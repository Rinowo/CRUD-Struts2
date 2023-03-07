package org.example.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.example.dao.Admin;
import org.example.model.EmpBean;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FindAllAction extends ActionSupport  {

    ResultSet rs = null;
    EmpBean bean = null;
    List<EmpBean> beanList = null;
    Admin admin = new Admin();
    private boolean noData = false;

    @Override
    public String execute() throws Exception {
        try {
            beanList = new ArrayList<EmpBean>();
            rs = admin.findAll();
            int i = 0;

            if (rs != null) {
                while (rs.next()) {
                    i++;
                    bean = new EmpBean();
                    bean.setSrNo(i);
                    bean.setUsername(rs.getString("USERNAME"));
                    bean.setEmail(rs.getString("EMAIL"));
                    bean.setPassword(rs.getString("PASSWORD").replaceAll("(?s).", "*"));
                    beanList.add(bean);
                }
            }

            if (i == 0) {
                noData = false;
            } else {
                noData = true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "FINDALL";
    }

    public boolean isNoData() {
        return noData;
    }

    public void setNoData(boolean noData) {
        this.noData = noData;
    }

    public List<EmpBean> getBeanList() {
        return beanList;
    }

    public void setBeanList(List<EmpBean> beanList) {
        this.beanList = beanList;
    }
}

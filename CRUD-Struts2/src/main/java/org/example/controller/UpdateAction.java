package org.example.controller;
import java.sql.ResultSet;

import com.opensymphony.xwork2.ActionSupport;
import org.example.dao.Admin;

public class UpdateAction extends ActionSupport {

    private static final long serialVersionUID = -1905974197186620917L;
    private String username = "", email = "", password = "", emailhidden = "";
    private String msg = "";
    ResultSet rs = null;
    Admin dao = new Admin();
    String submitType;

    @Override
    public String execute() throws Exception {
        try {
            if (submitType.equals("updatedata")) {
                rs = dao.findByEmail(email.trim());
                if (rs != null) {
                    while (rs.next()) {
                        username = rs.getString("USERNAME");
                        email = rs.getString("EMAIL");
                        password = rs.getString("PASSWORD");
                    }
                }
            } else {
                int i = dao.updateByEmail(username, email, password, emailhidden);
                if (i > 0) {
                    msg = "Record Updated Successfuly";
                } else {
                    msg = "error";
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return "UPDATE";
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailhidden() {
        return emailhidden;
    }

    public void setEmailhidden(String emailhidden) {
        this.emailhidden = emailhidden;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Admin getDao() {
        return dao;
    }

    public void setDao(Admin dao) {
        this.dao = dao;
    }

    public String getSubmitType() {
        return submitType;
    }

    public void setSubmitType(String submitType) {
        this.submitType = submitType;
    }
}
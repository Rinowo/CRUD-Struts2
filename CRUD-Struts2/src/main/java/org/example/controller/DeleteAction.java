package org.example.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.example.dao.Admin;

public class DeleteAction extends ActionSupport {

    String email;
    String msg;
    Admin dao = new Admin();

    @Override
    public String execute() throws Exception {
        try {
            int isDeleted = dao.deleteByEmail(email);
            if (isDeleted > 0) {
               msg = "Record Deleted Successfully";
            } else {
               msg = "Some error";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "DELETE";
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}

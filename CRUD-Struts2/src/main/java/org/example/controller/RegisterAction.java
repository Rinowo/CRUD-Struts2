package org.example.controller;

import com.opensymphony.xwork2.ActionSupport;
import org.example.dao.Admin;

public class RegisterAction extends ActionSupport {
    private static final long serialVersionUID = 123123213213232L;
    private String username, email, password;
    private String msg = "";
    Admin admin = null;
    int ctrl = 0;

    @Override
    public String execute() throws Exception {
        admin = new Admin();

        try {
            ctrl = admin.registerUser(username, email, password);
            if (ctrl > 0) {
                msg = "Regisration Succesfull";
            } else {
                msg = " Some error";
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return "REGISTER";
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public int getCtrl() {
        return ctrl;
    }

    public void setCtrl(int ctrl) {
        this.ctrl = ctrl;
    }
}

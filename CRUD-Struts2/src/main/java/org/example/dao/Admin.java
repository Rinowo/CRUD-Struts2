package org.example.dao;

import java.sql.*;

public class Admin {
    public static Connection getConnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/struts2crud";
            String username = "root";
            String password = "";
            return DriverManager.getConnection(url, username, password);
//            return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/websparrow", "root", "");
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    public int registerUser(String username, String email, String password) throws Exception {
        int i = 0;

        try {
            String sql = "INSERT INTO users VALUES (?,?,?)";
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            i = preparedStatement.executeUpdate();

            return i;
        } catch (Exception e) {
            e.printStackTrace();

            return i;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }

    public ResultSet findAll() throws SQLException, Exception {
        ResultSet rs = null;

        try {
            String sql = "SELECT u.username, u.email, u.password FROM users u";
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            rs = preparedStatement.executeQuery();

            return rs;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }

    public ResultSet findByEmail(String email) throws SQLException, Exception {
        ResultSet rs = null;

        try {
            String sql = "SELECT username, email, password FROM users WHERE email = ?";
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, email);
            rs = preparedStatement.executeQuery();

            return rs;
        } catch (Exception e) {
            e.printStackTrace();

            return null;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }

    public int updateByEmail(String username, String email, String password, String emailhidden) throws SQLException, Exception {
        int i = 0;
        try {
            String sql = "UPDATE users SET username = ?, email = ?, password = ? WHERE email = ?";
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, email);
            preparedStatement.setString(3, password);
            preparedStatement.setString(4, emailhidden);
            i = preparedStatement.executeUpdate();

            return i;
        } catch (Exception e) {
            e.printStackTrace();
            getConnection().rollback();
            return 0;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }

    public int deleteByEmail(String email) throws SQLException, Exception {
        getConnection().setAutoCommit(false);
        int i = 0;
        try {
            String sql = "DELETE FROM users WHERE email = ?";
            PreparedStatement preparedStatement = getConnection().prepareStatement(sql);
            preparedStatement.setString(1, email);
            i = preparedStatement.executeUpdate();
            return i;
        } catch (Exception e) {
            e.printStackTrace();
            getConnection().rollback();
            return 0;
        } finally {
            if (getConnection() != null) {
                getConnection().close();
            }
        }
    }
}

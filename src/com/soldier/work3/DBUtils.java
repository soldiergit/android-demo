package com.soldier.work3;

import java.sql.*;

/**
 * @Author soldier
 * @Date 2020/3/10 13:36
 * @Version 1.0
 * @Description:
 */
public class DBUtils {

    private static final String driverClass = "com.mysql.jdbc.Driver";
    private static final String url = "jdbc:mysql://127.0.0.1:3306/android-demo";
    private static final String user = "root";
    private static final String password = "123456";

    /**
     * 获取数据库连接
     */
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName(driverClass);
            conn = DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭数据库连接
     * @param rs
     * @param state
     * @param conn
     */
    public static void close(ResultSet rs,Statement state,Connection conn) {
        try {
            if(rs != null) rs.close();
            if(state != null) state.close();
            if(conn != null) conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

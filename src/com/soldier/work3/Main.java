package com.soldier.work3;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;

/**
 * @Author soldier
 * @Date 2020/3/11 20:52
 * @Email:583406411@qq.com
 * @Version 1.0
 * @Description: 连接数据库，并实现对student表中数据的增删改查操作
 */
public class Main {

    /**
     * 添加
     */
    public static void insert(Student student) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "insert into student(sNo,sName,sSex,sClass,sbirthday) " +
                "values(?,?,?,?,?)";
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            int index = 1;
            ps.setInt(index++,student.getsNo());
            ps.setString(index++,student.getsName());
            ps.setDouble(index++,student.getsSex());
            ps.setString(index++,student.getsClass());
            ps.setString(index, student.getSbirthday());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    /**
     * 修改
     */
    public static void update(Student student) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "update student set sName=?,sSex=?,sClass=?,sbirthday=? where sNo=? ";
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            int index = 1;
            ps.setString(index++,student.getsName());
            ps.setDouble(index++,student.getsSex());
            ps.setString(index++,student.getsClass());
            ps.setString(index++, student.getSbirthday());
            ps.setInt(index,student.getsNo());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    /**
     * 删除
     */
    public static void delete(int sNo) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        String sql = "delete from student where sNo=?";
        try {
            conn = DBUtils.getConnection();
            //预编译sql语句
            ps = conn.prepareStatement(sql);
            //赋值
            ps.setInt(1,sNo);
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            DBUtils.close(null,ps,conn);
        }
    }

    /**
     * 查询
     */
    public static List<Student> select(Integer sNo) throws Exception {
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        List<Student> studentList =  new ArrayList<>();
        Student student = null;
        String sql = "select * from student";
        try {
            conn = DBUtils.getConnection();
            ps = conn.prepareStatement(sql);
            if (sNo != null){
                sql += " where orderid=?";
                ps.setInt(1, sNo);
            }
            //执行sql语句并用rs接收返回结果
            rs = ps.executeQuery();
            while (rs.next()) {
                student = new Student();
                student.setsNo(rs.getInt(1));
                student.setsName(rs.getString(2));
                student.setsSex(rs.getInt(3));
                student.setsClass(rs.getString(4));
                student.setSbirthday(rs.getString(5));
                studentList.add(student);
            }
        } catch (SQLException e) {
            e.printStackTrace();
            throw new Exception("学生不存在！");
        } finally {
            DBUtils.close(rs,ps,conn);
        }
        return studentList;
    }

    public static void main(String[] args) throws Exception {
        /*Student student = new Student(1, "soldier", 1, "17软件2班", "1999-11");
        insert(student);*/

        /*Student student = new Student(1, "soldier", 1, "17软件2班2222", "1999-11");
        update(student);*/

        /*delete(1);*/

        Student student = null;
        for (int i = 1; i < 5; i++) {
            student = new Student(i, "soldier"+i, 1, "17软件"+i+"班", "1999-11");
            insert(student);
        }
        List<Student> studentList = select(null);
        studentList.forEach(v->{
            System.out.println(v.toString());
        });
    }
}

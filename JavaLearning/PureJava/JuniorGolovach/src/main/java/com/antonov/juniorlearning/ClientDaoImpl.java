/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.antonov.juniorlearning;

import com.mysql.jdbc.Driver;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Antonov
 */
public class ClientDaoImpl implements ClientDao {

    private Driver driver;
    private Properties prop;
    private static final String URL = "jdbc:mysql://localhost:3306/antonov?)";

    public ClientDaoImpl() {
        initDao();
    }

    private void initDao() {
        try {
            driver = new Driver();
        } catch (SQLException ex) {
            Logger.getLogger(ClientDaoImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        prop = new Properties();
        prop.setProperty("user", "antonov");
        prop.setProperty("password", "614331");
    }

    @Override
    public List<Client> selectAll() throws SQLException {
        List<Client> result = new ArrayList<>();

        Connection con = null;
        Statement st = null;
        ResultSet rs = null;
        try {
            con = driver.connect(URL, prop);
            st = con.createStatement();
            rs = st.executeQuery("select * from clients");
            while (rs.next()) {
                System.out.print(rs.getInt(1) + "  ");
                System.out.print(rs.getString(2) + "  ");
                System.out.print(rs.getString(3));
            }
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }

        return result;
    }

    @Override
    public void deleteById(int id) throws SQLException {
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = driver.connect(URL, prop);
            st = con.prepareStatement("delete from clients where id = ?");

            st.setInt(1, id);
            st.execute();
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    @Override
    public void insertClient(Client client) throws SQLException {
        int result = 0;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = driver.connect(URL, prop);
            st = con.prepareStatement("insert into clients (name, email) values (?,?)");
            st.setString(1, client.getName());
            st.setString(2, client.getEmail());
            
            
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }

    public void insertClientBatch(Client client, int quiantity) throws SQLException {
        int result = 0;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = driver.connect(URL, prop);

            st = con.prepareStatement("insert into clients (name, email) values (?,?)");
            for (int i = 0; i < quiantity; i++) {
                st.setString(1, client.getName());
                st.setString(2, client.getEmail());
                st.addBatch();
            }
            long t1 = System.currentTimeMillis();
            st.executeBatch();
            long t2 = System.currentTimeMillis();
            System.out.println((t2 - t1) / 1000);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
//        return result;
    }


    @Override
    public int insertClientAndGetId(Client client) throws SQLException {
                int result = 0;
        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = driver.connect(URL, prop);
            st = con.prepareStatement("insert into clients (name, email) values (?,?)", Statement.RETURN_GENERATED_KEYS);
            st.setString(1, client.getName());
            st.setString(2, client.getEmail());
            st.executeUpdate();
            rs = st.getGeneratedKeys();
            if (rs.next()) {
            result = ((Long)rs.getLong(1)).intValue();
        }
            
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
        return result;
    }

    @Override
    public void insertListClientsBatch(List<Client> list) throws SQLException {

        Connection con = null;
        PreparedStatement st = null;
        ResultSet rs = null;
        try {
            con = driver.connect(URL, prop);

            st = con.prepareStatement("insert into clients (name, email) values (?,?)");
            for (Client client : list) {
                st.setString(1, client.getName());
                st.setString(2, client.getEmail());
                st.addBatch();
            }
            long t1 = System.currentTimeMillis();
            st.executeBatch();
            long t2 = System.currentTimeMillis();
            System.out.println((t2 - t1) / 1000);
        } finally {
            if (rs != null) {
                rs.close();
            }
            if (st != null) {
                st.close();
            }
            if (con != null) {
                con.close();
            }
        }
    }
}

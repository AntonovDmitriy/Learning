package com.antonov.juniorlearning;

import java.sql.SQLException;
import java.util.List;

/**
 * Hello world!
 *
 */
public class ConnectAndSelectAll {

    public static void main(String[] args) throws SQLException {

        ClientDao dao = new ClientDaoImpl();
//        List<Client> list = dao.selectAll();
//        for (Client client : list) {
//            System.out.println(client.toString());
//        }
//
//        dao.deleteById(1);
//
//        list = dao.selectAll();
//        for (Client client : list) {
//            System.out.println(client.toString());
//        }
//        long t1 = System.currentTimeMillis();
//        for(int i=0;i<5000;i++){
//            Client cl = new Client();
//            cl.setName("Dima");
//            cl.setEmail("myEmail");
//            dao.insertClient(cl);
//        }
//        long t2 = System.currentTimeMillis();
//        System.out.println((t2-t1)/1000);
//    }

//        Client cl = new Client();
//        cl.setName("Dima");
//        cl.setEmail("myEmail");
//        dao.insertClientButch(cl, 5000);
//        long t1 = System.currentTimeMillis();
//        for (int i = 1; i < 10000; i++) {
//            dao.deleteById(i);
//        }
//        long t2 = System.currentTimeMillis();
//        System.out.println((t2 - t1) / 1000);
        for (int i = 0; i < 5000; i++) {
            Client cl = new Client();
            cl.setName("Dima");
            cl.setEmail("myEmail");
            System.out.println(dao.insertClientAndGetId(cl));
        }
    }
}

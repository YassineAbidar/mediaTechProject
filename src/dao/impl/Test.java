/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Client;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassine
 */
public class Test {

    public static void main(String args[]) {
        System.out.println("test");
//        ConnectDB.getConnection();
        ClientImplDao cliendao = new ClientImplDao();
        List<Client> clients = new ArrayList<>();
        clients = cliendao.findAll();
        System.out.println(clients.size());
        // java 8;
        clients.forEach((client) -> {
            System.out.println(client.toString());
        });
    }
}

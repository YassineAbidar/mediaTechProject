/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Client;
import dao.ClientDao;
import dao.ConnectDB;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author yassine
 */
public class ClientImplDao implements ClientDao {

    @Override
    public Client save(Client client) {
        Connection connection = ConnectDB.getConnection();
        Client result = new Client();
        int rs = 0;
        try {
//            Statement stmt = (Statement) connection.createStatement();
            String sql = "insert into client values(?,?,?,?)";
            PreparedStatement pr = (PreparedStatement) connection.prepareStatement(sql);

            pr.setString(1, client.getRefClient());
            pr.setString(2, client.getNom_cli());
            pr.setString(3, client.getPrenom());
            pr.setString(4, client.getTele());
            rs = pr.executeUpdate();
            if (rs > 0) {
                PreparedStatement prepar = (PreparedStatement) connection.prepareStatement("select * from client where code_cli=?");
                prepar.setString(1, client.getRefClient());
                ResultSet resultSet = prepar.executeQuery();
                if (resultSet.next()) {
                    result = client;
                } else {
                    result = null;
                }
                prepar.close();
            }
            pr.close();

        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return result;
    }

    @Override
    public int update(Client client) {
        Connection connection = ConnectDB.getConnection();
        int rep = 0;
        try {
            String sql = "UPDATE CLIENT SET nom_cli=?,prenom_cli=?,tele=?, where code_cli=? ";
            PreparedStatement prepar = (PreparedStatement) connection.prepareStatement(sql);
            prepar.setString(1, client.getNom_cli());
            prepar.setString(2, client.getPrenom());
            prepar.setString(3, client.getTele());
            prepar.setString(4, client.getRefClient());
            System.out.println("debut");
            rep = prepar.executeUpdate();
            System.out.println("fine");
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return rep;
    }

    @Override
    public List<Client> findAll() {
        List<Client> clients = new ArrayList<>();
        Connection connection = ConnectDB.getConnection();
        try {
            String sql = "select * from client";
            PreparedStatement prepar = (PreparedStatement) connection.prepareStatement(sql);
            ResultSet resultSet = prepar.executeQuery();
            while (resultSet.next()) {
                Client client = new Client();
                client.setNom_cli(resultSet.getString(2));
                client.setPrenom(resultSet.getString(3));
                client.setRefClient(resultSet.getString(1));
                client.setTele(resultSet.getString(4));
                clients.add(client);
            }
        } catch (Exception e) {
        }
        return clients;
    }

    @Override
    public Client findbyRef(String ref) {
        Connection connection = ConnectDB.getConnection();
        Client client = new Client();
        try {
            String sql = "select * from client where code_cli=?";
            PreparedStatement prepar = (PreparedStatement) connection.prepareStatement(sql);
            prepar.setString(1, ref);
            ResultSet resultSet = prepar.executeQuery();
            if (resultSet.next()) {
                client.setRefClient(resultSet.getString(1));
                client.setNom_cli(resultSet.getString(2));
                client.setPrenom(resultSet.getString(3));
                client.setTele(resultSet.getString(4));
            }
            prepar.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return client;
    }

    @Override
    public int delete(String ref) {
        Connection connection = ConnectDB.getConnection();
        int rep = 0;
        try {
            String sql = "delete  client where code_cli=?";
            PreparedStatement prepar = (PreparedStatement) connection.prepareStatement(sql);
            prepar.setString(1, ref);
            rep = prepar.executeUpdate();
            prepar.close();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        return rep;
    }
}

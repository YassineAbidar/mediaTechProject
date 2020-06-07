/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Client;
import java.util.List;

/**
 *
 * @author yassine
 */
public interface ClientDao {

    public  Client save(Client client);

    public int update(Client client);

    public List<Client> findAll();

    public Client findbyRef(String ref);

    public int delete(String ref);

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Client;
import bean.Facture;
import java.util.List;

/**
 *
 * @author yassine
 */
public interface FactureDao {

    public Facture save(Facture facture);

    public int update(Facture facture);

    public List<Facture> findAll();

    public Facture findbyRef(String ref);

    public int delete(String ref);

}

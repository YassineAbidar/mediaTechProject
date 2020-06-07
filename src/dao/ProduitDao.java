/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import bean.Facture;
import bean.Produit;
import java.util.List;

/**
 *
 * @author yassine
 */
public interface ProduitDao {
    
     public Produit save(Produit produit);

    public int update(Produit produit);

    public List<Produit> findAll();

    public Produit findbyRef(String ref);

    public int delete(String ref);
}

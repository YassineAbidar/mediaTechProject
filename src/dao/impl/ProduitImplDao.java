/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao.impl;

import bean.Produit;
import dao.ProduitDao;
import java.util.List;

/**
 *
 * @author yassine
 */
public class ProduitImplDao  implements ProduitDao{

    @Override
    public Produit save(Produit produit) {
        return null;
    }

    @Override
    public int update(Produit produit) {
       return 0;
    }

    @Override
    public List<Produit> findAll() {
       return null;
    }

    @Override
    public Produit findbyRef(String ref) {
       return null;
    }

    @Override
    public int delete(String ref) {
        return 0;
    }
    
}

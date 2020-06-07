/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;

/**
 *
 * @author yassine
 */
public class Produit implements Serializable {

    private String ref_prod;
    private String libelle;
    private double prix_unitaire;
    private int quantite_stock;

   
    public Produit(String ref_prod, String libelle, double prix_unitaire, int quantite_stock) {
        this.ref_prod = ref_prod;
        this.libelle = libelle;
        this.prix_unitaire = prix_unitaire;
        this.quantite_stock = quantite_stock;
    }

    public String getRef_prod() {
        return ref_prod;
    }

    public void setRef_prod(String ref_prod) {
        this.ref_prod = ref_prod;
    }

    public String getLibelle() {
        return libelle;
    }

    public void setLibelle(String libelle) {
        this.libelle = libelle;
    }

    public double getPrix_unitaire() {
        return prix_unitaire;
    }

    public void setPrix_unitaire(double prix_unitaire) {
        this.prix_unitaire = prix_unitaire;
    }

    public int getQuantite_stock() {
        return quantite_stock;
    }

    public void setQuantite_stock(int quantite_stock) {
        this.quantite_stock = quantite_stock;
    }

    @Override
    public String toString() {
        return "Produit{" + "ref_prod=" + ref_prod + ", libelle=" + libelle + ", prix_unitaire=" + prix_unitaire + ", quantite_stock=" + quantite_stock + '}';
    }

    public Produit() {
    }
    
    

}

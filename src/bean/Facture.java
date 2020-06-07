/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 *
 * @author yassine
 */
public class Facture implements Serializable {

    private String ref_facture;
    private Date date_facture;
    private Client client;
    //chaque facture has many Produit
    List<Produit> produits;

    public Facture(String ref_facture, Date date_facture, Client client) {
        this.ref_facture = ref_facture;
        this.date_facture = date_facture;
        this.client = client;
    }

    public Facture() {
    }

    public String getRef_facture() {
        return ref_facture;
    }

    public void setRef_facture(String ref_facture) {
        this.ref_facture = ref_facture;
    }

    public Date getDate_facture() {
        return date_facture;
    }

    public void setDate_facture(Date date_facture) {
        this.date_facture = date_facture;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<Produit> getProduits() {
        return produits;
    }

    public void setProduits(List<Produit> produits) {
        this.produits = produits;
    }
    

}

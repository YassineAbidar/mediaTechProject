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
public class Client implements Serializable {
    private String refClient;
    private String nom_cli;
    private String prenom;
    private String tele;

    public Client() {
    }

    public Client(String refClient, String nom_cli, String prenom, String tele) {
        this.refClient = refClient;
        this.nom_cli = nom_cli;
        this.prenom = prenom;
        this.tele = tele;
    }
    public String getPrenom() {
        return prenom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public String getRefClient() {
        return refClient;
    }

    public void setRefClient(String refClient) {
        this.refClient = refClient;
    }

    public String getNom_cli() {
        return nom_cli;
    }

    public void setNom_cli(String nom_cli) {
        this.nom_cli = nom_cli;
    }

    public String getTele() {
        return tele;
    }

    public void setTele(String tele) {
        this.tele = tele;
    }

    @Override
    public String toString() {
        return "Client{" + "refClient=" + refClient + ", nom_cli=" + nom_cli + ", prenom=" + prenom + ", tele=" + tele + '}';
    }
    
    

}

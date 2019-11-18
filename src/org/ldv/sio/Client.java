package org.ldv.sio;

import android.widget.ListView;

import java.util.ArrayList;

public class Client {
    private String nom;
    private String prenom;
    private ArrayList<Adresse> Livraison;
    private Adresse Habitation;

    public Client(String nom, String prenom, Adresse Habitation, ArrayList<Adresse> Livraison) {
        this.nom = nom;
        this.prenom = prenom;
        if (this.Livraison == null) {
            this.Livraison = Livraison;
            this.Habitation = Habitation;
        }else{
            this.Livraison = Livraison;
            this.Habitation = Habitation;
        }
    }

    public Client(String nom, String prenom, Adresse Habitation) {
        this.nom = nom;
        this.prenom = prenom;
        this.Habitation = Habitation;

    }

    public Adresse getHabitation () {
            return Habitation;
        }

        public void setHabitation (Adresse Habitation){
            Habitation = Habitation;
        }

        public ArrayList<Adresse> getLivraison () {
            return Livraison;
        }

        public void setLivraison (Adresse Livraison){
            Livraison = Livraison;
        }

        public String getNom () {
            return nom;
        }

        public void setNom (String nom){
            this.nom = nom;
        }

        public String getPrenom () {
            return prenom;
        }

        public void setPrenom (String prenom){
            this.prenom = prenom;
        }

        @Override
        public String toString () {
            return "Client{" +
                    "nom='" + nom + '\'' +
                    ", prenom='" + prenom + '\'' +
                    ", Livraison=" + Livraison +
                    ", Habitation=" + Habitation +
                    '}';
        }
    }


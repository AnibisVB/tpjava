package org.ldv.sio;

import java.util.ArrayList;

public class Main {

  public static void main(String[] args) {
    Adresse domicile = new Adresse("3rue du clocher", 77000, "melun");

    ArrayList<Adresse> listeAdresse = new ArrayList<>();
    listeAdresse.add(livraison);


    Client c = null;
    Client clientSansLivraison = null;
    String nom = "oui";
    String prenom = "oui2";


    if (listeAdresse == null){

      listeAdresse.add(livraison);

      clientSansLivraison = new Client(nom, prenom, domicile, listeAdresse);
      System.out.println(clientSansLivraison.toString());

    }else {

      listeAdresse.add(livraison);
      c = new Client("Dijkstra", "Edsger", domicile, listeAdresse);
      System.out.println(c.toString());
    }


  }
}

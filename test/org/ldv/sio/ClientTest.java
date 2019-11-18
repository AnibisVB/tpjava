package org.ldv.sio;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ClientTest {

  private Client c;
  private ArrayList<Adresse> livraison;
  private Adresse habitation;

  @Before
  public void initializeEachTest() {
    this.livraison = new Adresse("3 rue du clocher", 77000, "melun");
    this.habitation = new Adresse("3 allée des fraisier", 91370, "massy");
    this.c = new Client("Dijkstra", "Edsger", habitation, livraison);
  }

  @Test
  public void getNom() {
    assertEquals("Dijkstra", this.c.getNom());
  }

  @Test
  public void setNom() {
    this.c.setNom(this.c.getNom().toUpperCase());
    assertEquals("DIJKSTRA", this.c.getNom());
  }

  @Test
  public void getPrenom() {
    assertEquals("Edsger", this.c.getPrenom());
  }

  @Test
  public void setPrenom() {
    this.c.setPrenom(this.c.getPrenom().toUpperCase());
    assertEquals("EDSGER", this.c.getPrenom());
  }

  @Test
  public void AdrDomicile() {
    assertEquals(habitation,this.c.getHabitation());
  }


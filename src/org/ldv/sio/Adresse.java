package org.ldv.sio;

import java.util.ArrayList;

public class Adresse extends ArrayList<Adresse> {

    private String rue;
    private int codePostale;
    private String ville;

    public Adresse(String rue, int codePostale, String ville){
        this.rue = rue;
        this.codePostale = codePostale;
        this.ville = ville;

    }

    public String getRue() {
        return rue;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public int getCodePosatale() {
        return codePosatale;
    }

    public void setCodePostale(int codePostale) {
        this.codePosatale = codePostale;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    @Override
    public String toString() {
        return "Adresse{" +
                "rue='" + rue + '\'' +
                ", codePostale=" + codePostale +
                ", ville='" + ville + '\'' +
                '}';
    }
}

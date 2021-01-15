package com.example.proiect.util;

import java.util.Date;

public class MijlocFix {
    private int id ;
    private String denumire ;
    private float valoare ;
    private Date dataAdaugare ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDenumire() {
        return denumire;
    }

    public void setDenumire(String denumire) {
        this.denumire = denumire;
    }

    public float getValoare() {
        return valoare;
    }

    public void setValoare(float valoare) {
        this.valoare = valoare;
    }

    public Date getDataAdaugare() {
        return dataAdaugare;
    }

    public void setDataAdaugare(Date dataAdaugare) {
        this.dataAdaugare = dataAdaugare;
    }

    public MijlocFix(int id, String denumire, float valoare, Date dataAdaugare) {
        this.id = id;
        this.denumire = denumire;
        this.valoare = valoare;
        this.dataAdaugare = dataAdaugare;
    }

    public MijlocFix(String denumire, float valoare, Date dataAdaugare) {
        this.denumire = denumire;
        this.valoare = valoare;
        this.dataAdaugare = dataAdaugare;
    }
}

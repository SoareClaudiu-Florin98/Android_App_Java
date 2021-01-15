package com.example.proiect.util;

import java.util.List;

public class Nume {
    private int id ;
    private List<MijlocFix> mijloaceFixe ;
    private List<ObiectInventar> obiecteInventar ;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public List<MijlocFix> getMijloaceFixe() {
        return mijloaceFixe;
    }

    public void setMijloaceFixe(List<MijlocFix> mijloaceFixe) {
        this.mijloaceFixe = mijloaceFixe;
    }

    public List<ObiectInventar> getObiecteInventar() {
        return obiecteInventar;
    }

    public void setObiecteInventar(List<ObiectInventar> obiecteInventar) {
        this.obiecteInventar = obiecteInventar;
    }

    public Nume(int id, List<MijlocFix> mijloaceFixe, List<ObiectInventar> obiecteInventar) {
        this.id = id;
        this.mijloaceFixe = mijloaceFixe;
        this.obiecteInventar = obiecteInventar;
    }

    public Nume(List<MijlocFix> mijloaceFixe, List<ObiectInventar> obiecteInventar) {
        this.mijloaceFixe = mijloaceFixe;
        this.obiecteInventar = obiecteInventar;
    }
}

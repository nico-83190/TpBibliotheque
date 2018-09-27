package fr.univtln.nguigou971.bibliotheque.materiel;

import fr.univtln.nguigou971.bibliotheque.Empruntable;

public class OrdinateurPortable extends Materiel implements Empruntable {

    public enum Os{LINUX, WINDOWS}

    private String marque;
    private Os os;


    public OrdinateurPortable(String marque, String os){
        super();
        this.marque = marque;
        this.os = Os.valueOf(os);
    }


    @Override
    public void setEmprunte(boolean emprunte) {
        super.setEmprunte(emprunte);
    }

    @Override
    public boolean isDisponible() {
        if(emprunte || enPanne)
            return false;
        else
            return true;
    }

    @Override
    public void setDisponibilite(boolean disponibilite) {
        setEmprunte(!disponibilite);
    }


    @Override
    public String toString() {
        return super.toString() + " OrdinateurPortable{" +
                "marque='" + marque + '\'' +
                ", os=" + os +
                '}';
    }


}

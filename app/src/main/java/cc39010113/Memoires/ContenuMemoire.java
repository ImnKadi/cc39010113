package cc39010113.Memoires;

import java.util.ArrayList;

public class ContenuMemoire{

    private String titre;
    private String auteur;
    private String resume;
    private String remerciements;
    private String introduction;
    private String conclusion;
    private ArrayList<Chapitres> chapitres;

    public void setTitre(String titre){}

    public void setAuteur(String auteur){}

    public void setResume(String resume){}

    public void setRemerciements(String remerciements){}

    public void setIntroduction(String introduction){}

    public void setConclusion(String conclusion){}

    public void addChapitre(Chapitres c) {
        chapitres.add(c);
    }


}

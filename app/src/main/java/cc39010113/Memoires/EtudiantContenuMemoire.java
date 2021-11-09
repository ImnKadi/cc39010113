package cc39010113.Memoires;

import org.checkerframework.common.returnsreceiver.qual.This;

public class EtudiantContenuMemoire implements BuilderMemoire {

    private ContenuMemoire contenuMemoire = new ContenuMemoire();

    @Override
    public void setTitre(String titre) {
        this.contenuMemoire.setTitre(titre);
    }

    @Override
    public void setAuteur(String auteur) {
        this.contenuMemoire.setAuteur(auteur);
    }

    @Override
    public void setResume(String resume) {
        this.contenuMemoire.setResume(resume);
    }

    @Override
    public void setRemerciements(String remerciements) {
        this.contenuMemoire.setRemerciements(remerciements);

    }

    @Override
    public void setIntroduction(String introduction) {
      //  this.contenuMemoire.setIntroduction(introduction);

    }

    @Override
    public void setConclusion(String conclusion) {

        // this.contenuMemoire.setConclusion(conclusion);


    }

    @Override
    public void addChapitre(Chapitres c) {
    }
}

package cc39010113.Memoires;

public interface BuilderMemoire {

         void setTitre(String titre);
         void setAuteur(String auteur);
         void setResume(String resume);
         void setRemerciements(String remerciements);
         void setIntroduction(String introduction);
         void setConclusion(String conclusion);
         void addChapitre(Chapitres c);



}

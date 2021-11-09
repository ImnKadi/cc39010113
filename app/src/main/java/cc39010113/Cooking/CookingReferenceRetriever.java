package cc39010113.Cooking;

import java.util.Map;

public interface CookingReferenceRetriever {

        public Map<String, CookingReference> retrieveFromIngredient(String ingredient);
        //CookingReferenceRetriever retriever = ... // ici une instance de réalisation de l'interface
       // Map<String, CookingReference> = retriever.retrieveFromIngredient("tomate");


}

package com.example.tp2bis;

// classe du modèle
public class PerimetreModele {

    public PerimetreModele() {
        // TODO Auto-generated constructor stub
    }

    //Simple calcul de périmètre pour cet exercice mais en réalité, on aurait ici tous les calculs "métiers"
    // par exemple, une série de méthode pour les rectangle
    public float calculPerimetre(float valLongueur, float valLargeur)
    {
       return ((valLongueur+valLargeur)*2);
    }
}
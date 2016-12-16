package com.antoine;

public class Main {

    public static void main(String[] args) {
	// write your code here
        cordonnees(5, 0, 4);

    }
    public static void cordonnees(int t){cordonnees(t, 1, 3);}
        // Par défaut, on fait retourner ça


    public static void cordonnees(int t, double vx, double vy){
        // affiche les coordonnée de la balle parce que voila omg quoi c'est une balle avec des coordonnées
        // HYP : on lache la balle en (0,10)
        // HYP : précision du temps en incrément de 0.1 secondes
        double pox = 0, poy = 10;
        for (double i = 0; i<t; i+=0.1){
            pox = vx*0.1 + pox;
            poy = -0.5*9.81*0.1 - vy*0.1 + poy;
        }
        System.out.println(" les coordonnées sont en x: "+ pox + " et en y : "+ poy);


    }
}

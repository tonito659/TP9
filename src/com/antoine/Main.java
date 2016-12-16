package com.antoine;

public class Main {

    public static void main(String[] args) {
	// write your code here
        cordonnees(7);

    }
    public static void cordonnees(int t){cordonnees(t, 5, 4, 0.07);}
        // Par défaut, on fait retourner ça


    public static void cordonnees(int t, double vx, double vy, double frt){
        // affiche les coordonnée de la balle parce que voila omg quoi c'est une balle avec des coordonnées
        // HYP : on lache la balle en (0,10)
        // HYP : précision du temps en incrément de 0.1 secondes

        // frottement
        // rebonds

        double pox = 0, poy = 10;
        int direction = -1;

        for (double i = 0; i<t; i+=0.1){
            pox = vx*0.1 + pox -frt*vx;
            poy = (-0.5*9.81*0.1 - vy*0.1 + poy)*direction -frt*vy;
            vy = vy + 0.1*9.81*-direction;
            if (poy <0) {
                direction = 1;
            }else{
                direction = -1;
            }
        }
        System.out.println(" les coordonnées sont en x: "+ pox + " et en y : "+ poy);

    }
}


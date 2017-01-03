package com.antoine;

import edu.princeton.cs.introcs.StdDraw;

public class Main {

    public final static int X_MAX= 64;
    public final static int Y_MAX= 24;
    public final static float WIDTH= 0.5f;

    public static void main(String[] args) {
	// write your code here
        dessin();
        //cordonnees(7);

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
            if (poy <=0) {
                direction = 1;
            }else direction = -1;
            System.out.println("x: "+ pox + "\ty : "+ poy+"\t \t \t dir : " + direction + "\t vy : " + vy);

        }
        System.out.println(" les coordonnées sont en x: "+ pox + " et en y : "+ poy);

    }

    public static void dessin(){
        // hypothèse : on prend
        double x = 0, y = 20;
        double vx = 12, vy = 4;
        int direction = -1;
        StdDraw.setXscale(-WIDTH, X_MAX + WIDTH);
        StdDraw.setYscale(-WIDTH, Y_MAX + WIDTH);
            for (int i = 0; i <= 12000; i++) {
                x = vx*0.01 + x -0.04*vx;
                y = (-0.5*9.81*0.01 - vy*0.01 + y)*direction -0.04*vy;
                vy = vy + 0.01*9.81*-direction;
                if (y <=0) {
                    direction = 1;
                }else direction = -1;

                StdDraw.clear(StdDraw.GRAY);
                StdDraw.setPenColor(StdDraw.RED);
                StdDraw.filledCircle(x, y, WIDTH);
                // display and pause for 20 ms
                StdDraw.show(20);
            }
        }
    }


package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód

        /* čtverec
        for (int i=0; i<4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        */
        /* trojúhelník
        for (int i=0; i<3; i++) {
            zofka.move(100);
            zofka.turnLeft(120);}

         */


        /* domek
        for (int i=0; i<4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70.7);
        zofka.turnLeft(90);
        zofka.move(70.7);
        zofka.turnLeft(45);
        */

        /*kolecko a zmena místa

        for (int i=0; i<365; i++) {
            zofka.move(1);
            zofka.turnLeft(1);}

        zofka.setLocation(200, 200);
        for (int i=0; i<365; i++) {
            zofka.move(1);
            zofka.turnLeft(1);}

         */

        // několik domků ručně
        /*
        zofka.setLocation(200, 200);

        for (int i=0; i<4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70.7);
        zofka.turnLeft(90);
        zofka.move(70.7);
        zofka.turnLeft(225);


        zofka.setLocation(400, 200);

        for (int i=0; i<4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70.7);
        zofka.turnLeft(90);
        zofka.move(70.7);
        zofka.turnLeft(45);

         */

        //několik domků automat
double x=200;
double y=200;
        zofka.setLocation(x,y);

for (int a=0;a<5;a++) {
    for (int i = 0; i < 4; i++) {
        zofka.move(100);
        zofka.turnLeft(90);
    }
    zofka.move(100);
    zofka.turnLeft(45);
    zofka.move(70.7);
    zofka.turnLeft(90);
    zofka.move(70.7);
    zofka.turnLeft(225);

    zofka.setX(zofka.getX() + 250);
    zofka.setY(zofka.getY() + 100);

}

// prasatko
        zofka.setLocation(500, 500);
zofka.turnLeft(90);

        for (int i = 0; i < 4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70.7);
        zofka.turnLeft(90);
        zofka.move(70.7);
        zofka.turnLeft(45);
        zofka.move(20);
        double predniNohyX =zofka.getX();
        double predniNohyY= zofka.getY();
        zofka.turnRight(120);
        zofka.move(40);
        zofka.setLocation(predniNohyX,predniNohyY);
        zofka.turnLeft(60);
       zofka.move(40);
       zofka.setLocation(predniNohyX,predniNohyY);
       zofka.turnLeft(60);
        zofka.move(70);
        double zadniNohyX =zofka.getX();
        double zadniNohyY= zofka.getY();
        zofka.turnRight(120);
        zofka.move(40);
        zofka.setLocation(zadniNohyX,zadniNohyY);
        zofka.turnLeft(60);
        zofka.move(40);



    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

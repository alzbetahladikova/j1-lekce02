package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód


        nakresliCtverec(100, 100);
        nakresliCtverec(250, 100);
        nakresliCtverec(400, 100);
        nakresliCtverec(550, 100);


        nakresliTrojuhelnik(100, 300);
        nakresliTrojuhelnik(250, 300);
        nakresliTrojuhelnik(400, 300);
        nakresliTrojuhelnik(550, 300);


        nakresliDomek(100, 500);
        nakresliDomek(250, 500);
        nakresliDomek(400, 500);
        nakresliDomek(550, 500);


        nakresliKolecko(800,100);
        nakresliKolecko(1000,100);

        nakresliPrasatko(800, 300);
        nakresliPrasatko(1000, 300);


    }

    private void nakresliPrasatko(double x, double y) {
        zofka.setLocation(x, y);
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
        zofka.turnLeft(150);
    }

    private void nakresliKolecko(double x, double y) {
        zofka.setLocation(x, y);
        for (int i=0; i<360; i++) {
            zofka.move(1);
            zofka.turnLeft(1);}

    }

    private void nakresliDomek(double x, double y) {
        zofka.setLocation(x, y);
        for (int i=0; i<4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
        zofka.move(100);
        zofka.turnLeft(45);
        zofka.move(70.7);
        zofka.turnLeft(90);
        zofka.move(70.7);
        zofka.turnRight(135);
    }

    private void nakresliTrojuhelnik(double x, double y) {
        zofka.setLocation(x, y);
        for (int i=0; i<3; i++) {
            zofka.move(100);
            zofka.turnLeft(120);}
    }

    private void nakresliCtverec(double x, double y) {
        zofka.setLocation(x, y);
        for (int i=0; i<4; i++) {
            zofka.move(100);
            zofka.turnLeft(90);
        }
    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

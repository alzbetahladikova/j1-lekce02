package cz.czechitas.java.lekce02;

import cz.czechitas.java.lekce02.engine.Turtle;

public class HlavniProgram {
    private Turtle zofka;
    public void start() {
        zofka = new Turtle();

        //TODO tady bude kód

        //vlastní cvičení
        /* domel
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
        /* kruh
        for (int i=0; i<365; i++) {
            zofka.move(1);
            zofka.turnLeft(1);}

         */



    }

    public static void main(String[] args) {
        new HlavniProgram().start();
    }

}

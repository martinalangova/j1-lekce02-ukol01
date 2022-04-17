package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();


       // 1.část
        // posun zelvy
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(150);
        zofka.turnRight((90));
        zofka.move(200);
        zofka.turnLeft(90);
        zofka.penDown();

        nakresliPrasatko(zofka);

        // 2.část

        //posun zelvy
        zofka.penUp();
        zofka.turnLeft(135);
        zofka.move(400);
        zofka.turnLeft(90);
        zofka.move(700);
        zofka.penDown();

        // osmiúhelník
       // nakresliOsmiuhelnik(zofka);

        //posun zelvy
        zofka.penUp();
        zofka.turnLeft(180);
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.penDown();
        // kolečko
       // nakresliKolecko(zofka);

        //posun zelvy
        zofka.penUp();
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();

        //slunce
        nakresliSlunce(zofka);

        // 3.část
        //posun zelvy
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(400);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.penDown();
        zofka.turnLeft(90);

        // domeček
        nakresliDomecek(zofka);

        //přesun
        zofka.penUp();
        zofka.move(200);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.penDown();

        nakresliDomecek(zofka);

        //přesun + domečky
        for (int i=0;i<4;i++) {
            zofka.penUp();
            zofka.turnRight(90);
            zofka.move(250);
            zofka.turnRight(90);
            zofka.penDown();

            nakresliDomecek(zofka);
        }

        //přesun
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(200);
        zofka.penDown();

        nakresliDomecek(zofka);

// 4.část
        //posun želvy
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.move(250);
        zofka.turnRight(180);
        zofka.penDown();

        // M
        nakresliM(zofka);

        // A
        nakresliA(zofka);

        //R
        nakresliR(zofka);

        //T
        nakresliT(zofka);

        // I
        nakresliI(zofka);

        //N
        nakresliN(zofka);

        //
        nakresliA(zofka);
    }


    private void nakresliN(Turtle zofka) {
        zofka.move(50);
        zofka.turnRight(140);
        zofka.move(65);
        zofka.turnLeft(140);
        zofka.move(50);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(50);
        //mezera
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(20);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private void nakresliI(Turtle zofka) {
        zofka.move(50);
        zofka.penUp();
        zofka.turnRight(180);
        zofka.move(50);
        //mezera
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private void nakresliT(Turtle zofka) {
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.move(40);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnLeft(90);
        zofka.move(50);
        //mezera
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private void nakresliR(Turtle zofka) {
        zofka.penDown();
        zofka.move(50);
        zofka.turnRight(90);
        for(int i=0;i<10;i++) {
            zofka.move(5);
            zofka.turnRight(18);
        }
        zofka.turnLeft(135);
        zofka.move(25);
        //mezera
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(40);
        zofka.turnLeft(90);
        zofka.penDown();
    }

    private void nakresliA(Turtle zofka) {
        zofka.penDown();
        zofka.turnRight(20);
        zofka.move(55);
        zofka.turnRight(140);
        zofka.move(55);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(27);
        zofka.turnLeft(75);
        zofka.penDown();
        zofka.move(20);
        zofka.turnLeft(180);
        zofka.penUp();
        zofka.move(20);
        zofka.turnRight(75);
        zofka.move(27);
        //mezera
        zofka.turnLeft(70);
        zofka.move(40);
        zofka.turnLeft(90);
    }

    private void nakresliM(Turtle zofka) {
        zofka.move(50);
        zofka.turnRight(135);
        zofka.move(25);
        zofka.turnLeft(90);
        zofka.move(25);
        zofka.turnRight(135);
        zofka.move(50);
        //mezera
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(40);
        zofka.penDown();
        zofka.turnLeft(90);
    }

    private void nakresliDomecek(Turtle zofka) {
        for (int j=0;j<2;j++) {
            zofka.move(100);
            zofka.turnRight(90);
            zofka.move(70);
            zofka.turnRight(90);
        }
        zofka.turnRight(135);
        zofka.move(50);
        zofka.turnLeft(90);
        zofka.move(50);
        zofka.turnRight(135);
    }

    private void nakresliSlunce(Turtle zofka) {
        nakresliKolecko(zofka);
        for(int j=0; j<12; j++){
            zofka.turnLeft(90);
            zofka.move(30);
            zofka.turnLeft(180);
            zofka.penUp();
            zofka.move(30);
            zofka.turnLeft(90);
            zofka.move(13);
            zofka.turnRight(15);
            zofka.move(13);
            zofka.turnRight(15);
            zofka.penDown();
        }
    }

    private void nakresliKolecko(Turtle zofka) {
        for(int i=0; i<24; i++) {
            zofka.move(13);
            zofka.turnRight(15);
        }
    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        // osmiúhelník
        for(int i=0; i<8; i++) {
            zofka.move(40);
            zofka.turnRight(45);
        }
    }

    private void nakresliPrasatko(Turtle zofka) {
        // prasatko telo
//        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(100);
        zofka.turnRight(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(135);
        zofka.move(70);
        // přesun na přední
        zofka.penUp();
        zofka.turnRight(45);
        zofka.move(30);
        zofka.penDown();
        zofka.turnRight(180);
        // nohy přední
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
        //přesun na zadní
        zofka.penUp();
        zofka.turnLeft(45);
        zofka.move(60);
        zofka.penDown();
        zofka.turnLeft(45);
        // nohy zadní
        zofka.move(30);
        zofka.turnRight(90);
        zofka.move(30);
    }

}

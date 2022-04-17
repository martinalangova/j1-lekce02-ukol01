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

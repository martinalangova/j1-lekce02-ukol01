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

        nakresliOsmiuhelnik(zofka);


    }

    private void nakresliOsmiuhelnik(Turtle zofka) {
        // osmiúhelník
        for(int i=0; i<8; i++) {
            zofka.move(50);
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

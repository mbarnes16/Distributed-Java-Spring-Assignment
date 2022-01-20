package edu.wctc.dice.impl;

import edu.wctc.dice.iface.IDice;

import java.util.Random;

public class Dice20 implements IDice {
    @Override
    public int rollDie() {

         Random random = new Random();
        return random.nextInt(8) + 1;
    }
}

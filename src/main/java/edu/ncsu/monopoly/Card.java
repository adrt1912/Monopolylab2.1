package edu.ncsu.monopoly;
//Eguneraketa irailak 25 bigarrena
//Actualizacion viernes 25 is2
public abstract class Card {

    public static final int TYPE_CHANCE = 1;
    public static final int TYPE_CC = 2;

    public abstract String getLabel();
    public abstract void applyAction();
    public abstract int getCardType();
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package designpatternstest;

/**
 *
 * @author eleves
 */
public abstract class Character
{
    //Fields
    protected String armes = "", shoes = "", healthPack = "";
    
    //Method to move the character
    void move()
    {
        System.out.println("I move by steps.");
    }
    //Method to battle
    void battle()
    {
        System.out.println("I dont't battle me!");
    }
    //Method for don't health
    void cure()
    {
        System.out.println("I don't health.");
    }
    //Methods to set the items
    protected void setArmes(String armes)
    {
        this.armes = armes;
    }
    protected void setShoes(String shoes)
    {
        this.shoes = shoes;
    }
    protected void setHealthPack(String healthPack)
    {
        this.healthPack = healthPack;
    }
}

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
    
}

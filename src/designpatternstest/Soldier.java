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
public class Soldier extends Character
{

    @Override
    void move()
    {
        System.out.println("I move by steps");
    }

    @Override
    void battle()
    {
        System.out.println("Sniper, pistol, knife, shotgun! All that you want");
    }
    
}

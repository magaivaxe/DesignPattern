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
    void battle()
    {
        if (this.armes.equals("pistol"))
        {
            System.out.println("Pistol Attack!");
        }
        else if (this.armes.equals("Sniper Rifle"))
        {
            System.out.println("Sniper Rifle Attack!");
        }
        else
        {
            System.out.println("Knife Attack!");
        }
        
    }
    
}

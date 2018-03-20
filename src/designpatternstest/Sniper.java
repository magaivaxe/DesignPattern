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
public class Sniper extends Character
{
    @Override
    void battle()
    {
        if (this.armes.equals("Shotgun"))
        {
            System.out.println("Shotgun Attack!");
        }
        else
        {
            System.out.println("Sniper Rifle Attack");
        }
    }
    
}

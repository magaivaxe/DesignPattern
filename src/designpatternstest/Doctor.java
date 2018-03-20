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
public class Doctor extends Character
{

    @Override
    void battle()
    {
        if (this.armes.equals("Pistol"))
        {
            System.out.println("Pistol Attack!");
        }
        else
        {
            System.out.println("Scalpel Attack!");
        }
        
    }
    
    @Override
    public void cure()
    {
        if (this.healthPack.equals("Little pack"))
        {
            System.out.println("I could health your injuries!");
        }
        else
        {
            System.out.println("I could do the basic... sorry");
        }
    }
    
}

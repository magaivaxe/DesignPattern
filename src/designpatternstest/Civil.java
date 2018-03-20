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
public class Civil extends Character
{

    @Override
    void battle()
    {
        if (this.armes.equals("Knife"))
        {
            System.out.println("Knife Attack!");
        }
        else
        {
            System.out.println("I don't battle me!");
        }
    }
    
}

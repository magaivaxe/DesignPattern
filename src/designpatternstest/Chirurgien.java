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
public class Chirurgien extends Character
{

    @Override
    public void cure()
    {
        if (this.healthPack.equals("Big pack"))
        {
            System.out.println("I could do miracles!!");
        }
        else
        {
            System.out.println("I could do the operations");
        }
    }
}

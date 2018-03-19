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
public class DesignPatternsTest
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        //Array from type CHaracter Class that have the classes from game
        Character [] arrayChar = {new Soldier(), new Chirurgien(), new Civil(),
                                 new Sniper(), new Doctor()};
       
       for(Character c : arrayChar)
       {
           System.out.println("\nInstance from " + c.getClass().getName());
           System.out.println("*****************************************");
           
           c.battle();
           c.move();
       }
    }
    
}

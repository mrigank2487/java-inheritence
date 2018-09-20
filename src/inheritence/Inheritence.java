/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package inheritence;

/**
 *
 * @author Sandeep
 */
import java.io.*;
import java.util.Scanner;
class abc
{
    private int x,y;
    int getxy()
    {
        Scanner Sc= new Scanner(System.in);
        System.out.println("Enter a value: ");
        x= Sc.nextInt();
        System.out.println("Enter another value: ");
        y= Sc.nextInt();
        return(x+y);
        
    }
}

class xyz extends abc
{
    private int z;
    void calculate()
    {
        z=getxy();
        System.out.println("The sum is: "+z);
    }
}

public class Inheritence 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
       xyz obj= new xyz();
       obj.calculate();
    }
    
}

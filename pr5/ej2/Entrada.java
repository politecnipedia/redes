package ej2;
import java.net.*;
import java.io.*;
import java.util.Scanner;


/**
 * Write a description of class Entrada here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Entrada extends Thread
{
    // instance variables - replace the example below with your own
    Socket idE;

    /**
     * Constructor for objects of class Entrada
     */
    public Entrada(Socket s)
    {
        // initialise instance variables
        idE = s;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void run() {
        try {
            Scanner leer = new Scanner(idE.getInputStream());
            String recibe;
            while(leer.hasNext()) {
                recibe = leer.nextLine();
                System.out.println(recibe);
            }
            idE.close();
        } catch (Exception e) {System.err.println("Error: " + e);}
    }
}

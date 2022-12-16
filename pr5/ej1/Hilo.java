package ej1;
import java.net.*;
import java.util.Scanner;
import java.io.*;


/**
 * Write a description of class Hilo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Hilo extends Thread
{
    // instance variables - replace the example below with your own
    Socket id;

    /**
     * Constructor for objects of class Hilo
     */
    public Hilo(Socket s)
    {
        // initialise instance variables
        id = s;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void run () {
        try {
            Scanner entrada = new Scanner(id.getInputStream());
            PrintWriter salida = new PrintWriter(id.getOutputStream(), true);
            String recibe = "";
            while (!recibe.equals("FIN")) {
                
                recibe = entrada.nextLine();
                
                salida.println(recibe);
            }
            id.close();
        } catch (Exception e) {System.out.println("txao: " + e); }
    }
}

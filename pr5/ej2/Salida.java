package ej2;
import java.util.Scanner;
import java.io.*;
import java.net.*;


/**
 * Write a description of class Salida here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Salida extends Thread
{
    // instance variables - replace the example below with your own
    Socket idS;
    String name;

    /**
     * Constructor for objects of class Salida
     */
    public Salida(Socket s, String n)
    {
        // initialise instance variables
        idS = s;
        name = n;
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void run() {
        try {
            PrintWriter salida = new PrintWriter(idS.getOutputStream(), true);
            Scanner teclado = new Scanner(System.in);
            String texto = "";
            while(!texto.equalsIgnoreCase("quit")) {
                texto = teclado.nextLine();
                salida.println(name + ": " + texto);
            }
            idS.close();
        } catch (Exception e) {System.err.println("Error: " + e); }
    }
    
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);
        System.out.println("Cual es tu nombre?");
        String n = in.nextLine();
        Socket s = new Socket("rdc00.redes.upv.es",7777);
        Salida sal = new Salida(s, n);
        Entrada ent = new Entrada(s);
        sal.start();
        ent.start();
        while(sal.isAlive()) {
        }
    }
}

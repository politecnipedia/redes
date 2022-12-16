package ej1;
import java.net.*;
import java.io.*;
import java.util.Scanner;

/**
 * Write a description of class Main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Main
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Main
     */
    public static void main (String[] args) throws IOException {
        ServerSocket ss = new ServerSocket(7777);
        while (true) {
            Socket s = ss.accept();
            Hilo hi = new Hilo(s);
            hi.start();
        }
    }
}

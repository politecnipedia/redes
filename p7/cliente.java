import java.net.*;
/**
 * Write a description of class cliente here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cliente
{
    // instance variables - replace the example below with your own
    
    public static void main(String[] args) {
        try {
            DatagramSocket s = new DatagramSocket();
            System.out.println("Puerto local: " + s.getLocalPort());
        } catch (SocketException e) { System.out.println("hey");}
        
        
        
    }
}

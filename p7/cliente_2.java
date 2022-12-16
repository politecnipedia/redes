import java.net.*;
import java.io.*;

/**
 * Write a description of class cliente_2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class cliente_2
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        try {
            DatagramSocket s = new DatagramSocket();
            
            String ms = "Erik Beltran Lobato\n";
            DatagramPacket p = new DatagramPacket(ms.getBytes(),ms.getBytes().length,InetAddress.getByName("localhost"),7777);
            s.send(p);
            s.close();
        } catch(SocketException e) {
            System.out.println(e);
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            
        }
        
    }
}

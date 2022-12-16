import java.net.*;
import java.util.*;
import java.io.*;

/**
 * Write a description of class CopyOfservidorUDP_fecha here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CopyOfservidorUDP_fecha
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) {
        Date now = new Date();
        String now_string = now + "\r\n";
        try {
            DatagramSocket s = new DatagramSocket(7777);
            DatagramPacket p = new DatagramPacket(new byte[512], 512);
            s.setSoTimeout(5000);
            s.receive(p);

            p.setData(now_string.getBytes());
            p.setLength(now_string.length());
            s.send(p);

        } catch(SocketException e) {
            System.out.println(e);
        } catch (UnknownHostException e) {
            System.out.println(e);
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}

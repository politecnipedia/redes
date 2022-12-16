import java.net.*;
/**
 * Write a description of class dnslookup here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class dnslookup
{
    // instance variables - replace the example below with your own
    public static void main(String[] args) throws UnknownHostException {
        System.out.println(InetAddress.getByName(args[0]).toString().replace("/", ": "));
    }
}

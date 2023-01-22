package br.ufs.dcomp.InetAddressTest;

import java.net.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        try{
            
            String name = "www.google.com";
            InetAddress[] address = InetAddress.getAllByName(name);
            System.out.println( "Name:      "+ name);
            for (InetAddress inetAddress : address) {
                System.out.println("Address:   " + inetAddress.getHostAddress());

            }

        } catch (UnknownHostException e){
            System.out.println(e.getMessage());
        }                
    }
}

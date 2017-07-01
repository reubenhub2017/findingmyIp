/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testapplication;
import java.io.*;
import java.net.*;
import java.util.*;
import static java.lang.System.out;

/**
 *
 * @author reubenukah
 */
public class TestApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SocketException, UnknownHostException  {
        Enumeration<NetworkInterface> nets = NetworkInterface.getNetworkInterfaces();
          for(NetworkInterface netint:Collections.list(nets))
              displayInterfaceInformation(netint);
              System.out.println(InetAddress.getLocalHost());
        
        // TODO code application logic here
    }
   static void displayInterfaceInformation(NetworkInterface netint) throws  SocketException {
       out.printf("Display name: %s\n", netint.getDisplayName());
       out.printf("Name: %s\n", netint.getName());
       Enumeration<InetAddress> inetAddresses = netint.getInetAddresses();
       for(InetAddress inetAddress : Collections.list(inetAddresses)){
       out.printf("InetAddress: %s\n", inetAddresses);
       
       }
       
       out.printf("\n");
   
   
   }
}

import java.io.*;

import java.net.*;
public class PingSample 
{
	public static void main(String[] args) throws UnknownHostException, IOException 
	{
	    String ipAddress = "192.168.11.161";
	    InetAddress inet = InetAddress.getByName(ipAddress);

	    System.out.println("Sending Ping Request to " + ipAddress);
	    System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");

	    ipAddress = "173.194.32.38";
	    inet = InetAddress.getByName(ipAddress);

	    System.out.println("Sending Ping Request to " + ipAddress);
	    System.out.println(inet.isReachable(5000) ? "Host is reachable" : "Host is NOT reachable");
	}
}


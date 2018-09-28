	import java.io.*;  
	import java.net.*;  

public class ex149 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			try{  
			InetAddress ip=InetAddress.getByName("www.google.com");  
				  
				System.out.println("Host Name: "+ip.getHostName());  
				System.out.println("IP Address: "+ip.getHostAddress());  
				}catch(Exception e){System.out.println(e);}  

	}

}

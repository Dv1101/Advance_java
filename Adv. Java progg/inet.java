
import java.net.InetAddress;
import java.net.UnknownHostException;

public class inet {
	public static void main(String[]args)
    {
	String name ="";
	try{
		System.out.println("Host NAme - Numric Address : "+InetAddress.getLocalHost());
		InetAddress ip = InetAddress.getByName(name);
		System.out.println("Host Defaule Name : "+ ip);
		System.out.println("Host IP Address: "+ ip.getHostAddress());
		System.out.println("Host Default Name: "+ ip.getHostName());
	}
	catch(UnknownHostException e)
	{
		System.out.println("No find the IP-Address for:"+name);
	}
}
}
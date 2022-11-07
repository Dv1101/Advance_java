import java.net.*;

import java.io.*;

public class url

{

public static void main(String [] args)

{

try

{

URL url = new URL("http://www.amrood.com/index.html");

System.out.println("URL is " + url.toString());

System.out.println("protocol is " + url.getProtocol());

System.out.println("file name is " + url.getFile());

System.out.println("host is " + url.getHost());

System.out.println("path is " + url.getPath());

System.out.println("port is " + url.getPort());

System.out.println("default port is "+ url.getDefaultPort());

}catch(IOException e)

{

e.printStackTrace();

}

}

}
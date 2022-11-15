package java021_network;

import java.net.MalformedURLException;
import java.net.URL;

public class Java219_network {

	public static void main(String[] args) {
		try {
		URL url = new URL("https://movie.daum.net/moviedb/main?movieId=3212");
		System.out.println("getHost() : "+url.getHost());  //getHost() : movie.daum.net
		System.out.println("getProtocol() : "+url.getProtocol()); //getProtocol() : https
		System.out.println("getPort() : "+url.getPort()); //getPort() : -1
		System.out.println("getPath() : "+url.getPath()); //getPath() : /moviedb/main
		System.out.println("getQuery : "+url.getQuery()); //movieId=3212
		} catch(MalformedURLException e) {
			e.printStackTrace();
		} // end try
		
		
	} // end main

} // end class

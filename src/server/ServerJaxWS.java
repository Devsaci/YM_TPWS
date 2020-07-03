package server;

import javax.xml.ws.Endpoint;

import ws.BanqueService;

public class ServerJaxWS {
	public static void main(String[] args) {
		
		String url = "http://0.0.0.0:8686/";
		Endpoint.publish(url, new BanqueService());
		System.out.println("Web Service déployé sur : " + url);
		
		
	}
}

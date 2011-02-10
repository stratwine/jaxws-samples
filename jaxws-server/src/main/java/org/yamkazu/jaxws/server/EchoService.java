package org.yamkazu.jaxws.server;

import javax.jws.WebService;

@WebService
public class EchoService {

	public String echo(String message) {
		if (message == null) {
			return "Waht?";
		}
		return "echo: " + message;
	}

}

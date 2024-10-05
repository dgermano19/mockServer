package br.com.mockserver.webSocket.Consumer;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;

//Lógica do servidor para RECEBER mensagens do client websocket
public class webSoketServerConsumer {
	
	@MessageMapping("/send-message")
	public void handleMessage(String message) {
		System.out.println("Client Message: "+message);
	}
}

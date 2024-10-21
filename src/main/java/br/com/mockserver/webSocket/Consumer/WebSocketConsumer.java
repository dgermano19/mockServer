package br.com.mockserver.webSocket.Consumer;

import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Component;

// Consumer: Processa mensagesm que chegam e executa lógica dentro do método abaixo
@Component
public class WebSocketConsumer {

    @MessageMapping("/send")
    @SendTo("/queue/replies")
    public void processMessageFromClient(String message) {
        System.out.println("Mensagem recebida: " + message);
    }
    
    @MessageMapping("/send")
    @SendTo("/queue/camera-event")
    public void processCameraEvents(String event) {
        System.out.println("\n---Camera Event---\n" + event);
    }
}
package br.com.mockserver.webSocket.Producer;

import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Component;

//Producer: Envio de mensagens 
@Component
public class WebSocketProducer {

    private final SimpMessagingTemplate messagingTemplate; //Template de mensagem da lib messageing (pringboot)

    public WebSocketProducer(SimpMessagingTemplate messagingTemplate) {
        this.messagingTemplate = messagingTemplate;
    }

    public void sendMessage(String destination, String message) {
        messagingTemplate.convertAndSend(destination, message);
    }
}

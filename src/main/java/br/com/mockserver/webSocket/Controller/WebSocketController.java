package br.com.mockserver.webSocket.Controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.mockserver.webSocket.Producer.WebSocketProducer;

@RestController
public class WebSocketController {

    private final WebSocketProducer webSocketProducer;

    public WebSocketController(WebSocketProducer webSocketProducer) {
        this.webSocketProducer = webSocketProducer;
    }

    @PostMapping("/api/sendMessage")
    public void sendMessageToQueue(@RequestBody MessageRequest messageRequest) {
        // Envia mensagem para queue especificada abaixo
        webSocketProducer.sendMessage("/queue/updates", messageRequest.getMessage());
    }
}

class MessageRequest {
    private String message;

    // Getters and Setters
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
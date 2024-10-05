package br.com.mockserver.httpClient.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/notification")
// "/notification": Rota padrão para receber de eventos do Leitor facial
public class FaceIDEventController {
	
	//Recebe enventos do FaceID e imprime do console
	@PostMapping(consumes = MediaType.MULTIPART_MIXED_VALUE)
	public void handleMultipartRequest(@RequestPart("info") String jsonData){
		System.out.println("\n\n"+jsonData);
	}
}

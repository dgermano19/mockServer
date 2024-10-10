package br.com.mockserver.httpClient.Controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;


@RestController
@RequestMapping("/notification")
// "/notification": Rota padrão para receber de eventos do Leitor facial
public class FaceIDEventController {
	
	//Recebe enventos do FaceID e imprime do console
//	@PostMapping(consumes = MediaType.MULTIPART_MIXED_VALUE)
//	public void handleMultipartRequest(@RequestPart("info") String jsonData){
//		System.out.println("\n\n"+jsonData);
//	}
	
//	@PostMapping(consumes = {
//	        MediaType.APPLICATION_JSON_VALUE,
//	        MediaType.TEXT_PLAIN_VALUE,
//	        MediaType.MULTIPART_MIXED_VALUE,
//	        MediaType.ALL_VALUE
//	    })
//	    public void handleRawRequest(@RequestBody(required = false) String rawData, HttpServletRequest request) {
//	        // Print the Content-Type header
//	        String contentType = request.getContentType();
//	        System.out.println("Content-Type: " + contentType);
//
//	        // Check and print the body if present
//	        if (rawData == null || rawData.isEmpty()) {
//	            System.out.println("Request body is missing or empty.");
//	        } else {
//	            System.out.println("\n\n" + rawData);
//	        }
//	    }
	
	//Recebe enventos do FaceID e imprime do console
	@PostMapping(consumes = MediaType.MULTIPART_MIXED_VALUE)
	public void handleMultipartRequest(@RequestPart("info") String jsonData){
		
            System.out.println("\n\n" + jsonData);
	}
}

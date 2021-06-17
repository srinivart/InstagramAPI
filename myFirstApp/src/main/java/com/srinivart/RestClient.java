package com.srinivart;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.http.MediaType;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

import java.io.Reader;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RestClient {

    private static String URI = "17910853348420209?fields=media_url&access_token=IGQVJVLU9fMlNRWmpTTmxXalZA2YkczdHhET2xZAejVpT2tZAclU2bTZAFMkN1RDZAQX1lpNEpyU2ZAZAa2xlbXVINUhoNVRDWUxybDFmbWNpRGdiY253b1J2MkJvdlV6UmpaMkU0U25OREhaZAHZADQnA0ZAHhySW1rR1lOVFhIbktr";
    private WebClient webClient;

    public RestClient(WebClient webClient) {
        this.webClient = webClient;
    }


//    List<String> getAllImages(){
//        return webclient.get()
//                .uri(URI)
//                .retrieve()
//                .bodyToFlux(String.class).collectList().block();
//    }


    Mono<String> getAllImages() {
        Mono<String> response = webClient.get()
                .uri(URI)
                .accept(MediaType.APPLICATION_JSON)
                .retrieve()
                .bodyToMono(String.class);

        return response;



    }


}

package ma.emsi.service_rating.controller;

import ma.emsi.service_rating.beans.Appareil;
import ma.emsi.service_rating.beans.Categorie;
import ma.emsi.service_rating.service.RatingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.List;

@RestController
@RequestMapping("api/rating")
public class RatingController {
    @Autowired
    RestTemplate restTemplate;
    @Autowired
    RatingService ratingService;
    @Autowired
    WebClient webClient;
    String urlMSA1 = "http://localhost:5555/api/";

    @GetMapping("/filter/{id}")
    public Categorie Rate(@PathVariable Long id) {
        int countOn = 0;
        int countOff = 0;

        Categorie categorie11 = webClient.get()
                .uri(this.urlMSA1 + "categories/id/" + id)
                .retrieve()
                .bodyToMono(Categorie.class)
                .block();

        List<Categorie> categories = webClient.get()
                .uri(this.urlMSA1 + "categories")
                .retrieve()
                .bodyToFlux(Categorie.class)
                .collectList().block();

        return categorie11;
    }

    @PostMapping ("")
    public ResponseEntity<Appareil> addAppareil(@RequestBody Appareil appareil) {
        ResponseEntity<Appareil> response = restTemplate.postForEntity(this.urlMSA1 + "appareils", appareil, Appareil.class);
        return response;
    }
}

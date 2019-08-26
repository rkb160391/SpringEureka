package com.rkb.app;
import com.rkb.app.Movie;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;



@RestController
@EnableEurekaClient
public class RecommendationController {
    @Autowired
    RestTemplate restTemplate;

    @GetMapping("/recommendations")
    public Movie[] recommendations() {
        Movie[] result = restTemplate.getForObject("http://localhost:9001/movies", Movie[].class);
        return result;
    }
}
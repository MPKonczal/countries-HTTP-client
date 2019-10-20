package pl.edu.utp.wtie.homeworkweek5.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.edu.utp.wtie.homeworkweek5.model.Country;

import java.util.List;

@Controller
public class CountryController {

    public List<Country> getCountries() {
        RestTemplate restTemplate = new RestTemplate();
        return restTemplate.exchange("https://raw.githubusercontent.com/lorey/list-of-countries/master/json/countries-readable.json",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Country>>() {}).getBody();
    }
}

package pl.edu.utp.wtie.homeworkweek5.client;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.stereotype.Controller;
import org.springframework.web.client.RestTemplate;
import pl.edu.utp.wtie.homeworkweek5.model.Country;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Controller
public class CountryController {

    public List<Country> getCountries() {
        RestTemplate restTemplate = new RestTemplate();
        restTemplate.setMessageConverters(getMessageConverters());
        return restTemplate.exchange("https://raw.githubusercontent.com/lorey/list-of-countries/master/json/countries-readable.json",
                HttpMethod.GET, null, new ParameterizedTypeReference<List<Country>>() {}).getBody();
    }

    private List<HttpMessageConverter<?>> getMessageConverters() {
        List<HttpMessageConverter<?>> messageConverters = new ArrayList<>();
        MappingJackson2HttpMessageConverter converter = new MappingJackson2HttpMessageConverter();
        converter.setSupportedMediaTypes(Collections.singletonList(MediaType.ALL));
        messageConverters.add(converter);
        return messageConverters;
    }
}

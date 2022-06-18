package pl.pjwstk.jazs21161nbp.Service;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import pl.pjwstk.jazs21161nbp.model.NBPModel;

import java.util.Date;

@Service
public class NBPService {
    private final RestTemplate restTemplate;

    public NBPService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public NBPModel avgKurs(Date data_od, Date data_do) {
        NBPModel forEntity = restTemplate.getForEntity("http://api.nbp.pl/api/cenyzlota/" +data_od+"/"+data_do, NBPModel.class).getBody();
        return forEntity;
    }
}

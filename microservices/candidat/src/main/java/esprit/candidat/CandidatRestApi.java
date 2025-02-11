package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.function.EntityResponse;

import java.util.List;

@RestController
@RequestMapping("/candidat")
public class CandidatRestApi {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World";
    }
    @Autowired
    private CandidatService candidatService;
    @GetMapping("/list")
    public List<Candidat> list(){
        return candidatService.findAll();
    }
}

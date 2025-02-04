package esprit.candidat.Controller;

import esprit.candidat.Models.Adresse;
import esprit.candidat.Service.AdresseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class AdresseApi {
    @Autowired
    public AdresseImpl adresseimp;
    @PostMapping("/add")
    public Adresse addAdresse(@RequestBody Adresse adresse)
    {
        Adresse adresse1=adresseimp.addAdresse(adresse);
        return adresse1;
    }
    @DeleteMapping("/{id}")
    public void DeleteAdresse(@PathVariable int id)
    {
        adresseimp.DeleteAdresse(id);
    }
    @PutMapping
    public Adresse updateAdresse(@RequestBody Adresse adresse)
    {
        Adresse adresse1=adresseimp.updateAdresse(adresse);
        return adresse1;
    }

    @GetMapping("/{id}")
    public Adresse GetAdresse(@PathVariable int id)
    {
        Adresse adresse1=adresseimp.GetAdresse(id);
        return adresse1;
    }

    @GetMapping
    public List<Adresse> GetAllAdress()
    {
        List<Adresse>AdresseList=adresseimp.GetAllAdress();
        return AdresseList;
    }
}

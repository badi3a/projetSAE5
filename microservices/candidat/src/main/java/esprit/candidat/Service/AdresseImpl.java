package esprit.candidat.Service;

import esprit.candidat.Models.Adresse;
import esprit.candidat.Repository.AdresseRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdresseImpl implements AdresseCrud
{
    @Autowired
   public  AdresseRepo adresseRepo;

    @Override
    public Adresse addAdresse(Adresse adresse) {
        return adresseRepo.save(adresse);
    }

    @Override
    public List<Adresse> GetAllAdress() {
        return adresseRepo.findAll();
    }

    @Override
    public Adresse GetAdresse(int id) {
        return adresseRepo.findById(id).get();
    }

    @Override
    public Adresse updateAdresse(Adresse adresse) {
        return adresseRepo.save(adresse);
    }

    @Override
    public void DeleteAdresse(int id) {
        adresseRepo.deleteById(id);

    }
}

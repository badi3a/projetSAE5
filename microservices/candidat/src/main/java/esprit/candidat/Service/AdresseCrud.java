package esprit.candidat.Service;

import esprit.candidat.Models.Adresse;

import java.util.List;

public interface AdresseCrud {
    public Adresse addAdresse(Adresse adresse);
    public List<Adresse> GetAllAdress();
    public Adresse GetAdresse(int id);
    public Adresse updateAdresse(Adresse adresse);
    public void DeleteAdresse(int id);
}

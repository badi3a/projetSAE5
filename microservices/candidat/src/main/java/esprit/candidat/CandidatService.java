package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CandidatService {
    @Autowired
    CandidatRespository candidatRespository;
public List<Candidat> findAll() {
    return candidatRespository.findAll();
}
}

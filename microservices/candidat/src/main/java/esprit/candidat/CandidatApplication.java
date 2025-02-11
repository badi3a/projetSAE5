package esprit.candidat;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class CandidatApplication {

	public static void main(String[] args) {
		SpringApplication.run(CandidatApplication.class, args);
	}
     @Autowired
	CandidatRespository candidatRespository;
	@Bean
	public Candidat addCandidat() {
		return candidatRespository.save(new Candidat("Badia","Bouhdid","badia@gmail.com"));

	};
}

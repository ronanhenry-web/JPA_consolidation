package ronan.jpa.exercicejpa;

import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import ronan.jpa.exercicejpa.repository.ClientEmRepository;
import ronan.jpa.exercicejpa.service.ClientService;

@SpringBootApplication
@EnableJpaRepositories // optionnel avec SpringBoot
public class ExerciceJpaApplication {

    @Autowired
    private ClientService clientService;

    @Autowired
    private ClientEmRepository clientEmRepository;

    @Autowired
    private Exemple exemple;

    @PostConstruct
    public void test() {
        clientService.test();
        clientEmRepository.test();
        exemple.test();
    }

    public static void main(String[] args) {
        SpringApplication.run(ExerciceJpaApplication.class, args);
    }

}

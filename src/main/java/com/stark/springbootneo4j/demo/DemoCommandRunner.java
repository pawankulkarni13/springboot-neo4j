package com.stark.springbootneo4j.demo;


import com.stark.springbootneo4j.domain.Person;
import com.stark.springbootneo4j.repository.PersonRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class DemoCommandRunner {
    @Bean
    CommandLineRunner demo(PersonRepository personRepository) {
        return args -> {

            personRepository.deleteAll();
            Person pawan = new Person();
            pawan.setName("Pawan Kulkarni");
            pawan.setDob("13-04-1990");

            Person purvi = new Person();
            purvi.setName("Purvi Kulkarni");
            purvi.setDob("14-07-1993");

            Person swara = new Person();
            swara.setName("Swara Kulkarni");
            swara.setDob("10-10-2019");

            Person sneha = new Person();
            sneha.setName("Sneha Kulkarni");
            sneha.setDob("06-04-1968");

            Person shashikant = new Person();
            shashikant.setName("Shashikant Kulkarni");
            shashikant.setDob("21-02-1961");

            Person shridhar = new Person();
            shridhar.setName("Shridhar Kulkarni");
            shridhar.setDob("01-01-1961");

            Person surekha = new Person();
            surekha.setName("Surekha Kulkarni");
            surekha.setDob("01-01-1965");

            personRepository.save(pawan);
            personRepository.save(purvi);
            personRepository.save(swara);
            personRepository.save(sneha);
            personRepository.save(shashikant);
            personRepository.save(shridhar);
            personRepository.save(surekha);


            pawan.setCouples(purvi);

            shashikant.setCouples(sneha);

            shridhar.setCouples(surekha);

            pawan.setSonOf(shashikant);

            swara.setDaughterOf(pawan);

            purvi.setDaughterOf(shridhar);

            personRepository.save(pawan);
            personRepository.save(purvi);
            personRepository.save(swara);
            personRepository.save(sneha);
            personRepository.save(shashikant);
            personRepository.save(shridhar);

            System.out.println("Number of Person Counts : " + personRepository.count());

//            System.out.println(personRepository.findPersonByName(pawan.getName()));

//            personRepository.findAllByMarriedPersonIsTrue().stream().forEach(rec->System.out.println(rec.toString()));

        };
    }
}

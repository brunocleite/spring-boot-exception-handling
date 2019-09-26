package com.example.springbootexceptionhandling;

import com.example.springbootexceptionhandling.bird.BirdObjectMother;
import com.example.springbootexceptionhandling.bird.BirdRepository;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
@Slf4j
@AllArgsConstructor
public class DbInit implements ApplicationRunner {

    private BirdRepository birdRepository;

    public void run(ApplicationArguments args) {
        log.info("Populating database with sample data...");
        birdRepository.save(BirdObjectMother.createCanary());
    }
}
package com.example.springbootexceptionhandling.data;

import com.example.springbootexceptionhandling.bird.BirdObjectMother;
import com.example.springbootexceptionhandling.bird.BirdRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
public class SampleData {

    private BirdRepository birdRepository;

    void createSampleData() {
        birdRepository.save(BirdObjectMother.createCanary());
    }
}

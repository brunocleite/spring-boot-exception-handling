package com.example.springbootexceptionhandling.bird;

import org.springframework.data.repository.CrudRepository;

public interface BirdRepository extends CrudRepository<Bird, Long> {
}

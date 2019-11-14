package com.udacity.DogMS.repository;


import com.udacity.DogMS.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}
package com.example.myfirstwebservice.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.myfirstwebservice.entity.Person;

public interface PersonRepo extends JpaRepository<Person, Integer> {

}

package com.example.demo.service;

import com.example.demo.dto.Person;
import com.example.demo.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonService {

    @Autowired
    PersonRepository personRepository;
    public Person savePerson(Person p)
    {
        return personRepository.save(p);


    }


    public Person getPersonById(int id){
       return personRepository.findById(id).get();
    }

    public void deletePersonById(Integer pId) {
        personRepository.deleteById(pId);
    }
}

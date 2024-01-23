package com.example.demo.controller;

import com.example.demo.dto.Person;
import com.example.demo.dto.Task;
import com.example.demo.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RestController
@RequestMapping
public class DemoController {
    @Autowired
    PersonService personService;

    @PostMapping("/savePerson")
    public ResponseEntity savePerson(@RequestBody Person person) {
            return new ResponseEntity(personService.savePerson(person),HttpStatus.CREATED);
    }

    @GetMapping("/getPerson/{id}")
    public ResponseEntity getPerson(@PathVariable("id") Integer p_id)
    {
        return new ResponseEntity(personService.getPersonById(p_id),HttpStatus.OK);

    }
    @DeleteMapping("deletePerson/{id}")
    public ResponseEntity deletePerson(@PathVariable("id") Integer p_id){
        personService.deletePersonById(p_id);
        return new ResponseEntity("deleted record Successfully",HttpStatus.OK);
    }

}






 /*


    int empid;
    String emp_name;

    @PostMapping("/saveEmployee")
    public ResponseEntity saveEmployee(@RequestBody Person person ){
        List<Person> personlist= new ArrayList<Person>();
        personlist.add(person);
        List<Person> e=personlist.stream().filter(person1->person1.getId()>1).collect(Collectors.toList());
        System.out.println(e.toString());
        return new ResponseEntity(personlist, HttpStatus.CREATED);

*/























        /*
    @PostMapping("/createTask")
    public ResponseEntity createTask(@RequestBody Task task){
        List<Task> taskList=new ArrayList<Task>();
        taskList.add(task);
        return new ResponseEntity(taskList,HttpStatus.CREATED);
    }

    @GetMapping("/tasks")
    public ResponseEntity readTask(){
        List<Task> taskList=new ArrayList<>();
        List<Task> t=taskList.stream().findAny().stream().collect(Collectors.toList());

        return new ResponseEntity<Task>(for(Task i:taskList){i.toString()});
    }*/


   /* @GetMapping
    public RequestBody readTask(@RequestBody Task task)
    {

        Stream
        return;
    }*/










package com.example.demo.controller;


import com.example.demo.dto.Person;
        import com.example.demo.service.PersonService;
        import org.junit.jupiter.api.BeforeEach;
        import org.junit.jupiter.api.Test;
        import org.mockito.InjectMocks;
        import org.mockito.Mock;
        import org.mockito.MockitoAnnotations;
        import org.springframework.http.HttpStatus;
        import org.springframework.http.ResponseEntity;

import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.*;

class DemoControllerTest {

    @Mock
    private PersonService personService;

    @InjectMocks
    private DemoController demoController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSavePerson() {
        // Arrange
        Person person = new Person(); // create a Person object for testing
        when(personService.savePerson(any(Person.class))).thenReturn(person);

        // Act
        ResponseEntity result = demoController.savePerson(person);
        assertTrue(result.hasBody());
        // Assert
       // verify(personService, times(1)).savePerson(any(Person.class));
        assert result.getStatusCode() == HttpStatus.CREATED;
    }

    @Test
    void testGetPerson() {
        // Arrange
        int personId = 1; // set the ID for testing
        when(personService.getPersonById(personId)).thenReturn(new Person()); // mock the service method
        // Act
        ResponseEntity result = demoController.getPerson(personId);
        assertTrue(result.hasBody());

                // Assert
        verify(personService, times(1)).getPersonById(personId);
        assert result.getStatusCode() == HttpStatus.OK;
    }
}

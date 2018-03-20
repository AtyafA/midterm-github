package com.cisc181.core;

public class PersonException extends Exception {

    private String message;
    private  Person person;
    
    public PersonException(Person person, String message) {
        this.person = person;
        this.message = message;
    }
    
    @Override
    public String getMessage() {
        return person + " : " + message;
    }
}


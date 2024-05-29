package views;

import models.Persona;

public class PersonView {
    Persona person;
    public PersonView(Persona person){
        this.person = person;
    }

    public void printName (){
        System.out.println("My name is: "+this.person.getName());
    }
}

package Controllers;

import java.util.List;

import models.Persona;

public class PersonController {
    public Persona searchPersonaByAges(List<Persona> personas, int age){
            for (Persona persona : personas) {
                if (persona.getAges()==age) return persona;
            }
            return null;
    }
}

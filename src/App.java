import java.util.ArrayList;
import java.util.List;

import javax.swing.text.View;

import Controllers.PersonController;
import models.Persona;
import views.PersonView;

public class App {
    public static void main(String[] args) throws Exception {
        PersonController controller = new PersonController();
        List<Persona> persona = new ArrayList<>();
        persona.add(new Persona("Carlos", 12));
        persona.add(new Persona("Paula", 14));
        persona.add(new Persona("Steben", 42));
        persona.add(new Persona("Josue", 32));
        persona.add(new Persona("Viviana", 54));
        persona.add(new Persona("Paul", 76));

        Persona personaEncontrada = controller.searchPersonaByAges(persona, 32);
        PersonView view = new PersonView(personaEncontrada);
        view.printName();
    }

    
}

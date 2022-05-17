import java.util.ArrayList;
import java.util.Collections;

public class Classifica 
{
    ArrayList <Persona> classifica = new ArrayList<Persona>();   
    
    public Classifica(){}

    public void Aggiungi(Persona p)
    {
        classifica.add(p);
    }

    public void aggiusta()
    {
        Collections.sort(classifica);
    }
    
}

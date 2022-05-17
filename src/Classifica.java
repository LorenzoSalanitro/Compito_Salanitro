import java.util.ArrayList;
import java.util.Collections;

public class Classifica 
{

    ArrayList <Persona> classifica = new ArrayList<Persona>();   
    
    /**
     * constructor of the class
     */
    public Classifica(){}

    /**
     * methods to add person in to the ArrayList
     * @param p
     */
    public void Aggiungi(Persona p)
    {
        classifica.add(p);
    }
    
    /**
     * methods to sort the ArrayList
     */
    public void aggiusta()
    {
        Collections.sort(classifica);
    }
    
}

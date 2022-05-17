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

        /*for(int i = 0; i< classifica.size(); i++)
        {
            for(int j = 1; j<classifica.size()-1; j++)
            {
                if(classifica.get(i).tempo_fin < classifica.get(j).tempo_fin)
                {

                }
            }
        }*/
    }
    
}

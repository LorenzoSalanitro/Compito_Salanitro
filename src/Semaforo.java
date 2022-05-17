public class Semaforo 
{
    int valore;

    public Semaforo(int v)
    {
        this.valore = v;
    }

    synchronized public void Prendi()
    {
        while(valore == 0)
        {
            try
            {
                wait();
            }
            catch(Exception e)
            {

            }
        }
        valore--;
    }

    synchronized public void libera()
    {
        valore++;
        notify();
    }
}

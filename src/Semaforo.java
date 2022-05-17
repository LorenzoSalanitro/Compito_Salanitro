public class Semaforo 
{
    /**
     * 
     * @param valore number of the people that can use the risource
     */
    int valore;

    /**
     * constructor of the class
     * @param v
     */
    public Semaforo(int v)
    {
        this.valore = v;
    }

    /**
     * method to take the risource
     */
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

    /**
     * method to leave the risource
     */
    synchronized public void libera()
    {
        valore++;
        notify();
    }
}

public class Persona extends Thread implements Comparable<Persona>
{
    /**
     * this class uses thread 
     * 
     * @param nome name of the person
     * @param spogliatoio change room to use
     * @param semaforo street light to use
     */
    String nome;
    Spogliatoio spogliatoglio;
    Semaforo semaforo;

    long inizio;
    long fine;
    long tempo_fin;

    /**
     * constructor of the class
     * @param nome
     * @param spogliatoglio
     * @param semaforo
     */
    public Persona(String nome, Spogliatoio spogliatoglio, Semaforo semaforo) {
        this.nome = nome;
        this.spogliatoglio = spogliatoglio;
        this.semaforo = semaforo;
    }

    /**
     * create the thread and run it
     * @return void
     */
    @Override
    public void run()
    {
        semaforo.Prendi();
        spogliatoglio.usa_Spo(nome);
        semaforo.libera();

        System.out.println(nome +" è entrato in pista");
        System.out.println(" ");
        inizio = System.nanoTime();

        for(int i =0; i < 15; i++)
        {
            try
            {
                Thread.sleep((long)(Math.random() * 1000));
            }
            catch(Exception e){}
            
        }

        fine = System.nanoTime();
        tempo_fin = (fine-inizio) / 1000000;
        System.out.println(nome +" è uscito dalla pista");
        System.out.println(" ");

        semaforo.Prendi();
        spogliatoglio.usa_Spo(nome);
        semaforo.libera();
    }
    
    /**
     * 
     * @param p
     * @return the compare between two persone
    */
    @Override
    public int compareTo(Persona p) {
        return (int)(this.tempo_fin - p.tempo_fin);
    }
}

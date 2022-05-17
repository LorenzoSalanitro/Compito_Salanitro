public class Persona extends Thread implements Comparable<Persona>
{
    String nome;
    Spogliatoglio spogliatoglio;
    Semaforo semaforo;

    long inizio;
    long fine;
    long tempo_fin;

    public Persona(String nome, Spogliatoglio spogliatoglio, Semaforo semaforo) {
        this.nome = nome;
        this.spogliatoglio = spogliatoglio;
        this.semaforo = semaforo;
    }

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
    

    @Override
    public int compareTo(Persona p) {
        return (int)(this.tempo_fin - p.tempo_fin);
    }
}

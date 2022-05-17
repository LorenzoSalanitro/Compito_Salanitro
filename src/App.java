public class App {
    public static void main(String[] args) throws Exception 
    {
        Semaforo semaforo = new Semaforo(2);
        Spogliatoglio spogliatoglio = new Spogliatoglio();
        Classifica b = new Classifica();

        Persona p1 = new Persona("marco", spogliatoglio, semaforo);
        Persona p2 = new Persona("gianluca", spogliatoglio, semaforo);
        Persona p3 = new Persona("andrea", spogliatoglio, semaforo);
        Persona p4 = new Persona("davide", spogliatoglio, semaforo);
        Persona p5 = new Persona("mirko", spogliatoglio, semaforo);
        Persona p6 = new Persona("gioele", spogliatoglio, semaforo);
        Persona p7 = new Persona("manuele", spogliatoglio, semaforo);
        Persona p8 = new Persona("federico", spogliatoglio, semaforo);
        
        System.out.println("inizio");
        System.out.println(" ");

        p1.start();
        p2.start();
        p3.start();
        p4.start();
        p5.start();
        p6.start();
        p7.start();
        p8.start();

        
        p1.join();
        p2.join();
        p3.join();
        p4.join();
        p5.join();
        p6.join();
        p7.join();
        p8.join();

        b.Aggiungi(p1);
        b.Aggiungi(p2);
        b.Aggiungi(p3);
        b.Aggiungi(p4);
        b.Aggiungi(p5);
        b.Aggiungi(p6);
        b.Aggiungi(p7);
        b.Aggiungi(p8);

        b.aggiusta();


        System.out.println(" ");
        System.out.println("Stampa Classifica");
        System.out.println(" ");
        for(int i = 0; i< b.classifica.size(); i++)
        {
            System.out.println(b.classifica.get(i).nome + " "+ b.classifica.get(i).tempo_fin);
        }
        
        System.out.println("fine");
    }
}

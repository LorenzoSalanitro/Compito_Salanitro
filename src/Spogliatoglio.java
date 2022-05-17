public class Spogliatoglio 
{
    public Spogliatoglio()
    {

    }

    public void usa_Spo(String nome)
    {
        try
        {
            System.out.println(nome + " è entrato nello spogliatoio");
            System.out.println(" ");
            Thread.sleep((long)(Math.random() * 1000));
            System.out.println(nome + " è uscito dallo spogliatoio");
            System.out.println(" ");
        }catch(Exception e){}
    }
}

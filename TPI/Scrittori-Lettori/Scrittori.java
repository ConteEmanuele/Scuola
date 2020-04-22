package scrittori;

import java.util.Random;

public class Scrittori extends Thread {

    private Messaggi messaggi;
    private int numeroScrittore;
    private String messaggio;
    private Random r = new Random();
    private int destinatario;

    public Scrittori(Messaggi messaggi, int numeroScrittore) {
        this.messaggi = messaggi;
        this.numeroScrittore = numeroScrittore;
        this.messaggio = "Ciao" ;
    }
    
    @Override
    public void run(){
        try{
            
            while(true){
                this.destinatario = (r.nextInt(3)+1);
                System.out.println( this.numeroScrittore + " scrive a " + this.destinatario);
                messaggi.scriviMessaggio(this.numeroScrittore, this.destinatario, this.messaggio);
                Thread.sleep(3000); 
                /*Gli scrittori stampano un messaggio nel quale comunicano
                a chi stanno per scrivere, poi scrivono il messaggio e una
                volta fatto aspettano 3 secondi prima di scriverne uno nuovo*/
            }
            
        }catch( InterruptedException e ){}
    }
    
}

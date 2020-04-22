package scrittori;

public class Lettori extends Thread{
    
    private Messaggi messaggi;
    private int numeroLettore;

    public Lettori(Messaggi messaggi, int numeroLettore) {
        this.messaggi = messaggi;
        this.numeroLettore = numeroLettore;
    }

    @Override
    public void run(){
        String s;
        try{
            
            while(true){
                    messaggi.leggiMessaggi(this.numeroLettore);
                    Thread.sleep(1000);
                    /* I lettori si limitano a leggere i messaggi,
                    ne leggono uno ogni secondo considerando che potrebbero
                    aver ricevuto il messaggio da piu di uno scrittore*/
            }
            
        }catch(InterruptedException e){}
    }
    
}

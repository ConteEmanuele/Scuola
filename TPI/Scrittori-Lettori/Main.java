package scrittori;

public class Main {
    
    public static void main( String[] args ) throws InterruptedException{
        
        /*Creo un oggetto di tipo Messaggi da passare agli scrittori
        e ai lettori per far si che comunichino*/
        
        Messaggi messaggi = new Messaggi();
        
        Scrittori scrittore1 = new Scrittori( messaggi, 1 );
        Scrittori scrittore2 = new Scrittori( messaggi, 2 );
        Scrittori scrittore3 = new Scrittori( messaggi, 3 );
        
        Lettori lettore1 = new Lettori( messaggi, 1 );
        Lettori lettore2 = new Lettori( messaggi, 2 );
        Lettori lettore3 = new Lettori( messaggi, 3 );
        
        scrittore1.start();
        scrittore2.start();
        scrittore3.start();
        
        lettore1.start();
        lettore2.start();
        lettore3.start();
        
        Thread.sleep(30000);
        
        scrittore1.interrupt();
        scrittore2.interrupt();
        scrittore3.interrupt();
        
        lettore1.interrupt();
        lettore2.interrupt();
        lettore3.interrupt();
        
        /*So che avrei potuto creare e far iniziare i Thread con un ciclo for
        ma ho preferito fare così perchè nonostante sia più lungo
        mi permette di vedere ogni operazione che faccio*/
        
    }
    
}

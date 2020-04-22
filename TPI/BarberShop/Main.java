package barbershop;

import java.util.Random;

public class Main {
    
    public static void main( String[] args ) throws InterruptedException{
        
        Random r = new Random();
        
        WaitingRoom w = new WaitingRoom();
        
        Barber barber = new Barber(w);
        barber.start();
        
        for( int i = 0; i < 29; i++ ){
            Customer c = new Customer( w, (i+1) );
            c.start();
            Thread.sleep(r.nextInt(1001));/*Mando il main in sleep per un tempo casuale da 0 a 1 secondo,
            in modo che alcuni clienti abbiano il tempo di andarsene ed altri il tempo di entrare, senza
            che riescano a entrare solo i primi 5 clienti. Per dimostrare che mentre il barbiere si riposa
            puo essere svegliato da un cliente(oltre quando all'inizio quando non trovando nessun cliente 
            riposa, e riprende all'arrivo del primo cliente) basta alzare il tempo a piu di 1 secondo.*/
        }
        
        Thread.sleep(30000);
        
        barber.interrupt();
    }
    
}

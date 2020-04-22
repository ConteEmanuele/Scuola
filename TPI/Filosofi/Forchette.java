package filosofi;

import java.util.Arrays;

public class Forchette {
    
    private Forchetta[] forchette;
    private final int DIM = 10; 

    public Forchette() {
        
        forchette = new Forchetta[DIM];
        for (int i = 0; i < DIM; i++ ){
            forchette[i] = new Forchetta(i);
        }
        
    }

    public synchronized boolean prendiForchetta( int sinistra, int destra) throws InterruptedException {
        
        if( (forchette[sinistra].getStatoForchetta() == true) && (forchette[destra].getStatoForchetta() == true) ){
            forchette[sinistra].setStatoForchetta(false);
            forchette[destra].setStatoForchetta(false);
            System.out.println( "Filosofo " + sinistra + " sta mangiando..." );
            wait(3000); /*Se tutte e 2 le forchette sono disponibili allora 
            il filosofo le prende e mangia per 3 secondi, poi le lascia e inizia a pensare*/
            lasciaForchette(sinistra,destra);
            System.out.println( "Filosofo " + sinistra + " sta pensando..." );
            return true;
        }
        else
            return false;
    }
    
    public synchronized void lasciaForchette( int sinistra, int destra ) throws InterruptedException {
        
        forchette[sinistra].setStatoForchetta(true);
        forchette[destra].setStatoForchetta(true);
        System.out.println( "Filosofo " + sinistra + " ha lasciato le forchette" );
        notifyAll();
        
    }

    public int getForchetta( int i ) {
        return forchette[i].getNumeroForchetta();
    }
    
    public void setForchetta( int i, int valore ) {
        forchette[i].setNumeroForchetta(valore);
    }

    public void stampa() {
       System.out.println(Arrays.toString(forchette));
    }

    public int getDIM() {
        return DIM;
    }
    
    
}

package filosofi;

public class Main {
    
    public static void main( String[] args ) throws InterruptedException{
        
        /*Creo un oggetto di tipo Forchette da passare ai filosofi
        che sarà poi metaforicamente la tavola con sopra le forchette*/
        
        Forchette forchette = new Forchette();
        
        Filosofi filosofo0 = new Filosofi( 0, forchette ); 
        Filosofi filosofo1 = new Filosofi( 1, forchette ); 
        Filosofi filosofo2 = new Filosofi( 2, forchette ); 
        Filosofi filosofo3 = new Filosofi( 3, forchette ); 
        Filosofi filosofo4 = new Filosofi( 4, forchette );
        Filosofi filosofo5 = new Filosofi( 5, forchette );
        Filosofi filosofo6 = new Filosofi( 6, forchette );
        Filosofi filosofo7 = new Filosofi( 7, forchette );
        Filosofi filosofo8 = new Filosofi( 8, forchette );
        Filosofi filosofo9 = new Filosofi( 9, forchette );
        
        filosofo0.start();
        filosofo1.start();
        filosofo2.start();
        filosofo3.start();
        filosofo4.start();
        filosofo5.start();
        filosofo6.start();
        filosofo7.start();
        filosofo8.start();
        filosofo9.start();
        
        Thread.sleep(30000);
        
        filosofo0.interrupt();
        filosofo1.interrupt();
        filosofo2.interrupt();
        filosofo3.interrupt();
        filosofo4.interrupt();
        filosofo5.interrupt();
        filosofo6.interrupt();
        filosofo7.interrupt();
        filosofo8.interrupt();
        filosofo9.interrupt();
    }
    
    /*So che avrei potuto creare e far iniziare i Thread con un ciclo for
    ma ho preferito fare così perchè nonostante sia più lungo
    mi permette di vedere ogni operazione che faccio*/
        
    
}

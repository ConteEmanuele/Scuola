package barbershop;

import java.util.Arrays;

public class WaitingRoom {

   private int[] chairs;
   private static int index = (-1);
   private final int DIM = 5;

    public WaitingRoom(){
        this.chairs = new int[DIM];
    }

    public synchronized int getIndex(){
        
        return index;
        
    }
    
    public synchronized void setIndex( int i ){
        
        index = i;
        
    }
    
    public synchronized int serveCustomer(){
        int chair = chairs[0];
        index--;
        for( int i = 0; i < DIM - 1; i++ ){
            chairs[i] = chairs[(i+1)];
        }
        chairs[DIM-1] = 0;
        return chair;
    }
    
    public synchronized boolean checkChairsCustomer( int customer ){
        
        if( index == (DIM-1) ){
            System.out.println("Cliente " + customer + " va via" );
            return false;
        }
        else{
            chairs[++index] = customer;
            System.out.println( "cliente " + customer + " entrato" );
            stampa();
            this.notifyAll();
            return true;
        }
        
    }
    
    public synchronized boolean checkCustomers() throws InterruptedException{
        if( index == (-1) ){
            System.out.println( "Barbiere si riposa..." );
            this.wait();
            return true;
        }
        else
            return false;
    } 
    
    public synchronized void stampa(){
        
        System.out.println(Arrays.toString(chairs));
        
    }
    
}

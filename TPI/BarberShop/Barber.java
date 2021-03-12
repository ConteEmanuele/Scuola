package barbershop;


public class Barber extends Thread {
    
    System.out.println("Prova");
    WaitingRoom waitingRoom;
    private int barberChair = 0;
    private boolean barber = true;

    public Barber( WaitingRoom waitingRoom ) {
        this.waitingRoom = waitingRoom;
    }
    
    @Override
    public void run(){
        try{
            while(true){
                
                if( !this.waitingRoom.checkCustomers() ){       
                    this.barberChair = waitingRoom.serveCustomer();
                    System.out.println("Cliente " + this.barberChair + " Servito! ");
                    waitingRoom.stampa();
                }
                
                Thread.sleep(1000);
            }
            
        }catch( InterruptedException e ){}
    }
    
}

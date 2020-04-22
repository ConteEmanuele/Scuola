package barbershop;

public class Customer extends Thread {
    
    WaitingRoom waitingRoom;
    private int customer;

    public Customer(WaitingRoom waitingRoom, int customer) {
        this.waitingRoom = waitingRoom;
        this.customer = customer;
    }
    
    @Override
    public void run(){
        
                if( !this.waitingRoom.checkChairsCustomer(this.customer) );
    
    }
    
}

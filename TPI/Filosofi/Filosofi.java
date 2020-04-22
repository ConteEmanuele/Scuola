package filosofi;

public class Filosofi extends Thread{

    private final int filosofo;
    private Forchette forchetteDisponibili;

    public Filosofi(int filosofo, Forchette forchetteDisponibili) {
        
        this.filosofo = filosofo;
        this.forchetteDisponibili = forchetteDisponibili;
        
    }

    public int getFilosofo() {
        
        return this.filosofo;
        
    }
    
    public int sinistra(){
        
        return this.filosofo;
        
    }
    
    public int destra(){
        
        if( this.filosofo == (forchetteDisponibili.getDIM() - 1) )
            return 0;
        else
            return (this.filosofo + 1);
        
    }
    
    
    @Override
    public void run(){
        
        try{
            while(true){
                if( this.forchetteDisponibili.prendiForchetta(sinistra(), destra()) == true )
                    Thread.sleep(8000); //Se ha mangiato il filosofo riposa 8 secondi 
                else
                    Thread.sleep(1000); //Altrimenti aspetta un secondo e riprova
            }
        }catch( InterruptedException e ){}
    
    }
}


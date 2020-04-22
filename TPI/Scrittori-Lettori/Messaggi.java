package scrittori;

public class Messaggi {
    
    Messaggio[] messaggi;
    private final int DIM = 3;

    public Messaggi() {
        messaggi = new Messaggio[DIM];
        for( int i = 0; i < DIM; i++ ){
            messaggi[i] = new Messaggio( 0, null );
            //inizializzo l'array in modo che tutti i messaggi abbiamo conferma di lettura = true
        }
    }
    
    public synchronized void scriviMessaggio(int mittente, int destinatario, String messaggio ) throws InterruptedException{
        while( !messaggi[(destinatario - 1)].getConferma() ){
            this.wait(100); //Se il mesaggio non è ancora stato letto, lo scrittore aspetta mezzo secondo e riprova a scrivere il suo messaggio
        }
        messaggi[(destinatario - 1)] = new Messaggio( mittente, messaggio );
        messaggi[(destinatario - 1)].setConfermaDiLettura(false);

        
    }
    
    public synchronized void leggiMessaggi( int destinatario ) throws InterruptedException{
        
        if( !messaggi[(destinatario - 1)].getConferma() ){//Se il messaggio è gia stato letto allora il lettore non lo rilegge
            System.out.println( "\nMittente: " + messaggi[(destinatario - 1)].getMittente()
                              + "\nDestinatario: " + destinatario
                              + "\nMessaggio: " + messaggi[(destinatario - 1)].getMessaggio() + "\n" );
            messaggi[(destinatario - 1)].setConfermaDiLettura(true);
            //in caso contrario lo legge e conferma di averlo letto
        }
        
    }
    
}

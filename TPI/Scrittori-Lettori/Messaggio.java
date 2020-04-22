package scrittori;

public class Messaggio {
    
    private int mittente;
    private String messaggio;
    private boolean confermaDiLettura;

    public Messaggio(int mittente, String messaggio) {
        this.mittente = mittente;
        this.messaggio = messaggio;
        this.confermaDiLettura = true;
    }

    public void setMittente(int mittente) {
        this.mittente = mittente;
    }

    public void setMessaggio(String messaggio) {
        this.messaggio = messaggio;
    }

    public void setConfermaDiLettura(boolean confermaDiLettura) {
        this.confermaDiLettura = confermaDiLettura;
    }
    
    public int getMittente() {
        return mittente;
    }

    public String getMessaggio() {
        return messaggio;
    }
    
    public boolean getConferma() {
        return this.confermaDiLettura;
    }
    
}

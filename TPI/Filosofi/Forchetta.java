package filosofi;

public class Forchetta {
    
    private int numeroForchetta;
    private boolean statoForchetta;

    public Forchetta(int numeroForchetta) {
        this.numeroForchetta = numeroForchetta;
        this.statoForchetta = true;
        //se true la forchetta è disponibile
        
    }

    public int getNumeroForchetta() {
        return numeroForchetta;
    }

    public boolean getStatoForchetta() {
        return statoForchetta;
    }

    public void setNumeroForchetta(int numeroForchetta) {
        this.numeroForchetta = numeroForchetta;
    }

    public void setStatoForchetta(boolean statoForchetta) {
        this.statoForchetta = statoForchetta;
    }
    
}

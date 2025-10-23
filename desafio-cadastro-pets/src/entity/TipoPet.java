package entity;

public enum TipoPet {
    CACHORRO(1),
    GATO(2);

    private final int tipoPet;

    TipoPet(int tipoPetInt){
        this.tipoPet = tipoPetInt;
    }

    public int getTipoPet(){
        return this.tipoPet;
    }
}

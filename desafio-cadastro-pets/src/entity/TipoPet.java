package entity;

public enum TipoPet {
    CACHORRO("Cachorro"),
    GATO("Gato");

    private final String tipoPet;

    TipoPet(String tipoPetString){
        this.tipoPet = tipoPetString;
    }

    public String getTipoPet(){
        return this.tipoPet;
    }
}

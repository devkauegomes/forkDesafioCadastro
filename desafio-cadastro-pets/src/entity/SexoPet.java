package entity;

public enum SexoPet {
    MACHO(1),
    FEMEA(2);

    private final int sexoPet;

    SexoPet(int sexoPetInt){
        this.sexoPet = sexoPetInt;
    }

    public int getSexoPet(){
        return this.sexoPet;
    }
}

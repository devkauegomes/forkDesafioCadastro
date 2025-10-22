package entity;

public enum SexoPet {
    MACHO("Macho"),
    FEMEA("Fêmea");

    private final String sexoPet;

    SexoPet(String sexoPetString){
        this.sexoPet = sexoPetString;
    }

    public String getSexoPet(){
        return this.sexoPet;
    }
}

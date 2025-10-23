package entity;

import util.ConstanteUtils;

public class Endereco {
    private Integer numeroDaCasa;
    private String cidade;
    private String rua;
    private String bairro;

    public Endereco(Integer numeroDaCasa, String cidade, String rua, String bairro) {
        this.numeroDaCasa = numeroDaCasa;
        this.cidade = cidade;
        this.rua = rua;
        this.bairro = bairro;
    }

    public Integer getNumeroDaCasa() {
        return numeroDaCasa;
    }

    public void setNumeroDaCasa(Integer numeroDaCasa) {
        if (numeroDaCasa < 0){
            throw new IllegalArgumentException("O numero deve ser maior ou igual a 0.");
        }
        this.numeroDaCasa = numeroDaCasa;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        if (cidade == null || cidade.isEmpty()){
            throw new IllegalArgumentException("A cidade não deve ser nula ou vazia.");
        }
        this.cidade = cidade;
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        if (rua == null || rua.isEmpty()){
            throw new IllegalArgumentException("A rua não deve ser nula ou vazia.");
        }
        this.rua = rua;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        if (bairro == null || bairro.isEmpty()){
            throw new IllegalArgumentException("O bairro não deve ser nulo ou vazio.");
        }
        this.bairro = bairro;
    }
}

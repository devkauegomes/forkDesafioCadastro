package entity;

public class EnderecoEncontrado {
    private String endereco;
    private String bairro;

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        if (endereco == null || endereco.isEmpty()){
            throw new IllegalArgumentException("O endereço não deve ser nulo ou vazio.");
        }
        this.endereco = endereco;
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

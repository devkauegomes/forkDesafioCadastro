package entity;

public class Pet {
    private String nome;
    private String sobreNome;
    private TipoPet tipoPet;
    private SexoPet sexoPet;
    private EnderecoEncontrado enderecoEncontrado;
    private int idade;
    private double peso;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O nome não deve ser nulo ou vazio.");
        }
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        if (nome == null || nome.isEmpty()){
            throw new IllegalArgumentException("O sobrenome não deve ser nulo ou vazio.");
        }
        this.sobreNome = sobreNome;
    }

    public TipoPet getTipoPet() {
        return tipoPet;
    }

    public void setTipoPet(TipoPet tipoPet) {
        this.tipoPet = tipoPet;
    }

    public SexoPet getSexoPet() {
        return sexoPet;
    }

    public void setSexoPet(SexoPet sexoPet) {
        this.sexoPet = sexoPet;
    }

    public EnderecoEncontrado getEnderecoEncontrado() {
        return enderecoEncontrado;
    }

    public void setEnderecoEncontrado(EnderecoEncontrado enderecoEncontrado) {
        if (enderecoEncontrado == null){
            throw new IllegalArgumentException("O endereço encontrado não pode ser nulo.");
        }
        this.enderecoEncontrado = enderecoEncontrado;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade <= 0){
            throw new IllegalArgumentException("A idade deve ser maior que 0.");
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso <= 0){
            throw new IllegalArgumentException("A peso deve ser maior que 0.");
        }
        this.peso = peso;
    }
}

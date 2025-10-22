package entity;


public class Pet {
    private String nome;
    private String sobreNome;
    private TipoPet tipoPet;
    private SexoPet sexoPet;
    private Endereco endereco;
    private int idade;
    private double peso;
    private String raca;
    public static final String NAO_INFORMADO = "NÃO INFORMADO";

    public Pet(String nome, String sobreNome, TipoPet tipoPet, SexoPet sexoPet, Endereco endereco, int idade, double peso, String raca) {
        this.nome = (nome == null || nome.isBlank()) ? NAO_INFORMADO : nome;
        this.sobreNome = (sobreNome == null || sobreNome.isBlank()) ? NAO_INFORMADO : sobreNome;
        this.tipoPet = tipoPet;
        this.sexoPet = sexoPet;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = (raca == null || raca.isBlank()) ? NAO_INFORMADO : raca;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if (nome == null) {
            throw new IllegalArgumentException("O nome não deve ser nulo.");
        } else if (nome.isEmpty()) {
            this.nome = NAO_INFORMADO;
            return;
        }
        this.nome = nome;
    }

    public String getSobreNome() {
        return sobreNome;
    }

    public void setSobreNome(String sobreNome) {
        if (nome == null || nome.isEmpty()) {
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

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        if (endereco == null) {
            throw new IllegalArgumentException("O endereço encontrado não pode ser nulo.");
        }
        this.endereco = endereco;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        if (idade < 0 || idade > 20) {
            throw new IllegalArgumentException("A idade não deve ultrapassar 20 anos ou ser menor que 0.");
        }
        this.idade = idade;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        if (peso < 0.5 || peso > 60) {
            throw new IllegalArgumentException("A peso deve estar entre 0.5kg e 60kg.");
        }
        this.peso = peso;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        if (raca == null) throw new IllegalArgumentException("A raça não deve ser nula.");
        else if (raca.isEmpty()) {
            this.raca = NAO_INFORMADO;
            return;
        }
        this.raca = raca;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome +
                "\nSobrenome: " + this.sobreNome +
                "\nTipo: " + this.tipoPet +
                "\nSexo: " + this.sexoPet +
                "\nEndereço... " +
                "\nCidade: " + this.endereco.getCidade() +
                "\nRua: " + this.endereco.getRua() +
                "\nBairro: " + this.endereco.getBairro() +
                "\nIdade: " + this.idade +
                "\nPeso: " + this.peso +
                "\nRaça: " + this.raca;
    }
}

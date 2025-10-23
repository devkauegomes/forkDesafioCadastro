package entity;


import util.ConstanteUtils;

public class Pet {
    private String nomeSobrenome;
    private TipoPet tipoPet;
    private SexoPet sexoPet;
    private Endereco endereco;
    private Double idade;
    private Double peso;
    private String raca;

    public Pet(String nomeSobrenome, TipoPet tipoPet, SexoPet sexoPet, Endereco endereco, Double idade, Double peso, String raca) {
        this.nomeSobrenome = (nomeSobrenome == null || nomeSobrenome.isBlank()) ? ConstanteUtils.NAO_INFORMADO : nomeSobrenome;
        this.tipoPet = tipoPet;
        this.sexoPet = sexoPet;
        this.endereco = endereco;
        this.idade = idade;
        this.peso = peso;
        this.raca = (raca == null || raca.isBlank()) ? ConstanteUtils.NAO_INFORMADO : raca;
    }

    public Pet() {
    }

    public String getNomeSobrenome() {
        return nomeSobrenome;
    }

    public void setNomeSobrenome(String nome) {
        if (nome == null || nome.isEmpty()) {
            this.nomeSobrenome = ConstanteUtils.NAO_INFORMADO;
            return;
        }
        this.nomeSobrenome = nome;
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

    public Double getIdade() {
        return idade;
    }

    public void setIdade(Double idade) {
        if (idade <= 0 || idade > 20) {
            throw new IllegalArgumentException("A idade não deve ultrapassar 20 anos ou ser menor que 0.");
        }
        this.idade = idade;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
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
            this.raca = ConstanteUtils.NAO_INFORMADO;
            return;
        }
        this.raca = raca;
    }

    @Override
    public String toString() {
        String idade = (this.idade == null) ? ConstanteUtils.NAO_INFORMADO : String.format("%.1f", this.idade);
        String peso = (this.peso == null) ? ConstanteUtils.NAO_INFORMADO : String.format("%.2f kg", this.peso);
        String numeroCasa = (this.endereco.getNumeroDaCasa() == null) ? ConstanteUtils.NAO_INFORMADO : String.format("%d", this.endereco.getNumeroDaCasa());
        return "Nome: " + this.nomeSobrenome +
                "\nTipo: " + this.tipoPet +
                "\nSexo: " + this.sexoPet +
                "\nEndereço... " +
                "\nNúmero da Casa: " + numeroCasa +
                "\nCidade: " + this.endereco.getCidade() +
                "\nRua: " + this.endereco.getRua() +
                "\nBairro: " + this.endereco.getBairro() +
                "\nIdade: " + idade +
                "\nPeso: " + peso +
                "\nRaça: " + this.raca;
    }
}

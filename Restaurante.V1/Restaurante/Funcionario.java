package Restaurante;

public class Funcionario {
    private String nome;
    private String documento;
    private String setor;
    private String datanascimento;
    private double salario;

    public Funcionario(String nome, String documento, String setor, String datanascimento, double salario) {
        this.nome = nome;
        this.documento = documento;
        this.setor = setor;
        this.datanascimento = datanascimento;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public String getDatanascimento() {
        return datanascimento;
    }

    public void setDatanascimento(String datanascimento) {
        this.datanascimento = datanascimento;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public void mostraFuncionario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Documento: " + this.documento);
        System.out.println("Setor: " + this.setor);
        System.out.println("Data de nascimento: " + this.datanascimento);
        System.out.println("Salário: " + this.salario);
    }
}
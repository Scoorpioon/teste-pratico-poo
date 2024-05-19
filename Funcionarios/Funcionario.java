package Funcionarios;
import java.time.LocalDate;

// Pensei em fazer tudo nessa classe antes, mas posteriormente decidi transformar ela numa classe mãe, para não deixar atributos exclusivos de cada cargo (como o de vendas, por exemplo) amostra em cargos que não os devem possuir!
public class Funcionario {
    protected String nome;
    protected LocalDate dataContratacao;
    protected int anosServico; // Os anos de serviço, se contarmos da data de contratação até o ano de 2024
    protected float salario;
    protected float bonusSalario;
    protected boolean recebeBeneficio;
    
    public void printarDados() {
        System.out.printf("Dados: %s / %.2f", this.nome, this.salario);
        System.out.println("");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public float getSalarioPeriodo(LocalDate periodo, boolean somenteSalario) {
        return 0f;
    }

    public float getBeneficioPeriodo(LocalDate periodo) {
        return 0f;
    }

    public void setSalario(float salario) {
        this.salario = salario;
    }

    public float getBonusSalario() {
        return bonusSalario;
    }

    public void setBonusSalario(float bonusSalario) {
        this.bonusSalario = bonusSalario;
    }

    public boolean getRecBeneficio() {
        return recebeBeneficio;
    }

    public void setRecBeneficio(boolean beneficio) {
        this.recebeBeneficio = beneficio;
    }
}
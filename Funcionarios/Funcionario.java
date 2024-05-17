package Funcionarios;
import java.time.LocalDate;
import java.util.Optional;

// Pensei em fazer tudo nessa classe antes, mas posteriormente decidi transformar ela numa classe mãe, para não deixar atributos exclusivos de cada cargo (como o de vendas, por exemplo) à mostra em cargos que não os devem possuir!
public class Funcionario {
    protected String nome;
    protected LocalDate dataContratacao;
    protected int anosServico; // Os anos de serviço, se contarmos da data de contratação até o ano de 2024
    protected float salario;
    protected float bonusSalario;
    protected Optional<Float> beneficio; // Deixei o benefício como Optional para que ele possa aceitar nulo, pois nem todos os cargos possuem benefícios
    
    public void printarDados() {
        System.out.printf("Dados: %s / %.2f", this.nome, this.salario);
        System.out.println("");
    }

    public float getSalario() {
        return salario;
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

    public Optional<Float> getBeneficio() {
        return beneficio;
    }

    public void setBeneficio(Optional<Float> beneficio) {
        this.beneficio = beneficio;
    }
}
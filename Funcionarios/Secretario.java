package Funcionarios;

import java.time.LocalDate;

public class Secretario extends Funcionario {
    public Secretario(String nome, LocalDate data) {
        this.nome = nome;
        this.dataContratacao = data;
        this.anosServico = LocalDate.now().getYear() - data.getYear();
        this.salario = 7000.0f;
        this.recebeBeneficio = true;
    }

    @Override
    public float getSalarioPeriodo(LocalDate periodo, boolean somenteSalario) {
        float salarioPeriodo = this.salario + (1000 * (Math.abs(periodo.getYear() - this.dataContratacao.getYear()))); // Deixei o valor absoluto aqui pra não ficar negativo hahah
        float beneficio = 0.2f * this.salario; // Considerei que os 20% de bônus é sobre o salário base!

        if(somenteSalario) {
            return salarioPeriodo;
        } else {
            return salarioPeriodo + beneficio;
        }
    }

    @Override
    public float getBeneficioPeriodo(LocalDate periodo) {
        return 0.2f * this.salario;
    }
}
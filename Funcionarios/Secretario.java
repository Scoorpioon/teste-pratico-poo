package Funcionarios;

import java.time.LocalDate;
import java.util.Optional;

public class Secretario extends Funcionario {
    public Secretario(String nome, LocalDate data) {
        this.nome = nome;
        this.dataContratacao = data;
        this.anosServico = LocalDate.now().getYear() - data.getYear();
        this.salario = 7000.0f;
        this.beneficio = Optional.of(0.2f); // Tive de usar o Optional.of, pois como o benefício pode ser nulo por causa do gerente, tem que passar esse método
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
}
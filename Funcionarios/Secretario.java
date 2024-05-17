package Funcionarios;

import java.time.LocalDate;
import java.util.Optional;

public class Secretario extends Funcionario {
    public Secretario(String nome, LocalDate data) {
        this.nome = nome;
        this.dataContratacao = data;
        this.anosServico = LocalDate.now().getYear() - data.getYear();
        this.salario = 7000.0f;
        this.beneficio = Optional.of(0.2f);

        this.bonusSalario = 1000 * this.anosServico; // Secretario recebe 1000 por cada ano de serviço
    }

    
}
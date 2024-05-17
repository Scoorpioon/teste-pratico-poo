package Funcionarios;

import java.time.LocalDate;
import java.util.Date;

public class Gerente extends Funcionario {
    public Gerente(String nome, LocalDate data) {
        this.nome = nome;
        this.dataContratacao = data;
        this.anosServico = LocalDate.now().getYear() - data.getYear();
        this.salario = 20000.0f;
        this.beneficio = null;

        this.bonusSalario = 3000 * this.anosServico; // Gerente recebe 3000 por cada ano de serviço
    }
}
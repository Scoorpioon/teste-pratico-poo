package Funcionarios;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

import Funcionarios.packVenda.Vendas;

public class Vendedor extends Funcionario {
    public List<Vendas> vendas; // Decidi fazer uma lista de objetos para armazenar adequadamente o LocalDate

    public Vendedor(String nome, LocalDate data, List<Vendas> vendas) {
        this.nome = nome;
        this.dataContratacao = data;
        this.anosServico = LocalDate.now().getYear() - data.getYear();
        this.salario = 12000.0f;
        this.beneficio = Optional.of(0.3f);

        this.vendas = vendas; // Todas as vendas que o funcionário possui, em forma de objeto

        this.bonusSalario = 1800 * this.anosServico; // Vendedor recebe 1800 por cada ano de serviço
    }

    public void printarVendas() {
        for(int i = 0; i < vendas.size(); i++) {
            System.out.println(String.format("Venda %s: ", i + 1));
            System.out.println(vendas.get(i).getDataVenda());
            System.out.println(vendas.get(i).getValorVenda());

            System.out.println("");
        }
    };
}
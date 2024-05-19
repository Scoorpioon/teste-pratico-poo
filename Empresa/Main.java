package Empresa;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import Funcionarios.Gerente;
import Funcionarios.Vendedor;
import Funcionarios.packVenda.Vendas;
import Funcionarios.Secretario;

public class Main {
    public static void main(String[] args) throws Exception {
        MetodosEmpresa metodos = new MetodosEmpresa(); // Classe que possui os métodos

        // Vendas
        List<Vendas> vendasAna = List.of(
            new Vendas(LocalDate.of(2021, 12, 01), 5200f),
            new Vendas(LocalDate.of(2022, 01, 01), 4000f),
            new Vendas(LocalDate.of(2022, 02, 01), 4200f),
            new Vendas(LocalDate.of(2022, 03, 01), 5850f),
            new Vendas(LocalDate.of(2022, 04, 01), 7000f)
        );

        List<Vendas> vendasJoao = List.of(
            new Vendas(LocalDate.of(2021, 12, 01), 3400f),
            new Vendas(LocalDate.of(2022, 01, 01), 7700f),
            new Vendas(LocalDate.of(2022, 02, 01), 5000f),
            new Vendas(LocalDate.of(2022, 03, 01), 5900f),
            new Vendas(LocalDate.of(2022, 04, 01), 6500f)
        );

        // Instância dos funcionários
        Secretario Jorge = new Secretario("Jorge Carvalho", LocalDate.of(2018, 01, 01));
        Secretario Maria = new Secretario("Maria Souza", LocalDate.of(2015, 12, 01));
        Vendedor Ana = new Vendedor("Ana Silva", LocalDate.of(2021, 12, 01), vendasAna);
        Vendedor Joao = new Vendedor("João Mendes", LocalDate.of(2021, 12, 01), vendasJoao);
        Gerente Juliana = new Gerente("Juliana Alves", LocalDate.of(2017, 07, 01));
        Gerente Bento = new Gerente("Bento Albino", LocalDate.of(2014, 03, 01));

        // Testes de todos os métodos
        System.out.println("- Teste feito para a data de 12/2021 - ");
        System.out.println("Total pago a todos os funcionarios: " + metodos.totalPagoNoMes(Arrays.asList(Jorge, Ana, Bento, Maria, Juliana, Joao), LocalDate.of(2021, 12, 01)));
        System.out.println("Total pago em salário a todos os funcionários: " + metodos.totalPagoEmSalarioMes(Arrays.asList(Jorge, Ana, Bento, Maria, Joao, Juliana), LocalDate.of(2021, 12, 01)));
        System.out.println("Total pago em benefícios a todos os funcionarios que recebem: " + metodos.totalPagoEmBeneficiosMes(Arrays.asList(Jorge, Ana, Joao, Maria), LocalDate.of(2021, 12, 01)));
        System.out.println("O funcionário que mais recebeu é: " + metodos.funcionarioMaisRecebeuNoMes(Arrays.asList(Jorge, Ana, Bento), LocalDate.of(2021, 12, 01)).getNome());
        System.out.println("O funcionário que mais recebeu benefícios é: " + metodos.funcionarioMaisRecebeuBeneficiosMes(Arrays.asList(Jorge, Joao, Ana), LocalDate.of(2021, 12, 01)));
        System.out.println("O funcionário que mais vendeu nesse mês é: " + metodos.funcionarioMaisVendeuMes(Arrays.asList(Joao, Ana), LocalDate.of(2021, 12, 01)).getNome());
    }
}
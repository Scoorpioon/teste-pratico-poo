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
        MetodosEmpresa metodos = new MetodosEmpresa();

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

        Secretario Jorge = new Secretario("Jorge Carvalho", LocalDate.of(2018, 01, 01));
        Vendedor Ana = new Vendedor("Ana Silva", LocalDate.of(2021, 12, 01), vendasAna);
        Gerente Bento = new Gerente("Bento Albino", LocalDate.of(2014, 03, 01));

        System.out.println(metodos.totalPagoNoMes(Arrays.asList(Jorge, Ana, Bento), LocalDate.of(2021, 12, 01)));
        System.out.println(metodos.totalPagoEmSalarioMes(Arrays.asList(Jorge, Ana, Bento), LocalDate.of(2021, 12, 01)));
        System.out.println(metodos.totalPagoEmBeneficiosMes(Arrays.asList(Jorge, Ana), LocalDate.of(2021, 12, 01)));
    }
}
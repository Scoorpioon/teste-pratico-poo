package Empresa;

import java.time.LocalDate;
import java.util.List;

import Funcionarios.Funcionario;
import Funcionarios.Vendedor;

public class MetodosEmpresa {
    public float totalPagoNoMes(List<Funcionario> funcionarios, LocalDate periodo) {
        float totalPago = 0;
        
        for(int i = 0; i < funcionarios.size(); i++) {
            totalPago += funcionarios.get(i).getSalarioPeriodo(periodo, false);
            /* System.out.println(funcionarios.get(i).getNome() + ": " + funcionarios.get(i).getSalarioPeriodo(periodo)); */
        }

        return totalPago;
    }

    public float totalPagoEmSalarioMes(List<Funcionario> funcionarios, LocalDate periodo) {
        float totalPago = 0;

        for(int i = 0; i < funcionarios.size(); i++) {
            totalPago += funcionarios.get(i).getSalarioPeriodo(periodo, true);
            /* System.out.println(funcionarios.get(i).getNome() + ": " + funcionarios.get(i).getSalarioPeriodo(periodo)); */
        }

        return totalPago;
    }

    public float totalPagoEmBeneficiosMes(List<Funcionario> funcionarios, LocalDate periodo) throws Exception {
        float totalPago = 0;

        for(Funcionario funcionario : funcionarios) {
            if(!funcionario.getRecBeneficio()) {
                throw new Exception("A lista só pode receber funcionários que recebem benefícios!");
            }

            totalPago += funcionario.getBeneficioPeriodo(periodo);
        }

        return totalPago;
    }

    // Aqui vocês falaram pra retornar o funcionário que recebeu o valor mais alto, então retornei o objeto inteiro
    Funcionario funcionarioMaisRecebeuNoMes(List<Funcionario> funcionarios, LocalDate periodo) {
        Funcionario oMaisRicoDoMes = null;
        float salarioAtual;
        
        for(int i = 0; i < funcionarios.size(); i++) {
            salarioAtual = funcionarios.get(i).getSalarioPeriodo(periodo, false);

            if(i == 0 || salarioAtual > oMaisRicoDoMes.getSalarioPeriodo(periodo, false)) {
                oMaisRicoDoMes = funcionarios.get(i);
            }
        }

        return oMaisRicoDoMes;
    }

    // Aqui vocês falaram pra retornar o *nome*, então vou retornar apenas a string do nome
    String funcionarioMaisRecebeuBeneficiosMes(List<Funcionario> funcionarios, LocalDate periodo) throws Exception {
        Funcionario oQueMaisRecebeuOsBeneficios = null;
        float beneficioAtual;

        for(int i = 0; i < funcionarios.size(); i++) {
            if(!funcionarios.get(i).getRecBeneficio()) {
                throw new Exception("A lista só pode receber funcionários que recebem benefícios!");
            }

            beneficioAtual = funcionarios.get(i).getBeneficioPeriodo(periodo);

            if(i == 0 || beneficioAtual > oQueMaisRecebeuOsBeneficios.getBeneficioPeriodo(periodo)) {
                oQueMaisRecebeuOsBeneficios = funcionarios.get(i);
            }
        }

        return oQueMaisRecebeuOsBeneficios.getNome(); // Retornando apenas o nome aqui
    }

    Funcionario funcionarioMaisVendeuMes(List<Vendedor> funcionario, LocalDate periodo) {
        Vendedor oQueMaisVendeu = null;
        float valorVendaAtual;

        for(int i = 0; i < funcionario.size(); i++) {
            valorVendaAtual = funcionario.get(i).getVendaPeriodo(periodo).getValorVenda();

            if(i == 0 || valorVendaAtual > oQueMaisVendeu.getVendaPeriodo(periodo).getValorVenda()) {
                oQueMaisVendeu = funcionario.get(i);
            }
        }

        return oQueMaisVendeu;
    }
}
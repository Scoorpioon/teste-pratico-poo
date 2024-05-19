package Empresa;

import java.time.LocalDate;
import java.util.List;

import Funcionarios.Funcionario;

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
}
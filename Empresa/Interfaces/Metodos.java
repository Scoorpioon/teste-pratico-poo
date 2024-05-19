package Empresa.Interfaces;
import java.time.LocalDate;

import java.util.List;

import Funcionarios.Funcionario;
import Funcionarios.Vendedor;

public interface Metodos {
    float totalPagoNoMes(List<Object> funcionarios, LocalDate periodo);
    float totalPagoEmSalarioMes(List<Funcionario> funcionarios, LocalDate periodo);
    float totalPagoEmBeneficiosMes(List<Funcionario> funcionarios, LocalDate periodo);
    Funcionario funcionarioMaisRecebeuNoMes(List<Funcionario> funcionarios, LocalDate periodo);
    String funcionarioMaisRecebeuBeneficiosMes(List<Funcionario> funcionarios, LocalDate periodo);
    Funcionario funcionarioMaisVendeuMes(List<Vendedor> funcionario, LocalDate periodo);
}
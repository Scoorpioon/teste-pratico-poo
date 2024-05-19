package Empresa;
import java.time.LocalDate;

import java.util.List;

import Funcionarios.Funcionario;
import Funcionarios.Vendedor;

public interface Metodos {
    float totalPagoNoMes(List<Object> funcionarios, LocalDate periodo);
    float totalPagoEmSalarioMes(List<Object> funcionarios, LocalDate periodo);
    float totalPagoEmBeneficiosMes(List<Object> funcionarios, LocalDate periodo);
    Funcionario funcionarioMaisRecebeuNoMes(List<Object> funcionarios, LocalDate periodo);
    String funcionarioMaisRecebeuBeneficiosMes(List<Object> funcionarios, LocalDate periodo);
    Funcionario funcionarioMaisVendeuMes(List<Vendedor> funcionario, LocalDate periodo);
}
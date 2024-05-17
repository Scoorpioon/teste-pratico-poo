package Empresa;
import java.util.Date;
import java.util.List;

import Funcionarios.Funcionario;
import Funcionarios.Vendedor;

public interface Metodos {
    float totalPagoNoMes(List<Object> funcionarios, Date periodo);
    float totalPagoEmSalarioMes(List<Object> funcionarios, Date periodo);
    float totalPagoEmBeneficiosMes(List<Object> funcionarios, Date periodo);
    Funcionario funcionarioMaisRecebeuNoMes(List<Object> funcionarios, Date periodo);
    String funcionarioMaisRecebeuBeneficiosMes(List<Object> funcionarios, Date periodo);
    Funcionario funcionarioMaisVendeuMes(List<Vendedor> funcionario, Date periodo);
}
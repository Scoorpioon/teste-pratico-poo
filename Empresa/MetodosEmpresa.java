package Empresa;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import Funcionarios.Funcionario;
import Funcionarios.Vendedor;

public class MetodosEmpresa {
    public float totalPagoNoMes(List<Funcionario> funcionarios, LocalDate periodo) {
        for(int i = 0; i < funcionarios.size(); i++) {
            System.out.println(funcionarios.get(i).getNome() + ": " + funcionarios.get(i).getSalarioPeriodo(periodo));
        }

        return 0.01f;
    }
}
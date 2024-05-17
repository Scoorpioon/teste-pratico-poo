package Funcionarios.packVenda;

import java.time.LocalDate;

public class Vendas {
    private LocalDate dataVenda;
    private float valorVenda;

    public Vendas(LocalDate data, float valor) {
        this.dataVenda = data;
        this.valorVenda = valor;
    }

    public LocalDate getDataVenda() {
        return dataVenda;
    }

    public void setDataVenda(LocalDate dataVenda) {
        this.dataVenda = dataVenda;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public void setValorVenda(float valorVenda) {
        this.valorVenda = valorVenda;
    }
}
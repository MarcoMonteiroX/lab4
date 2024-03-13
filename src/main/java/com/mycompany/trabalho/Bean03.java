package com.mycompany.trabalho;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ct3")
@SessionScoped
public class Bean03 implements Serializable {

    private Double investimentoInicial;
    private Double taxaJurosAnual;
    private Integer anos;
    private Double resultado;
    private Double total;

    public Bean03() {
    }

    public void calcular() throws Exception {
        if (getAnos() < 0) {
            throw new Exception("A quantidade de anos não pode ser negativa. Informe um periodo válido.");
        }
        if (getInvestimentoInicial() < 0) {
            throw new Exception("O Investimento não pode ser negativo.");
        }
        if (getTaxaJurosAnual() < 0) {
            throw new Exception("A taxa de juros não pode ser negativa.");
        }
        setResultado((investimentoInicial * taxaJurosAnual) * anos);
        setTotal(investimentoInicial + getResultado());
    }

    public Double getInvestimentoInicial() {
        return investimentoInicial;
    }

    public void setInvestimentoInicial(Double investimentoInicial) {
        this.investimentoInicial = investimentoInicial;
    }

    public Double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }

    public void setTaxaJurosAnual(Double taxaJurosAnual) {
        this.taxaJurosAnual = taxaJurosAnual;
    }

    public Integer getAnos() {
        return anos;
    }

    public void setAnos(Integer anos) {
        this.anos = anos;
    }

    public Double getResultado() {
        return resultado;
    }

    public void setResultado(Double resultado) {
        this.resultado = resultado;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

}

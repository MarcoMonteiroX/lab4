package com.mycompany.trabalho;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct4")
@SessionScoped
public class Bean04 implements Serializable {
    
    private Double salario;
    private Double valorAumento;
    private Double novoSalario;

    public Bean04() {
    }
    
    public void aumento() {
        if(getSalario() <= 1000.0) {
            setValorAumento( 0.20);
        }
        if(getSalario() > 1000.0 && getSalario() <= 3000) {
            setValorAumento( 0.15);
        }
        if(getSalario() > 3000.0) {
            setValorAumento( 0.10);
        }
    }
    
    public void btNovoSalario(ActionEvent a) throws Exception {
        calcularNovoSalario();
    }
    
    public void calcularNovoSalario() throws Exception {
        if(getSalario() < 0) {
            throw new Exception("O salario é invalido.");
        }
        aumento();
        setNovoSalario(salario + (salario * valorAumento));
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public Double getValorAumento() {
        return valorAumento;
    }

    public void setValorAumento(Double valorAumento) {
        this.valorAumento = valorAumento;
    }

    public Double getNovoSalario() {
        return novoSalario;
    }

    public void setNovoSalario(Double novoSalario) {
        this.novoSalario = novoSalario;
    }
    
}

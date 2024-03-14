package com.mycompany.trabalho;

import java.io.Serializable;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean(name = "ct4")
@SessionScoped
public class Bean04 implements Serializable {
    private Double salario;

    public Bean04() {
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
    
}

package com.mycompany.trabalho;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct")
@SessionScoped
public class Bean01 {
    
    Integer numero01;
    Integer numero02;
    Integer numero03;
    private Integer maiorNumero;
    
    public Bean01() {
    }
    
    public void btVerificar(ActionEvent a) {
        
    }
    
    public void maior() {
        if(numero01 > numero02 && numero01 > numero03)
            setma
    }

    public Integer getNumero01() {
        return numero01;
    }

    public void setNumero01(Integer numero01) {
        this.numero01 = numero01;
    }

    public Integer getNumero02() {
        return numero02;
    }

    public void setNumero02(Integer numero02) {
        this.numero02 = numero02;
    }

    public Integer getNumero03() {
        return numero03;
    }

    public void setNumero03(Integer numero03) {
        this.numero03 = numero03;
    }

    public Integer getMaiorNumero() {
        return maiorNumero;
    }

    public void setMaiorNumero(Integer maiorNumero) {
        this.maiorNumero = maiorNumero;
    }
    
    
    
}

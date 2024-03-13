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
    
    public String btPagina01(ActionEvent a) {
        return "Page3Numeros";
    }
    
    public String btVerificar(ActionEvent a) {
        maior();
        media();
        soma();
        return "O Maior número é: " + getMaiorNumero();
    }

    public void maior() {
        if (numero01 > numero02 && numero01 > numero03) {
            setMaiorNumero(getNumero01());
        }
        if (numero02 > numero01 && numero02 > numero03) {
            setMaiorNumero(getNumero02());
        }
        if (numero03 > numero01 && numero03 > numero02) {
            setMaiorNumero(getNumero03());
        }
    }

    public String media() {
        return "A média dos três números é: " + (getNumero01() + getNumero02() + getNumero03()) / 3;
    }

    public String soma() {
        return "A soma dos três numéros é " + parOuImpar();
    }

    public String parOuImpar() {
        if ((getNumero01() + getNumero02() + getNumero03()) % 2 == 0) {
            return "Par";
        } else {
            return "Impar";
        }
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

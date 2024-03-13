package com.mycompany.trabalho;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "ct2")
@SessionScoped
public class Bean02 {

    private Double massa;
    private Double altura;
    private Double imc;
    private String nivelIMC;

    public Bean02() {
    }

    public String btCalcularIMC(ActionEvent a) {
        calcularIMC();
        return "teste";
    }

    public String calcularIMC() {
        if (getMassa() < 0) {
            return "Massa abaixo de zero.";
        }
        if(getAltura() < 0 ) {
            return "Altura invalida.";
        }
        setImc(getMassa() * (getAltura() * getAltura()));
        return "";
    }

    public void calcularNivelIMC() {
        if (getImc() < 18.5) {
            nivelIMC = "Abaixo do peso.";
        }
        if (getImc() >= 18.5 && getImc() < 24.9) {
            nivelIMC = "Peso normal.";
        }
        if (getImc() >= 25 && getImc() < 29.9) {
            nivelIMC = "Sobrepeso";
        }
        if (getImc() >= 30 && getImc() < 34.9) {
            nivelIMC = "Obesidade grau 1";
        }
        if (getImc() >= 35 && getImc() < 39.9) {
            nivelIMC = "Obesidade grau 2";
        }
        if (getImc() > 40) {
            nivelIMC = "Obesidade grau 3";
        }
    }

    public Double getMassa() {
        return massa;
    }

    public void setMassa(Double massa) {
        this.massa = massa;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getImc() {
        return imc;
    }

    public void setImc(Double imc) {
        this.imc = imc;
    }

    public String getNivelIMC() {
        return nivelIMC;
    }

    public void setNivelIMC(String nivelIMC) {
        this.nivelIMC = nivelIMC;
    }

}

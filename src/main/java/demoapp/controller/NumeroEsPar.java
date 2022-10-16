package demoapp.controller;

import javax.validation.constraints.Min;

public class NumeroEsPar {
    @Min(value = 0, message = "El número tiene que ser mayor o igual que 0")
    Integer numero;

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }
}

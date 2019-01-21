package com.ifpb.cadastro.modelo;

import java.util.Objects;

public class Carro {

    private String placa;
    private String modelo;
    private int ano;

    public Carro(String placa, String modelo, int ano) {
        this.placa = placa;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Carro)) return false;
        Carro carro = (Carro) o;
        return getAno() == carro.getAno() &&
                Objects.equals(getPlaca(), carro.getPlaca()) &&
                Objects.equals(getModelo(), carro.getModelo());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getPlaca(), getModelo(), getAno());
    }

    @Override
    public String toString() {
        return "Carro{" +
                "placa='" + placa + '\'' +
                ", modelo='" + modelo + '\'' +
                ", ano=" + ano +
                '}';
    }
}

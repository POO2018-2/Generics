package com.ifpb.cadastro.controle;

import java.util.Arrays;

public class CadastroGenerico <T> {

    private T[] objetos;
    private int contObjects;

    public CadastroGenerico(){
        objetos = (T[]) new Object[100];
        contObjects = 0;
    }

    public boolean salvar(T p){
        if(contObjects >= 100)
            return false;
        else{
            objetos[contObjects++] = p;
            return true;
        }
    }

    public T[] getObjects(){
        return Arrays.copyOf(objetos, contObjects);
    }

}
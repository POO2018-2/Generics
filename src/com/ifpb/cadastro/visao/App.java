package com.ifpb.cadastro.visao;

import com.ifpb.cadastro.controle.CadastroGenerico;
import com.ifpb.cadastro.modelo.Carro;
import com.ifpb.cadastro.modelo.Pessoa;
import com.ifpb.cadastro.modelo.Professor;
import sun.util.resources.cldr.sah.CalendarData_sah_RU;

import java.util.Arrays;

public class App {

    public static void main(String[] args) {

        CadastroGenerico<Pessoa> pessoas = new CadastroGenerico<>();
        CadastroGenerico<Professor> professores = new CadastroGenerico<>();

        CadastroGenerico<Object> objetos = new CadastroGenerico<>();

        imprimirColecao(objetos);

    }

    //exemplo com super wildcard
    public static void imprimirColecao(CadastroGenerico<? super Pessoa> cadastro){
        System.out.println(Arrays.toString(cadastro.getObjects()));
    }

    // Imprime o array
    public static <T> void imprimirArray(T[] array){
        for(T elemento : array){
            System.out.println(elemento);
        }
    }

    //Ordena o array e imprime os elementos
    public static <T extends Comparable<T>> void ordenarEImprimir(T[] array){
        Arrays.sort(array);

        for(T elemento : array){
            System.out.println(elemento);
        }
    }

    //Retorna o maior elemento(ordem) do array
    public static <T extends Comparable<T>> T maior(T[] array){
        T maximo = array[0];

        for(T elemento : array){
            if(elemento.compareTo(maximo)>0)
                maximo = elemento;
        }

        return maximo;
    }

}

package main.java.list.OrdenacaoList.OrdenacaoNumeros;

import main.java.list.OrdenacaoList.OrdenacaoDePessoas.OrdenacaoPessoa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    // Atributos
    private List<Integer> listaDeNumeros;

    public OrdenacaoNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        this.listaDeNumeros.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAcendente = listaDeNumeros;

        Collections.sort(listaAcendente);

        return listaAcendente;
    }

    public List<Integer> ordenarDescendente(){
        List<Integer> listaDescendente = listaDeNumeros;

        listaDescendente.sort(Collections.reverseOrder());

        return listaDescendente;
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros= new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(8);
        ordenacaoNumeros.adicionarNumero(7);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());

    }
}

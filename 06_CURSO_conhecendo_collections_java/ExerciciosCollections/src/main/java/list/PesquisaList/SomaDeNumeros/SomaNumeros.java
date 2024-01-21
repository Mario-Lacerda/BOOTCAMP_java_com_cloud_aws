package main.java.list.PesquisaList.SomaDeNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Integer> listaDeNumeros;

    public SomaNumeros() {
        this.listaDeNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaDeNumeros.add(numero);
    }

    public int calculcarSoma(){
        // Criando variavel para armazenar soma
        Integer numerosSomados = 0;

        // Verificando se lista não está vazia
        if(!listaDeNumeros.isEmpty()){
            for(Integer numero : listaDeNumeros){
                numerosSomados += numero;
            }
        }

        return numerosSomados;
    }

    public int encontrarMaiorNumero(){
        // Criando variavel para armazenar o maior número
        Integer maiorNumeroEncontrado = listaDeNumeros.get(0);

        // Verificando se lista não está vazia
        if(!listaDeNumeros.isEmpty()){
            for(Integer numero : listaDeNumeros){
                if(numero > maiorNumeroEncontrado) {
                    maiorNumeroEncontrado = numero;
                }
            }
        }

        return maiorNumeroEncontrado;
    }

    public int encontrarMenorNumero(){
        // Criando variavel para armazenar o menor número
        Integer maiorNumeroEncontrado = listaDeNumeros.get(0);

        // Verificando se lista não está vazia
        if(!listaDeNumeros.isEmpty()){
            for(Integer numero : listaDeNumeros){
                if(numero < maiorNumeroEncontrado) {
                    maiorNumeroEncontrado = numero;
                }
            }
        }

        return maiorNumeroEncontrado;
    }

    public List<Integer> exibirNumero(){
        return listaDeNumeros;
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(1);
        somaNumeros.adicionarNumero(2);
        somaNumeros.adicionarNumero(3);
        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);

        System.out.println(somaNumeros.calculcarSoma());
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.exibirNumero());



    }
}

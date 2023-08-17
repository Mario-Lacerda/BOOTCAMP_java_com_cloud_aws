package main.java.list.OrdenacaoList.OrdenacaoDePessoas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> listaDePessoas;

    public OrdenacaoPessoa() {
        this.listaDePessoas = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura){
        listaDePessoas.add(new Pessoa(nome, idade, altura));
    }

    // Método para ordenar por idade
    public List<Pessoa> ordenarPorIdade(){
        // Criando lista de pessoas com lista já criada (sem ordenação)
        List<Pessoa> pessoasOrdenadasPorIdade = new ArrayList<>(listaDePessoas);

        // Usando método sort da interface collections
        // para ordenar a lista de pessoas a partir do compareTo da classe
        // pessoa (collections pega a informação de lá)
        Collections.sort(pessoasOrdenadasPorIdade);

        // Retornando a lsta ordenada
        return pessoasOrdenadasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura(){
        // Criando lista de pessoas com lista já criada (sem ordenação)
        List<Pessoa> pessoasOrdenadasPorAltura = new ArrayList<>(listaDePessoas);

        // Usando método sort da interface collections
        // para ordenar pessoas a partir da classe ComparatorPorAltura cridada
        // Devido isso, precisamos passar a lista e a instância do comparator fora da classe
        Collections.sort(pessoasOrdenadasPorAltura, new ComparatorPorAltura());

        return pessoasOrdenadasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Marlon", 23, 1.65);
        ordenacaoPessoa.adicionarPessoa("Ana", 21, 1.55);
        ordenacaoPessoa.adicionarPessoa("Loren", 38, 1.54);
        ordenacaoPessoa.adicionarPessoa("Fabio", 50, 1.80);

        System.out.println(ordenacaoPessoa.listaDePessoas);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

        System.out.println(ordenacaoPessoa.listaDePessoas);

    }

}

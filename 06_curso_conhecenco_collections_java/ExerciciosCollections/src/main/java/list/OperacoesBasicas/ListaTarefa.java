package main.java.list.OperacoesBasicas;


import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    // Criando atributos
    private List<Tarefa> tarefaList;

    // Método construtor para criar ArrayList vazio quando esta classe
    // for chamada
    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    // Adiciona tarefa
    public void adicionarTarefa(String descricao) {
        // Adicionando tarefa na Lista de tarefas a partir
        // de um novo objeto instanciado
        tarefaList.add(new Tarefa(descricao));
    }

    // Remove tarefa passando a descrição como parâmetro
    public void removerTarefa(String descricao) {
        // Criando lista do tipo tarefas para armazenar
        // as tarefas que desejo remover
        List<Tarefa> tarefasParaPremover = new ArrayList<>();

        // Criando laço de repetição para remover
        // todas as tarefas com a mesma descrição
        for (Tarefa tarefa : tarefaList) {
            // Se a descrição da tarefa no ponto atual for
            // igual à fornecida, ele adicionar à
            // lista de tarefas para remover
            if (tarefa.getDescricao().equalsIgnoreCase(descricao)) {
                //Adicionando tarefa à lista para remover
                tarefasParaPremover.add(tarefa);
            }

            // Removendo todos elementos que possuem a descrição informada
            tarefaList.removeAll(tarefasParaPremover);
        }


    }

    // Obtém numero total de tarefas
    public int obterNumeroTotalTarefas () {
        return tarefaList.size();
    }

    // Obtém descrição das tarefas
    public void obterDescricaoTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O número é: " + listaTarefa.obterNumeroTotalTarefas());

        // Adicionando tarefas e testando método de listar
        listaTarefa.adicionarTarefa("Tarefa 1");
        listaTarefa.adicionarTarefa("Tarefa 2");
        listaTarefa.adicionarTarefa("Tarefa 3");
        listaTarefa.adicionarTarefa("Tarefa 3");
        System.out.println("O número é: " + listaTarefa.obterNumeroTotalTarefas());

        // Testando remover tarefa
        listaTarefa.removerTarefa("Tarefa 3");
        System.out.println("O número é: " + listaTarefa.obterNumeroTotalTarefas());

        // Testando obter descrições
        listaTarefa.obterDescricaoTarefas();

    }
}
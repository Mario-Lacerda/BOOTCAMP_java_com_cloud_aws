package main.java.list.OperacoesBasicasList.CarrinhoCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;

    public CarrinhoDeCompras(){
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade){
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();

        for (Item item : itemList){
            if(item.getNome().equalsIgnoreCase(nome)){
                itensParaRemover.add(item);
            }
        }
        itemList.removeAll(itensParaRemover);
    }

    public void calcularValorTotal(){
        double valorSomado = 0;

        for(Item item: itemList){
            valorSomado += item.getQuantidade() * item.getPreco();
        }

        System.out.println("O valor total é de: " + valorSomado);
    }

    public void exibirItens(){
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        // Adicionando itens ao carrinho
        carrinhoDeCompras.adicionarItem("Vela", 10.00, 2);
        carrinhoDeCompras.adicionarItem("Caderno", 5.00, 3);
        carrinhoDeCompras.adicionarItem("Mouse", 15.00, 1);
        carrinhoDeCompras.adicionarItem("Caderno", 5.00, 3);


        // Exibindo itens adicionados
        carrinhoDeCompras.exibirItens();

        // Somando valor dos itens
        carrinhoDeCompras.calcularValorTotal();

        // Removendo itens do carrinho
        carrinhoDeCompras.removerItem("Caderno");

        // Reexibindo itens adicionados
        carrinhoDeCompras.exibirItens();

        // Re-somando valor dos itens
        carrinhoDeCompras.calcularValorTotal();

    }
}

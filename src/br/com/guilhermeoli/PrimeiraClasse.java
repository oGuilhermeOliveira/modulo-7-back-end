package br.com.guilhermeoli;

import br.com.guilhermeoli.Cliente;

/**
 * @author guiol
 */
public class PrimeiraClasse {
    // Classe, métodos, modificadores de acesso, palavras reservadas e comentários

    public static void main(String[] args) {
        Cliente cliente = new Cliente();
        cliente.cadastrarEndereco("Rua 1");
        cliente.setCodigo(1);
        System.out.println(cliente.getCodigo());
        //cliente.imprimirEndereco();
        System.out.println(cliente.retornarNomeCliente());
        System.out.println(cliente.getValorTotal());
    }
}

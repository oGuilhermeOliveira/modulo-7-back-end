package br.com.guilhermeoli;

/**
 * @author guiol
 */
public class Cliente {
    // Classe, métodos, modificadores de acesso, palavras reservadas e comentários

    private int codigo;

    private String nome;

    private String endereco;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void cadastrarEndereco(String endereco) {
        setEndereco(endereco);
    }

    public void imprimirEndereco() {
        System.out.println(this.endereco);
    }

    public String retornarNomeCliente() {
        return "Endereço do Guilherme";
    }

    public int getValorTotal() {
        return 20;
    }
}

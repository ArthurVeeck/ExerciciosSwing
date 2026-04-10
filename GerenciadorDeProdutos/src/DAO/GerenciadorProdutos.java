
package DAO;

import DTO.Produto;
import java.util.ArrayList;


public class GerenciadorProdutos {
    private ArrayList<Produto> listaProdutos = new ArrayList<>();
    
    public void adicionarProduto(Produto p){
        listaProdutos.add(p);
    }
    
    public String listarProdutos() {
        String resultado = "";

        for (Produto p : listaProdutos) {
            resultado += p.toString();
        }

        return resultado;
    }
}

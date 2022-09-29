package Livros;
import Excessoes.NotFound;

import java.util.ArrayList;

public class GerenciaLivro {
    private ArrayList<Livro> lista;

    public GerenciaLivro (){
        this.lista = new ArrayList<Livro>();
    }

    public void adicionaLivro (Livro livro){
        if(buscaLivro(livro.getId())){
            //exception
        }
        else{
            this.lista.add(livro);
        }
    }
    public void removerLivro   (Livro livro){
        if(!buscaLivro(livro.getId())){
            //exception
        }
        else{
            this.lista.remove(livro);
        }
    }
    public boolean buscaLivro( String id){
        int i;
        for( i = 0; i < this.lista.size(); i++){
            if(this.lista.get(i).getId() == id){
                return true;
            }
        }
        return false;  
    }
    public void reportarDescricao(Livro livro){
        // interface?
    }
}

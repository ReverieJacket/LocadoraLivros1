package User;

import java.util.ArrayList;

public class GerenciaUsuario {
    private ArrayList<Usuario> lista;

    public GerenciaUsuario() {
        this.lista = new ArrayList<Usuario>();
    }

    public void adicionarUsuario(Usuario usuario){
        if(buscarUsuario(usuario.getId())){
            //exception
        }
        else{
            this.lista.add(usuario);
        }
    }
    public void removerUsuario(Usuario usuario){
        if(!buscarUsuario(usuario.getId())){
            //exception
        }
        else{
            this.lista.remove(usuario);
        }
    }
    public boolean buscarUsuario(String id){
        int i;
        for(i = 0; i < this.lista.size(); i++){
            if(this.lista.get(i).getId() == id){
                return true;
            }
        }
        return false;
    }
    
}

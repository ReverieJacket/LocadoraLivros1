import Emprestimo.GerenciaEmprestimo;
import Livros.GerenciaLivro;
import User.GerenciaUsuario;

public class LocaInloco {
    private GerenciaUsuario gerenciaUsuario;
    private GerenciaLivro gerenciaLivro;
    private GerenciaEmprestimo gerenciaEmprestimo;

    public boolean verificar(String idLivro, String idUsuario){
        if(gerenciaLivro.buscaLivro(idLivro)){
            if(gerenciaUsuario.buscarUsuario(idUsuario)){
                if(gerenciaEmprestimo.)
            }
        }
        return false;
    }
}

package desafio2;

import java.util.ArrayList;
import java.util.List;

public class Biblioteca {
    private int qtdLivros;
    private List<Livro> acervo;
    private List<Usuario> usuarios;
    
    public Biblioteca() {
        acervo = new ArrayList<>();
        usuarios = new ArrayList<>();
    }
    
    public Biblioteca(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }

    public void adicionarLivro(Livro livro) {
        acervo.add(livro);
    }

    public void adicionarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public int getQtdLivros() {
        return qtdLivros;
    }

    public void setQtdLivros(int qtdLivros) {
        this.qtdLivros = qtdLivros;
    }
}

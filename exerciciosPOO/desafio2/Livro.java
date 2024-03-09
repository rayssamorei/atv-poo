package desafio2;

public class Livro {
    private int qtdPaginas;
    private String titulo;
    private String nomeAutor;
    private String generoTextual;
    private int anoPublicado;
    private boolean emprestado;

    public Livro() {
    }

    public Livro(String titulo, String nomeAutor) {
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
    }

    public Livro(int qtdPaginas, String titulo, String nomeAutor) {
        this.qtdPaginas = qtdPaginas;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
    }

    public Livro(int qtdPaginas, String titulo, String nomeAutor, String generoTextual, int anoPublicado, boolean emprestado) {
        this.qtdPaginas = qtdPaginas;
        this.titulo = titulo;
        this.nomeAutor = nomeAutor;
        this.generoTextual = generoTextual;
        this.anoPublicado = anoPublicado;
        this.emprestado = emprestado;
    }

    public boolean isEmprestado() {
        return emprestado;
    }

    public void emprestar(String titulo) {
        if (!emprestado) {
            emprestado = true;
            System.out.println("O livro " + this.titulo + " foi emprestado.");
        } else {
            System.out.println("O livro " + this.titulo + " já está emprestado.");
        }
    }

    public void devolver(String titulo) {
        if (emprestado) {
            emprestado = false;
            System.out.println("O livro " + this.titulo + " foi devolvido.");
        } else {
            System.out.println("O livro " + this.titulo + " já está disponível.");
        }
    }
    
    public int getQtdPaginas() {
        return qtdPaginas;
    }
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    public String getNomeAutor() {
        return nomeAutor;
    }
    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }
    public String getGeneroTextual() {
        return generoTextual;
    }
    public void setGeneroTextual(String generoTextual) {
        this.generoTextual = generoTextual;
    }
    public int getAnoPublicado() {
        return anoPublicado;
    }
    public void setAnoPublicado(int anoPublicado) {
        this.anoPublicado = anoPublicado;
    }

}

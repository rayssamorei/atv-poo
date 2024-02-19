//uma tecnica de ocultação de dados
public class Encapsulamento{
    public static void main(String[] args) {
        Conta c = new Conta("Teste 1", 23, 54);
        Conta c1 = new Conta("Teste 2", 34, 54);
        Conta c2 = new Conta("Teste 3");

        System.out.println(c.getNome());
        System.out.println(c.getIdade());
        System.out.println(c.getPeso());

        System.out.println(c1.getNome());
        System.out.println(c1.getIdade());
        System.out.println(c1.getPeso());

        System.out.println(c2.getNome());
    }
}
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Cadastrar<Jogo> cad = new Cadastrar<Jogo>();

        Jogo j1 = new Jogo(1, "Stardew Valley", "ConcernedApe", "26/02/2016");
        Jogo j2 = new Jogo(2, "Undertale", "Toby Fox", "15/09/2015");
        Jogo j3 = new Jogo(3, "Don't Starve", "Klei Entertainment", "23/04/2013");

        cad.adicionar(j1);
        cad.adicionar(j2);
        cad.adicionar(j3);

        System.out.println(Arrays.toString(cad.listarItensPreenchidos()));
        System.out.println();
        System.out.println(cad.procurarItem(1));
    }
}

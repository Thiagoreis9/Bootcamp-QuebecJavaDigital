import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Gato> gatos = new ArrayList<>(){{
            add(new Gato("Jon", "preto", 18));
            add(new Gato("Simba", "tigrado", 6));
            add(new Gato("Jon", "amarelo", 12));
        }};

            System.out.println("--\tOrdem de inserção\t--");
            System.out.println(gatos);

            System.out.println("--\tOrdem aleatoria\t--");
            Collections.shuffle(gatos);
            System.out.println(gatos);

            System.out.println("--\tOrdem natural\t--");
            Collections.sort(gatos);
            System.out.println(gatos);

            System.out.println("--\tOrdem idade\t--");
            Collections.sort(gatos, new ComparatorIdade());
            gatos.sort( new ComparatorIdade());
            System.out.println(gatos);

            System.out.println("--\tOrdem Cor\t--");
            Collections.sort(gatos, new ComparatorCor());
            System.out.println(gatos);

            System.out.println("--\tOrdem Nome/Cor/idade \t--");
            Collections.sort(gatos, new ComparatorNomeCorIdade());
            System.out.println(gatos);

    }
}

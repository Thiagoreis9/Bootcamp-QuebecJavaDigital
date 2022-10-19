import java.util.*;

public class lists {
    public static void main(String[] args) {

        List<gato> gatos = new ArrayList<>(){{
            add(new gato("Jon", "preto", 18));
            add(new gato("Simba", "tigrado", 6));
            add(new gato("Jon", "amarelo", 12));
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


    }
}


class gato implements Comparable<gato>{
    private String nome;
    private String cor;
    private Integer idade;

    public gato(String nome, String cor, Integer idade) {
        this.nome = nome;
        this.cor = cor;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "{" +
                "nome='" + nome + '\'' +
                ", cor='" + cor + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public int compareTo(gato gato) {
        return this.getNome().compareToIgnoreCase(gato.getNome());
    }
}

class ComparatorIdade implements Comparator<gato> {

    @Override
    public int compare(gato g1, gato g2) {
        return Integer.compare(g1.getIdade(), g2.getIdade());
    }
}

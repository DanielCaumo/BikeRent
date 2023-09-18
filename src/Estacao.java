import java.util.ArrayList;
import java.util.List;

class Estacao {
    private int id;
    private String nome;
    private List<Bicicleta> bicicletasDisponiveis;

    public Estacao(int id, String nome) {
        this.id = id;
        this.nome = nome;
        this.bicicletasDisponiveis = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void adicionarBicicleta(Bicicleta bicicleta) {
        bicicletasDisponiveis.add(bicicleta);
    }

    public void removerBicicleta(Bicicleta bicicleta) {
        bicicletasDisponiveis.remove(bicicleta);
    }

    public List<Bicicleta> getBicicletasDisponiveis() {
        return bicicletasDisponiveis;
    }
}

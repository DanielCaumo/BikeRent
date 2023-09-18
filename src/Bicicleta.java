public class Bicicleta {
    private int id;
    private String modelo;
    private boolean disponivel;

    public Bicicleta(int id, String modelo) {
        this.id = id;
        this.modelo = modelo;
        this.disponivel = true;
    }

    public int getId() {
        return id;
    }

    public String getModelo() {
        return modelo;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void alugar() {
        disponivel = false;
    }

    public void devolver() {
        disponivel = true;
    }
}
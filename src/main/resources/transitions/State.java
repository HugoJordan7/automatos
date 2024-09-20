package main.resources.transitions;

public class State {

    private String nome;
    private int numberName;

    public State(int numberName) {
        this.nome = "q"+numberName;
        this.numberName = numberName;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumberName() {
        return numberName;
    }

    public void setNumberName(int numberName) {
        this.numberName = numberName;
    }
}

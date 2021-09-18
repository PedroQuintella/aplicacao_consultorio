import java.util.ArrayList;

public class Pessoa {
    private String nome;

    public Pessoa(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório.");
        }
        else {
            this.nome = nome;
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        if ((nome == null) || (nome.trim().equals(""))) {
            throw new NullPointerException("Nome é obrigatório.");
        }
        this.nome = nome;
    }
}

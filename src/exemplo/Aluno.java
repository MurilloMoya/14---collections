package exemplo;

public class Aluno implements Comparable <Aluno> {
    private int rm;
    private String nome;

    public Aluno(String nome, int rm) {
        this.rm = rm;
        this.nome = nome;
    }

    public int getRm() {
        return rm;
    }

    public void setRm(int rm) {
        this.rm = rm;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return nome + " - " + rm;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return this.nome.compareTo(aluno.getNome());

    }
}



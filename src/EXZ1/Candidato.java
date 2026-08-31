package EXZ1;

public class Candidato implements Comparable<Candidato>{
    private String nome;
    private double anosEXP;
    private double notaDecimal;

    public Candidato(String nome, double anosEXP, double notaDecimal) {
        this.nome = nome;
        this.anosEXP = anosEXP;
        this.notaDecimal = notaDecimal;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getAnosEXP() {
        return anosEXP;
    }

    public void setAnosEXP(double anosEXP) {
        this.anosEXP = anosEXP;
    }

    public double getNotaDecimal() {
        return notaDecimal;
    }

    public void setNotaDecimal(double notaDecimal) {
        this.notaDecimal = notaDecimal;
    }

    @Override
    public int compareTo(Candidato o) {
        return 0;
    }

    @Override
    public String toString() {
        return nome + " - " + anosEXP+" - " +notaDecimal;
    }
}

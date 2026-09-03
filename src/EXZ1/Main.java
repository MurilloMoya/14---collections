package EXZ1;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Candidato> lista = new ArrayList<>();
        lista.add(new Candidato("Maria",9.5,20));
        lista.add(new Candidato("Leandro",9.5,20));
        lista.add(new Candidato("Ana",9,15));
        lista.add(new Candidato("Andre",3.5,1));


        lista.sort(Comparator.comparing(Candidato::getNotaDecimal).reversed()
                .thenComparing(Candidato::getAnosEXP).reversed()
                .thenComparing(Candidato::getNome));

        lista.forEach(candidato -> {

            System.out.println(candidato);
        });
    }
}

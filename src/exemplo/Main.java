package exemplo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    static void main() {
        List<Aluno> lista = new ArrayList<>();
        lista.add(new Aluno("Murillo",15));
        lista.add(new Aluno("Murillo",30));
        lista.add(new Aluno("Murillo",5));
        lista.add(new Aluno("Jose",22));
        lista.add(new Aluno("Robson",12));


        lista.forEach(aluno -> {
            System.out.println(aluno);
        });
        System.out.println();

        //ordenar usando o método  compareTo() da interface Comparable
        Collections.sort(lista);

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });

        //ordenação usando critério lambda
        lista.sort(Comparator.comparing(Aluno::getNome)
                .thenComparing(Comparator.comparing(Aluno::getRm)));
        System.out.println();

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });





    }
}

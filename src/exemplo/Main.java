package exemplo;

import java.util.*;

public class  Main {
    static void main() {
        Set<Aluno> lista = new HashSet<>();

        lista.add(new Aluno("Murillo",10));
        lista.add(new Aluno("Jose",20));
        lista.add(new Aluno("Murillo",10));
        lista.add(new Aluno("Paulo",8));

        lista.forEach(aluno -> {
            System.out.println(aluno);
        });


    }
}

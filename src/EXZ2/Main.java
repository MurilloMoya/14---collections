package EXZ2;

import java.util.HashMap;
import java.util.Map;

public class Main {
    static void main() {
        Map<Integer,Aluno>mapa=new HashMap<>();

        mapa.put(10,new Aluno("Carlos", 10));
        mapa.put(20,new Aluno("Jose", 15));
        mapa.put(10,new Aluno("Carlos", 10));

        mapa.forEach((rm,aluno) -> {
            System.out.println(aluno);
        });

        System.out.println(mapa.containsKey(10));
        System.out.println(mapa.get(10));
    }
}
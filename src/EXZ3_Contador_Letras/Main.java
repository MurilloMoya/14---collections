package EXZ3_Contador_Letras;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    static void main() {
        Scanner sc = new Scanner(System.in);
        Map<Character, Integer> contador = new HashMap<>();
        String frase ;
        char letra;

        System.out.print("Frase --->");
        frase = sc.nextLine();

        for (int i = 0; i < frase.length(); i++) {
            letra = frase.charAt(i);

            if (Character.isLetter(letra)){
                if (contador.containsKey(letra)){
                    contador.put(letra, contador.get(letra)+1);

                }else {
                    contador.put(letra,1);
                }
            }
        }

        //impressão
        for (Map.Entry<Character,Integer> item : contador.entrySet()){
            System.out.println("Chave: "+ item.getKey()+" | "+ item.getValue());
        }

    }
}

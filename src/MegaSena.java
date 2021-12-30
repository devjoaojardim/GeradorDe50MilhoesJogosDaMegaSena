

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MegaSena {

    public MegaSena() {
        List<Integer> numeros = new ArrayList<>();
        int contador = 0;


        for (int i = 1; i <= 60; i++) {
            numeros.add(i);
        }

        do {
            Collections.shuffle(numeros);
            List<Integer> escolhidos = numeros.subList(0, 6);

            Collections.sort(escolhidos);

            for (Integer escolhido : escolhidos) {
                if (escolhido < 10) {
                    System.out.print("0" + escolhido + " ");

                } else {
                    System.out.print(escolhido + " ");


                }
            }
            System.out.println("|");
            contador++;
        } while (contador <= 1000);


    }
    public void pdf(){

    }
    //500063860 jogos


}

package ProjetoPilhaI;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        List<CarroI> listCarro = new ArrayList<>();

        listCarro.add(new CarroI("Fiat"));
        listCarro.add(new CarroI("Ford"));
        listCarro.add(new CarroI("Nissan"));
        listCarro.add(new CarroI("Toyota"));

        System.out.println(listCarro.contains(new CarroI("Ford"))); // mostra contém na lista marca ford usando comando contains.

        System.out.println(listCarro.get(2)); //  mostra que posição 2 está qual marca.

        System.out.println(listCarro.indexOf(new CarroI("Fiat"))); // mostra posição está marca fiat.

        System.out.println(listCarro);
        System.out.println(listCarro.remove(3)); // remove elemento da lista.
        System.out.println(listCarro);


    }
}

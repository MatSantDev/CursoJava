package Exercice.Generics;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

    private List<T> lista = new ArrayList<>();

    public void addValue(T value){
        lista.add(value);
    }

    public T first(){
        if(lista.isEmpty()){
            throw new IllegalArgumentException("List is empty");
        }
        return lista.get(0);
    }

    public void imprimir() {
        System.out.print("[");
        System.out.print(first());
        for (int i = 1; i < lista.size(); i++) {
            System.out.print(", "+lista.get(i));
        }
        System.out.print("]");
    }

    public void imprimir2(){
        for(T item : lista){
            System.out.print(item+", ");
        }
    }
}




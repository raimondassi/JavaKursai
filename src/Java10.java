import KavosAparatas.KavosAparatas;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by Raimondas on 2017.07.20.
 */
public class Java10 {

    static KavosAparatas kavosAparatas=new KavosAparatas();
    static List<Object> listas= new ArrayList<Object>();

    public static void main(String[] args) {
       // bandymuMetodas();
        for (Object o : listas){
            System.out.println(listas.hashCode());
        }

        begamePerLita();

    }

    public static void bandymuMetodas(){
        listas.clear();
        listas.contains(kavosAparatas);
        listas.add(kavosAparatas);
        System.out.println(listas.contains(kavosAparatas));
    }
    public static void begamePerLita(){
        for (Object o :listas) {
            System.out.println(listas.get(0));
        }
    }


}

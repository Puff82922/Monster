import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Name: Driver.java
 * Author:Stacy Kirchner
 * Date: 25 November 2022
 * Description: Driver class with main
 */

public class Driver {
    public static void main(String[] args){
        HashMap<String, Integer> items = new HashMap<>();
        items.put("gold", 5);
        List<Monster> monsters = new ArrayList<>();
        monsters.add(new Imp(15, 20, items));
        monsters.add(new Kobold(1, 5, items));

        for(Monster m : monsters) {
            System.out.println(m);
        }
    }
}

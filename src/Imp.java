import java.util.HashMap;

/**
 * Name: Imp.java
 * Author:Stacy Kirchner
 * Date: 25 November 2022
 * Description: Extends the Monster class
 */

public class Imp extends Monster {
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP, xp, items);
    }

    @Override
    public  String toString(){
        return "Imp has : " + super.toString();
    }
}

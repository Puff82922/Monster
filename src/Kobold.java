import java.util.HashMap;

/**
 * Name: Kobold.java
 * Author:Stacy Kirchner
 * Date: 25 November 2022
 * Description: Extends the Monster class
 */
public class Kobold extends Monster {
    public Kobold(Integer maxHP, Integer xp, HashMap<String, Integer> items){
        super(maxHP, xp, items);
    }

    @Override
    public String toString(){
        return "Kobold has : " + super.toString();
    }
}

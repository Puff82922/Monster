package Monsters;

import Abilities.MeleeAttack;

import java.util.HashMap;

/**
 * Name: Monsters.Imp.java
 * Author:Stacy Kirchner
 * Date: 25 November 2022
 * Description: Extends the Monsters.Monster class
 */

public class Imp extends Monster {
    public Imp(Integer maxHP, Integer xp, HashMap<String, Integer> items) {
        super(maxHP, xp, items);

        Integer maxStr = 15;
        Integer maxDef = 6;
        Integer maxAgi = 3;

        attack = new MeleeAttack(this);
        str = super.getAttribute(str, maxStr);
        def = super.getAttribute(def, maxDef);
        agi = super.getAttribute(agi, maxAgi);
    }


    @Override
    public  String toString(){
        return "Monsters.Imp has : " + super.toString();
    }
}

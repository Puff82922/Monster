package Abilities;

import Monsters.Monster;

/**
 * Name: Abilities.MeleeAttack.java
 * Author:Stacy Kirchner
 * Date: 30 November 2022
 * Description: This class implements Abilities.Attack
 */

public class MeleeAttack implements Attack {
    Monster attacker;

    public MeleeAttack(Monster attacker){

        this.attacker = attacker;
    }

    @Override
    public Integer attack (Monster target) {
        String message = attacker + " uses a melee attack on " + target;
        System.out.println(message);
        return attacker.getStr() - target.getDef();
    }
}

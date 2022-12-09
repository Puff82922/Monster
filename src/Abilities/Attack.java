package Abilities;

import Monsters.Monster;

/**
 * Name: Abilities.Attack.java
 * Author:Stacy Kirchner
 * Date: 30 November 2022
 * Description: This interface extends interface Abilities.Ability
 */
public interface Attack extends Ability  {

    public abstract Integer attack(Monster target);

}

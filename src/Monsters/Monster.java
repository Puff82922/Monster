package Monsters;

import Abilities.Attack;

import java.util.HashMap;
import java.util.Random;

/**
 * Name: Monsters.Monster.java
 * Author:Stacy Kirchner
 * Date: 25 November 2022
 * Description: Abstract class that is extended by Monsters.Imp.java and Monsters.Kobold.java
 */
public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHp;
    private HashMap<String, Integer> items = null;

    Integer agi = 10;
    Integer def = 10;
    Integer str = 10;
    Attack attack;

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        hp = this.maxHp;
        this.xp = xp;
        this.items = items;
    }

    Integer getAttribute (Integer min, Integer max) {
        Random rand = new Random();
        if(min > max){
            Integer temp = min;
            min = max;
            max = temp;
        }
        return rand.nextInt(max-min) + min;
    }
    boolean takeDamage(Integer damage){
        if (damage > 0) {
            this.hp = this.hp - damage;
            System.out.println("The creature was hit for " + damage + " damage");
            if (hp <= 0) {
                System.out.println("Oh no! the creature has perished");
                System.out.println(this.toString());
                return false;
            }
        }
        System.out.println(this.toString());
        return true;
    }
    public Integer getAgi() {
        return agi;
    }

    public Integer getDef() {
        return def;
    }

    public Integer getStr() {
        return str;
    }

    public Integer attackTarget(Monster target) {
        int num = 0;
        num = attack.attack(target);
        target.takeDamage(num);
        return num;
    }

    public Integer getHp() {
        return hp;
    }

    public void setHp(Integer hp) {
        this.hp = hp;
    }

    public Integer getXp() {
        return xp;
    }

    public Integer getMaxHp() {
        return maxHp;
    }

    public HashMap<String, Integer> getItems() {
        return items;
    }

    public void setItems(HashMap<String, Integer> items) {
        this.items = items;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Monster monster = (Monster) o;

        if (getHp() != null ? !getHp().equals(monster.getHp()) : monster.getHp() != null) return false;
        if (getXp() != null ? !getXp().equals(monster.getXp()) : monster.getXp() != null) return false;
        if (getMaxHp() != null ? !getMaxHp().equals(monster.getMaxHp()) : monster.getMaxHp() != null) return false;
        return getItems() != null ? getItems().equals(monster.getItems()) : monster.getItems() == null;
    }

    @Override
    public int hashCode() {
        int result = getHp() != null ? getHp().hashCode() : 0;
        result = 31 * result + (getXp() != null ? getXp().hashCode() : 0);
        result = 31 * result + (getMaxHp() != null ? getMaxHp().hashCode() : 0);
        result = 31 * result + (getItems() != null ? getItems().hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "hp=" + getHp() + "/" + getMaxHp();
    }
}

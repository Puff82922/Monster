import java.util.HashMap;

/**
 * Name: Monster.java
 * Author:Stacy Kirchner
 * Date: 25 November 2022
 * Description: Abstract class that is extended by Imp.java and Kobold.java
 */
public abstract class Monster {
    private Integer hp;
    private Integer xp = 10;
    private Integer maxHp;
    private HashMap<String, Integer> items;

    public Monster(Integer maxHp, Integer xp, HashMap<String, Integer> items) {
        this.maxHp = maxHp;
        hp = this.maxHp;
        this.xp = xp;
        this.items = items;
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
        return "hp=" + hp.toString() + "/" + getMaxHp();
    }
}

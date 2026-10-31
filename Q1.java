class Character {
    private final int maxHealth;
    private int health;

    public Character(int maxHealth) {
        this.maxHealth = maxHealth;
        this.health = maxHealth;
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health < 0) {
            health = 0;
            System.out.println("health = " + health + " (floored)");
        } else {
            System.out.println("health = " + health);
        }
    }

    public void heal(int amount) {
        health += amount;
        if (health > maxHealth) {
            health = maxHealth;
            System.out.println("health = " + health + " (capped)");
        } else {
            System.out.println("health = " + health);
        }
    }

    public int getHealth() {
        return health;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Character c = new Character(100);
        c.takeDamage(30);
        c.heal(50);
        c.takeDamage(150);
    }
}

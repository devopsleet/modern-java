package Encapsulation;

public class Player {

    public String name, weapon;
    public int health;

    public void losehealth(int damage) {
        health = health - damage;
        if (health <=0) {
            System.out.println("player was knocked out of the game");
        }
    }

    public int healthRemaining() {
        return health;
    }

    public void restoreHealth(int extraHealth) {

        health = health + extraHealth;
        if(health > 100) {
            System.out.println("Player was restored to 100%");
            health = 100;
        }
    }
}

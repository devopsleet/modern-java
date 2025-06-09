package Encapsulation;

public class EnhancedPlayer {

    private String name, weapon;
    private int health;


    public EnhancedPlayer(String name) {
        this(name, 100, "Sword");
    }
    public EnhancedPlayer(String name, int health, String weapon) {
        this.name = name;
        if(health <= 0) {
            this.health = 1;
        } else if (health > 100) {
            this.health = 100;
        } else {
            this.health = health;
        }
        System.out.println();
    }



}

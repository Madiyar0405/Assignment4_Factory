abstract class Monster {
    protected String name;
    protected int health;
    protected int damage;

    public Monster(String name, int health, int damage) {
        this.name = name;
        this.health = health;
        this.damage = damage;
    }

    public void attack() {
        System.out.println(name + " attacks for " + damage + " damage.");
    }

    public void takeDamage(int amount) {
        health -= amount;
        if (health <= 0) {
            System.out.println(name + " has been defeated!");
        } else {
            System.out.println(name + " has " + health + " health remaining.");
        }
    }
}
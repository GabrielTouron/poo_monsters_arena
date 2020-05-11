import com.sun.security.auth.module.LdapLoginModule;

public class Monster {
    //Attribute
    protected String name;
    protected int damage;
    protected int life;

    //Constructor
    public Monster(String name, int life) {
        this.name = name;
        this.life = life;
    }

    //Getter
    public String getName() {
        return name;
    }

    public int getDamage() {
        return damage;
    }

    public int getLife() {
        return life;
    }

    //Setter
    public void setName(String name) {
        this.name = name;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public void setLife(int life) {
        this.life = life;
    }

    //Method
    public void attack(int damage, Monster monster) {
        if (monster.life > 0) {
            monster.life -= damage;
            monster.setLife(monster.life);
            System.out.printf("%s has "+ monster.life + " points remaining %n", monster.getName()) ;
        } else {
            System.out.printf("%s is KO!", monster.getName());
        }
    }
}

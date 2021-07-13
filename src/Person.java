import java.util.Random;

public abstract class Person {
    String name;
    int xp, gold, strength, agility, exp;

    public Person(String name, int xp, int strength, int agility) {
        this.name = name;
        this.xp = xp;
        this.strength = strength;
        this.agility = agility;
        gold = 0;
        exp = 0;
    }

    public static int attack(Person person1){
        if((person1.agility * 3) > new Random().nextInt(100)){
            return person1.strength;
        } else{
            return 0;
        }
    }
}

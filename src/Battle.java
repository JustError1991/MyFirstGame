public class Battle {
    public static void fight(Person player, Person monster){
        while (player.xp > 0 && monster.xp > 0) {
            monster.xp -= Person.attack(player);
            if (monster.xp > 0) {
                player.xp -= Person.attack(monster);
            }
        }
    }
}

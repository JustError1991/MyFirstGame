import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Vendor extends Person{
    Inventar meshok;

    private class Inventar{
        Deque <Flask> flaskList;
        int countflask;

        public Inventar() {
            for (int i = 0; i < 10; i++) {
                flaskList.push(new Flask(100, 90));
                countflask++;
            }
//            for (int i = 0; i < 10; i++) {
//                flaskList.push(new Flask(50, 50));
//                countflask++
//            }
        }
    }

    public Vendor(String name, int xp, int strength, int agility) {
        super("Vendor", 1000000, 100000, 1000000);
        this.meshok = new Inventar();
    }

    public void Seller(Person player){
        if (!meshok.flaskList.isEmpty()) {
            Flask flask = meshok.flaskList.getLast();
            if (player.gold >= flask.price) {
                player.gold -= flask.price;
            }
        }
    }

    public void buyflask(int count){
        for (int i = 1; i <= count; i++) {
            meshok.flaskList.add(new Flask(100, 90));
            meshok.countflask++;
        }
    }
}

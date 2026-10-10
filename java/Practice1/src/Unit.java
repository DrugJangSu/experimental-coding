public class Unit {
    String name;
    int attack;
    int defense;


    public int power() {
       return (attack + defense);
    }
    public int damage(int enemyDefense) {
        return attack - enemyDefense;
    }

}

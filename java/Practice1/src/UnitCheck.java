public class UnitCheck {
    public static void main(String[] args) {
        Unit unit1 = new Unit();
        unit1.name = "knight";
        unit1.attack = 50;
        unit1.defense = 30;

        Unit unit2 = new Unit();
        unit2.name = "archer";
        unit2.attack = 40;
        unit2.defense = 10;

        int enemyDefense = 15;

        System.out.println(unit1.name + "=" + unit1.power());
        System.out.println(unit2.name + "=" + unit2.power());
        System.out.println("damage=" + unit1.damage(enemyDefense));
        System.out.println("team=" + team(unit1.power(), unit2.power()));

    }
       public static int team(int number1, int number2) {
            return number1 + number2;
        }
}

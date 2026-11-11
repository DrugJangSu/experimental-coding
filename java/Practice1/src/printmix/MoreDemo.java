package printmix;

interface Dated {
    String dayLabel();
}

class StampSlip implements Printable, Dated {
    @Override
    public void print() {
        System.out.println("stamp=ok");
    }

    @Override
    public String dayLabel() {
        return "friday";
    }
}

abstract class CafeItem {
    abstract int price();

    void printWon() {
        System.out.println("won=" + price());
    }
}

class KimbapItem extends CafeItem {
    @Override
    int price() {
        return 4500;
    }
}

class WaterItem extends CafeItem {
    @Override
    int price() {
        return 1000;
    }
}

class SavedPrinter {
    private final Printable target;

    SavedPrinter(Printable target) {
        this.target = target;
    }

    void run() {
        target.print();
    }
}

public class MoreDemo {
    public static void main(String[] args) {
        StampSlip stamp = new StampSlip();
        LinePrinter printer = new LinePrinter();
        printer.run(stamp);
        Dated d = stamp;
        System.out.println(d.dayLabel());

        CafeItem a = new KimbapItem();
        CafeItem b = new WaterItem();
        a.printWon();
        b.printWon();

        SavedPrinter saved = new SavedPrinter(stamp);
        saved.run();
    }
}
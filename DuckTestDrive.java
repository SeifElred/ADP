interface Duck {
    void quack();
    void fly();
}

class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I'm flying");
    }
}

interface Turkey {
    void gobble();
    void fly();
}

class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I'm flying a short distance");
    }
}

class TurkeyAdapter implements Duck {
    Turkey turkey1;

    public TurkeyAdapter(Turkey turkey2) {
        this.turkey1 = turkey2;
    }

    public void quack() {
        turkey1.gobble(); // Değişiklik burada yapıldı
    }

    public void fly() {
        for (int i = 0; i < 5; i++) {
            turkey1.fly(); // Değişiklik burada yapıldı
        }
    }
}

public class DuckTestDrive {
    public static void main(String[] args) {
        Duck duck = new MallardDuck();
        Turkey turkey = new WildTurkey();
        Duck turkeyAdapter = new TurkeyAdapter(turkey);

//        System.out.println("The Turkey says...");
//        turkey.gobble();
//        turkey.fly();
//        System.out.println("\nThe Duck says...");
//        testDuck(duck);
	      turkeyAdapter.quack();
	      turkeyAdapter.fly();
//        System.out.println("\nThe TurkeyAdapter says...");
//        testDuck(turkeyAdapter);
    }

    static void testDuck(Duck duck) {
        duck.quack();
        duck.fly();
    }
}

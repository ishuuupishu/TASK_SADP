
interface Animal {
    void eat();

    void see();
}

interface FlyInterface {
    void fly();
}

class Bird implements Animal, FlyInterface {
    @Override
    public void eat() {
        System.out.println("I eat bugs");
    }

    @Override
    public void see() {
        System.out.println("I can see");
    }

    public void fly() {
        System.out.println("I can fly");
    }

}

class main {
    public static void main(String[] args) {
        Bird b = new Bird();
        System.out.println("Hi, I am bird");
        b.eat();
        b.fly();
        b.see();

        Cat c = new Cat();
        System.out.println("Hi, I am cat");
        c.eat();
        ((Animal) c).see();

    }

}

abstract class Animal {
    private final int MAX_RUN = 0;
    private final int MAX_SWIM = 0;
    private final double MAX_JUMP = 0;

    abstract void run(int length);
    abstract void swim(int length);
    abstract void jump(double height);
}

class Cat extends Animal {
    private final int MAX_RUN = 200;
    private final double MAX_JUMP = 2;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN)) System.out.println("Catrun: true");
        else System.out.println("Cat run: false");
    }

    @Override
    void swim(int length) {
        System.out.println("Cat swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_RUN)) System.out.println("Cat jump: true");
        else System.out.println("Cat jump: fase");
    }
}

class Dog extends Animal {
    private final int MAX_RUN = 500;
    private final int MAX_SWIM = 10;
    private final double MAX_JUMP = 0.5;

    @Override
    void run(int length) {
        if ((length >= 0) && (length <= MAX_RUN)) System.out.println("Dog run: true");
    }

    @Override
    void swim(int length) {
        if ((length >= 0) && (length <= MAX_SWIM)) System.out.println("Dog swim: true");
        else System.out.println("Dog swim: false");
    }

    @Override
    void jump(double height) {
        if ((height >= 0) && (height <= MAX_JUMP)) System.out.println("Dog jump: true");
        else System.out.println("Dog jump: false");
    }
}

public class lesson6 {
    public static void main(String[] args) {
        Cat cat = new Cat();
        cat.run(150);
        cat.swim(1);
        cat.jump(1.9);

        Dog dog = new Dog();
        dog.run(300);
        dog.swim(5);
        dog.jump(0.4);
    }
}



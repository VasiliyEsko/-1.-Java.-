package lessonSeven;

public class Cat {
    private String name;
    private int appetite;
    private boolean satiety = false;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public void eat(Plate p) {
        this.satiety = p.decreaseFood(appetite,this.name);

        boolean resultat = false;
        int n = 0;
        while (!this.satiety){
            p.addinPlate();
            this.satiety = p.decreaseFood(appetite,this.name);
            resultat = true;
            n = n + 1;
        }
        if (resultat){
            System.out.println("автоматическая кормушка сработала " + n + " раз(а).");
        }
    }
}

class Plate {
    private int food;
    private int staticFood = 50;

    public Plate(int food) {
        this.food = food;
    }

    public void addinPlate() {
        this.food += this.staticFood;
    }

    public void info() {
        System.out.println("plate: " + food);
    }

    public boolean decreaseFood(int food,String name) {
        if (this.food >= food){
            this.food -= food;
            return true;
        }else if(this.food < food){
            System.out.println("Не хватило корма для кота " + name + ", в количестве - " + (food - this.food)  + " шт." );
        }else{
            System.out.println("Корм закончился.");
        }
        return false;
    }
}

class Main {
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 150);
        Plate plate = new Plate(100);
        cat.eat(plate);
        plate.info();

        System.out.println();

        Cat arrCat [] = {new Cat("Barsik", 15),new Cat("Boris", 30),new Cat("Proglot", 60)};

        Plate plateFor3Cat = new Plate(100);

        for (int i = 0; i <= arrCat.length-1; i++) {
            arrCat [i].eat(plateFor3Cat);
            plateFor3Cat.info();
        }

    }
}

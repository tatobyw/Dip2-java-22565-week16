public class Main {
    public static void main(String[] args) {

        Student std = new Student();
        std.setName("chananthon");
        std.setAge(19);
        System.out.println("Name:" + std.getName());
        System.out.println("Age:" + std.getAge());




        Human human = new Human() {
            @Override
            public void walk() {

            }
            @Override
            public void eat() {

            }
        };
        human.eat();
        human.walk();

        Sparrow sparrow = new Sparrow();
        sparrow.fly();
        sparrow.walk();

        Rat rat = new Rat();
        rat.walk();



        Cat cat = new Cat();
        cat.printSound();
        cat.displayInfo("Cat");
        System.out.println("Animal name"  + cat.Animalname);

        Monkey monkey = new Monkey();
        monkey.printSound();
        monkey.displayInfo("Monkey");
        System.out.println("Animal name"  + monkey.Animalname);


        Dog dog = new Dog();
        dog.printSound();
        dog.displayInfo("Dog","Red");
        System.out.println("Animal name"  + dog.Animalname);

        Apple a = new Apple();
        Pineapple p = new Pineapple();
        a.taste();
        p.taste();
    }
}
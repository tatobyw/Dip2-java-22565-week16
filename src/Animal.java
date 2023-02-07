//abstract class
abstract class Animal {

    public String Animalname;

    public String color;
    abstract void printSound();

    public void displayInfo(String animal){  //General method
        this.Animalname = animal;
    }
    public void displayInfo(String animal,String color){  //General method
        this.Animalname = animal;
        this.color = color;
    }
}

class Cat extends Animal{
    void printSound(){
        System.out.println("Cat meow");
    }
}
class Monkey extends Animal{
    void printSound(){
        System.out.println("Mokey whoop!!");
    }
}
class Dog extends Animal{
    void printSound(){
        System.out.println("Dog Bow!!");
    }
}
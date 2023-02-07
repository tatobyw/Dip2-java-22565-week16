interface Walk{
    void walk();
}

class Sparrow implements Walk,Fly{
    public void walk(){
        System.out.println("A Sparrow Walk");
    }
    public void fly(){
        System.out.println("A Sparrow Fly");
    }
}

interface Fly{
    void fly();
}

interface Human extends Walk {
    @Override
    void walk();
    void eat();
}


class  Rat implements Walk{
    public void walk(){
        System.out.println("A rat Walks");
    }
}
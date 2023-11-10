abstract class Animal {
    public abstract void eat();

}

class Herbivore extends Animal{
    public void eat(){
        System.out.println("I eat plants");

    }
}

class Carnivore extends Animal{
    public void eat(){
        System.out.println("I eat meat");
    }
}

class Omnivore extends Animal{
    public void eat(){
        System.out.println("I eat both plants and meat");
    }
}


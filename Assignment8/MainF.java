interface Animal 
{
    void makeSound();
}


interface Vehicle 
{
    void start();
}

class AnimalVehicle implements Animal, Vehicle 
{
    @Override
    public void makeSound() 
    {
        System.out.println("The animal makes a sound.");
    }

    @Override
    public void start() 
    {
        System.out.println("The vehicle starts.");
    }
}

public class MainF 
{
    public static void main(String[] args) 
    {
        AnimalVehicle creature = new AnimalVehicle();
        creature.makeSound();
        creature.start();
    }
}

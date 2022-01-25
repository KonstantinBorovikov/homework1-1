package HomeWork_6;

class Animal {
    public int run;
    public String swim;
    public Animal(){
    }
    public Animal(int swim) {
        this.swim = String.valueOf(swim);
    }
    public void animalInfo(){
        System.out.println();
    }
}
class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog(500, 10);
        Cat cat = new Cat(200, animal.swim);
        cat.catInfo();
        dog.dogInfo();
    }
}








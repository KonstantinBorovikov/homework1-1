package HomeWork_6;

class Dog extends Animal {
    public long run;
    public long swim;

    public Dog(int run, int swim) {
        this.run = run;
        this.swim = swim;
    }

    public void dogInfo() {
        System.out.println("Собака пробежала " + run + "m " + "Собака проплыла " + swim + "m ");
    }
}




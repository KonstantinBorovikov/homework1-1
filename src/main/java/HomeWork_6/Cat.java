package HomeWork_6;

class Cat extends Animal{
    protected String swim;
    int run;
    public Cat(int run, String swim){
        this.run = run;
        this.swim = String.valueOf(swim);
    }
    public void catInfo(){
        System.out.println("Кот пробежал " + run + "m " + "Кот не умеет плавать ");
    }


}




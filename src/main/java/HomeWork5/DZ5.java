package HomeWork5;

public class DZ5 {
    // это поля класса
    String name; //ФИО
    String position; //должность
    String email; //емейл
    String phone_number; //номер телефона
    int salary; //зарплата
    int age; //возраст


    public DZ5(String name, String position, String email, String phone_number, int salary, int age) {
        this.name = name;
        this.position = position;
        this.email = email;
        this.phone_number = phone_number;
        this.salary = salary;
        this.age = age;
    }


    @Override
    public String toString() {
        return String.format("Имя: %s \tДолжность: %s \nEmail: %s \t Номер телефона: %s \n Зарплата: %d \t Возраст: %d \n",
                name, position, email, phone_number, salary, age);
    }


    public void print() {
        System.out.println(this);
    }


    public static void main(String[] args) {

        DZ5[] persArray = new DZ5[5];
        persArray[0] = new DZ5("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 250000, 55);
        persArray[1] = new DZ5("Ivanov Ivan1", "Engineer1", "ivivan@mailbox.com1", "8923123121", 127000, 42);
        persArray[2] = new DZ5("Ivanov Ivan2", "Engineer2", "ivivan@mailbox.com2", "8923123122", 19000, 21);
        persArray[3] = new DZ5("Ivanov Ivan3", "Engineer3", "ivivan@mailbox.com3", "8923123123", 120000, 28);
        persArray[4] = new DZ5("Ivanov Ivan4", "Engineer4", "ivivan@mailbox.com4", "8923123124", 138000, 48);


        for (int i = 0; i < persArray.length; i++)
            if (persArray[i].age > 40) persArray[i].print();

    }
}
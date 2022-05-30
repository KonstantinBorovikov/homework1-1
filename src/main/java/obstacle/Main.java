package obstacle;

import Java2.HomeWork_1.Cat;
import Java2.HomeWork_1.Human;
import Java2.HomeWork_1.Robot;
import Java2.HomeWork_1.Team;

public class Main {
    public static void main(String[] args) {

        Team team = new Team("Rocket", new Human("Bob"), new Cat("Vaska"), new Robot("R2d2"));
        Course course = new Course(
                new Cross(80),
                new Wall(2),
                new Wall(1),
                new Cross(120));
        course.doIt(team);
        team.showResults();

    }
}

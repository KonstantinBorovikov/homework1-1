package Java2.HomeWork_1;

public class Animal implements Competitor {

    public Animal(String кот, String name, int i, int i1, int i2) {

    }

    @Override
    public void run(int dist) {

    }

    @Override
    public void jump(int height) {

    }

    @Override
    public boolean isOnDistance() {
        return false;
    }

    @Override
    public void info() {

    }

    public static class Animals implements Competitor {
        String type;
        String name;

        int maxRunDistance;
        int maxJumpHeight;
        int maxSwimDistance;

        boolean onDistance;

        @Override
        public boolean isOnDistance() {
            return onDistance;
        }

        public Animals(String type, String name, int maxRunDistance, int maxJumpHeight, int maxSwimDistance) {
            this.type = type;
            this.name = name;
            this.maxRunDistance = maxRunDistance;
            this.maxJumpHeight = maxJumpHeight;
            this.maxSwimDistance = maxSwimDistance;
            this.onDistance = true;
        }

        @Override
        public void run(int dist) {
            if (dist <= maxRunDistance) {
                System.out.println(type + " " + name + " хорошо справился с кроссом");
            } else {
                System.out.println(type + " " + name + " не справился с кроссом");
                onDistance = false;
            }
        }

        @Override
        public void jump(int height) {
            if (height <= maxJumpHeight) {
                System.out.println(type + " " + name + " удачно перепрыгнул через стену");
            } else {
                System.out.println(type + " " + name + " не смог перепрыгнуть стену");
                onDistance = false;
            }
        }

        @Override
        public void info() {
            System.out.println(type + " " + name + " - " + onDistance);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Wall wall = new Wall(20,100,3);
        System.out.println(wall.getLength());
        wall.destroyHalfHeight();
        System.out.println(wall.getLength());
    }
}
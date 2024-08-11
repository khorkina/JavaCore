package lesson9.Task;

public class Restaurant {
    private static int sausageCount = 0;
    private static int breadCount = 0;

    public void cookHotDog() {
        if (sausageCount > 0 && breadCount > 1) {
            sausageCount--;
            breadCount -= 2;
            System.out.println("HotDog is ready! :)");
        } else {
            System.out.println("There are not ingredients :( ");
        }
    }

    public void addProducts() {
        sausageCount += 100;
        breadCount += 200;

    }

}

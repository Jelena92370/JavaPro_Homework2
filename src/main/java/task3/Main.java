package task3;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Bicycle roadBike = new Bicycle("Road Bike","Red", 28, false, 44);
        Bicycle mountainBike = new Bicycle("Mountain Bike","White", 26, true, 60);
        Bicycle kidsBike = new Bicycle("Kids Bike","Pink", 16, false, 30);

        System.out.println(roadBike);
        System.out.println(mountainBike);
        System.out.println(kidsBike);

        Bicycle[] bicycles = {roadBike, mountainBike, kidsBike};
        System.out.println(Arrays.toString(bicycles));

        // Метод Arrays.toString() вызывает toString() для каждого элемента массива. При вызове этого метода каждый объект превращается в строку.
    }

}

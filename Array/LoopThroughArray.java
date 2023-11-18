package array;

public class LoopThroughArray {
    public static void main(String[] args) {
        String[] cars1 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars1.length; i++) {
            System.out.println(cars1[i]);
        }

        // using for-each loop upper problem solution be like
        String[] cars2 = {"Volvo", "BMW", "Ford", "Mazda"};
        for (String car : cars2) {
            System.out.println(car);
        }
    }
}

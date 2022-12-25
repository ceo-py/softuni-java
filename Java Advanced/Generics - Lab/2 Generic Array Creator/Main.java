public class Main {
    public static void main(String[] args) {

        Integer[] arr = ArrayCreator.create(13, 69);

        for (Integer integer : arr) {
            System.out.println(integer);
        }

        Integer[] arr2 = ArrayCreator.create(Integer.class, 4, 13);

        for (Integer integer : arr2) {
            System.out.println(integer);
        }
    }
}
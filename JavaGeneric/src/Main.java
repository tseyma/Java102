public class Main {
    public static void main(String[] args) {
        MyList<Integer> list = new MyList<>(5);
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println("Size: " + list.size()); // Output: 3
        System.out.println("Capacity: " + list.getCapacity()); // Output: 10

        MyList<String> stringList = new MyList<>(5);
        stringList.add("Hello");
        stringList.add("World");
        System.out.println("Size: " + stringList.size()); // Output: 2
        System.out.println("Capacity: " + stringList.getCapacity()); // Output: 5
    }
}
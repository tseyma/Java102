public class MyList<T> {
    private static final int DEFAULT_CAPACITY = 10;
    private T[] array;
    private int size = 0;


    @SuppressWarnings("unchecked")
    public MyList(int i) {
        array = (T[]) new Object[DEFAULT_CAPACITY];
        size = 0;
    }


    public int size() {
        return size;
    }

    public int getCapacity() {
        return array.length;
    }

    public void add(T data) {
        if (size == array.length) {
            expandArray();
        }
        array[size++] = data;
    }

    private void expandArray() {
        int newCapacity = array.length * 2;
        @SuppressWarnings("unchecked")
        T[] newArray = (T[]) new Object[newCapacity];
        System.arraycopy(array, 0, newArray, 0, size);
        array = newArray;
    }}
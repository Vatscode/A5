import java.util.Arrays;
import java.util.Random;

/**
 * A dynamic array implementation that stores elements of type T.
 *
 * @param <T> The type of elements stored in the array
 * @author Vats Upadhyay A00454163
 */
public class DynamicArray<T> implements DynamicCollection<T> {

    private Object[] array;
    private int size;
    private final Random random; //final is optional here

    /**
     * Constructs an empty dynamic array with initial capacity of 8
     */
    public DynamicArray() {
        array = new Object[8];
        size = 0;
        random = new Random();
    }

    /**
     * Checks if the array is empty
     *
     * @return true if the array contains no elements, false otherwise
     */
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**
     * Returns the number of elements in the array
     *
     * @return the number of elements in the array
     */
    @Override
    public int size() {
        return size;
    }

    /**
     * Creates a new array containing all elements
     *
     * @return a new array containing all elements
     */
    @Override
    public Object[] toJavaArray() {
        return Arrays.copyOf(array, size); //simple array method provided by java
    }

    /**
     * Returns a copy of the underlying array
     *
     * @return a copy of the internal array
     */
    @Override
    public Object[] getUnderlyingArrayCopy() {
        return Arrays.copyOf(array, array.length); //simple array method provided by java
    }

    /**
     * Returns a string representation of the array
     *
     * @return a string representation of the array
     */
    @Override
    public String toString() {
        return Arrays.toString(toJavaArray()); //simple toString here
    }

    /**
     * Gets the element at the specified index
     *
     * @param index the index of the element to return
     * @return the element at the specified index
     * @throws IndexOutOfBoundsException if index is out of range
     */
    @Override
    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(); //basic exception handling here
        }
        return (T) array[index];
    }

    /**
     * Gets the last element in the array
     *
     * @return the last element, or null if array is empty
     */
    @Override
    public T getLast() {
        if (size == 0) {
            return null;
        }
        return (T) array[size - 1];
    }

    /**
     * Gets a random element from the array
     *
     * @return a random element, or null if array is empty
     */
    @Override
    public T getRandom() {
        if (size == 0) {
            return null;
        }
        return (T) array[random.nextInt(size)];
    }

    /**
     * Sets the element at the specified index
     *
     * @param index the index of the element to set
     * @param value the value to set
     * @throws IndexOutOfBoundsException if index is out of range
     */
    @Override
    public void set(int index, T value) { //two parameters here for method
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException(); //basic exception handling
        }
        array[index] = value;
    }

    /**
     * Adds an element to the end of the array
     *
     * @param data the element to add
     */
    @Override
    public void add(T data) { //add method implementation
        if (size == array.length) { 
            Object[] newArray = new Object[array.length * 2];

            for (int i = 0; i < size; i++) { //simple for loop for copying array
                newArray[i] = array[i];
            }
            array = newArray;
        }
        array[size++] = data;
    }

    /**
     * Deletes the element at the specified index
     *
     * @param index the index of the element to delete
     * @return the deleted element
     * @throws IndexOutOfBoundsException if index is out of range
     */
    @Override
    public T delete(int index) { //delete method implementation
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        T deleted = (T) array[index];

      
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }

        array[--size] = null; //here it subtracts first then adds to size
        return deleted;
    }
}

//end of program
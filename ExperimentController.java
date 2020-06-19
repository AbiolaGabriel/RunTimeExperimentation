import java.util.*;

/**
 * Abiola Gabriel Olofin
 *
 * In this class, we are experimenting with the amount of values being added
 * to the arrayList and seeing how long it takes each method in the RandomIntegerClass
 * to do the method
 */
public class ExperimentController {
    public int min, max, seed, numItems;

    public static void main(String[] args) {
        //6 tests of different values
        ExperimentController one = new ExperimentController();
        long time = 0;
        int x = 5;
        // while(x<79000){
        // time = one.timeAddToFront(x, 23, -2147483648, 2147483647);
        // System.out.println("Time AddtoFront: "+time);
        // x = x * 5;
        // }
        // x = 5;

        // while(x<79000){
        // time = one.timeAddToBack(x, 23, -2147483648, 2147483647);
        // System.out.println("Time AddtoBack: "+time);
        // x = x * 5;
        // }
        // x = 5;

        // while(x<79000){
        // time = one.timeAddSorted(x, 23, -2147483648, 2147483647);
        // System.out.println("Time AddSorted: "+time);
        // x = x * 5;
        // }

        // while(x<79000){
        // time = one.timeProductSorted(x,23,-2147483648,2147483647);
        // System.out.println("Time ProductSorted: "+time);
        // x = x * 5;
        // }
        // x = 5;

        // while(x<79000){
        // time = one.timeSortOfUnsortedList(x,23,-2147483648,1000);
        // System.out.println("Time SortUnsort: "+time);
        // x = x * 5;
        // }
        // x=5;

        while(x<79000) {
            time = one.timeSortOfSortedList(x, 23, -2147483648, 1000);
            System.out.println("Time SortSort: " + time);
            x = x * 5;
        }

        //System.out.println("Time AddtoBack: "+time);
        //time = one.timeAddSorted(25, 23, 0, 10);
        // param - 50, 23, 0, 1000
        // param - 125, 23, 0, 1000
        // param - 625, 23, 0, 1000
        // param - 3125, 23, 0, 1000
        // param - 15625, 23, 0, 1000
        // param - 78125, 23, 0, 1000
    }

    /**
     *
     * @param numberOfItems - number of items to be added
     * @param seed - seed number used to generate random numbers
     * @param min - the minimum number to be generated
     * @param max - the maximum number to be generated
     * @return - return the time it took to do each method in the RandomIntegerContainer
     */
    public long timeAddToFront(int numberOfItems, int seed, int min, int max) {
        RandomIntegerContainer r = new RandomIntegerContainer();
        Random random = new Random(seed);
        int i = 0;
        long startTime = System.currentTimeMillis();
        while (i < numberOfItems) {
            int j = random.nextInt();
            if (j < max && j > min) {
                r.addToFront(j);
                i++;
            }
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long timeAddToBack(int numberOfItems, int seed, int min, int max) {
        RandomIntegerContainer r = new RandomIntegerContainer();
        Random random = new Random(seed);
        int i = 0;
        long startTime = System.currentTimeMillis();
        while (i < numberOfItems) {
            int j = random.nextInt();
            if (j < max && j > min) {
                r.addToBack(j);
                i++;
            }
        }
        long endTime = System.currentTimeMillis();
        return (endTime*1000 - startTime*1000);
    }

    public long timeAddSorted(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer r = new RandomIntegerContainer();
        Random random = new Random(seed);
        int i = 0;
        long startTime = System.currentTimeMillis();
        while (i < numberOfItems) {
            int j = random.nextInt();
            if (j <= max && j >= min) {
                r.addSorted(j);
                i++;
            }
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long timeProductSorted(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer r = new RandomIntegerContainer();
        Random random = new Random(seed);
        int i = 0;
        long startTime = System.currentTimeMillis();
        while (i < numberOfItems) {
            int j = random.nextInt();
            if (j <= max && j >= min) {
                r.productSorted(j);
                i++;
            }
        }
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long timeSortOfUnsortedList(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer r = new RandomIntegerContainer();
        Random random = new Random(seed);
        int i = 0;
        long startTime = System.currentTimeMillis();
        while (i < numberOfItems) {
            int j = random.nextInt();
            if (j < max && j > min) {
                r.addToBack(j);
                i++;
            }
            //i++;
        }
        r.selectionSort();
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

    public long timeSortOfSortedList(int numberOfItems, int seed, int min, int max){
        RandomIntegerContainer r = new RandomIntegerContainer();
        Random random = new Random(seed);
        int i = 0;
        long startTime = System.currentTimeMillis();
        while (i < numberOfItems) {
            int j = random.nextInt();
            if (j < max && j > min) {
                r.addToBack(j);
                i++;
            }
            //i++;
        }
        r.selectionSort();
        r.selectionSort();
        long endTime = System.currentTimeMillis();
        return (endTime - startTime);
    }

}

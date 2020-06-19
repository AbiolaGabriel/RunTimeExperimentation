import java.util.*;
/**
 * Abiola Gabriel Olofin
 * 02/04/2020
 * 
 * This class we are creating methods that will add integers to an arrayList
 * These methods include adding to the front, back, adding to a sorted arrayList,
 * sorting the arrayList, and printing out an array of the arrayList
 */
public class RandomIntegerContainer{
    public ArrayList<Integer> arrList;

    public RandomIntegerContainer(){
        this.arrList = new ArrayList<Integer>();
    }

    public RandomIntegerContainer(int numElements){
        this.arrList = new ArrayList<Integer>();
        Random random = new Random(23);
        int i = 0;
        while(i<numElements){
            int j = random.nextInt();
            arrList.add(j);
            i++;
        }
    }

    public void addToFront(int x){
        this.arrList.add(0,x);
    }

    public void addToBack(int x){
        this.arrList.add(x);
    }

    public void addSorted(int x){
        for(int i = 1; i < this.arrList.size(); i++){
            if(x < arrList.get(i) && x > arrList.get(i-1)){
                this.arrList.add(i-1,x);
            }
        }
    }

    public void productSorted(int x){
        if(this.arrList.size() != 0){
            int newNum = this.arrList.get(0) * x;
            this.arrList.set(0, newNum);
            this.arrList.remove(0);
            addSorted(newNum);
        }
        // else{
            // System.out.println("arrayList length is 0");
        // }
    }

    public void selectionSort(){
        for (int i = 0; i < this.arrList.size(); i++) {
            int pos = i;
            for (int j = i; j < this.arrList.size(); j++) {
                if (this.arrList.get(j) < this.arrList.get(pos))
                    pos = j;
            }
            // Swap min (smallest num) to current position on array
            int min = this.arrList.get(pos);
            this.arrList.set(pos, this.arrList.get(i));
            this.arrList.set(i, min);
        }
    }

    public int[] toArray(){
        int[] newArr = new int[arrList.size()];
        for(int i = 0; i<newArr.length; i++){
            newArr[i] = this.arrList.get(i);
            System.out.println(newArr[i]);
        }
        return newArr;
    }
}
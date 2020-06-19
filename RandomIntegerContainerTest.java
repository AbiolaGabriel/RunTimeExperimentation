import java.util.*;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * The test class RandomIntegerContainerTest.
 *
 * @author  (your name)
 * @version (a version number or a date)
 */
public class RandomIntegerContainerTest
{
    /**
     * Default constructor for test class RandomIntegerContainerTest
     */
    private RandomIntegerContainer randomIn;
    private int count;
    public RandomIntegerContainerTest(){
        count = 0;
        randomIn = new RandomIntegerContainer();
        Random random = new Random(23);
        int i = 0;
        while(i<15){
            int j = random.nextInt();
            randomIn.addToBack(j);
            //System.out.println(random.nextInt());
            i++;
            count++;
        }
        //randomIn.toArray();
    }

    @Test
    public void addingToFront()
    {
        RandomIntegerContainerTest curr = new RandomIntegerContainerTest();
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        Random random = new Random(23); 
        int j = random.nextInt();
        curr.randomIn.addToFront(j);
        //System.out.println(random.nextInt());
        assert curr.randomIn.arrList.get(0) == j;
        assert curr.randomIn.arrList.get(0) != curr.randomIn.arrList.get(1);
        //System.out.println("");
        //curr.randomIn.toArray();
    }

    @Test
    public void addingToBack(){
        RandomIntegerContainerTest curr = new RandomIntegerContainerTest();
        RandomIntegerContainer randomIn1 = new RandomIntegerContainer();
        Random random = new Random(23); 
        int j = random.nextInt();
        curr.randomIn.addToBack(j);
        assert curr.randomIn.arrList.get(this.count) == j;
    }

    @Test
    public void addSorted(){
        RandomIntegerContainerTest curr = new RandomIntegerContainerTest();
        ArrayList<Integer> i = new ArrayList<Integer>();
        for(int k: curr.randomIn.arrList){
            i.add(k);
        }
        Random random = new Random(23);
        int j = random.nextInt();
        i.add(j);
        Collections.sort(i);
        curr.randomIn.addSorted(j);
        for(int k = 0; k<curr.randomIn.arrList.size(); k++){
            assert i.get(k) == curr.randomIn.arrList.get(k);
        }
    }

    @Test
    public void addProductSorted(){
        RandomIntegerContainerTest curr = new RandomIntegerContainerTest();
        Random random = new Random(23);
        int j = 27;
        int y = (curr.randomIn.arrList.get(0)) * j;
        ArrayList<Integer> i = new ArrayList<Integer>();
        for(int k: curr.randomIn.arrList){
            i.add(k);
        }
        i.add(y);
        Collections.sort(i);
        curr.randomIn.productSorted(j);
        assert (curr.randomIn.arrList.contains(y)) == true;
        for(int k = 0; k<curr.randomIn.arrList.size(); k++){
            assert i.get(k) == curr.randomIn.arrList.get(k);
        }
    }

    @Test
    public void addSelectionSort(){
        RandomIntegerContainerTest curr = new RandomIntegerContainerTest();
        ArrayList<Integer> i = new ArrayList<Integer>();
        for(int k: curr.randomIn.arrList){
            i.add(k);
            //System.out.println(k);
        }
        Collections.sort(i);
        //System.out.println("");
        //for(int k: i){
        //System.out.println(k);
        //}
        curr.randomIn.selectionSort();
        //System.out.println("");
        int assertion = 0;
        for(int j = 0; j<curr.randomIn.arrList.get(j); j++){
            //System.out.println(curr.randomIn.arrList.get(j));
            assert i.get(j) == curr.randomIn.arrList.get(j);
        }
    }

    @Test
    public void toArray(){
        RandomIntegerContainerTest curr = new RandomIntegerContainerTest();
        int[] i = new int[curr.randomIn.arrList.size()];
        for(int k = 0; k<curr.randomIn.arrList.size(); k++){
            i[k] = curr.randomIn.arrList.get(k);
            //System.out.println(k);
        }
        int [] r = curr.randomIn.toArray();
        for(int j = 0; j<r.length; j++){
           assert i[j] == r[j];
        }
    }
}


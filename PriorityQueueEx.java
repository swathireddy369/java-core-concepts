
//queue first in first out
//queue is interface which are extended from collection interface
//it folows first in out but some exceptions like priorityqueue
import java.util.Arrays;
import java.util.Collections;

import java.util.PriorityQueue;

public class PriorityQueueEx {
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>((a, b) -> b - a);// its by default sort them in ascending ordedr
        pq.add(5);
        pq.add(8);
        pq.add(3);
        pq.add(1);
        pq.add(9);
        System.out.println(pq);
        pq.isEmpty();
        // if we want to make pq in descending order need to provide custom comparator
        // pq.add to add elements in to the pq
        // pq.add(null)throws exception null pointer exception
        // offer also add elemtns into the pq it returns false if adding fails

        // poll()//retrives and remove the head of queeu return null if queue is empty
        // remove()//it throws exception no such element exception if queue empty

        // peek() //just remove first element from queue does not remove it
        // element is same peek if queue empt just return exception

        // iteratable-collection-queue-PriorityQueueEx
        // minPriorityQueue - min heap
        // maxPriorityQueue -max heap

        // add - O(logn)
        // peek-O(1)
        // remove-O(logn)
        // arbitary element -O(n)

        // primitive collection sort
        int[] arr = new int[] { 3, 5, 68, 9 };
        // comparator
        // comaprable compareTo
        Arrays.sort(arr);

        // object collection sorting

        // comparator (fnctional interface)
        // which abstarct method

        // Comparator

        Integer[] arr1 = { 4, 56, 7 };
        Arrays.sort(arr1, (a, b) -> b - a);// its by default sort them in ascending ordedr

        Arrays.sort(arr1);// comparable compare to

        // if a>b = 1 (swap happens)
        // a==b = 0
        // a<b =-1
        for (Integer val : arr1) {
            System.out.println(val);
        }
        Car[] cArray = new Car[3];
        cArray[0] = new Car("telsa");
        cArray[1] = new Car("porche");
        cArray[2] = new Car("hondai");
        Arrays.sort(cArray, (a, b) -> a.compareTo(b));// this compares and sorts in lexicograpahical order
    }

}

class Car implements Comparable<Car> {
    String carType;

    public Car(String type) {
        this.carType = type;
    }

    @Override
    public int compareTo(Car o) {
        // TODO Auto-generated method stub
        return this.carType.compareTo(o.carType);
    }
}

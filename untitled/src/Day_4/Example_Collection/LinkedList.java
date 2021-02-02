package Day_4.Example_Collection;


    /*LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
    It can store the duplicate elements.
    It maintains the insertion order and is not synchronized.*/

import java.util.Iterator;
import java.util.LinkedList;

class TestJavaCollection2{
        public static void main(String args[]){
            LinkedList<String> al=new LinkedList<String>();
            al.add("Ravi");
            al.add("Vijay");
            al.add("Ravi");
            al.add("Ajay");



            Iterator<String> itr=al.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            //Add an element to the first position
            al.addFirst("surya");
            //Add an element to the first position
            al.addLast("ajith");
            //Add an element to the first position

            System.out.println(al.getFirst());
            //Get the first value using index position
            System.out.println(al.get(0));

            //removeFirst and removeLast
            System.out.println("Remove first :"+al.removeFirst());
            System.out.println("Remove last :"+al.removeLast());

            //poll method  and pollfirst() deletes the first element in the list
            System.out.println(al.poll());
            System.out.println(al);

            //pollLast deletes the last
            al.pollLast();
            System.out.println(al);

            //remove deletes the first element
            al.remove();
            System.out.println(al);
        }
    }


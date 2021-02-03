package Day_4.Example_Collection;


    /*LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
    It can store the duplicate elements.
    It maintains the insertion order and is not synchronized.*/

/*
 * LinkedList performs the worst if the operation is retrieval of data.
 * Hence if our requirement is to fetch data, we should use ArrayList.
 * But LinkedList is the best choice if we have requirements of adding and
 * removing data very often. In this case we should avoid ArrayList
 */

import java.util.Iterator;
import java.util.LinkedList;

class Browser{
        public static void main(String args[]){
            LinkedList<String> url=new LinkedList<String>();
            url.add("www.javaatpoint.com");
            url.add("www.techdifferences.com");
            url.add("www.greeks.com");
            url.add("www.wikipidea.com");
            url.add("www.tutorialspoint.com");
            url.add("www.instagaram.com");

            Iterator<String> itr=url.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            //Add an element to the first position
            url.addFirst("www.youtube.com");
            System.out.println(url);
            //Add an element to the first position
            url.addLast("www.twitter.com");
            System.out.println(url);

            //removeFirstOccurence
            url.removeFirstOccurrence("www.greeks.com");
            System.out.println("After removing the first "+ url);

            //removeLastOccurrence
            url.removeLastOccurrence("www.wikipidea.com");
            System.out.println("After removing the last occurence "+ url);


            //Add an element to the first position

            System.out.println(url.getFirst());
            //Get the first value using index position
            System.out.println(url.get(0));

            //removeFirst and removeLast
            System.out.println("Remove first :"+url.removeFirst());
            System.out.println("Remove last :"+url.removeLast());

            System.out.println(url);

            //poll method  and pollfirst() deletes the first element in the list
            System.out.println(url.poll());
            System.out.println(url);

            //pollLast deletes the last
            url.pollLast();
            System.out.println(url);

            //remove deletes the first element
            url.remove();
            System.out.println(url);
        }
    }


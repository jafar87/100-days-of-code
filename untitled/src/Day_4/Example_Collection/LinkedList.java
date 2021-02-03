package Day_4.Example_Collection;


    /*LinkedList implements the Collection interface. It uses a doubly linked list internally to store the elements.
    It can store the duplicate elements.
    It maintains the insertion order and is not synchronized.*/

import java.util.Iterator;
import java.util.LinkedList;

class TestJavaCollection2{
        public static void main(String args[]){
            LinkedList<String> playlist=new LinkedList<String>();
            playlist.add("ARRahman Song");
            playlist.add("Gv Song");
            playlist.add("Anirudh Song");
            playlist.add("Yuvan Song");
            playlist.add("thaman Song");
            playlist.add("Harrisjayaraj Song");

            Iterator<String> itr=playlist.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            //Add an element to the first position
            playlist.addFirst("ilayaraja");
            System.out.println(playlist);
            //Add an element to the first position
            playlist.addLast("hiphop");
            System.out.println(playlist);

            //removeFirstOccurence
            playlist.removeFirstOccurrence("Gv Song");
            System.out.println("After removing the first occurence of 2 "+ playlist);

            //removeLastOccurrence
            playlist.removeLastOccurrence("hiphop");
            System.out.println("After removing the last occurence of 6 "+ playlist);


            //Add an element to the first position

            System.out.println(playlist.getFirst());
            //Get the first value using index position
            System.out.println(playlist.get(0));

            //removeFirst and removeLast
            System.out.println("Remove first :"+playlist.removeFirst());
            System.out.println("Remove last :"+playlist.removeLast());

            System.out.println(playlist);

            //poll method  and pollfirst() deletes the first element in the list
            System.out.println(playlist.poll());
            System.out.println(playlist);

            //pollLast deletes the last
            playlist.pollLast();
            System.out.println(playlist);

            //remove deletes the first element
            playlist.remove();
            System.out.println(playlist);
        }
    }


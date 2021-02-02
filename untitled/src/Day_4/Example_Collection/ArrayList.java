package Day_4.Example_Collection;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/*ArrayList;-
    The ArrayList class implements the List interface. It uses a dynamic array to store the duplicate element of different data types.
    The ArrayList class maintains the insertion order and is non-synchronized.
    The elements stored in the ArrayList class can be randomly accessed.*/
    class TestJavaCollection1{
        public static void main(String args[]){
            ArrayList<String> list=new ArrayList<String>();//Creating arraylist
            list.add("Ravi");//Adding object in arraylist
            list.add("Vijay");
            list.add("Ravi");
            list.add("Ajay");
            System.out.println(list.get(0));
//Traversing list through Iterator
            ListIterator<String> itr=list.listIterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
            while(itr.hasPrevious()){
                System.out.println(itr.previous());
            }
            Iterator itrarraylist = list.iterator();
            while (itrarraylist.hasNext()){
                System.out.println(itrarraylist.next());
            }
        }
    }


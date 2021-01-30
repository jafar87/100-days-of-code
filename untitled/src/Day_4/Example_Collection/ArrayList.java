package Day_4.Example_Collection;


import java.util.ArrayList;
import java.util.Iterator;

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
//Traversing list through Iterator
            Iterator itr=list.iterator();
            while(itr.hasNext()){
                System.out.println(itr.next());
            }
        }
    }


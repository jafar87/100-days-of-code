package Day_4.Example_Collection;

public class Collection {

    /*Collections in Java
    The Collection in Java is a framework that provides an architecture to store and manipulate the group of objects.

    Java Collections can achieve all the operations that you perform on a data such as searching, sorting, insertion, manipulation, and deletion.

    Java Collection means a single unit of objects.
    Java Collection framework provides many interfaces (Set, List, Queue, Deque) and classes (ArrayList, Vector, LinkedList, PriorityQueue, HashSet, LinkedHashSet, TreeSet).*/


    /*What is Collection in Java:-
    A Collection represents a single unit of objects, i.e., a group.

    What is Collection framework
    The Collection framework represents a unified architecture for storing and manipulating a group of objects. It has:

    1.Interfaces and its implementations, i.e., classes
    2.Algorithm*/


//    Iterator interface;-
//    Iterator interface provides the facility of iterating the elements in a forward direction only.
//    Methods of Iterator interface
//    There are only three methods in the Iterator interface.

    /*Iterable Interface
    The Iterable interface is the root interface for all the collection classes.
    The Collection interface extends the Iterable interface and therefore all the subclasses of Collection interface also implement the Iterable interface.

    It contains only one abstract method. i.e.,

    Iterator<T> iterator()
    It returns the iterator over the elements of type T.*/

   /* Collection Interface:-
    The Collection interface is the interface which is implemented by all the classes in the collection framework.
    It declares the methods that every collection will have.
    In other words, we can say that the Collection interface builds the foundation on which the collection framework depends.

    Some of the methods of Collection interface are Boolean add ( Object obj), Boolean addAll ( Collection c), void clear(), etc.
    which are implemented by all the subclasses of Collection interface.*/

    /*List Interface
    List interface is the child interface of Collection interface.
    It inhibits a list type data structure in which we can store the ordered collection of objects.
    It can have duplicate values.*/

    /*List <data-type> list1= new ArrayList();
    List <data-type> list2 = new LinkedList();
    List <data-type> list3 = new Vector();
    List <data-type> list4 = new Stack();*/

//    here are various methods in List interface that can be used to insert, delete, and access the elements from the list.

}

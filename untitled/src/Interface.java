//*The interface in Java is a mechanism to achieve abstraction.
// There can be only abstract methods in the Java interface, not method body. It is used to achieve abstraction and multiple inheritance in Java.

//        It is used to achieve abstraction.
//        By interface, we can support the functionality of multiple inheritance.
//        It can be used to achieve loose coupling.


interface printable {
    void print();
}

class A6 implements printable {
    public void print() {
        System.out.println("Hello");
    }

    public static void main(String args[]) {
        A6 obj = new A6();
        obj.print();
    }
}
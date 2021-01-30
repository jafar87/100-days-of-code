//When a class inherits another class, it is known as a single inheritance.
    class Animal{
        void eat(){System.out.println("eating...");}
    }
    class Dog extends Animal{
        void bark(){System.out.println("barking...");}
    }
    class TestInheritance{
        public static void main(String args[]){
            Dog d=new Dog();
            d.bark();
            d.eat();
        }}

////        Multilevel Inheritance
//        When there is a chain of inheritance, it is known as multilevel inheritance
//class Animal{
//    void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//    void bark(){System.out.println("barking...");}
//}
//class BabyDog extends Dog{
//    void weep(){System.out.println("weeping...");}
//}
//class TestInheritance2{
//    public static void main(String args[]){
//        BabyDog d=new BabyDog();
//        d.weep();
//        d.bark();
//        d.eat();

//        Hierarchical Inheritance;-
//        When two or more classes inherits a single class, it is known as hierarchical inheritance.

//class Animal{
//    void eat(){System.out.println("eating...");}
//}
//class Dog extends Animal{
//    void bark(){System.out.println("barking...");}
//}
//class Cat extends Animal{
//    void meow(){System.out.println("meowing...");}
//}
//class TestInheritance3{
//    public static void main(String args[]){
//        Cat c=new Cat();
//        c.meow();
//        c.eat();
////c.bark();//C.T.Error
//    }}
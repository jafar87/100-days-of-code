package Encapsulation;

public class Student {

    //    Encapsulation in Java is a process of wrapping code and data together into a single unit, for example, a capsule which is mixed of several medicines.

//  We can create a fully encapsulated class in Java by making all the data members of the class private. Now we can use setter and getter methods to set and get the data in it.

    /*Advantage of Encapsulation in Java
    By providing only a setter or getter method, you can make the class read-only or write-only. In other words, you can skip the getter or setter methods.

    It provides you the control over the data. Suppose you want to set the value of id which should be greater than 100 only, you can write the logic inside the setter method. You can write the logic not to store the negative numbers in the setter methods.

    It is a way to achieve data hiding in Java because other class will not be able to access the data through the private data members.

    The encapsulate class is easy to test. So, it is better for unit testing.

    The standard IDE's are providing the facility to generate the getters and setters. So, it is easy and fast to create an encapsulated class in Java.*/

        //private data member
        private String name;
        //getter method for name
        public String getName(){
            return name;
        }
        //setter method for name
        public void setName(String name){
            this.name=name;
        }

/*
//    Read-Only class
    public class Student1{
        //private data member
        private String college="AKG";
        //getter method for college
        public String getCollege(){
            return college;
        }
    }
    //s.setCollege("KITE");
*/
    /*Write-Only class
    //A Java class which has only setter methods.
    public class Student2{
        //private data member
        private String college;
        //getter method for college
        public void setCollege(String college){
            this.college=college;
        }
    }

    System.out.println(s.getCollege());//Compile Time Error, because there is no such method
System.out.println(s.college);//Compile Time Error, because the college data member is private.
//So, it can't be accessed from outside the class*/

}

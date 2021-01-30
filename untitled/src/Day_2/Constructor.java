package Day_2;
//A constructor in Java is a special method that is used to initialize objects. The constructor is called when an object of a class is created.

//    Note that the constructor name must match the class name, and it cannot have a return type (like void).
//
//    Also note that the constructor is called when the object is created.
//
//    All classes have constructors by default: if you do not create a class constructor yourself, Java creates one for you. However, then you are not able to set initial values for object attributes.
public class Constructor {
    int modelYear;
    String modelName;

    public Constructor(int year, String name) {
        modelYear = year;
        modelName = name;
    }

    public static void main(String[] args) {
        Constructor myCar = new Constructor(1969, "Mustang");
        System.out.println(myCar.modelYear + " " + myCar.modelName);
    }
}



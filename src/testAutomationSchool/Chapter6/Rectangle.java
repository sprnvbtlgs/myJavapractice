package testAutomationSchool.Chapter6;

public class Rectangle {
    private double lenght;
    private double width;

    /*
    If the first word is "private" - no class can directly access the length field, nor can they directly access
    "protected" - other classes within this same package can access it. It's similar to having no access modifier at all.
     */

    /*
    *Encapsulation is one of the key principles of object-oriented programming.
    *It specifies that the data (fields) of a class should be private and
    *the methods (behaviour) of the class can be exposed (public) to other classes to use.
     */

    /*
    * This is constructor - another way to set values for rectangle. It isn't method and
    * these structure hasn't return type.
    * The constructor's name must be the exact same name as the class.
    * In this constructor we're setting default values.
    * Constructors are used to initialize an object, or set up its state in some way. So if user passed anything -
    * we use default value.
     */
    public Rectangle(){
        lenght = 0;
        width = 0;
    }

    /*
    * Constructor below - If user want to set values of length and width and know it.
     */

    public Rectangle(double lenght, double width) {
        setLength(lenght);
        setWidth(width); //can be set this way
        //this.length = length - or can be set this way because we use local scope variables
    }

    /*
    * getter or setter - one way of set the value for rectangle!!!
    * getter method - вычитать длину
    * setter method - установить длину
     */

    public double getLength(){
        return lenght;
    }

    public void setLength(double lenght) {
        this.lenght = lenght; // take the value of our local variable length and assign it to our global one.
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width; //take the value of our local variable width and assign it to our global one.
    }

    public double calculatePerimeter(){
        return (2 * lenght) + (2 * width);
    }

    public double calculateArea(){
        return lenght * width;
    }
}

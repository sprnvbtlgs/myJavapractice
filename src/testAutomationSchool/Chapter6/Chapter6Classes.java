package testAutomationSchool.Chapter6;

public class Chapter6Classes {
    private double lenght;
    private double width;

    public Chapter6Classes(){
        lenght = 0;
        width = 0;
    }

    public Chapter6Classes(double lenght, double width) {
        setLength(lenght);
        setWidth(width); //can be set this way
        //this.length = length - or can be set this way -- these are only
    }

    public double getLength(){
        return lenght;
    }

    public void setLength(double lenght) {
        this.lenght = lenght;
    }

    public double getWidth(){
        return width;
    }

    public void setWidth(double width){
        this.width = width;
    }

    public double calculatePerimeter(){
        return (2 * lenght) + (2 * width);
    }

    public double calculateArea(){
        return lenght * width;
    }
}

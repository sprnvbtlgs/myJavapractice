package testAutomationSchool.Chapter9Inheritance;

public class Person {

    private String name;
    private int age;
    private String gender;



    public Person(String name){
        System.out.println("In person 2nd constructor. Name is set");
    }

    /*
    * You need to select all of the called values and click right button 'generate - getter and setter'
     */

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

}

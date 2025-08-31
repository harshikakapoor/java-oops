package classBasics;

// Rewrite with setters and getters later on
public class Student {

    // declare these var private for -> encapsulation
    private String name;
    private int age;
    private int marks;

    // constructor to initialise the object -> create a student and set all of its values in a single code
    public Student(String name, int age, int marks){
        this.name = name;
        this.age = age;
        this.marks = marks;
    }
    // constructor overloading, marks will be 0 by default
    public Student(String name, int age){
        this.name = name;
        this.age = age;
    }

    // getters -> to retrieve name, age, marks of student
    // return because that's the data its giving back
    public String getName(){
        return name;
    }
    // its job is to set value, so there's a parameter
    public void setName(String name){
        this.name = name; // to assign value from param to private class variable
    }

    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public int getMarks(){
        return marks;
    }
    public void setMarks(int marks){
        this.marks = marks;
    }

    public static void main(String[] args){
        Student student1 = new Student("Alice",20,95);
        Student student2 = new Student("Bob",19); // by default 0 marks for bob
        System.out.println(student1.getAge());
        student1.setAge(21); // update the age from 20 to 21
        System.out.println(student1.getAge());


    }
}

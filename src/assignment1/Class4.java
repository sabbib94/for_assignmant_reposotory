package assignment1;

import Assignment2.JavaPackage1;

public class Class4 extends JavaPackage1{
//   constructor overriding
     public void JavaPackage1(){
        System.out.println("Java package one constructor overriding in subClass.");
    }
    public Class4(int x){
        System.out.println("Constructor for int value.");
    }
    public Class4(String name){
        System.out.println("Constructor for string value.");
    }

    public Class4(int x,String name){
        System.out.println("Constructor for int and string value.");
    }
    public static void main(String[] args) {
//        passing int value
        Class4 object1=new Class4(5);
        object1.method(10);
//        passing string value
        Class4 object2=new Class4("sabbib");
        object2.method("Sabbib");
//        passing int and string value
        Class4 object3=new Class4(1,"sabbib");
        object3.method(110,"Sabbib");
    }
//    method overloading but different parameter
    public  void method(int x){
        System.out.println(x+ " is a int value.");
    }

    public  void method(String name){
        System.out.println("My name is "+name);
    }

    public  void method(int x,String name){
        System.out.println("My name is "+name+" and "+x+ " is a int value.");
    }

    @Override
    public void javaPackMethod() {
        System.out.println("Method overriding in sub class.");
    }
}

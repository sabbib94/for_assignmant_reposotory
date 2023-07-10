package assignment5.oops.single;

import assignment5.oops.single.Animal;

public class Cat extends Animal {
    String vocal;
    String tail;

    public void work(){
        System.out.println(name+" enable to work.");
    }

    public void attribute(){
        System.out.println(name+" have "+eyes+" eyes,"+legs+" legs"+" and color is "+color+".");
    }

}

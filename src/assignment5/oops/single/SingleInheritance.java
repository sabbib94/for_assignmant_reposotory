package assignment5.oops.single;

import assignment5.oops.single.Cat;

public class SingleInheritance {
    public static void main(String[] args) {
        Cat cat=new Cat();
        cat.name="Cat";
        cat.eyes=2;
        cat.legs=4;
        cat.color="black";
        cat.tail="it's have long tail";
        cat.vocal="mew";
        cat.attribute();
        cat.work();
        cat.eat();
        cat.sleep();
    }
}

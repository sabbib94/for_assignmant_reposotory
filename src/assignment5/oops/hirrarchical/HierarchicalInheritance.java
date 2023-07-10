package assignment5.oops.hirrarchical;

public class HierarchicalInheritance {
    public static void main(String[] args) {

        MaleChild child=new MaleChild();
        child.age=10;
        child.color="black";
        child.name="MaleChild";
        System.out.println("MaleChild age upto "+child.age+"years.");
        child.walk();
        child.speak();

        FemaleChild femaleChild=new FemaleChild();
        femaleChild.age=8;
        femaleChild.color="white";
        femaleChild.name="Female child";
        System.out.println("female child upto "+femaleChild.age+" years"+" and "+femaleChild.color+" color.");
        femaleChild.walk();
        femaleChild.speak();

        Male male=new Male();
        male.name="Male";
        male.job();
        male.business();
    }
}

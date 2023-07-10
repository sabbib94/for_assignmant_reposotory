package assignment5.oops.multilevel;

public class MultilevelInheritance {
    public static void main(String[] args) {
        Tester tester=new Tester();
        tester.testerName="Sabbib";
        tester.empPosition="Software tester";
        tester.setEmpSalary(30000);
        tester.writeTestCase();
        tester.doTest();
        System.out.println("Software tester salary is "+tester.getEmpSalary());


        Developer developer=new Developer();
        developer.devName="Sabbib";
        developer.empPosition="Software developer";
        developer.setEmpSalary(30000);
        developer.writeCode();
        System.out.println("Software developer salary is "+tester.getEmpSalary());

    }
}

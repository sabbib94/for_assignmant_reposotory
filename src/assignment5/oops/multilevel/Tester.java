package assignment5.oops.multilevel;

import assignment5.oops.multilevel.Developer;

public class Tester extends Developer {
    String testerName;

    public void writeTestCase(){
        System.out.println(empPosition+" write test case.");
    }

    public void doTest(){
        System.out.println(empPosition+" do test.");
    }
}

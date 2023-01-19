import States.GumBallMachine;

public class Main {
    public static void main(String[] args) {
        GumBallMachine gumballMachine = new GumBallMachine(5);

//        System.out.println(gumballMachine);
//        System.out.println("-------------------");
//
//        System.out.println();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println();
//        System.out.println(gumballMachine);
//        System.out.println("-------------------");
//
//        System.out.println();
//        gumballMachine.insertQuarter();
//        gumballMachine.ejectQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println();
//        System.out.println(gumballMachine);
//        System.out.println("-------------------");
//
//        System.out.println();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.ejectQuarter();
//
//        System.out.println();
//        System.out.println(gumballMachine);
//        System.out.println("-------------------");
//
//        System.out.println();
//        gumballMachine.insertQuarter();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//        gumballMachine.insertQuarter();
//        gumballMachine.turnCrank();
//
//        System.out.println();
//        System.out.println(gumballMachine);
//        System.out.println("-------------------");
        System.out.println(gumballMachine);
        System.out.println("----------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println();
        System.out.println(gumballMachine);
        System.out.println("----------------------");
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        gumballMachine.insertQuarter();
        gumballMachine.turnCrank();
        System.out.println();
        System.out.println(gumballMachine);

    }
}
package States;

import java.util.Random;

public class HasQuarterState implements State{
    Random castigator = new Random(System.currentTimeMillis());

    private GumBallMachine gumBallMachine;

    public HasQuarterState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Nu poti insera alta fisa");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Fisa returnata");
        gumBallMachine.setState(gumBallMachine.getNoQuarterState());
    }

    @Override
    public void turnCrank() {
        System.out.println("Se proceseaza...");
        int winner = castigator.nextInt(10);
        if ((winner == 0) && (gumBallMachine.getCount() > 1)) {
            gumBallMachine.setState(gumBallMachine.getWinnerState());
        } else {
            gumBallMachine.setState(gumBallMachine.getSoldState());
        }
    }

    @Override
    public void dispense() {
        System.out.println("Nu a picat guma");
    }
}

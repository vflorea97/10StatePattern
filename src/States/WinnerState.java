package States;

public class WinnerState implements State{

    private GumBallMachine gumBallMachine;

    public WinnerState(GumBallMachine gumBallMachine) {
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Asteapta, deja iti dam o guma");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Scuze, ai intors deja manivela");
    }

    @Override
    public void turnCrank() {
        System.out.println("Daca introduci de doua ori, nu iti da inca o guma");
    }

    public void dispense() {
        System.out.println("Ai castigat inca o guma!!!");
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() == 0) {
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }else {
            gumBallMachine.releaseBall();
            if (gumBallMachine.getCount() > 0) {
                gumBallMachine.setState(gumBallMachine.getNoQuarterState());
            }else {
                System.out.println("Ups, masina nu mai are gume");
                gumBallMachine.setState(gumBallMachine.getSoldOutState());
            }
        }
    }
}

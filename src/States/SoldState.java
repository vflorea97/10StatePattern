package States;

public class SoldState implements State{

    private GumBallMachine gumBallMachine;

    public SoldState(GumBallMachine gumBallMachine) {
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

    @Override
    public void dispense() {
        gumBallMachine.releaseBall();
        if (gumBallMachine.getCount() > 0) {
            gumBallMachine.setState(gumBallMachine.getNoQuarterState());
        } else {
            System.out.println("Ups, masina nu mai are gume");
            gumBallMachine.setState(gumBallMachine.getSoldOutState());
        }
    }
}

package States;

public class NoQuarterState implements State{

    private GumBallMachine gumBallMachine;

    public NoQuarterState(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }
    @Override
    public void insertQuarter() {
        System.out.println("Ai indrodus o fisa");
        gumBallMachine.setState(gumBallMachine.getHasQuarterState());
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Nu ai introdus nici o fisa");
    }

    @Override
    public void turnCrank() {
        System.out.println("Ai intros manivela, dar nu este nici o fisa");
    }

    @Override
    public void dispense() {
        System.out.println("Trebuie sa platesti prima data");
    }
}

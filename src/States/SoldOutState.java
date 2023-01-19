package States;

public class SoldOutState implements State{

    private GumBallMachine gumBallMachine;

    public SoldOutState(GumBallMachine gumBallMachine){
        this.gumBallMachine = gumBallMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("Nu poti introduce o fisa, masina nu mai are guma");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Nu poti scoate fisa,deoarece nu ai introdus-o");
    }

    @Override
    public void turnCrank() {
        System.out.println("Ai intors manivela, dar aparatul nu mai are gume");
    }

    @Override
    public void dispense() {
        System.out.println("Nu a picat guma");
    }
}

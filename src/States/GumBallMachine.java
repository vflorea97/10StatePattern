package States;

public class GumBallMachine {
//    final static int SOLD_OUT = 0;
//    final static int NO_QUARTER = 1;
//    final static int HAS_QUARTER = 2;
//    final static int SOLD = 3;
//    int state = SOLD_OUT;
//    int count = 0;

//    public GumBallMachine(int count) {
//        this.count = count;
//        if (count > 0) {
//            state = NO_QUARTER;
//        }
//    }
//
//    public void insertQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("Nu poti insera alta fisa");
//        } else if (state == NO_QUARTER) {
//            state = HAS_QUARTER;
//            System.out.println("Ai indrodus o fisa");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Nu poti introduce o fisa, masina nu mai are guma");
//        } else if (state == SOLD) {
//            System.out.println("Asteapta, deja iti dam o guma");
//        }
//    }
//
//    public void ejectQuarter() {
//        if (state == HAS_QUARTER) {
//            System.out.println("Fisa returnata");
//            state = NO_QUARTER;
//        } else if (state == NO_QUARTER) {
//            System.out.println("Nu ai introdus nici o fisa");
//        } else if (state == SOLD) {
//            System.out.println("Scuze, ai intors deja manivela");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Nu poti scoate fisa,deoarece nu ai introdus-o");
//        }
//    }
//
//    public void turnCrank() {
//        if (state == SOLD) {
//            System.out.println("Daca introduci de doua ori, nu iti da inca o guma");
//        } else if (state == NO_QUARTER) {
//            System.out.println("Ai intros manivela, dar nu este nici o fisa");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Ai intors manivela,dar aparatul nu mai are gume");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("Se proceseaza...");
//            state = SOLD;
//            dispense();
//        }
//    }
//
//    public void dispense() {
//        if (state == SOLD) {
//            System.out.println("O guma se rostogoleste afara din aparat");
//            count = count - 1;
//            if (count == 0) {
//                System.out.println("Ups, masina nu mai are gume");
//                state = SOLD_OUT;
//            } else {
//                state = NO_QUARTER;
//            }
//        } else if (state == NO_QUARTER) {
//            System.out.println("Trebuie sa platesti prima data");
//        } else if (state == SOLD_OUT) {
//            System.out.println("Nu a picat guma");
//        } else if (state == HAS_QUARTER) {
//            System.out.println("Nu a picat guma");
//        }
//    }
    private State soldOutState;
    private State noQuarterState;
    private State hasQuarterState;
    private State soldState;
    private State winnerState;

    private State state = soldOutState;
    int count = 0;

    @Override
    public String toString(){
        String text = "Mighty Gumball, Inc.\nStoc: " + count + " gume\nAparatul este pregatit sa introduci fisa";
        return text;
    }

    public GumBallMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);
        this.count = numberGumballs;
        if (numberGumballs > 0) {
            state = noQuarterState;
        }
    }
    public void insertQuarter() {
        state.insertQuarter();
    }
    public void ejectQuarter() {
        state.ejectQuarter();
    }
    public void turnCrank() {
        state.turnCrank();
        state.dispense();
    }

    void releaseBall() {
        System.out.println("O guma pica din aparat...");
        if (count != 0) {
            count = count - 1;
        }
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public int getCount() {
        return count;
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getWinnerState() {
        return winnerState;
    }

}

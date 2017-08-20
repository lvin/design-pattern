package demo;

/**
 * @autor wensen on 2017/8/20.
 */
public class ConcreteMediator implements Mediator {

    /**
     * 持有并维护同事A
     */
    private ConcreteColleagueA concreteColleagueA;

    /**
     * 持有并维护同事B
     */
    private ConcreteColleagueB concreteColleagueB;

    public ConcreteColleagueA getConcreteColleagueA() {
        return concreteColleagueA;
    }

    public void setConcreteColleagueA(ConcreteColleagueA concreteColleagueA) {
        this.concreteColleagueA = concreteColleagueA;
    }

    public ConcreteColleagueB getConcreteColleagueB() {
        return concreteColleagueB;
    }

    public void setConcreteColleagueB(ConcreteColleagueB concreteColleagueB) {
        this.concreteColleagueB = concreteColleagueB;
    }

    public void changed(Colleague colleague) {
        //某个同事类发生了变化，通常需要与其他同事变化
        //具体协调相应的同事对象来实现协作行为j
    }
}

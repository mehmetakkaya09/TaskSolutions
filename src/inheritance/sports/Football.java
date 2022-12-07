package inheritance.sports;

public class Football extends Sports{

    private boolean isCL;


    public Football(String name, int numberOfPlayers, int numberOfReferee, String rules, String playerName,boolean isCL) {
        super(name, numberOfPlayers, numberOfReferee, rules, playerName);
        setCL(isCL);
    }

    public boolean isCL() {
        return isCL;
    }

    public void setCL(boolean CL) {
        isCL = CL;
    }
    public String toString() {
        return "Sports{" +
                "name='" + getName() + '\'' +
                ", numberOfPlayers=" + getNumberOfPlayers() +
                ", numberOfReferee=" + getNumberOfReferee() +
                ", rules='" + getRules() + '\'' +
                ", isCL='" + isCL() + '\'' +
                '}';
    }
}

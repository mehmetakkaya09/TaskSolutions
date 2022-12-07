package inheritance.sports;

public class Basketball extends Sports{
    private boolean isNBA;


    public Basketball(String name, int numberOfPlayers, int numberOfReferee, String rules, String playerName,boolean isNBA) {
        super(name, numberOfPlayers, numberOfReferee, rules, playerName);
        setNBA(isNBA);
    }

    public boolean isNBA() {
        return isNBA;
    }

    public void setNBA(boolean NBA) {
        isNBA = NBA;
    }
    public String toString() {
        return "Sports{" +
                "name='" + getName() + '\'' +
                ", numberOfPlayers=" + getNumberOfPlayers() +
                ", numberOfReferee=" + getNumberOfReferee() +
                ", rules='" + getRules() + '\'' +
                ", isNBA='" + isNBA() + '\'' +
                '}';
    }
}

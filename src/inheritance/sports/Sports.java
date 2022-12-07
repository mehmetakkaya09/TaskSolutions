package inheritance.sports;

public class Sports {
    private String name;
    private String playerName;
    private int numberOfPlayers;
    private int numberOfReferee;
    private String rules;

    public Sports(String name, int numberOfPlayers, int numberOfReferee, String rules, String playerName) {
        setPlayerName(playerName);
        setName(name);
        setNumberOfPlayers(numberOfPlayers);
        setNumberOfReferee(numberOfReferee);
        setRules(rules);
    }

    public String getName() {
        return name;
    }

    public String getPlayerName() {
        return playerName;
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }

    public int getNumberOfReferee() {
        return numberOfReferee;
    }

    public String getRules() {
        return rules;
    }

    public void setName(String name) {
        if (name.equals("")){
            System.out.println("Invalid name");
            return;
        }
        this.name = name;
    }

    public void setPlayerName(String playerName) {
        if (playerName.equals("")){
            System.out.println("Invalid name");
            return;
        }
        this.playerName = playerName;
    }

    public void setNumberOfPlayers(int numberOfPlayers) {
        if (numberOfPlayers <= 0){
            System.out.println("Invalid number");
            return;
        }
        this.numberOfPlayers = numberOfPlayers;
    }

    public void setNumberOfReferee(int numberOfReferee) {
        if (numberOfReferee <= 0){
            System.out.println("Invalid number");
            return;
        }
        this.numberOfReferee = numberOfReferee;
    }

    public void setRules(String rules) {
        if (rules.equals("")){
            System.out.println("Invalid rules");
            return;
        }
        this.rules = rules;
    }
    public void play(){
        System.out.println(name + " is played with " + numberOfPlayers + " players!");
    }
    public String toString() {
        return "Sports{" +
                "name='" + name + '\'' +
                ", numberOfPlayers=" + numberOfPlayers +
                ", numberOfReferee=" + numberOfReferee +
                ", rules='" + rules + '\'' +
                '}';
    }
}

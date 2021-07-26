package Domain;

public class Artifact {
    private String setName;
    private String name;
    private String piece;
    private MainStat mainStat;
    private SubStats subStats;
    private int currentLevel;

    public Artifact(String setName, String name, String piece, MainStat mainStat, SubStats subStats, int currentLevel) {
        this.setName = setName;
        this.name = name;
        this.piece = piece;
        this.mainStat = new MainStat();
        this.subStats = new SubStats();
        this.currentLevel = 0;
    }
}

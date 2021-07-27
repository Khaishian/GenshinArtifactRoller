package Domain;

public class Artifact {
    private String setName;
    private String name;
    private String piece;
    private MainStat mainStat;
    private SubStats subStats;
    private int currentLevel;

    public Artifact(String setName) {
        this.setName = setName;
        this.mainStat = new MainStat();
        this.subStats = new SubStats(this.mainStat.getName());
        this.piece = this.mainStat.getPiece();
        this.currentLevel = 0;
        switch (this.setName){
            case "Crimson Witch of Flames":
                switch (this.piece){
                    case "Flower of Life":
                        this.name = "Witch's Flower of Blaze";
                        break;
                    case "Plume of Death":
                        this.name = "Witch's Ever-Burning Plume";
                        break;
                    case "Sands of Eon":
                        this.name = "Witch's End Time";
                        break;
                    case "Goblet of Eonothem":
                        this.name = "Witch's Heart Flames";
                        break;
                    case "Circlet of Logos":
                        this.name = "Witch's Scorching Hat";
                        break;
                    default:
                }
                break;
            default:
        }
    }

    public boolean upgrade(){
        if (this.currentLevel < 20){
            this.mainStat.upgrade();
            this.subStats.upgrade();
            this.currentLevel += 4;
            return true;
        }else{
            return false;
        }
    }

    public String getSetName() {
        return setName;
    }

    public void setSetName(String setName) {
        this.setName = setName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPiece() {
        return piece;
    }

    public void setPiece(String piece) {
        this.piece = piece;
    }
    public MainStat getMainStat() {
        return mainStat;
    }

    public void setMainStat(MainStat mainStat) {
        this.mainStat = mainStat;
    }

    public SubStats getSubStats() {
        return subStats;
    }

    public void setSubStats(SubStats subStats) {
        this.subStats = subStats;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public void setCurrentLevel(int currentLevel) {
        this.currentLevel = currentLevel;
    }

    @Override
    public String toString() {
        return "Artifact{\n" +
                "setName='" + setName + "\'\n" +
                "name='" + name + "\'\n" +
                "piece='" + piece + "\'\n" +
                "mainStat=" + mainStat +
                "subStats=" + subStats +
                "currentLevel=" + currentLevel +
                "\n}";
    }
}

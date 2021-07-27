package Mihoyo;

import java.util.Random;

public class Artifact {
    private String setName;
    private String name;
    private String piece;
    private MainStat mainStat;
    private SubStats subStats;
    private int currentLevel;

    public Artifact(String setName) {
        this.setName = setName;
        this.piece = rollArtifactPieceType();
        this.name = setNameToNameOfArtifact(this.piece, this.setName);
        this.mainStat = new MainStat(this.piece);
        this.subStats = new SubStats(this.mainStat.getName());
        this.currentLevel = 0;

    }

    private String rollArtifactPieceType(){
        switch(new Random().nextInt(5)){
            case 0:
                return "Flower of Life";
            case 1:
                return "Plume of Death";
            case 2:
                return "Sands of Eon";
            case 3:
                return "Goblet of Eonothem";
            default:
                return "Circlet of Logos";
        }
    }

    private String setNameToNameOfArtifact(String piece, String setName){
        switch (piece){
            case "Flower of Life":
                return flowerName(setName);
            case "Plume of Death":
                return plumeName(setName);
            case "Sands of Eon":
                return sandsName(setName);
            case "Goblet of Eonothem":
                return gobletName(setName);
            case "Circlet of Logos":
                return circletName(setName);
            default:
                return null;
        }
    }

    private String flowerName(String setName){
        switch (setName) {
            case "Crimson Witch of Flames":
                return "Witch's Flower of Blaze";
            case "Lavawalker":
                return "Lavawalker's Resolution";
            default:
                return null;
        }
    }

    private String plumeName(String setName){
        switch (setName) {
            case "Crimson Witch of Flames":
                return "Witch's Ever-Burning Plume";
            case "Lavawalker":
                return "Lavawalker's Salvation";
            default:
                return null;
        }
    }

    private String sandsName(String setName){
        switch (setName) {
            case "Crimson Witch of Flames":
                return "Witch's End Time";
            case "Lavawalker":
                return "Lavawalker's Torment";
            default:
                return null;
        }
    }

    private String gobletName(String setName){
        switch (setName) {
            case "Crimson Witch of Flames":
                return "Witch's Heart Flames";
            case "Lavawalker":
                return "Lavawalker's Epiphany";
            default:
                return null;
        }
    }

    private String circletName(String setName){
        switch (setName) {
            case "Crimson Witch of Flames":
                return "Witch's Scorching Hat";
            case "Lavawalker":
                return "Lavawalker's Wisdom";
            default:
                return null;
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

    public String toStringBrief() {
        return "5*****\n" +
                setName + "\n" +
                name + "\n" +
                piece + "\n" +
                mainStat +
                subStats;
    }

    @Override
    public String toString() {
        String isMax = currentLevel==20?" [MAX]":"";
        return "5*****\n" +
                "Level +" + currentLevel + isMax + "\n" +
                setName + "\n" +
                name + "\n" +
                piece + "\n" +
                mainStat +
                subStats;
    }
}

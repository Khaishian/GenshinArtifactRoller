package Domain;

import java.util.Random;

public class SubStat {
    private String name;
    private double value;
    private double tier1;
    private double tier2;
    private double tier3;
    private double tier4;

    public SubStat(){
        this.name = "undefined";
        this.value = 0;
        this.tier1 = 0;
        this.tier2 = 0;
        this.tier3 = 0;
        this.tier4 = 0;
    }

    public SubStat(String mainStat) {
        do {
            this.value = 0;
            switch (new Random().nextInt(10)) {
                case 0:
                    this.name = "HP";
                    this.tier1 = 209;
                    this.tier2 = 239;
                    this.tier3 = 269;
                    this.tier4 = 299;
                    break;
                case 1:
                    this.name = "ATK";
                    this.tier1 = 14;
                    this.tier2 = 16;
                    this.tier3 = 18;
                    this.tier4 = 19;
                    break;
                case 2:
                    this.name = "DEF";
                    this.tier1 = 16;
                    this.tier2 = 19;
                    this.tier3 = 21;
                    this.tier4 = 23;
                    break;
                case 3:
                    this.name = "HP%";
                    this.tier1 = 4.1;
                    this.tier2 = 4.7;
                    this.tier3 = 5.3;
                    this.tier4 = 5.8;
                    break;
                case 4:
                    this.name = "ATK%";
                    this.tier1 = 4.1;
                    this.tier2 = 4.7;
                    this.tier3 = 5.3;
                    this.tier4 = 5.8;
                    break;
                case 5:
                    this.name = "DEF%";
                    this.tier1 = 5.1;
                    this.tier2 = 5.8;
                    this.tier3 = 6.6;
                    this.tier4 = 7.3;
                    break;
                case 6:
                    this.name = "Elemental Mastery";
                    this.tier1 = 16;
                    this.tier2 = 19;
                    this.tier3 = 21;
                    this.tier4 = 23;
                    break;
                case 7:
                    this.name = "CRIT Rate%";
                    this.tier1 = 2.7;
                    this.tier2 = 3.1;
                    this.tier3 = 3.5;
                    this.tier4 = 3.9;
                    break;
                case 8:
                    this.name = "CRIT DMG%";
                    this.tier1 = 5.4;
                    this.tier2 = 6.2;
                    this.tier3 = 7.0;
                    this.tier4 = 7.8;
                    break;
                case 9:
                    this.name = "Energy Recharge%";
                    this.tier1 = 4.5;
                    this.tier2 = 5.2;
                    this.tier3 = 5.8;
                    this.tier4 = 6.5;
                    break;
                default:
            }
            roll();
        }while (this.name.equals(mainStat));
    }
    public void roll(){
        double roll;
        switch (new Random().nextInt(4)){
            case 0:
                roll = this.tier1;
                break;
            case 1:
                roll = this.tier2;
                break;
            case 2:
                roll = this.tier3;
                break;
            default:
                roll = this.tier4;
        }
        this.value += roll;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getTier1() {
        return tier1;
    }

    public void setTier1(double tier1) {
        this.tier1 = tier1;
    }

    public double getTier2() {
        return tier2;
    }

    public void setTier2(double tier2) {
        this.tier2 = tier2;
    }

    public double getTier3() {
        return tier3;
    }

    public void setTier3(double tier3) {
        this.tier3 = tier3;
    }

    public double getTier4() {
        return tier4;
    }

    public void setTier4(double tier4) {
        this.tier4 = tier4;
    }
}

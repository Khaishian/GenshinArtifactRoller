package Mihoyo;

import java.util.Random;

public class MainStat {
    private String name;
    private String piece;
    private double value;
    private double increment;

    public MainStat(String piece) {
        switch(piece){
            case "Flower of Life":
                rollFlower();
                break;
            case "Plume of Death":
                rollPlume();
                break;
            case "Sands of Eon":
                rollSands();
                break;
            case "Goblet of Eonothem":
                rollGoblet();
                break;
            case "Circlet of Logos":
                rollCirclet();
                break;
            default:
        }
    }

    private void rollFlower(){
        this.name = "HP";
        this.value = 717;
        this.increment = 203.15;
    }

    private void rollPlume(){
        this.name = "ATK";
        this.value = 47;
        this.increment = 13.2;
    }

    private void rollSands(){
        double prob = Math.random();
        if (prob < 0.2668){
            this.name = "HP%";
            this.value = 7;
            this.increment = 1.98;
        }else if (prob < 0.5334){
            this.name = "ATK%";
            this.value = 7;
            this.increment = 1.98;
        }else if (prob < 0.8){
            this.name = "DEF%";
            this.value = 8.7;
            this.increment = 2.48;
        }else if (prob < 0.9){
            this.name = "Energy Recharge%";
            this.value = 7.8;
            this.increment = 2.2;
        }else{
            this.name = "Elemental Mastery";
            this.value = 28;
            this.increment = 7.95;
        }
    }

    private void rollGoblet(){
        double prob = Math.random();
        if (prob < 0.2125){
            this.name = "HP%";
            this.value = 7;
            this.increment = 1.98;
        }else if (prob < 0.4250){
            this.name = "ATK%";
            this.value = 7;
            this.increment = 1.98;
        }else if (prob < 0.6250){
            this.name = "DEF%";
            this.value = 8.7;
            this.increment = 2.48;
        }else if (prob < 0.65){
            this.name = "Elemental Mastery";
            this.value = 28;
            this.increment = 7.95;
        }else{
            Random ran = new Random();
            switch (ran.nextInt(7)){
                case 0:
                    this.name = "Pyro DMG Bonus%";
                    break;
                case 1:
                    this.name = "Electro DMG Bonus%";
                    break;
                case 2:
                    this.name = "Cryo DMG Bonus%";
                    break;
                case 3:
                    this.name = "Hydro DMG Bonus%";
                    break;
                case 4:
                    this.name = "Anemo DMG Bonus%";
                    break;
                case 5:
                    this.name = "Geo DMG Bonus%";
                    break;
                case 6:
                    this.name = "Physical DMG Bonus%";
                    break;
                default:
            }
            if(this.name.equals("Physical DMG Bonus%")){
                this.value = 8.7;
                this.increment = 2.48;
            }else{
                this.value = 7;
                this.increment = 1.98;
            }
        }
    }

    private void rollCirclet(){
        double prob = Math.random();
        if (prob < 0.22){
            this.name = "HP%";
            this.value = 7;
            this.increment = 1.98;
        }else if (prob < 0.44){
            this.name = "ATK%";
            this.value = 7;
            this.increment = 1.98;
        }else if (prob < 0.66){
            this.name = "DEF%";
            this.value = 8.7;
            this.increment = 2.48;
        }else if (prob < 0.7){
            this.name = "Elemental Mastery";
            this.value = 28;
            this.increment = 7.95;
        }else if (prob < 0.8){
            this.name = "CRIT Rate%";
            this.value = 4.7;
            this.increment = 1.32;
        }else if (prob < 0.9){
            this.name = "CRIT DMG%";
            this.value = 9.3;
            this.increment = 2.645;
        }else{
            this.name = "Healing Bonus%";
            this.value = 5.4;
            this.increment = 1.525;
        }
    }

    public void upgrade() {
        this.value += this.increment*4;
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

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getIncrement() {
        return increment;
    }

    public void setIncrement(double increment) {
        this.increment = increment;
    }

    @Override
    public String toString() {
        if(name.contains("%")){
            String newName = name.substring(0, name.length()-1);
            return newName + " " + String.format("%.1f", value) + "%\n";
        }else{
            return name + " " + (int)value + "\n";
        }
    }
}

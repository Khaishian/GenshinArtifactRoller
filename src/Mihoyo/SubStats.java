package Mihoyo;

import java.util.Random;

public class SubStats {
    private String mainStat;

    private SubStat subStat1;
    private SubStat subStat2;
    private SubStat subStat3;
    private SubStat subStat4;

    public SubStats(String mainStat) {
        this.mainStat = mainStat;
        initializeSubStat();
    }

    private void initializeSubStat(){
        subStat1 = new SubStat(this.mainStat,"", "", "");
        subStat2 = new SubStat(this.mainStat, subStat1.getName(), "", "");
        subStat3 = new SubStat(this.mainStat, subStat1.getName(), subStat2.getName(), "");
        if (new Random().nextInt(3) == 0){
            subStat4 = new SubStat(this.mainStat, subStat1.getName(), subStat2.getName(), subStat3.getName());
        }else{
            subStat4 = new SubStat();
        }
    }

    public void upgrade(){
        if(subStat4.getName().equals("undefined")) {
            subStat4 = new SubStat(this.mainStat, subStat1.getName(), subStat2.getName(), subStat3.getName());
        }else{
            switch (new Random().nextInt(4)) {
                case 0:
                    subStat1.roll();
                    break;
                case 1:
                    subStat2.roll();
                    break;
                case 2:
                    subStat3.roll();
                    break;
                default:
                    subStat4.roll();
            }
        }
    }

    @Override
    public String toString() {
        String str = "--------------------------\n";
        if(subStat1.getName().contains("%")){
            String newName = subStat1.getName().substring(0, subStat1.getName().length()-1);
            str += newName + " +" + String.format("%.1f", subStat1.getValue()) + "%\n";
        }else{
            str += subStat1.getName() + " +" + (int)subStat1.getValue() + "\n";
        }
        if(subStat2.getName().contains("%")){
            String newName = subStat2.getName().substring(0, subStat2.getName().length()-1);
            str += newName + " +" + String.format("%.1f", subStat2.getValue()) + "%\n";
        }else{
            str += subStat2.getName() + " +" + (int)subStat2.getValue() + "\n";
        }
        if(subStat3.getName().contains("%")){
            String newName = subStat3.getName().substring(0, subStat3.getName().length()-1);
            str += newName + " +" + String.format("%.1f", subStat3.getValue()) + "%\n";
        }else{
            str += subStat3.getName() + " +" + (int)subStat3.getValue() + "\n";
        }
        if(!subStat4.getName().equals("undefined")){
            if (subStat4.getName().contains("%")) {
                String newName = subStat4.getName().substring(0, subStat4.getName().length() - 1);
                str += newName + " +" + String.format("%.1f", subStat4.getValue()) + "%\n";
            } else {
                str += subStat4.getName() + " +" + (int) subStat4.getValue() + "\n";
            }
        }
        return str;
    }
}

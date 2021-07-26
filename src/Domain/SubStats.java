package Domain;

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

    public void initializeSubStat(){
        subStat1 = new SubStat(this.mainStat);
        subStat2 = new SubStat(this.mainStat);
        subStat3 = new SubStat(this.mainStat);
        if (new Random().nextInt(3) == 0){
            subStat4 = new SubStat(this.mainStat);
        }else{
            subStat4 = new SubStat();
        }
    }

    public void upgrade(){
        if(subStat4.getName().equals("undefined")) {
            subStat4 = new SubStat(this.mainStat);
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
}

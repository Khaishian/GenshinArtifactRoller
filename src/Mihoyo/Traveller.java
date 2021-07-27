package Mihoyo;

import java.util.ArrayList;
import java.util.Random;

public class Traveller {
    private ArrayList<Artifact> bag;

    public Traveller() {
        this.bag = new ArrayList<>();
    }

    public ArrayList<Artifact> runDomain(String domain){
        String[] setNames = domainToSetNames(domain);

        ArrayList<Artifact> newArtifacts = new ArrayList<>();
        for(int i=0; i<2; i++){
            newArtifacts.add(new Artifact(setNames[new Random().nextInt(2)]));
        }
        this.bag.addAll(newArtifacts);
        return newArtifacts;
    }

    private String[] domainToSetNames(String domain){
        String[] setNames = new String[2];
        switch (domain){
            case "Hidden Palace of Zhou Formula":
                setNames[0] = "Crimson Witch of Flames";
                setNames[1] = "Lavawalker";
                break;
            default:
        }
        return setNames;
    }

    public void showBag(){
        for(Artifact arti : bag){
            System.out.println(arti.toString());
        }
    }

    public ArrayList<Artifact> getBag() {
        return bag;
    }

    public void setBag(ArrayList<Artifact> bag) {
        this.bag = bag;
    }
}

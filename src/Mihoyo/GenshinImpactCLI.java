package Mihoyo;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class GenshinImpactCLI {
    public static void main(String[] args) throws InterruptedException {
        startGame();
    }

    public static void startGame() throws InterruptedException{
        System.out.println("Loading game");
        Traveller traveller = new Traveller();
        for (int i=0; i<3; i++){
            System.out.println(".");
//            TimeUnit.SECONDS.sleep(1);
        }
        System.out.println("Welcome traveller!");
        Scanner sc = new Scanner(System.in);
        int input;
        game: while(true) {
            System.out.println("What do you wanna do? [1: Run domain | 2: Check Bag | 3: Logout ]");
            input = sc.nextInt();
            switch (input){
                case 1:
                    runDomain(traveller);
                    break;
                case 2:
                    checkBag(traveller);
                    break;
                case 3:
                    System.out.println("See you again, traveller!");
                    break game;
                default:
                    System.out.println("Input error, kindly retry.\n");
            }
        }
    }

    public static void runDomain(Traveller traveller) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        int input;
        domain: while(true) {
            System.out.println("Which domain do you wanna run?");
            System.out.println("1: Hidden Palace of Zhou Formula");
            input = sc.nextInt();
            switch (input) {
                case 1:
                    System.out.println("Running domain");
                    ArrayList<Artifact> newArtifacts = traveller.runDomain("Hidden Palace of Zhou Formula");
                    for (int i = 0; i < 3; i++) {
                        System.out.println(".");
//                        TimeUnit.SECONDS.sleep(1);
                    }
                    System.out.println("Congratulations! You got: \n");
                    for (int i = 0; i < newArtifacts.size(); i++) {
                        System.out.println((i + 1) + ": 5***** " + newArtifacts.get(i).getName());
                    }
                    System.out.println();
                    break domain;
                default:
                    System.out.println("Input error, kindly retry.\n");
            }
        }
    }

    public static void checkBag(Traveller traveller){
        if (traveller.getBag().isEmpty()){
            System.out.println("There's nothing in the bag.");
            return;
        }
        bag: while (true) {
            ArrayList<Artifact> artifacts = traveller.getBag();
            System.out.println("Artifacts in bag: \n");
            for (int i = 0; i < artifacts.size(); i++) {
                System.out.println((i + 1) + ": " + artifacts.get(i).toString() + "\n");
            }
            Scanner sc = new Scanner(System.in);
            int index;
            select: while (true) {
                System.out.println("Which artifact do you wanna checkout? [0: Back to menu | Enter the index]");
                index = sc.nextInt();
                if(index == 0) {
                    break bag;
                }else if (index > artifacts.size() || index < 1) {
                    System.out.println("Artifact not found, kindly retry.");
                } else {
                    Artifact arti = artifacts.get(index-1);
                    System.out.println("Currently selected artifact: \n");
                    System.out.println(arti.toString());
                    while (true) {
                        System.out.println("What do you wanna do with this artifact? [1: Level up | 2: Go back to bag ]");
                        int input = sc.nextInt();
                        switch (input) {
                            case 1:
                                if(arti.upgrade()){
                                    traveller.getBag().set(index-1, arti);
                                    System.out.println("Levelled up successfully.\n");
                                    Artifact levelledUpArti = traveller.getBag().get(index-1);
                                    System.out.println(levelledUpArti.toString());
                                }else{
                                    System.out.println("Cannot Level up current artifact, its level is maxed out. \n");
                                }
                                break;
                            case 2:
                                break select;
                            default:
                                System.out.println("Input error, kindly retry.\n");
                        }
                    }
                }
            }
        }
    }

    public static boolean upgradeArtifact(Artifact arti){
        return arti.upgrade();
    }

}

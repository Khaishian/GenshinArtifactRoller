package Domain;

public class Main {
    public static void main(String[] args) {
        Artifact arti = new Artifact("Crimson Witch of Flames");
        System.out.println(arti.toString());

        arti.upgrade();
//        System.out.println(arti.toString());
        arti.upgrade();
//        System.out.println(arti.toString());
        arti.upgrade();
//        System.out.println(arti.toString());
        arti.upgrade();
//        System.out.println(arti.toString());
        arti.upgrade();
        System.out.println(arti.toString());

    }
}

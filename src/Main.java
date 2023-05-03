import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
String s = sc.nextLine();
Oblast oblast = Oblast.valueOf(s.valueOf(s.toUpperCase()));
switch (oblast){
    case OSH -> Oblast.OSH.medhod();
    case BATKEN -> Oblast.BATKEN.medhod();
    case DJALAL_ABAD -> Oblast.DJALAL_ABAD.medhod();
    case NARYN -> Oblast.NARYN.medhod();
    case TALAS -> Oblast.TALAS.medhod();
    case CHUI -> Oblast.CHUI.medhod();
    case YSSYK_KOL -> Oblast.YSSYK_KOL.medhod();
}
    }

}
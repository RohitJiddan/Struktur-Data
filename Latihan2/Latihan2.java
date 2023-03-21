package StrukData.Latihan2;

import java.util.ArrayList;

public class Latihan2 {
    public static void main(String[] args) {
        ArrayList<String> Hewan = new ArrayList<>();
        ArrayList<String> DeleteHewan = new ArrayList<>();

        Hewan.add("Sapi");
        Hewan.add("Kelinci");
        Hewan.add("Kambing");
        Hewan.add("Unta");
        Hewan.add("Domba");
        System.out.println("Before\t: " + Hewan);

        DeleteHewan.addAll(Hewan);
        DeleteHewan.remove("Kelinci");
        DeleteHewan.remove("Kambing");
        DeleteHewan.remove("Unta");
        System.out.println("After\t: " + DeleteHewan);

    }
}

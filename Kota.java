package Prolan.StrukDat;

public class Kota <E> {
    private E element;
    public Kota (E kota){
        element = kota;

    }
    public E getElemen(){

        return element;
    }

    public static void main(String[] args) {
        Kota<Integer> jumlahkota = new Kota<Integer>(9);
        Kota<String> namakota = new Kota<String>("Malang");
        System.out.println("Jumlah kota di jawa timur :"+ jumlahkota.getElemen()+" kota");
        System.out.println("Salah Satu Kota di Jawa Timur : Kota "+ namakota.getElemen());
    }

}

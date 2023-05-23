package StrukData.Modul5;

public class Main {
    public static void main(String[] args) {
        BinaryTree pohon = new BinaryTree();
        pohon.NewNode(20);
        pohon.NewNode(2);
        pohon.NewNode(25);
        pohon.NewNode(37);
        pohon.NewNode(16);

        System.out.println("\n in order : ");
        pohon.inOrder(pohon.root);
        System.out.println("\n post order : ");
        pohon.PreOrder(pohon.root);
        System.out.println("\n pre order : ");
        pohon.PostOrder(pohon.root);
    }



}

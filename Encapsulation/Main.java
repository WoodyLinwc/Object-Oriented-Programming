package Encapsulation;

public class Main {
    public static void main(String[] args) {

        Tree myTree = new Tree(90,30, TreeType.MAPLE);

        // no longer working because only restricted to Tree Class, private
        // System.out.println(myTree.treeType);
        // System.out.println(myTree.height);
        // System.out.println(myTree.trunkDiameter);

        System.out.println(myTree.getTreeType());
        System.out.println(myTree.getHeight());
        System.out.println(myTree.getTrunkDiameter());

        // myTree.height = 180;
        myTree.setHeight(180);
        myTree.grow();


    }
}

package ClassesAndObject;

import java.awt.Color;

public class Main {
    public static void main(String[] args) {
        Tree myTree = new Tree(120, 12, TreeType.OAK);
        Tree yourTree = new Tree(90, 30, TreeType.MAPLE);

        Color myTrunkColor = Tree.TRUNK_COLOR;
        Color myDefaultBlue = Color.BLUE;

        Color darkerBlue = myDefaultBlue.darker();

        
        yourTree.announceTallTree();
        myTree.announceTallTree();
        // Reuseable code
        // if (myTree.height > 100) {
        //     System.out.println("That's a tall "+ myTree.treeType +" tree!");
        // }

        Tree.annouceTree();

        System.out.println(myTrunkColor);
        System.out.println(myDefaultBlue);
        System.out.println(darkerBlue);
    }
}

package ClassesAndObject;
import java.awt.Color;

public class Tree {
    // non-static attributes, depending on the instance
    double height;
    double trunkDiameter;
    TreeType treeType;

    // static attribute, properties of the class
    static Color TRUNK_COLOR = new Color(102,51,0);

    // constructor
    Tree(double height, double trunkDiameter, TreeType treeType) {
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }

    void grow() {
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }

    void announceTallTree() {
        if (this.height > 100) {
            System.out.println("That's a tall "+ this.treeType +" tree!");
        }
    }

    static void annouceTree() {
        System.out.println("Look out for that " + Tree.TRUNK_COLOR + " tree!");
    }
}
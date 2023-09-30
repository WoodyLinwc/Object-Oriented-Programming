package Encapsulation;
import java.awt.Color;

public class Tree {
    // non-static attributes, depending on the instance
    // access modifier
    private double height;
    private double trunkDiameter;
    private TreeType treeType;

    // static attribute, properties of the class
    protected static Color TRUNK_COLOR = new Color(102,51,0);

    // constructor
    public Tree(double height, double trunkDiameter, TreeType treeType) {
        this.height = height;
        this.trunkDiameter = trunkDiameter;
        this.treeType = treeType;
    }




    // getter methods
    public double getHeight() {
        return height;
    }

    public double getTrunkDiameter() {
        return trunkDiameter;
    }

    public TreeType getTreeType() {
        return treeType;
    }

    // getter methods
    public void setHeight(double height) {
        this.height = height;
    }

    public void setTrunkDiameter(double trunkDiameter) {
        this.trunkDiameter = trunkDiameter;
    }
    






    public void grow() {
        this.height = this.height + 10;
        this.trunkDiameter = this.trunkDiameter + 1;
    }


    public void announceTallTree() {
        if (this.height > 100) {
            System.out.println("That's a tall "+ this.treeType +" tree!");
        }
    }

    static void annouceTree() {
        System.out.println("Look out for that " + Tree.TRUNK_COLOR + " tree!");
    }
}
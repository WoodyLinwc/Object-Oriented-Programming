import java.util.ArrayList;

// <Any type data>
public class ModArrayList<D> extends ArrayList<D>{

    // listy method
    public D getUsingMod(int index) {
        int validIndex = Math.abs(index) % this.size();
        return this.get(validIndex);
    }
}

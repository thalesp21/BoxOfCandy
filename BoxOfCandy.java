public class BoxOfCandy {
    /** box contains at least one row and is initialized in the constructor. */
    private Candy[][] box;

    public BoxOfCandy(Candy[][] grid) {
        box = grid;
    }

    /**
    * Moves one piece of candy in column col, if necessary and possible, so that the box
    * element in row 0 of column col contains a piece of candy, as described in part (a).
    * Returns false if there is no piece of candy in column col and returns true otherwise.
    * Precondition: col is a valid column index in box.
    */
    public boolean moveCandyToFirstRow(int col) {
        if (box[0][col] == null) {
            int toGrab = -1;
            for (int i=0;i<box.length;i++) {
                if (box[i][col] != null) toGrab = i;
            }
            if (toGrab==-1) return false;
            box[0][col] = box[toGrab][col];
            box[toGrab][col] = null;
        }
        return true;
    }

    /**
    * Removes from box and returns a piece of candy with flavor specified by the parameter, or
    * returns null if no such piece is found, as described in part (b)
    */
    public Candy removeNextByFlavor(String flavor) {
        for (int r=box.length-1;r>=0;r--) {
            for (int c=0;c<box[0].length;c++) {
                if (box[r][c]!=null && box[r][c].getFlavor().equals(flavor)) {
                    Candy temp = box[r][c];
                    box[r][c] = null;
                    return temp;
                }
            }
        }
        return null;
    }

    public String toString() {
        String ret = "";
        for (int r=0;r<box.length;r++) {
            ret += "[";
            for (int c=0;c<box[0].length-1;c++) {
                if (box[r][c]==null) ret+="null, ";
                else ret += box[r][c].getFlavor()+", ";
            }
            if (box[r][box[0].length-1]==null) ret+="null]\n";
            else ret += box[r][box[0].length-1].getFlavor()+"]\n";
        }
        return ret;
    }

    // There may be instance variables, constructors, and methods that are not shown.
}
public class Main {
    @SuppressWarnings("removal")
    public static void main(String args[]) {
        /*Candy[][] goodies1 = new Candy[3][4];
        for (int r=0;r<goodies1.length;r++) {
            for (int c=0;c<goodies1[0].length;c++) {
                goodies1[r][c] = new Candy(new Integer(r).toString()+" "+c);
            }
        }
        BoxOfCandy gb1 = new BoxOfCandy(goodies1);
        System.out.print(gb1);
        System.out.println(gb1.moveCandyToFirstRow(0));
        System.out.print(gb1);

        Candy[][] goodies2 = new Candy[3][4];
        for (int r=0;r<goodies2.length;r++) {
            for (int c=0;c<goodies2[0].length;c++) {
                goodies2[r][c] = null;
            }
        }
        BoxOfCandy gb2 = new BoxOfCandy(goodies2);
        System.out.println();
        System.out.print(gb2);
        System.out.println(gb2.moveCandyToFirstRow(0));
        System.out.print(gb2);

        Candy[][] goodies3 = new Candy[3][4];
        for (int c=0;c<goodies3[0].length;c++) {
            goodies3[0][c] = null;
        }
        for (int c=0;c<goodies3[0].length;c++) {
            goodies3[1][c] = null;
        }
        for (int c=0;c<goodies3[0].length;c++) {
            goodies3[2][c] = new Candy(new Integer(2).toString()+" "+c);
        }
        BoxOfCandy gb3 = new BoxOfCandy(goodies3);
        System.out.println();
        System.out.print(gb3);
        System.out.println(gb3.moveCandyToFirstRow(0));
        System.out.print(gb3);*/

        Candy[][] goodies4 = {
            {null, new Candy("lime"), null},
            {null, new Candy("orange"), null},
            {null, null, new Candy("cherry")},
            {null, new Candy("lemon"), new Candy("grape")}};
        BoxOfCandy gb4 = new BoxOfCandy(goodies4);
        System.out.print(gb4);
        System.out.println(gb4.moveCandyToFirstRow(0));
        System.out.print(gb4);
        System.out.println(gb4.moveCandyToFirstRow(1));
        System.out.print(gb4);
        System.out.println(gb4.moveCandyToFirstRow(2));
        System.out.println(gb4);

        Candy[][] goodies5 = {
            {new Candy("lime"), new Candy("lime"), null, new Candy("lemon"), null},
            {new Candy("orange"), null, null, new Candy("lime"), new Candy("lime")},
            {new Candy("cherry"), null, new Candy("lemon"), null, new Candy("orange")}};
        BoxOfCandy gb5 = new BoxOfCandy(goodies5);
        System.out.print(gb5);
        System.out.println(gb5.removeNextByFlavor("cherry").getFlavor());
        System.out.print(gb5);
        System.out.println(gb5.removeNextByFlavor("lime").getFlavor());
        System.out.print(gb5);
        System.out.println(gb5.removeNextByFlavor("grape"));
        System.out.print(gb5);
    }
}
public class Card {


    //attributes
    private int number;
    private int value;
    private String row3;
    private String row4;
    private String row5;
    private String row6;
    private String row7;
    private String row8;
    private String row9;

    //constructors
    public Card(int number, int value) {
        this.number = number;
        this.value = value;
        this.row3 = "";
        this.row4 = "";
        this.row5 = "";
        this.row6 = "";
        this.row7 = "";
        this.row8 = "";
        this.row9 = "";
    }

    //accessors
    public int getNumber() {
        return this.number;
    }
    public int getValue() {
        return this.value;
    }
    public String getRow3() {
        return this.row3;
    }
    public String getRow4() {
        return this.row4;
    }
    public String getRow5() {
        return this.row5;
    }
    public String getRow6() {
        return this.row6;
    }
    public String getRow7() {
        return this.row7;
    }
    public String getRow8() {
        return this.row8;
    }
    public String getRow9() {
        return this.row9;
    }

    //mutators
    public void setNumber(int number) {
        this.number = number;
    }
    public void setValue(int value) {
        this.value = value;
    }
    public void setRow3(String row3) {
        this.row3 = row3;
    }
    public void setRow4(String row4) {
        this.row4 = row4;
    }
    public void setRow5(String row5) {
        this.row5 = row5;
    }
    public void setRow6(String row6) {
        this.row6 = row6;
    }
    public void setRow7(String row7) {
        this.row7 = row7;
    }
    public void setRow8(String row8) {
        this.row8 = row8;
    }
    public void setRow9(String row9) {
        this.row9 = row9;
    }

    public void printCard() {
        System.out.println();
        System.out.println(" XXXXXXXXXXXXXXXX"+" ");     //row 1
        System.out.println(" X              X"+" ");     //row 2
        System.out.println(" X " + this.getRow3() + " X"+" ");   //row 3
        System.out.println(" X " + this.getRow4() + " X"+" ");   //row 4
        System.out.println(" X " + this.getRow5() + " X"+" ");   //row 5
        System.out.println(" X " + this.getRow6() + " X"+" ");   //row 6
        System.out.println(" X " + this.getRow7() + " X"+" ");   //row 7
        System.out.println(" X " + this.getRow8() + " X"+" ");   //row 8
        System.out.println(" X " + this.getRow9() + " X"+" ");   //row 9
        System.out.println(" X              X"+" ");     //row 10
        System.out.println(" XXXXXXXXXXXXXXXX"+" ");     //row 11
        System.out.println();
    }
}

    /*

        xxxxxxxxxxxxxxxx
        x              x
    h   x   99999999   x
    e   x 9999    9999 x
    i   x 9999    9999 x
    g   x   9999999999 x
    e   x         9999 x
    i   x 9999    9999 x
        x   99999999   x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x TTTTTTTTTTTT x
    e   x     TTTT     x
    i   x     TTTT     x
    g   x     TTTT     x
    e   x     TTTT     x
    i   x     TTTT     x
        x     TTTT     x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x     JJJJJJJJ x
    e   x       JJJJ   x
    i   x       JJJJ   x
    g   x       JJJJ   x
    e   x       JJJJ   x
    i   x JJJJ  JJJJ   x
        x    JJJJ      x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x   QQQQQQQQ   x
    e   x QQQQ      QQ x
    i   x QQQQ      QQ x
    g   x QQQQ      QQ x
    e   x QQQQ  QQQ QQ x
    i   x QQQQ   QQQQ  x
        x   QQQQQQQ QQ x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x KK      KKKK x
    e   x KK    KKKK   x
    i   x KK  KKKK     x
    g   x KKKKKK       x
    e   x KK  KKKK     x
    i   x KK    KKKK   x
        x KK      KKKK x
        x              x
        xxxxxxxxxxxxxxxx

        */
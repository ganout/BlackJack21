public class Card {



    //start attributes

    //size
    private int heigthCard;
    private int widthCard;

    //card's number
    private int number;

    //card's value
    private int value;

    //end attributes


    //start constructor
    public Card(int number, int value) {
        this.heigthCard = 11;
        this.widthCard = 16;
        this.number = number;
        this.value = value;
    }
    //end constructor

    //start accessors
    public int getHeigthCard() {
        return this.heigthCard;
    }

    public int getWidthCard() {
        return this.widthCard;
    }

    public int getNumber() {
        return this.number;
    }

    public int getValue() {
        return this.value;
    }
    //end accessors

    //start mutators
    public void setNumber(int number) {
        this.number = number;
    }

    public void setValue(int value) {
        this.value = value;
    }
    //end mutators

    //funtions
    public void printCard(int number) {

        switch (number) {
            case 1:
                System.out.println();
                for (int row = 1;row <= this.heigthCard; row++) {
                    System.out.print(" ");
                    for (int col = 1;col <= this.widthCard; col++) {
                        System.out.print("X");
                    }
                    System.out.print(" ");
                    System.out.println();
                }
                System.out.println(" ");
                break;
            case 2:
                
                break;
            case 3:
                
                break;
            case 4:
                
                break;
            case 5:
                
                break;
            case 6:
                
                break;
            case 7:
                
                break;
            case 8:
                
                break;
            case 9:
                
                break;
            case 10:
                
                break;
            case 11:
                
                break;
            case 12:
                
                break;
            case 13:
                
                break;       
            default:

                break;
        }
    }

}

    /*  
           width = 16
           heigth = 11

        XXXXXXXXXXXXXXXX
        x              x
    h   x     AAAA     x
    e   x   AAAAAAAA   x
    i   x AAAA    AAAA x
    g   x AAAA    AAAA x
    t   x AAAAAAAAAAAA x
    h   x AAAA    AAAA x
        x AAAA    AAAA x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x   22222222   x
    e   x 2222    2222 x
    i   x         2222 x
    g   x     222222   x
    t   x   2222       x
    h   x 2222         x
        x 222222222222 x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x   33333333   x
    e   x 3333    3333 x
    i   x         3333 x
    g   x     333333   x
    t   x         3333 x
    h   x 3333    3333 x
        x   33333333   x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x 4444    4444 x
    e   x 4444    4444 x
    i   x 4444    4444 x
    g   x 4444    4444 x
    t   x   4444444444 x
    h   x        44444 x
        x        44444 x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x 555555555555 x
    e   x 5555         x
    i   x 5555555555   x
    g   x         5555 x
    t   x         5555 x
    h   x 5555    5555 x
        x   55555555   x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x   66666666   x
    e   x 6666    6666 x
    i   x 6666         x
    g   x 6666666666   x
    t   x 6666    6666 x
    h   x 6666    6666 x
        x   66666666   x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x 777777777777 x
    e   x         7777 x
    i   x       7777   x
    g   x     7777     x
    t   x     7777     x
    h   x     7777     x
        x     7777     x
        x              x
        xxxxxxxxxxxxxxxx

        xxxxxxxxxxxxxxxx
        x              x
    h   x   88888888   x
    e   x 8888    8888 x
    i   x 8888    8888 x
    g   x   88888888   x
    e   x 8888    8888 x
    i   x 8888    8888 x
        x   88888888   x
        x              x
        xxxxxxxxxxxxxxxx

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
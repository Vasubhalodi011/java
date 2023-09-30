public class Player {

    public static void main(String[] args) {

        System.out.println("-----All Batsman Name-----");
        System.out.println();
        Batsman bet = new Batsman();
        bet.get();

        System.out.println("-----All Bowler Name-----");
        System.out.println();
        Bowler boll = new Bowler();
        boll.show();

    }

}

class CricketPlayer {

    String a = "Sachin Tandulkar";
    String b = "Ms Dhoni";
    String c = "Virat Kohli";
    String d = "Shikhar Dhawan";
    String e = "Rhohit Sharma";
    String f = "Suryakumar Yadav";
    String x = "Jasprit Bumrah";
    String y = "Mohammed Shami";
    String z = "Shardul Thakur";
    String v = "Ravichandran Ashwin";
    String w = "Mohammed Siraj";

}

class Batsman extends CricketPlayer {

    void get() {

        System.out.println("Batsman = " + b);
        System.out.println("Batsman = " + a);
        System.out.println("Batsman = " + c);
        System.out.println("Batsman = " + d);
        System.out.println("Batsman = " + e);
        System.out.println("Batsman = " + f);

    }

}

class Bowler extends CricketPlayer {

    void show() {

        System.out.println("Bowler = " + x);
        System.out.println("Bowler = " + y);
        System.out.println("Bowler = " + z);
        System.out.println("Bowler = " + v);
        System.out.println("Bowler = " + w);

    }

}
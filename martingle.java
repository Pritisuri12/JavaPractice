
public class martingle {
    public  static void main(String arg[])
    {
        int money = 1000;
        int target = 1200;
        int bet = 10;
        while (money > bet) {
            boolean win = true;
            if (win) {
                money += bet;
                bet = 10;
            } else {
                money -= bet;
                bet *= 2;
            }
            if(money >= target)
            {
                break;
            }
        }
        System.out.println(money);
    }

    }


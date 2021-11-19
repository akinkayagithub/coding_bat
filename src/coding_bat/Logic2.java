package coding_bat;

public class Logic2 {
    //1
    public boolean makeBricks(int small, int big, int goal) {
        if(big * 5 == goal) return true;
        else if(big * 5 > goal) return goal % 5 <= small;
        else return small >= goal - (big * 5);
    }

    //2
    public int loneSum(int a, int b, int c) {
        if(a == b && b == c) return 0;
        else if(a == b) return c;
        else if(a == c) return b;
        else if(b == c) return a;
        return a + b + c;
    }

    //3
    public int luckySum(int a, int b, int c) {
        if(a == 13) return 0;
        else if(b == 13) return a;
        else if(c == 13) return a + b;
        return a + b + c;
    }

    //4
    public int noTeenSum(int a, int b, int c) {
        int sum = 0;
        if(fixTeen(a) != 14) sum += a;
        if(fixTeen(b) != 14) sum += b;
        if(fixTeen(c) != 14) sum += c;
        return sum;
    }

    public int fixTeen(int n){
        if(n >= 13 && n <= 19 && n != 15 && n != 16) n = 14;
        return n;
    }

    //5
    public int roundSum(int a, int b, int c) {
        return round10(a) + round10(b) + round10(c);
    }

    public int round10(int num){
        if(num % 10 >= 5) num = (num / 10) * 10 + 10;
        else num = num - (num % 10);
        return num;
    }

    //6
    public boolean closeFar(int a, int b, int c) {
        return (Math.abs(a - b) <= 1 && Math.abs(a - c) >=2 && Math.abs(b - c) >=2)
                || (Math.abs(a - c) <= 1 && Math.abs(a - b) >=2 && Math.abs(b - c) >=2)
                || (Math.abs(c - b) <= 1 && Math.abs(a - c) >=2 && Math.abs(b -a) >=2);
    }

    //7
    public int blackjack(int a, int b) {
        if( a > 21 && b > 21) return 0;
        else if(a > 21) return b;
        else if(b > 21) return a;
        return Math.max(a, b);
    }

    //8
    public boolean evenlySpaced(int a, int b, int c) {
        if(a == b && b == c) return true;
        else if(a == b || b == c || a == c) return false;

        int smallest = Math.min(a, Math.min(b, c));
        int greatest = Math.max(a, Math.max(b, c));
        int middle;

        if(a == greatest) middle = Math.max(b, c);
        else if(b == greatest) middle = Math.max(a, c);
        else middle = Math.max(a, b);

        return greatest - middle == middle - smallest;
    }

    //9
    public int makeChocolate(int small, int big, int goal) {
        if(big * 5 > goal){
            if(goal % 5 <= small) return goal % 5;
        }
        else if(big * 5 == goal) return 0;
        else{
            goal = goal - (big * 5);
            if(small >= goal) return goal;
        }
        return -1;
    }
}

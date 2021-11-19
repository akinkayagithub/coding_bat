package coding_bat;

public class Logic1 {
    //1
    public boolean cigarParty(int cigars, boolean isWeekend) {
        if (isWeekend && cigars >= 40) return true;
        else return cigars >= 40 && cigars <= 60;
    }

    //2
    public int dateFashion(int you, int date) {
        if ((you > 7 && date > 2) || (date > 7 && you > 2)) return 2;
        else if (date < 3 || you < 3) return 0;
        return 1;
    }

    //3
    public boolean squirrelPlay(int temp, boolean isSummer) {
        if (!isSummer && temp >= 60 && temp <= 90) return true;
        else return isSummer && temp >= 60 && temp <= 100;
    }

    //4
    public int caughtSpeeding(int speed, boolean isBirthday) {
        int plus = 0;
        if (isBirthday) plus = 5;
        if (speed <= 60 + plus) return 0;
        else if (speed <= 80 + plus) return 1;
        else if (speed > 80 + plus) return 2;
        return 0;
    }

    //5
    public int sortaSum(int a, int b) {
        if ((a + b) >= 10 && (a + b) <= 19) return 20;
        return a + b;
    }

    //6
    public String alarmClock(int day, boolean vacation) {
        if (day == 0 || day == 6) {
            if (vacation) return "off";
            return "10:00";
        }

        if (vacation) return "10:00";
        return "7:00";
    }

    //7
    public boolean love6(int a, int b) {
        return a == 6 || b == 6 || Math.abs(a - b) == 6 || a + b == 6;
    }

    //8
    public boolean in1To10(int n, boolean outsideMode) {
        return (!outsideMode && n >= 1 && n <= 10) || (outsideMode && (n <= 1 || n >= 10));
    }

    //9
    public boolean specialEleven(int n) {
        return n % 11 <= 1;
    }

    //10
    public boolean more20(int n) {
        return (n % 20 == 1) || (n % 20 == 2);
    }

    //11
    public boolean old35(int n) {
        return (n % 3 == 0 || n % 5 == 0) && n % 15 != 0;
    }

    //12
    public boolean less20(int n) {
        return n % 20 == 18 || n % 20 == 19;
    }

    //13
    public boolean nearTen(int num) {
        return num % 10 <= 2 || num % 10 >= 8;
    }

    //14
    public int teenSum(int a, int b) {
        if ((a >= 13 && a <= 19) || (b >= 13 && b <= 19)) return 19;
        return a + b;
    }

    //15
    public boolean answerCell(boolean isMorning, boolean isMom, boolean isAsleep) {
        if (isAsleep) return false;
        else {
            if (isMorning) return isMom;
            return true;
        }
    }

    //16
    public int teaParty(int tea, int candy) {
        if (tea < 5 || candy < 5) return 0;
        else if (2 * tea <= candy || candy * 2 <= tea) return 2;
        return 1;
    }

    //17
    public String fizzString(String str) {
        if (str.startsWith("f") && str.endsWith("b")) return "FizzBuzz";
        else if (str.startsWith("f")) return "Fizz";
        else if (str.endsWith("b")) return "Buzz";
        return str;
    }

    //18
    public String fizzString2(int n) {
        if (n % 3 == 0 && n % 5 == 0) return "FizzBuzz!";
        else if (n % 3 == 0) return "Fizz!";
        else if (n % 5 == 0) return "Buzz!";
        return n + "!";
    }

    //19
    public boolean twoAsOne(int a, int b, int c) {
        return a + b == c || b + c == a || a + c == b;
    }

    //20
    public boolean inOrder(int a, int b, int c, boolean bOk) {
        if (bOk) return c > b;
        return b > a && c > b;
    }

    //21
    public boolean inOrderEqual(int a, int b, int c, boolean equalOk) {
        if (equalOk) return a <= b && b <= c;
        return a < b && b < c;
    }

    //22
    public boolean lastDigit(int a, int b, int c) {
        return a % 10 == b % 10 || b % 10 == c % 10 || a % 10 == c % 10;
    }

    //23
    public boolean lessBy10(int a, int b, int c) {
        return Math.abs(a - b) >= 10 || Math.abs(a - c) >= 10 || Math.abs(b - c) >= 10;
    }

    //24
    public int withoutDoubles(int die1, int die2, boolean noDoubles) {
        if (noDoubles && die1 == die2 && die1 == 6) return 7;
        else if (noDoubles && die1 == die2) return 2 * die1 + 1;
        return die1 + die2;
    }

    //25
    public int maxMod5(int a, int b) {
        if (a == b) return 0;
        else if (a % 5 == b % 5) return Math.min(a, b);
        return Math.max(a, b);
    }

    //26
    public int redTicket(int a, int b, int c) {
        if (a == 2 && b == 2 && c == 2) return 10;
        else if (a == b && b == c) return 5;
        else if (a != b && a != c) return 1;
        return 0;
    }

    //27
    public int greenTicket(int a, int b, int c) {
        if (a == b && b == c) return 20;
        else if (a == b || a == c || b == c) return 10;
        return 0;
    }

    //28
    public int blueTicket(int a, int b, int c) {
        if (a + b == 10 || b + c == 10 || a + c == 10) return 10;
        else if (a + b == 10 + b + c || b == 10 + c) return 5;
        return 0;
    }

    //29
    public boolean shareDigit(int a, int b) {
        if (String.valueOf(a).contains(String.valueOf(b % 10)) || String.valueOf(a).contains(String.valueOf(b / 10)))
            return true;
        return false;
    }

    //30
    public int sumLimit(int a, int b) {
        if (String.valueOf(a + b).length() == String.valueOf(a).length()) return a + b;
        return a;
    }
}

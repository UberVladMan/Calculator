import java.util.Scanner;

class Calculator extends Print {
    void Cal() {
        String num;
        String symvol = "0";
        double select = 0;
        double plus = 0;
        double operation;
        boolean or = true;
        int rnumber;
        while (or) {
            Scanner in = new Scanner(System.in);
            num = in.nextLine();
            if (num.equals("1")  || num.equals("2") || num.equals("3")
                    || num.equals("4") || num.equals("5")
                    || num.equals("6") || num.equals("7")
                    || num.equals("8")  || num.equals("9") || num.equals("I")  || num.equals("II") || num.equals("III")
                    || num.equals("IV") || num.equals("V")
                    || num.equals("VI") || num.equals("VII")
                    || num.equals("VIII")  || num.equals("IX")  ) {
                switch (num) {
                    case "I":
                        rnumber = 1;
                        select = rnumber;
                        new Print(rnumber);
                        break;

                    case "II":
                        rnumber = 2;
                        select = rnumber;
                        new Print(rnumber);

                        break;

                    case "III":
                        rnumber = 3;
                        select = rnumber;
                        new Print(rnumber);

                        break;

                    case "IV":
                        rnumber = 4;
                        select = rnumber;
                        new Print(rnumber);

                        break;

                    case "V":
                        rnumber = 5;
                        select = rnumber;
                        new Print(rnumber);

                        break;

                    case "VI":
                        rnumber = 6;
                        select = rnumber;
                        new Print(rnumber);

                        break;

                    case "VII":
                        rnumber = 7;
                        select = rnumber;
                        new Print(rnumber);

                        break;

                    case "VIII":
                        rnumber = 8;
                        select = rnumber;
                        new Print(rnumber);

                        break;

                    case "IX":
                        rnumber = 9;
                        select = rnumber;
                        new Print(rnumber);

                        break;
                    default: {
                        select = Integer.parseInt(num);
                        new Print(num);
                    }
                    break;
                }
            }
            else if (num.equals("+")){
                operation = select + plus;
                select = operation;
                new Print(operation);
                symvol = num;
                plus = operation;
            }
            else if (num.equals("-")){
                operation = -select + plus;
                new Print(Math.abs(operation));
                symvol = num;
                plus = select;

            }
            else if (num.equals("/")){
                double cath;
                operation = plus / select;
                new Print(operation);
                cath = select;
                select = plus;
                plus = cath;
                symvol = num;

            }
            else if (num.equals("*")){
                operation = select * plus;
                new Print(operation);
                symvol = num;
                plus = select;

            }
            else if (num.equals("E")) {
                select = 0;
                plus = 0;
                new Print();

            }
            else if (num.equals("=")){

                switch(symvol){
                    case "+":
                    operation = select + plus;
                    select = operation;
                    new Print(operation);
                break;
                    case "-":
                        double cathh;
                    operation = -select + plus;
                    new Print(operation);
                        cathh = select;
                        select = plus;
                        plus = cathh;
                break;

                    case "/":
                    double cath;
                    operation = plus / select;
                    new Print(operation);
                    cath = select;
                    select = plus;
                    plus = cath;
                    symvol = num;

                break;
                    case "*":
                    operation = select * plus;
                    new Print(operation);
                    symvol = num;
                    plus = select;

                }
            }

            else {
                select = 0;
                plus = 0;
                new Print();
            }

        }
    }
}

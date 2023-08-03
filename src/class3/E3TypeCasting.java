package class3;

public class E3TypeCasting {
    public static void main(String[] args) {
        //byte ->short->int->long->float->double

        int number=100;
        byte number2;
        /*number2=number; will give error cause number is bigger then number2
        you can force java to do the conversion by putting it in () anything over 127
        will give a unexpected results in binary numbers
         */
        number2=(byte)number;
        System.out.println(number2);

        short box1=2000;
        int box2=box1;   //implicit/auto
        System.out.println(box2);

    }
}

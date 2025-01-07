package edurca;

public class operators {
    public static void main (String[]args){
        int x = 10 ;
        int y= 12;
        int z = 14;

        System.out.println(x++);
        System.out.println(++y);
        System.out.println(z--);
        System.out.println(x+y);
        System.out.println(x-y);

        System.out.println(x* 2);
        System.out.println(y / 2);
        System.out.println(x >>y);
        System.out.println(x<<x);

        //  ********Relational Operator****** //
        int a = 10 ; int b = 25 ; int c = 5 ;
        System.out.println(a<b && a>c );
        System.out.println(a<b & a<c);



    }
}

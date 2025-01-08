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


       // *************Bitwise operators***********
        int s = 5 ; int f = 7; int g= 9;
        System.out.println(s<f && f++ >f);
        System.out.println(s);
        System.out.println(g>s & g++> f );
        System.out.println(g);

        //***************Ternary logical Operator ***********
        int e = 2; int h = 5;
        int min = (e>h)?e:h;
        System.out.println(min);

        // Assignment Operator
        int l = 10;
        int p = 20;
        l+=4;  p-=4;
        System.out.println("This is  : "+ l);
        System.out.println(("This is : "+ p));
    }
}

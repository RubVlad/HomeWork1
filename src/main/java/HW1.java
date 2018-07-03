public class HW1 {
        public static void main(String[] args){
            calc();
            factorial();
        }


        public static void calc()
        {
            int a,b,c=0;
            float answ=0;
            a=2;
            b=3;
            c=1;

            if(a%2==0)
                answ = a * b / c;
            if ((a+c)%2==0||(b+c)%2==0)
                answ = a * b / c;
            else
                answ = a+b-c;

            System.out.println(answ);

        }

        public static void factorial()
        {
            int n = 3;
            int fact=1;
                for (int i=1; i<n; i++)
                fact = fact*i;

            System.out.println(fact);
        }
}

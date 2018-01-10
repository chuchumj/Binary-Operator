interface BinaryOperator
{ int yield(int a, int b); }

class Main
{
    public static final int low = 0, high = 2;

    public static void simulate(BinaryOperator op)
    {
        // your code
        for(int i = 0 ; low<=i && i <= high ; i++ ){
            for(int j = 0 ; low <= j && j <= high ; j++ ){

                System.out.printf("%d %d => %d\n",i,j,op.yield(i, j));
            }

        }
    }
    public static void simulate(String mode)
    {


    }
    public static void main(String[] args)
    {
        simulate((x,y)->{return 2*x + 3*y;});
        simulate("mul");
    }
}
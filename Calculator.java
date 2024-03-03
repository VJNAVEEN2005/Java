public class Calculator {
    public static void main(String[] args) {
        int a=10;
        int b=12;
        char c = '*';
        float ans;

        switch (c){
            case '+':
                ans=add(a,b);
                System.out.println((int)ans);
                break;
            case '-':
                ans=sub(a,b);
                System.out.println((int)ans);
                break;
            case '*':
                ans=mul(a,b);
                System.out.println((int)ans);
                break;
            case '/':
                ans=div(a,b);
                System.out.println(ans);
                break;
            default:
                System.out.println("Error");
        }

    }

    public static int add(int x, int y){
        return x+y;
    }
    public static int sub(int x, int y){
        return x-y;
    }
    public static int mul(int x, int y){
        return x*y;
    }
    public static float div(int x, int y){
        return (float)x/(float)y;
    }
}

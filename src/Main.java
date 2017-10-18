import java.util.*;
public class Main {

    public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	String x=in.next();
	int a,b,c,d;
	a=((x.charAt(0)-'0')+7)%10;
	b=((x.charAt(1)-'0')+7)%10;
	c=((x.charAt(2)-'0')+7)%10;
	d=((x.charAt(3)-'0')+7)%10;
	System.out.printf("%d%d%d%d\n",c,d,a,b);
    }
}

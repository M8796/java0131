package Random;

import java.util.Random;

    public class random {
	public static void main(String[] args) {
   	 //创建Aandom类实例
   	 Random ran=new Random();
   	 int i=ran.nextInt(100);
   	 double d=ran.nextDouble();
   	 System.out.println(i);
   	 System.out.println(d);
    }
}

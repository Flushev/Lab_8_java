import shop.store;
import para.shoes;
import java.util.*;
public class Main {
	public static void main (String[] args)
	{	final int LEN=100;
		
		 Scanner in = new Scanner(System.in);
		 shoes para1 = new shoes("__Название__","__Вид__","__Артикул__",0);
		 para1.read();
		 double sum=0;
		 sum=para1.add(sum);
		 store st1 = new store(1,0,0,para1);
		 st1.display();
		 st1.sale();
		 st1.display();
		 st1.back();
		 st1.display();
		 System.out.println("Введите количество позиций");
		 int col=in.nextInt();
		shoes[] para2 = new shoes[LEN];
		for(int i=0; i<col; i++)
		{
			para2[i] = new shoes("__Название__","__Вид__","__Артикул__",0);
			para2[i].read();
			sum=para2[i].add(sum);
		}
		store st2 = new store(col,0,0,para2);
		 st1.display();
		 st1.sale();
		 st1.display();
		 st1.back();
		 st1.display();
	}


}

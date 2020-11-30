import shop.store;
import para.shoes;
import taxx.taxa;
import java.util.*;
public class Main {
	public static void main (String[] args)
	{	final int LEN=100;
		
		 Scanner in = new Scanner(System.in);
		 shoes para1 = new shoes("__Бренд__","__Вид__","__Артикул__",0);
		 para1.read();
		 double sum=0;
		 sum=para1.add(sum);
		 store st1 = new store(1,0,0,para1);
		 st1.display();
		 taxa t = new taxa();
		 store.nalog ();
		 System.out.println ("Налог на пары обуви: " + taxa.tmp);
		 st1.sale();
		 st1.display();
		 st1.back();
		 st1.display();
		 System.out.println("Введите количество позиций");
		 int col=in.nextInt();
		taxa.tmp = 0;
		shoes[] para2 = new shoes[LEN];
		for(int i=0; i<col; i++)
		{
			para2[i] = new shoes("__Бренд__","__Вид__","__Артикул__",0);
			para2[i].read();
			sum=para2[i].add(sum);
			store.nalog();
		}
		store st2 = new store(col,0,0,para2);
		 st2.display();
		 System.out.println ("Налог на пары обуви: " + taxa.tmp);
		 st2.sale();
		 st2.display();
		 st2.back();
		 st2.display();
	}


}
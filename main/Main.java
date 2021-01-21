import shop.store;
import para.shoes;
import taxx.taxa;
import exx.Ex;
import java.util.*;
public class Main {
	public static void main (String[] args)
	{	final int LEN=100;
		
		 Scanner in = new Scanner(System.in);
		 shoes[][] p = new shoes[10][10];
           	 int box = 0;
            	int k_box = 0;
            	System.out.println("Введите количество коробок на складе");
            	box = in.nextInt();
            	System.out.println("Введите количество пар в коробке");
            	k_box = in.nextInt();
            	for (int i = 0; i < box; i++)
                	for (int j = 0; j < k_box; j++)
                	{
                    		p[i][j] = new shoes();
                    		p[i][j].read();
                	}
       		store sklad = new store (box, k_box, p);
            	sklad.display_sklad();
		 System.out.println ("Инициализация массива через конструктор с 1 параметром: ");
		 shoes s[] = new shoes [2];
		 for (int i = 0; i < 2; i ++)
		 {
			s[i] = new shoes (i);
			s[i].display();
		 }
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
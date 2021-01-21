package shop;
import para.*;
import taxx.*;
import java.util.*;
public class store {
	private static final int LEN = 100;
	private int col;
	private double profit;
	private int sale_count;
	private shoes[] para = new shoes[LEN];
	private static int stavka;
	private shoes [][] para_1 = new shoes [LEN][LEN];
	private int box = 0;
	private int k_box = 0;
	static 
	{
		stavka = 300;
	}
	 public store(int box, int k_box, shoes[][] para)
        {
            this.col = box * k_box;
            this.box = box;
            this.k_box = k_box;
            for (int i = 0; i < box; i++) // Количество коробок
                for (int j = 0; j < k_box; j++) // Количество пар в коробке
                    this.para_1[i][j] = para[i][j];
	}
	
	public store(int col, double profit, int sale_count, shoes[] para)
	{
		this.col=col;
		this.profit=profit;
		this.sale_count=sale_count;
		for(int i=0; i<col; i++)
		{
			this.para[i]=para[i];
		}
	}
	public store(int col, double profit, int sale_count, shoes para)
	{
		this.col=col;
		this.profit=profit;
		this.sale_count=sale_count;
		for(int i=0; i<col; i++)
		{
			this.para[i]=para;
		}
	
		
	}
      	public double cost_sklad ()
        {
            double cost = 0;
            for (int i = 0; i < box; i++)
                for (int j = 0; j < k_box; j++)
                    cost += para_1[i][j].get_price();
            return cost;
        }
       	public void display_sklad()
        {
            System.out.println("Количество коробок на складе " + box);
            System.out.println ("Количество пар в коробке " + k_box);
            System.out.println("Общее количество пар на складе " + col);
            System.out.println("Общая стоимость товаров на складе " + cost_sklad());
            for (int i = 0; i < box; i++)
            {
                for (int j = 0; j < k_box; j++)
                    para_1[i][j].display();
                System.out.println("\n");
            }

        }
	public int get_col () 
	{
		return this.col;
	}
	public void display()
	{
		System.out.println("Количество товаров : " +col);
		System.out.println("Выручка : " + profit);
		System.out.println("Количество продаж : " + sale_count);
		for(int i=0; i<col; i++)
		{
			para[i].display();	
			System.out.println();
		}
		
	}

	public void sale()
	{
		for(int i=0; i<=col; i++)
		{
			this.profit += this.para[i].get_price();
			this.sale_count += 1;
			this.col -= 1;
		}
		System.out.println("Продажа прошла успешно!");
	}

	public void back ()
	{
		for(int i=0; i<1; i++)
		{
			this.profit -= this.para[i].get_price();
			this.sale_count -= 1;
			this.col += 1;
		}
		System.out.println("Возврат прошел успешно!");

	}

	public static void nalog ()
	{
		taxa.tmp += stavka;		
	}
}

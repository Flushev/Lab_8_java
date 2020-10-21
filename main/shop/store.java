package shop;
import para.*;
import java.util.*;
public class store {
	private static final int LEN = 100;
	private int col;
	private double profit;
	private int sale_count;
	private shoes[] para = new shoes[LEN];
		
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
}

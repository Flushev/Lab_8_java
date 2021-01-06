package para;
import exx.Ex;
import java.util.*;


public class shoes {

		private String name;
		private String type;
		private String art;
		private double price;
		public shoes () 
		{
			this.name="__Бренд__";
			this.type="__Вид__";
			this.art="__Артикул__";
			this.price=0;
		}
		public shoes(String name, String type, String art, double price)
		{
			this.name=name;
			this.type=type;
			this.art=art;
			this.price=price;
		}
		public shoes (double price)
		{
			this.name="__Бренд__";
			this.type="__Вид__";
			this.art="__Артикул__";
			this.price=price;
		}
		public double get_price()
		{
			return this.price;
		}
		public void read() 
		{	int f = 0;
			double temp;
			Scanner in = new Scanner(System.in);
			shoes para = new shoes("__Бренд__","__Вид__","__Артикул__",0);
			System.out.println("Введите Бренд:");
			name=in.nextLine();
			System.out.println("Введите Вид:");
			type=in.nextLine();
			System.out.println("Введите Артикул:");
			art=in.nextLine();
			while (f == 0)
			{	
				System.out.println("Введите Стоимость:");
				temp=in.nextDouble();
				try
				{
					if (temp > 0)
					{
						price = temp;
						f = 1;
					}
					else 
					{
						f = 0;
						throw new Ex (1);
						
					}
				}
				catch (Ex e)
				{
					System.out.println ("Ошибка ввода!" + e);
					
				}				

			}
		}
		public void display()
		{
			System.out.println("Бренд: "+ name);
			System.out.println("Вид обуви: "+ type);
			System.out.println("Артикул: "+ art);
			System.out.println("Стоимость: "+ price);
			System.out.println("\n");		
		}
		public double add(double sum)
		{
			sum+=price;
			System.out.println("Общая стоимость: " + sum);
			return sum;
		}
	}



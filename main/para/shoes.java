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
			this.name="__�����__";
			this.type="__���__";
			this.art="__�������__";
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
			this.name="__�����__";
			this.type="__���__";
			this.art="__�������__";
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
			shoes para = new shoes("__�����__","__���__","__�������__",0);
			System.out.println("������� �����:");
			name=in.nextLine();
			System.out.println("������� ���:");
			type=in.nextLine();
			System.out.println("������� �������:");
			art=in.nextLine();
			while (f == 0)
			{	
				System.out.println("������� ���������:");
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
					System.out.println ("������ �����!" + e);
					
				}				

			}
		}
		public void display()
		{
			System.out.println("�����: "+ name);
			System.out.println("��� �����: "+ type);
			System.out.println("�������: "+ art);
			System.out.println("���������: "+ price);
			System.out.println("\n");		
		}
		public double add(double sum)
		{
			sum+=price;
			System.out.println("����� ���������: " + sum);
			return sum;
		}
	}



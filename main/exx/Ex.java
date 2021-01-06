package exx;
import java.util.*;
public class Ex extends Exception 
{
  private int Type;       
  public Ex(int a)                   
   {
    	Type = a;
   }
   public String toString() 
   {
	if (Type == 1)
		return "—тоимость не может быть отрицательной!";
	return "";
   }
}
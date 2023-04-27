package com.app.tester;
import  com.app.fruits.*;
import java.util.*;
public class FruitBasket {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size of basket:");
		Fruit[] FruitB=new Fruit[sc.nextInt()];
		int index=0;
		int c;
		
		System.out.println("1.Add mango 2. Add orange 3. Add Apple 4.Display names 5.Display details 6.Make Stale 7.Make sour stale 8.Invoke individual functions 9.exit");
		do {
		System.out.println("Enter the choice:");
		 c=sc.nextInt();
		
		switch(c)
		{
		case 1:
			if(index<FruitB.length)
			{
				FruitB[index]=new Mango(sc.next(),sc.next(),sc.nextDouble());
				index++;
			}
			else
			{
				System.out.println("Basket is full.");
			}
			break;
		
		
		case 2:
			if(index<FruitB.length)
			{
				FruitB[index]=new Orange(sc.next(),sc.next(),sc.nextDouble());
				index++;
			}
			else
			{
				System.out.println("Basket is full.");
			}
			break;
			
		case 3:
			if(index<FruitB.length)
			{
				FruitB[index]=new Apple(sc.next(),sc.next(),sc.nextDouble());
				index++;
			}
			else
			{
				System.out.println("Basket is full.");
			}
			break;
		case 4:
			System.out.println("All Fruits are:");
			for(Fruit f:FruitB)
			{
				if(f!=null) {
			
				System.out.println(f.getName());
			}
				}
			break;
		case 5:
			System.out.println("All Fruits Details are:");
			for(Fruit f:FruitB)
			{
				if(f!=null) {
			
				System.out.println(f);
			}
				}
			break;
		case 6:
			System.out.println("Enter the index:");
			int i=sc.nextInt();
			if(i<=index)
			{
				FruitB[i].setFresh(false);
			}
			else
			{
				System.out.println("Invalid index.");
			}
			break;
		case 7:
			for(Fruit f:FruitB)
			{
				if(f.taste().equals("sour"))
				{
					f.setFresh(false);
				}
			}
			break;
		case 8:
			System.out.println("Enter the index:");
			int i1=sc.nextInt();
			if(FruitB[i1] instanceof Mango)
			{
				((Mango)FruitB[i1]).Pulp();
			}
			else if(FruitB[i1] instanceof Orange)
			{
				((Orange)FruitB[i1]).juice();
			}
			else
			{
				((Apple)FruitB[i1]).jam();
			}
		break;	
			
		case 9:
			System.out.println("Thank you!");
			break;
		}
		}while(c<9);
	}

}

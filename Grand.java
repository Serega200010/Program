package city;
import java.io.PrintStream;
import java.util.Scanner;
public class Grand {
	static Scanner in = new Scanner(System.in);
	public static PrintStream out=System.out;
	public static void main(String[] args) {
		town town1   = new town();
		town town2 = new town( 10, 20,"Sabianin","Voronezh");
	
		city.age(city.now,city.year);
		city.age(city.year);
		//for (int i=0;i<5;i++){
	int p=in.nextInt();
		//int m=in.nextInt();
		int c=in.nextInt();
		int cars=in.nextInt();
		String mer=in.toString();
		String name=in.toString();
		
town1.setCount(c);
town1.setMer(mer);
town1.setParks(p);
town1.setName(name);
town1.setCars(cars);
//	}
		//for (int i=0;i<5;i++){
			//int p=town1[i].getParks();
			
		//	int c=town1[i].getCount();
			//int cars=town1[i].getCars();
		//	String mer=town1[i].getMer();
		//	String name=town1[i].getName();
			
		//	System.out.println("Город"+i+":");
	//		System.out.println("Название:"+name+".");
		///	System.out.println("Имя мера:"+mer+".");
		//	System.out.println("Численность населения:"+c+".");
		//	System.out.println("Количество машин в городе:"+cars+".");
		//	System.out.println("Количество парков в городе:"+p+".");
		//}
		
		
	}

}

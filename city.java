package city;

public class city {
	 static int year = 1147;
	 static int now = 2016;
	static void age (int now,int age){
		System.out.println(now-age);
	}
	static void age (int age){
		System.out.println(2016-age);
	}
	public city() {
		setCount(0);
		setMer("");
		setName("");
		setCars(0);
	}
	public city(int c,int cars,String mer,String name){
		setCount(c);
		setMer(mer);
		setName(name);
		setCars(cars);
	}
	private int count;
 protected String mer;
 private String name;
 private int cars;
 void setCars(int cars){
	 this.cars=cars;
 }
 
 int getCars(){
	 return this.cars;
 }
 
 void setCount(int _count){
	 this.count=_count;
 }
 
 void setMer(String _mer){
	 this.mer=_mer;
 }
 
 int getCount(){
	 return this.count;
 }
 
 String getMer(){
	 return this.mer;
 }
 

 
 void setName(String name){
	 this.name=name;
 }
 
  String getName(){
	  return this.name;
  }



}

package city;

public class town extends city{
	private int numParks; //Количество парков в городе
	
public town(int j, int cars, String mer, String name) {
	
	}

public town() {
}

void setParks(int parks){
	this.numParks=parks;
}

int getParks(){
	return this.numParks;
}


}

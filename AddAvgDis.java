
public class AddAvgDis {

	int addTwo(int n1, int n2) {
		
		int sum= n1+n2;
		return sum;
		
	}
	
	int average(int q, int p) {
		
		AddAvgDis a1= new AddAvgDis();
		
		int result =a1.addTwo(q, p);
		
		int avg=result/2;
		return avg;
		
	}
	
	void discount(int a, int b) {
		
		AddAvgDis s1 =new AddAvgDis();
		
		int val=s1.average(a, b);
		
		int disc=val*10/100;
		
	}
}

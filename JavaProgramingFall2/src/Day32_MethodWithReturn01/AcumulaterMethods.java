package Day32_MethodWithReturn01;

public class AcumulaterMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Method getStars that accept and int return a string
		//getStart(5)=*****
	String show=getStars(5);
	System.out.println(show);
	System.out.println(getStars(10));
	
	int [] nums= {1,2,3,4,5,6,7,8,7,6,5,4,3,2,1};
	for(int Nums:nums) {
		System.out.println(getStars(Nums));
	}
	
	}
public static String getStars(int n) {
	String star="";
	for(int i=0;i<n;i++) {
	star=star+"*";
	}
	return star;
}
}

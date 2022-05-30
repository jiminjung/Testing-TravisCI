
public class CalMain {
	CalIF cal;
	public void setCal(CalIF cal) {
		this.cal = cal;
	}
  // return sum of a and b
	public int doAdd(int a,int b){
		System.out.println("## summing "+a+"+"+b+"="+ cal.add(a, b) );
		return cal.add(a, b);
	}
	public int doSub(int a,int b){
		System.out.println("## substracting "+a+"+"+b+"="+ cal.substract(a, b) );
		return cal.substract(a, b);
	} 
}

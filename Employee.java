import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.time.LocalDate; //Importing the current date at application running point.
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Employee implements Serializable {
	private String EmployeeID;
	private String FName;
	private String LName;
	private String Class1;
	private String Class2;
	private String Class3;
	private String Class4;
	private String Class5;
	private String Class6;
	private String Class7;
	private String Class8;
	private String Class9;
	private String Class10;
	private String Class11;
	private String Class12;
	private String Class13;
	private String Class14;
	private String Class15;
	private List<String> classes = new ArrayList<String>();	
	private List<String> classNames = new ArrayList<String>();
	/*private Placeholder EmployeeClass1;
	private Placeholder EmployeeClass2;
	private Placeholder EmployeeClass3;
	private Placeholder EmployeeClass4;
	private Placeholder EmployeeClass5;
	private Placeholder EmployeeClass6;
	private Placeholder EmployeeClass7;
	private Placeholder EmployeeClass8;
	private Placeholder EmployeeClass9;
	private Placeholder EmployeeClass10;
	private Placeholder EmployeeClass11;
	private Placeholder EmployeeClass12;
	private Placeholder EmployeeClass13;
	private Placeholder EmployeeClass14;
	private Placeholder EmployeeClass15;*/


	public Employee() {
		
	}
	
	public Employee(String EmployeeID, String FName, String LName, String info1, String info2, String info3, String info4, String info5, String info6, String info7, String info8, String info9, String info10, String info11, String info12, String info13, String info14, String info15) {
		this.EmployeeID = EmployeeID;
		this.FName = FName;
		this.LName = LName;
		this.Class1 = info1;
		this.Class2 = info2;
		this.Class3 = info3;
		this.Class4 = info4;
		this.Class5 = info5;
		this.Class6 = info6;
		this.Class7 = info7;
		this.Class8 = info8;
		this.Class9 = info9;
		this.Class10 = info10;
		this.Class11 = info11;
		this.Class12 = info12;
		this.Class13 = info13;
		this.Class14 = info14;
		this.Class15 = info15;
		
		this.classes = Arrays.asList(new String[] {info1, info2, info3, info4, info5, info6, info7, info8, info9, info10, info11, info12, info13, info14, info15});

	}
	
	public void setClassNames(List<String> classNames) {
		this.classNames = classNames;
	}
	
	public List<String> getClassNames() {
		return classNames;
	}
	
	public List<String> getClasses() {
		return Arrays.asList(new String[] {this.Class1, this.Class2, this.Class3, this.Class4, this.Class5, this.Class6, this.Class7, this.Class8, this.Class9, this.Class10, this.Class11, this.Class12, this.Class13, this.Class14, this.Class15});
	}
	
	public String getEmployeeId() {
		return EmployeeID;
	}
	
	public void setEmployeeId(String EmployeeId) {
		this.EmployeeID = EmployeeId;
	}
	
	public String getFName() {
		return FName;
	}
	
	public void setFName(String FName) {
		this.FName = FName;
	}
	
	public String getLName() {
		return LName;
	}
	
	public void setLName(String LName) {
		this.LName = LName;
	}
	
	public String getClass1() {
		return Class1;
	}
	
	public void setClass1(String Class1) {
		this.Class1 = Class1;
	}
	
	public String getClass2() {
		return Class2;
	}
	
	public void setClass2(String Class2) {
		this.Class2 = Class2;
	}
	
	public String getClass3() {
		return Class3;
	}
	
	public void setClass3(String Class3) {
		this.Class3 = Class3;
	}
	
	public String getClass4() {
		return Class4;
	}
	
	public void setClass4(String Class4) {
		this.Class4 = Class4;
	}
	
	public String getClass5() {
		return Class5;
	}
	
	public void setClass5(String Class5) {
		this.Class5 = Class5;
	}
	
	public String getClass6() {
		return Class6;
	}
	
	public void setClass6(String Class6) {
		this.Class6 = Class6;
	}
	
	public String getClass7() {
		return Class7;
	}
	
	public void setClass7(String Class7) {
		this.Class7 = Class7;
	}
	
	public String getClass8() {
		return Class8;
	}
	
	public void setClass8(String Class8) {
		this.Class8 = Class8;
	}
	
	public String getClass9() {
		return Class9;
	}
	
	public void setClass9(String Class9) {
		this.Class9 = Class9;
	}
	
	public String getClass10() {
		return Class10;
	}
	
	public void setClass10(String Class10) {
		this.Class10 = Class10;
	}
	
	public String getClass11() {
		return Class11;
	}
	
	public void setClass11(String Class11) {
		this.Class11 = Class11;
	}
	
	public String getClass12() {
		return Class12;
	}
	
	public void setClass12(String Class12) {
		this.Class12 = Class12;
	}
	
	public String getClass13() {
		return Class13;
	}
	
	public void setClass13(String Class13) {
		this.Class13 = Class13;
	}
	
	public String getClass14() {
		return Class14;
	}
	
	public void setClass14(String Class14) {
		this.Class14 = Class14;
	}
	
	public String getClass15() {
		return Class15;
	}
	
	public void setClass15(String Class15) {
		this.Class15 = Class15;
	}
	
	public String newDate(java.util.Date date2) {
    	String newstring = new SimpleDateFormat("yyyy-MM-dd").format(date2);
    	//System.out.println(newstring); // 2011-01-18
    	return newstring;
	}
	
	public void print() {
		System.out.print("\n" + EmployeeID + " || ");
		System.out.print(FName + " || ");
		System.out.print(LName + " || ");
		System.out.print(Class1 + " || ");
		System.out.print(Class2 + " || ");
		System.out.print(Class3 + " || ");
		System.out.print(Class4 + " || ");
		System.out.print(Class5 + " || ");
		System.out.print(Class6 + " || ");
		System.out.print(Class7 + " || ");
		System.out.print(Class8 + " || ");
		System.out.print(Class9 + " || ");
		System.out.print(Class10 + " || ");
		System.out.print(Class11 + " || ");
		System.out.print(Class12 + " || ");
		System.out.print(Class13 + " || ");
		System.out.print(Class14 + " || ");
		System.out.print(Class15 + " || ");
	}
	
//	public void pfile() {
//		System.out.printf("%-10s%-10d%-10c%-10f\\n", EmployeeID, FName, LName, Class1, Class2, Class3, Class4, Class5, Class6, Class7, Class8, Class9, Class10, Class11, Class12, Class13, Class14, Class15);
//		System.out.println(EmployeeID);
//		System.out.println(FName);
//		System.out.println(LName);
//		System.out.println(Class1);
//		System.out.println(Class2);
//		System.out.println(Class3);
//		System.out.println(Class4);
//		System.out.println(Class5);
//		System.out.println(Class6);
//		System.out.println(Class7);
//		System.out.println(Class8);
//		System.out.println(Class9);
//		System.out.println(Class10);
//		System.out.println(Class11);
//		System.out.println(Class12);
//		System.out.println(Class13);
//		System.out.println(Class14);
//		System.out.println(Class15);
//	}
	
	
}

package exam02;

public class Test {
	int id;
	
	public Test(int id) {
		this.id = id;
	}
	
//	public boolean equals(Object obj) {
//		if(obj instanceof Test) {
//			Test t = (Test) obj;
//			if(this.id == t.id)
//				return true;
//		}
//		
//		return false;
//	}
	public boolean equals(Test t) {
		if(this.id == t.id)
				return true;
		
		return false;
	}
}

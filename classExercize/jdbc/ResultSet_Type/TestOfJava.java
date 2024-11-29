package classExercize.jdbc.ResultSet_Type;

class TestOfJava{
	
	int x = 10;
	int y = 10;
	
	public static void main(String[] args){
		
		TestOfJava t = new TestOfJava();
		TestOfJava t2 = new TestOfJava();
		
		String s = "Rajan";
		String s2 = "Rajan";
		
		System.out.println(s.compareTo(s2));
		//System.out.println(s.equals(s2));
		System.out.println(t.x==t2.x);
	}
}
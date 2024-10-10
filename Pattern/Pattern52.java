class Pattern52{
	public static void main(String[] args){
		int n = 5;
		int alpha = 65;
		for(int i = n-1; i>=0; i--){
			for(int j = 0; j<=i; j++){
				System.out.print((char)(alpha));
			}
			alpha++;
			System.out.println();
		}
	}
}
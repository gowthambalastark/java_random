/*
Generate the following pattern when x is given upto Nth terms
For ex:

Input: x=2 ,N=5

OUTPUT:

2

12

1112

3112

132112

*/
import java.util.Scanner;
class pattern{
	public static void main(String[] args) {
		int n,i,k;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter The Number of Times:");
		n=in.nextInt();
		System.out.println("Enter The x:");
		String s=in.next();
		System.out.println("Result");
		System.out.println(s);
		String t="";
		for(i=0;i<n-1;i++){
		    int j=0;
		    String b="";
		    char[] d=s.toCharArray();
			while(j<s.length()){
			    int c=0;
				for(k=j;k<s.length();k++){
					if(d[j]==d[k]){
						c+=1;
					}
					else{
						break;
					}
				}
				t+=String.valueOf(d[j])+String.valueOf(c);
				j+=c;
			}
			s=t;
			t="";
			StringBuilder sb=new StringBuilder(s);
			System.out.println(String.valueOf(sb.reverse()));
		}
	
	}
}
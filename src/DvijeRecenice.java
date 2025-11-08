import java.util.Scanner;

public class DvijeRecenice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Unesite prvu recenicu: ");
		String[] r1 = sc.nextLine().split(" ");
		System.out.println("Unesite prvu recenicu: ");
		String []r2 = sc.nextLine().split(" ");
		 
		StringBuilder sb = new StringBuilder();
		 
		for(String rijec2 : r2) {
			boolean ima = false;
			for(String rijec1 : r1) {
				if(rijec2.equals(rijec1)) {
					ima = true;
					break;
				}}
		if(ima) {
			sb.append(rijec2).append(" ");}
		else {
		sb.append("{+").append(rijec2).append("+}");	
		}	
} 
		
	for(String rijec1 : r1) {
		boolean postoji = false;
		for(String rijec2:r2) {
			if(rijec1.equals(rijec2)) {
				postoji = true;
				break;
			}
		}
	if(!postoji) {
		sb.append("[-").append(rijec1).append("-]");
	}
	}	
System.out.print(sb.toString());}

}

package zzz;

public class main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// to print *****
		//          *****
		//          *****
		//          *****
		int n=4,m=5 ;
//		for (int i = 1; i <= n; i++) {
//				for (int j = 1; j<= m; j++) {
//					System.out.print("*");
//			}System.out.println();
//		}

		for (int i=1; i<=n; i++) {
			for (int j=1; j<=m; j++) {
				if (i==1 || j==1 || i==n || j==m) {
					System.out.print("*");
				} else {
				System.out.print(" ");
			}
		} System.out.println();
	}}}


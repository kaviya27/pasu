package flowcontrols;

public class Flow13 {

	public static void main(String[] args) {
		for(int n=11;n<=100;n++) {
			int count=0;
			for(int i=2;i<=n;i++) {
				if(n%i==0)
					count++;
			}
			if(count==1)
				System.out.println(n);
		}
		
	}

}

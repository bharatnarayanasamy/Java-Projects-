package tofindallthescorespossible;

public class TFATSP {

	public static void main(String[] args) {
		double x = 25;
		double y = 6;
		double z = 1.5;
		double w = 0;

		for(int i=0;i<26;i++){
			for(int j=0;j<26;j++){
				int s = 25-i-j;
				if(s>=0) {
					double a = i*y + j*w + s*z;
					if(a==108 || 1==1){
						System.out.println(i + " " + j + " " + s + " " + a);
					}
				}
			}			
		}

	}

}

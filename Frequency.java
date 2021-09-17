package secondDay2;

public class Frequency {

	public static void main(String[] args) {
		int arr[]= {3,4,2,5,1,2,6,3,6,2,4,7,1};
		int fr[]=new int[13];
		int visited=-1;
		for(int i=0;i<arr.length;i++) {
			int num=arr[i];
			int count=1;
			for(int j=i+1;j<arr.length;j++) {
				if(num==arr[j]) {
					count=count+1;
					fr[j]=visited;
				}
			}
			if(fr[i]!=-1) {
				fr[i]=count;
				System.out.println("The frequency of"+arr[i]+"is:"+fr[i]+"times");
			}
		}
	}

}

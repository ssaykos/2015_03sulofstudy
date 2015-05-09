package _2ÁÖ;

public class _6ÀÏÂ÷_2AvgTotal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double[] arr={12.3,45.6,78.9};
		double total=0.0;
		double average=0.0;
		for(int i=0;i<arr.length;i++)
		{
			total+=arr[i];
		}
		average=total/arr.length;
		
		System.out.printf("ÃÑÁ¡:%.1f\n",total);
		System.out.printf("Æò±Õ:%.1f\n",average);
	}

}

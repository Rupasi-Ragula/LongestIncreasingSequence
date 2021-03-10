import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	public int[] getList(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the list");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the list");
        for(int i=0;i<n;i++){
            arr[i]=(sc.nextInt());
        }
        sc.close();
        return arr;
    }
	public void longestSequence(int[] arr)
	{
		ArrayList<Integer> list = new ArrayList<Integer>();
		ArrayList<Integer> longest_list = new ArrayList<Integer>();
		int currentMax;
		int maxLength=0;
		for(int i=0;i<arr.length;i++){
		    currentMax=Integer.MIN_VALUE;
		    for(int j=i;j<arr.length;j++){
		        if(arr[j]>currentMax){
		            currentMax=arr[j];
		            list.add(arr[j]);
		            
		        }
		    }
		    if(maxLength<list.size())
		    {
		        maxLength=list.size();
		        longest_list= new ArrayList<Integer>(list);
		    }
		    list.clear();
		}
		System.out.println("Longest Sequence: "+longest_list);
		System.out.println("Length of longest sequence: "+longest_list.size());
	}

	public static void main(String[] args) {
		Main obj = new Main();
		int[] arr = obj.getList();
		obj.longestSequence(arr);
		
	}
	

}

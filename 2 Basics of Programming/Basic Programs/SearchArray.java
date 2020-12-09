class SearchArray
{
	public static void main(String[] args){

		int arr[]={1,2,3,4,5,6,7,8,9,10};
		int searchNo = 15;
		boolean flag=false;
		for(int i=0;i<10;i++){
			if(arr[i]==searchNo){
				flag=true;
				break;
			}
		}
		if(flag){
			System.out.println("no is found");
		}
		else{
			System.out.println("no is not found");
		}
	}
}
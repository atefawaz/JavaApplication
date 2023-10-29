package java_practice;

public class TwoArrays {

	public static void main(String[] args) {
		int [] firstArray = {1,2,3,4,5,6};
		int [] secondArray = {4,5,6,7,8,9};
		
		for (int x = 0; x < firstArray.length; x++) {
			
			for (int y = 0 ; y < secondArray.length ;y++){
				
				if (  firstArray[x] == secondArray[y]) {
					System.out.println("We have a match " + firstArray[x]);
				}
			}
			
		}

	}

}

package datastructures;

public class Arrays {

	public static void main(String[] args) {

		String[] alphabet = {"a","b","c","d","e","f","g"};
		
		System.out.println("Printing array in old way.");
		for (int i=0; i <=5; i++) {
			System.out.print(alphabet[i]+" ");
		}
		
		System.out.println("\n\nPrinting using lenght variable.");
		
		for (int n=0; n < alphabet.length; n++) {
			System.out.print(alphabet[n]+" ");
		}
		
		System.out.println("\n\nUsing the For-Each method.");
		
		for (String letter : alphabet) {
			System.out.print(letter +" ");
		}
		
		System.out.println("\n\n****************************\n");
		
		String[][] users = {
					{"John","Williams","jw@gmail.com","34343434"},
					{"Sarah","Jackson","sj@testmail.com","435834524"},
					{"Rachel","Wallace","rc@somemail.com","49384038"}
				};
		
		// Get the size of array
		int numOfUsers = users.length;
		int numOfFields = users[0].length;
		
		System.out.println("Number of users: "+numOfUsers);
		System.out.println("Number of fields: "+numOfFields);
		
		
		System.out.println("\n\n************************\n");
		
		// Traverse the double array
		for (int i=0; i<numOfUsers;i++) {
			String firstName = users[i][0];
			String lastName = users[i][1];
			String email = users[i][2];
			String phone = users[i][3];
			System.out.println(firstName+" "+lastName+" "+" "+email+" "+phone);
		}
		
		System.out.println("\n\n************************\n");
		
		for (String[] user : users) {
			System.out.print("[ ");
				for (String field : user) {
					System.out.print(field + " ");
				}
				System.out.println(" ]");
		}
		
	}

}

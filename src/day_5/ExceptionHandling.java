package day_5;

 
import java.util.ArrayList;

public class ExceptionHandling {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		try {
			arrayList.add("sayli");
			arrayList.add("walkoli");
			exceptionFunction(arrayList);
		} catch (IndexOutOfBoundsException ex) {
			System.out.println("Array Index Out Of Bound Exception" + ex);
		} catch (Exception ex) {
			System.out.println("Some Other Exception" + ex);
		} finally {
			for (int i = 0; i < arrayList.size(); i++) {
				System.out.println(arrayList.get(i));
			}
		}
	}

	static ArrayList<String> exceptionFunction(ArrayList<String> arrayList) throws Exception {

		arrayList.add(4, "ssss"); 
 
		
		arrayList.add(3, "something");
		return arrayList;
	}

}

package day_5;


import java.util.ArrayList;

public class LambdaFunction {

	public static void main(String[] args) {
		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("sayli");
		arrayList.add("walkoli");
		arrayList.add("sakshi ");
		arrayList.add("sonali");
		arrayList.add(2, "Sis"); // inserting element in between 2 elements

		ArrayList<String> arrayList2 = new ArrayList<>();
		
		arrayList.forEach((word) -> {
			if(word.contains("sakshi"))
				arrayList2.add(word);
			}
		);
		
		arrayList2.forEach((word) -> System.out.println(word));

	}
}
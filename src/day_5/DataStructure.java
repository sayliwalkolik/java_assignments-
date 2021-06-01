package day_5;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;

public class DataStructure {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		arrayList.add("sayli");
		arrayList.add("walkoli");
		 

		Iterator<String> it = arrayList.iterator();
		while (it.hasNext()) {
			System.out.println(it.next());
		}
		for (int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}

		arrayList.clear();

		System.out.println(arrayList.contains("sayli"));

		arrayList.forEach((word) -> System.out.println(word));

		for (String word : arrayList) {
			System.out.println(word);
		}

		// LinkedList
		LinkedList<String> linkedList = new LinkedList<>();
		linkedList.add("sakshi");
		linkedList.add("sonali");
		linkedList.add("esha");
		linkedList.add("lisa");

		for (String word : linkedList) {
			System.out.println(word);
		}

		linkedList.addFirst("First Element");
		linkedList.addLast("Last Element");
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());

		System.out.println("After Adding First & Last Element");
		for (String word : linkedList) {
			System.out.println(word);
		}

		linkedList.removeFirst();
		linkedList.removeLast();
		System.out.println("After Removing First & Last Element");

		for (String word : linkedList) {
			System.out.println(word);
		}
		Iterator<String> it2 = linkedList.iterator();
		while (it2.hasNext()) {
			System.out.println(it2.next());
		}

		// HashMap
		HashMap<String, String> hashMap = new HashMap<>();
		hashMap.put("name 1", "sayli");
		hashMap.put("name 2", " sia");
		hashMap.put("name 3", "sakshi ");
		hashMap.put("name 4", "sonali ");
		hashMap.put("name 5", " sayli");
		hashMap.put("name 1", " sayli");
		// Slight change when we want to use iterator with hash map
		Iterator<Map.Entry<String, String>> it3 = hashMap.entrySet().iterator();
		while (it3.hasNext()) {
			System.out.println(it3.next().getKey() + "-" + it3.next().getValue());
		}
		System.out.println(hashMap.get("name 5"));

		hashMap.forEach((key, value) -> System.out.println(key + "-" + value));

		for (String key : hashMap.keySet()) {
			System.out.println(key + "-" + hashMap.get(key));
		}

		// Hash Set
		HashSet<String> hashSet = new HashSet<>();
		hashSet.add("sayli");
		hashSet.add("sayli");
		hashSet.add("sayli");
		hashSet.add("sakshi");
		hashSet.add("sakshi");
		hashSet.add("sakshi2");

		for (String value : hashSet) {
			System.out.println(value);
		}
		
		Iterator<String> it4 = hashSet.iterator();
		while(it4.hasNext()) {
			System.out.println(it4.next());
		}

	}

}



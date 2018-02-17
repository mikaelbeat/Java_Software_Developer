package datastructures;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Sets {

	public static void main(String[] args) {

		// LinkedHash - in order that they were entered
		// HashSet - complete random order
		// TreeSet - Alphabetical order
		// 1. Define the collection
		Set<String> animals = new TreeSet<String>();
		
		// 2. Adding elements
		animals.add("Dog");
		animals.add("Pig");
		animals.add("Hog");
		animals.add("Cat");
		animals.add("Snake");
		
		System.out.println(animals.size() + " " + animals);
		
		animals.add("Cat");
		animals.add("Snake");
		animals.add("Goose");
		
		System.out.println(animals.size() + " " + animals);
		
		// Create new set and compare it to other one
		
		Set<String> farmAnimals = new HashSet<String>();
		farmAnimals.add("Chicken");
		farmAnimals.add("Cow");
		farmAnimals.add("Pig");
		farmAnimals.add("Horse");
		farmAnimals.add("Dog");
		
		// What is the INTERSECTION ( Only animals and farm animals "AND")
		// 1. Copy existing set into a new set
		Set<String> intersecionSet = new HashSet<String>(animals);
		System.out.println(intersecionSet);
		
		// 2. Retain ONLY the elements that are also in the other set
		intersecionSet.retainAll(farmAnimals);
		System.out.println("\nThe intersection is: "+intersecionSet);
		
		// What is the UNION (Are both animals and farm animals "OR")
		Set<String> unionSet = new HashSet<String>(farmAnimals);
		unionSet.addAll(animals);
		System.out.println("The union is: " + unionSet);
		
		// What is the DIFFERENCE ( animals but NOT farm animals - in 1 and NOT in other)
		Set<String> differenceSet = new HashSet<String>(animals);
		differenceSet.removeAll(farmAnimals);
		System.out.println("Difference is: " + differenceSet);
	}

}

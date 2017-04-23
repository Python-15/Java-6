package _Starting;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Student st = new Student("John", "Smith", 18);
		Calculate(st);
		System.out.println(st);

		Book b1 = new Book("War", "Tolstoy", 1863);
		b1.DisplayId(); // id == 1
		
		Book b2 = new Book("Fathers and Sons", "Turgencev", 1862);
		b2.DisplayId(); // id == 2
		
		System.out.println(b1);
		
		Scanner sc = new Scanner(System.in);
	}

	public static void Calculate(Student st) {
		st.set_age(23);
	}
}

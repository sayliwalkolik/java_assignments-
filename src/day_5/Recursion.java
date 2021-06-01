package day_5;

public class Recursion {
	 

		public static void main(String[] args) {
			recursiveFun2(8);
		}

		static void recursiveFun(int i) {
			if (i <= 0)
				return;
			else {
				System.out.println(i);
				recursiveFun(i--);  
			}
		}

		static void recursiveFun2(int i) {
			if (i > 0) {
				recursiveFun2(--i);  
				System.out.println(i);
			} else
				return;
		}

	}


/* 

interface Animal{
	void eat();

}

class Main{
	public static void main(String[] args) {
		Animal cat = ()-> System.out.println("Eat");

		cat.eat();
	}
}

*/

/*
 
interface Printer {
	void printSomething(String data);
}

class Main {
	public static void main(String args[]) {

		Printer mom = new Printer() {
			@Override
			public void printSomething(String data){
				System.out.println("Print : " + data);
			}
		};

		mom.printSomething("Mom");
		
	}
}

*/


interface Calculator {
	void printTotal(int num1, int num2);
}

class Main {
	public static void main(String args[]) {

		Calculator c = (int num1, int num2) -> {
				int Total = num1 + num2 ;
				System.out.println("Total = " + Total);
			

		};

		c.printTotal(10,20);
		
	}
}


package HomeWork;

public class SwappingStringWithoutThirdVariable {

	public static void main(String[] args) {

String a = "Hello";
String b = "Hai";

System.out.println("The given strings before swapping: "+a +"and" +b);

a = a + b;
b = a.substring(0, (a.length() - b.length()));
a = a.substring(b.length());

System.out.println("The given strings after swapping: "+a +"and" +b);

	}

}

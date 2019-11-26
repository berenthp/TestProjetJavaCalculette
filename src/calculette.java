import java.util.Scanner;

public class calculette {

	static Scanner scNum=new Scanner(System.in);
	static Scanner scString= new Scanner(System.in);

	public static double saisieDouble(String msg)  //fonction pour saisir un double (chiffre virgule) plus vite, sans scanner
	{
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		double result = sc.nextDouble();
		return result; // sors de la foncion et retourne/renvoie ce qui est return dans le main
	}
	public static String saisieString(String msg) // idem pour du texte
	{
		System.out.println(msg);
		Scanner sc=new Scanner(System.in);
		String result = sc.nextLine();
		return result;
	}

	public static double operation (double a, double b, String op) {
		double result = 0;
		switch (op) {
		case "+" : result = a + b ; break;
		case "-" : result = a - b ;break;
		case "*" : result = a * b ;break;
		case "/" : result = a / b ;break;
		default : System.out.println("error");break;
		}
		return result;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double a = saisieDouble("Donner un chiffre a:"); 
		double b = saisieDouble("Donner un chiffre b:"); 
		String op = saisieString("Choisir un opérateur: + - / *"); 

		while (!op.equals("S")) {
			if (op.equals("+")||op.equals("-")||op.equals("/")||op.equals("*")) {

				System.out.println("Le résultat est :"+ operation(a, b, op));
				op = saisieString("Choisir un autre opérateur, effacer le calcul précédent (saisir C) ou quitter le programme (saisir S).");
			}
			else if (op.equals("C")) {
				System.out.println();
				System.out.println("Nouveau calcul");
				a = saisieDouble("Donner un chiffre a:"); 
				b = saisieDouble("Donner un chiffre b:"); 
				op = saisieString("Choisir un opérateur: + - / *");
			}
			if (op.equals("S")) { //quitter le programme
				System.out.println();
				System.out.println("FIN");
			}
		}
	}
}
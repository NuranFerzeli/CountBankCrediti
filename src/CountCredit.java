import java.util.Scanner;

public class CountCredit {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Illik faiz dərəcəsini daxil edin:");
		double illikFaiz = input.nextDouble();
		System.out.println("Kredit müddətini daxil edin: ");
		byte year = input.nextByte();
		System.out.println("Kredit miqdarını daxil edin");
		double miqdar = input.nextDouble();
		double ayliqFaizDerecesi = illikFaiz / 1200;
		double ayliqMiqdar = (miqdar * ayliqFaizDerecesi) / (1 - 1 / (Math.pow(1 + ayliqFaizDerecesi, year * 12)));
		double umumiMiqdar = ayliqMiqdar * 12 * year;
		System.out.printf("Ümumi ödəniləcək məbləğ: %2.2f", umumiMiqdar);
		System.out.println();
		System.out.printf("Aylıq ödənəcək miqdar: %2.2f", ayliqMiqdar);
		System.out.println();

	}
}

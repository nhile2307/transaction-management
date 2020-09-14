import java.util.Scanner;

public class XuLy {

	public XuLy() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
	//	Scanner scan = new Scanner(System.in);
	//	doMenu(scan);
	/*
	 * String text1 ="Song"; String text2 ="Trình";
	 * if(text1.compareToIgnoreCase(text2) >0) { System.out.println("1"); }else
	 * System.out.println("2");
	 */	}

	private static void inMenu() {
		System.out.println("Choose the function");
		System.out.println("1. Enter type of transaction");
		System.out.println("2. Total quanity each type of transaction");
		System.out.println("3. Average for foreign currency");
		System.out.println("4. Print out transactions more than 1 billion");
		System.out.println("0. Exit the program");
	}

	private static void doMenu(Scanner scan) {
		
		boolean flag = true;
		DanhSachGiaoDich xuLyGiaoDich = new DanhSachGiaoDich();
		xuLyGiaoDich.dummyData();
		xuLyGiaoDich.tinhTienChoCacGiaoDich();
		do {
			inMenu();
			System.out.print("Please choose");
			int chon = Integer.parseInt(scan.nextLine());
			switch (chon) {
			case 0:
				flag = false;
				break;
			case 1:
				xuLyGiaoDich.nhap(scan);
				break;
			case 2:
				xuLyGiaoDich.tinhTongSLGDTienTe();
				xuLyGiaoDich.tinhTongSLGDVang();
				System.out.println("Total amount of currency transaction: " + xuLyGiaoDich.getTongSLGDTienTe());
				System.out.println("Total amount of gold transaction: " + xuLyGiaoDich.getTongSLGDVang());
				break;
			case 3:
				xuLyGiaoDich.tinhTBThanhTienTT();
				System.out.println("Average of currency transaction: " + xuLyGiaoDich.getTrungBinhTTGiaoDichTTe() );
				break;
			case 4:
				xuLyGiaoDich.xuatGiaoDichTheoTieuChi();
				break;
			}
		} while (flag);
	}

}

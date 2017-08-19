import java.util.*;
public class Specialchar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s=sc.nextLine();
		String str=s.replaceAll("[!@#~$%^&*()+{}:?><]","");
		int l=s.length()-str.length();
		System.out.println(l);

	}

}

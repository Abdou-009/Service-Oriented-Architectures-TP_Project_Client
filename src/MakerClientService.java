

import org.soa.ws.tp.*;

public class MakerClientService {

	public static void main(String[] args) {
		
		MakerImplService service = new MakerImplService();
		MiltiServise con = service.getMakerImplPort();
		
		
		
		
		
		
		double max = con.getMaxValue(4, 4);
		double min = con.getMinValue(0, 7);
		double moy = con.getMoyValue(10, 5, 5, 10);
		String Upperrname = con.toUpperString("aid");
		String Lowername = con.toLowerString("AICHA");
		System.out.println("the full name of my prof is : ");
		System.out.println(Upperrname);
		System.out.println(Lowername);
		System.out.println("The Result of opirations : ");
		System.out.print("Moyen : ");
		System.out.println(moy);
		System.out.print("Max : ");
		System.out.println(max);
		System.out.print("Min : ");
		System.out.println(min);
		
	

	}

}

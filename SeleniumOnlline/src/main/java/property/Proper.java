package property;

import java.io.FileInputStream;
import java.util.Properties;

public class Proper {

	public static Properties pro;

	public Proper() {

		try {
			String Path = "C:\\Users\\Dell\\git\\Djlala\\Djlala\\SeleniumOnlline\\src\\test\\resources\\mah.txt";

			FileInputStream f1 = new FileInputStream(Path);

			pro = new Properties();

			pro.load(f1);

		} catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

	public static String getkeyvalue() {

		String url = pro.getProperty("link");

		return url;

	}

}

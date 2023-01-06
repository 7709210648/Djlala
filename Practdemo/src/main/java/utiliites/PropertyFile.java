package utiliites;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFile {

	public File f1;

	public Properties p;

	public PropertyFile() {

		String pathfile = "C:\\Users\\Dell\\eclipse-workspace\\Practdemo\\src\\test\\resources\\propertyfile";

		try {

			FileInputStream f1 = new FileInputStream(pathfile);

			p = new Properties();

			p.load(f1);

		} catch (Exception e) {

			System.out.println(e.getMessage());
			// TODO: handle exception
		}

	}

	public String getlink() {

		String link = p.getProperty("Link");
		return link;
	}

	public String getusername() {

		String username = p.getProperty("username");
		return username;

	}

	public String getPassword() {

		String password = p.getProperty("password");

		return password;

	}
}

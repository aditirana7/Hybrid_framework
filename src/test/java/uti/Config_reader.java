package uti;
import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class Config_reader {
	

		Properties pro;

		public Config_reader() {
			File src = new File("./Configuration/config.properties");
			try {
				FileInputStream fis = new FileInputStream(src);
				pro = new Properties();
				pro.load(fis);
			} catch (Exception e) {
				System.out.println("Unable to lod excel file " + e.getMessage());
			}
		}

		public String getBrowser() {
			return pro.getProperty("Browser");
		}

		public String getAppURL() {
			return pro.getProperty("AppUrl");
		}
}

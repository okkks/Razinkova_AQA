package helpers;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropertyHelper {
    private final Properties properties = new Properties();

    private PropertyHelper() {

        InputStream in = this.getClass().getClassLoader().getResourceAsStream("config.properties");
        System.out.println("Read all properties from file");
        try {
            properties.load(in);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static class LazyHolder {
        private static final PropertyHelper INSTANCE = new PropertyHelper();
    }

    public static PropertyHelper getInstance() {
        return LazyHolder.INSTANCE;
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
package utils.configuration;

import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
    private static final Properties properties;

    static {
        properties = new Properties();
        try {
            properties.load(ReadProperties.class.getClassLoader().getResourceAsStream("config.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String getUrl() {
        return properties.getProperty("url");
    }

    public static String browserName() {
        return properties.getProperty("browser");
    }

    public static String username() {
        return properties.getProperty("username");
    }

    public static String password() {
        return properties.getProperty("password");
    }

    public static String firstname() {
        return properties.getProperty("firstname");
    }
    public static String lastname() {
        return properties.getProperty("lastname");
    }
    public static String code() {
        return properties.getProperty("code");
    }
    public static boolean isHeadless() {
        return properties.getProperty("headless").equalsIgnoreCase("true");
    }

    public static long timeout() {
        return 0;
    }

//    public static String standartUserName () {
//        return properties.getProperty("standartUserName");
//    }
    public static String userName () {
        return properties.getProperty("userName");
    }
    public static String failUserName () {
        return properties.getProperty("failUserName");
    }

    public static String originalPassword () {
        return properties.getProperty("originalPassword");
    }
}
package demoqa.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    private static Properties properties = new Properties();

    static {
        String path = "src/main/resources/app.properties";
        try (FileInputStream fileInputStream = new FileInputStream(path)) {
            properties.load(fileInputStream);
        } catch (IOException e) {
            System.err.println("Не удалось загрузить файл конфигурации: " + e.getMessage());
            throw new RuntimeException("Ошибка загрузки конфигурации", e);
        }
    }

    public static String getValue(String key) {
        return properties.getProperty(key.trim());
    }
}

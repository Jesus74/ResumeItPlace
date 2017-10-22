package main.java.common.propertiesreader;


import main.java.common.propertiesreader.data.DataProperties;
import main.java.common.propertiesreader.data.DataPropertiesKeys;


import java.io.*;
import java.util.Properties;


public class PropertiesReader implements PropertiesReaderInterface{
    private Properties dataPropertiesFile;

    public PropertiesReader() {
        this.dataPropertiesFile = getProperties();
    }


    private Properties getProperties() {
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("src/resource/data.properties"));
            return properties;
        } catch (FileNotFoundException e) {
            System.out.println("Отсутсвует .properties файл");
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }


    @Override
    public DataProperties getDataProperties() {
        DataProperties dataProperties = null;
        if(this.dataPropertiesFile != null){
            dataProperties = new DataProperties(
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.FIO),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.DOB),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.PHONE),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.EMAIL),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.SKYPE),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.AVATAR),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.TARGET),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.EXPERIENCES),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.EDUCATIONS),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.ADDITIONAL_EDUCATION),
                    this.dataPropertiesFile.getProperty(DataPropertiesKeys.SKILLS)


            );
        }
        return dataProperties;
    }
}

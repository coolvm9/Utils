package com.fusionz;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;

import java.io.FileReader;
import java.io.IOException;
import java.util.List;

public class OpenCSVExample {

    public static void main(String[] args) {
        String csvFile = "path/to/your/csvfile.csv";

        try (FileReader reader = new FileReader(csvFile)) {
            CsvToBean<Person> csvToBean = new CsvToBeanBuilder<Person>(reader)
                    .withType(Person.class)
                    .withIgnoreLeadingWhiteSpace(true)
                    .build();

            List<Person> persons = csvToBean.parse();
            for (Person person : persons) {
                System.out.println(person);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
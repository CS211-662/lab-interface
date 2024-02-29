package ku.cs.fileWriter;

import ku.cs.fileWriter.model.Cat;
import ku.cs.fileWriter.model.CatList;
import ku.cs.fileWriter.service.CatListFileDataSource;
import ku.cs.fileWriter.service.Datasource;

public class MainFileWriter {
    public static void main(String[] args) {
        Datasource<CatList> datasource = new CatListFileDataSource();

        System.out.println("Reading data from file in first time:");
        CatList catList = datasource.readData();
        for (Cat cat : catList.getCatList()) {
            System.out.println(cat);
        }

        catList.addCat("Mimi", "Siamese", 2);
        datasource.writeData(catList);

        System.out.println("\nReading data from file after added:");
        catList = datasource.readData();
        for (Cat cat : catList.getCatList()) {
            System.out.println(cat);
        }
    }
}

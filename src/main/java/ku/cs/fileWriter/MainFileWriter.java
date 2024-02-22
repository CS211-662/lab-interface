package ku.cs.fileWriter;

import ku.cs.fileWriter.model.Cat;
import ku.cs.fileWriter.model.CatList;
import ku.cs.fileWriter.service.CatListDataSource;
import ku.cs.fileWriter.service.Datasource;

public class MainFileWriter {
    public static void main(String[] args) {
        Datasource<CatList> catListDatasource = new CatListDataSource();

        CatList catList = new CatList();
        catList.addCat(new Cat("A", "B"));
        catList.addCat(new Cat("C", "D"));

        catListDatasource.writeData(catList);
    }
}

package ku.cs.fileWriter.service;

import ku.cs.fileWriter.model.CatList;

import java.util.ArrayList;

public class CatListFileDataSource implements Datasource<CatList> {

    private DataFileManager dataFileManager;

    public CatListFileDataSource() {
        dataFileManager = new DataFileManager("cat.csv", "data");
    }

    @Override
    public CatList readData() {
        ArrayList<String[]> data = dataFileManager.extractDataToArray();

        CatList catList = new CatList();

        for (String[] catData : data) {
            String name = catData[0];
            String breed = catData[1];
            int age = Integer.parseInt(catData[2]);

            catList.addCat(name, breed, age);
        }

        return catList;
    }

    @Override
    public void writeData(CatList data) {
        dataFileManager.writeData(data.getCatList());
    }
}

package ku.cs.fileWriter.service;

import ku.cs.fileWriter.model.CatList;

public class CatListDataSource implements Datasource<CatList> {

    private FileManager fileManager;

    public CatListDataSource() {
        fileManager = new FileManager("cat.csv", "data");
    }

    @Override
    public CatList readData() {
        return null;
    }

    @Override
    public void writeData(CatList data) {
        fileManager.writeData(data.getCatList());
    }
}

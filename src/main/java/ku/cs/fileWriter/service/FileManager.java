package ku.cs.fileWriter.service;

import java.util.List;

public class FileManager {
    private String filename;
    private String directory;

    public FileManager(String filename, String directory) {
        this.filename = filename;
        this.directory = directory;
    }

    public void writeData(List<? extends WriteAble> list) {
        for (WriteAble data : list) {
            System.out.println(data.toCsvFormat());
        }
    }

}

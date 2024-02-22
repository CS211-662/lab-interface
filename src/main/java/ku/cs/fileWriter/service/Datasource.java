package ku.cs.fileWriter.service;

public interface Datasource<T> {
    T readData();
    void writeData(T data);
}

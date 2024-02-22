package ku.cs.fileWriter.model;

import java.util.ArrayList;
import java.util.List;

public class CatList {
    private List<Cat> catList;

    public CatList() {
        catList = new ArrayList<>();
    }
    public CatList(List<Cat> catList) {
        this.catList = catList;
    }

    public void addCat(Cat cat) {
        catList.add(cat);
    }

    public List<Cat> getCatList() {
        return catList;
    }

    public void setCatList(List<Cat> catList) {
        this.catList = catList;
    }
}

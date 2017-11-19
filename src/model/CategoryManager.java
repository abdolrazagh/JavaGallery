package model;

import java.util.ArrayList;

public class CategoryManager {
    public ArrayList<Category> loadAllCategories(){
        CategoryDA categoryDA = new CategoryDA();
        return categoryDA.selectAllCategories();
    }
    public Category loadCategoryById(int id){
        CategoryDA categoryDA = new CategoryDA();
        return categoryDA.selectCategoryById(id);
    }
}

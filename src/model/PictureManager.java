package model;

import java.util.ArrayList;

public class PictureManager {

    public static boolean savePicture(Picture pic){
        PictureDA pictureDA =new PictureDA();
        return pictureDA.insertPicture(pic);
    }
    public Picture loadPictureById(int pic_id ){
        PictureDA pictureDA =new PictureDA();
        return pictureDA.selectPictureById(pic_id);
    }
    public static ArrayList<Picture> loadPictureByCatId(int cat_id){
        PictureDA pictureDA = new PictureDA();
        return pictureDA.selectPictureByCatId(cat_id);
    }
    public static boolean removePictureById(int id){
        PictureDA pictureDA =new PictureDA();
        return pictureDA.deletePictureById(id);
    }
}

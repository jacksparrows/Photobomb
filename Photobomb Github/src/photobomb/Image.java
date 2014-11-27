/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package photobomb;

import java.sql.Blob;

/**
 *
 * @author David Roche
 */
public class Image {
    private int imageId,userId,rating;
    private String genre,description;
    private Blob myImage,ImageThumb;
    
    public Image(int imageId, int userId,int rating,String genre,String description,Blob myImage,Blob ImageThumb){
        this.imageId = imageId;
        this.userId = userId;
        this.rating=rating;
        this.genre=genre;
        this.description=description;
        this.myImage=myImage;
        this.ImageThumb=ImageThumb;
    }
    public Image(){
        this(0,0,0,"No Information","No Information",null,null);
    }
    public int getImageId(){
        return imageId;
    }
    public int getUserId(){
        return userId;
    }
    public int getRating(){
        return rating;
    }
    public String getDescription(){
        return description;
    }
    public String getGenre(){
        return genre;
    }
    public void setUserId(int userId){
        this.userId=userId;
    }
    public void setImageId(int imageId){
        this.imageId=imageId;
    }
}

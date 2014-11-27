package photobomb;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Blob;
import java.sql.Date;

/**
 *
 * @author t00160145
 */
public class User {
    private String username , surname,forename,email,password,gender,frozenaccount;
    private int userid,flagcount;
    private Date date;
    private Blob profilepic;
    
    public User(String username,String surname,String forename,
                        String email,String password,String gender,String frozenaccount,int userid,int flagcount,Date date,Blob profilepic){
        this.userid = userid;
        this.forename=forename;
        this.surname=surname;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.frozenaccount = frozenaccount;
        this.flagcount = flagcount;
        this.username = username;
        this.date =date;
        this.profilepic = profilepic;
        
    }
    public int getUserId(){
        return userid;
    }
    public String getUsername(){
        return username;
    }
    public String getForename(){
        return forename;
    }
    public String getSurname(){
        return surname;
    }
    public String getEmail(){
        return email;
    }
    public String getPasssword(){
        return password;
    }
    public String getGender(){
        return gender;
    }
    public String getFrozenAccount(){
        return frozenaccount;
    }
    public int getFlagCount(){
        return flagcount;
    }
    public Date getDate(){
        return date;
    }
    public Blob getProfilePic(){
        return profilepic;
    }
    public void setUserId(int userid){
        this.userid = userid;
    }
    public void setUsername(String username){
       this.username = username;
    }
    public void setForename(String forename){
        this.forename= forename;
    }
    public void setSurname(String surname){
        this.surname = surname;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPasssword(String password){
        this.password = password;
    }
    public void setGender(String gender){
        this.gender = gender;
    }
    public void setFrozenAccount(String frozenaccount){
        this.frozenaccount = frozenaccount;
    }
    public void setFlagCount(int flagcount){
        this.flagcount = flagcount;
    }
    public void setDate(Date date){
        this.date = date;
    }
    public void setProfilePic(Blob profilepic){
        this.profilepic = profilepic;
    }
    
    
    
}

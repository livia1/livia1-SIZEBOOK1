package ca.ualberta.cs.lonelytwitter;


import java.text.DecimalFormat;
import java.util.Date;
import java.util.zip.CheckedInputStream;

/**
 * Created by livialee on 2017-02-01.
 */

public class Person {
    //Changed all of the floats into strings, if there is no value for the float variables
    //return nothing if there is convert to float and return %.1f
    private String name, date, neck, bust, chest, waist, hip, inseam, comment, size;

    public Person(String Name, String Date, String Neck, String Bust, String Chest, String Waist,
                  String Hip, String Inseam, String Comment) {
        this.setName(Name);
        this.setDate(Date);
        this.setNeck(Neck);
        this.setBust(Bust);
        this.setChest(Chest);
        this.setWaist(Waist);
        this.setHip(Hip);
        this.setInseam(Inseam);
        this.setComment(Comment);


    }
    public void setName(String name) {this.name = name;}
    public String getName() {return name;}

    public void setDate(String date) {this.date = date;}
    public String getDate() {return date;}

    public void setNeck(String neck) {
        if (neck.equals("")){
            this.neck = neck;
        } else {
            DecimalFormat myFormatter = new DecimalFormat("#.0");
            this.neck = myFormatter.format(Float.parseFloat(neck));
        }
    }
    public String getNeck() {return neck;}

    public void setBust(String bust) {
        if (bust.equals("")){
            this.bust = bust;
        } else {
            DecimalFormat myFormatter = new DecimalFormat("#.0");
            this.bust = myFormatter.format(Float.parseFloat(bust));
        }}
    public String getBust() {return bust;}

    public void setChest(String chest) {
        if (chest.equals("")){
            this.chest = chest;
        } else {
            DecimalFormat myFormatter = new DecimalFormat("#.0");
            this.chest = myFormatter.format(Float.parseFloat(chest));;
        }}
    public String getChest() {return chest;}

    public void setWaist(String waist) {
        if (waist.equals("")){
            this.waist = waist;
        } else {
            DecimalFormat myFormatter = new DecimalFormat("#.0");
            this.waist = myFormatter.format(Float.parseFloat(waist));
        }
    }
    public String getWaist() {return waist;}

    public void setHip(String hip) {
        if (hip.equals("")){
            this.hip = hip;
        } else {
            DecimalFormat myFormatter = new DecimalFormat("#.0");
            this.hip = myFormatter.format(Float.parseFloat(hip));
        }}
    public String getHip() {return hip;}

    public void setInseam(String inseam) {
        if (inseam.equals("")){
            this.inseam = inseam;
        } else {
            DecimalFormat myFormatter = new DecimalFormat("#.0");
            this.inseam = myFormatter.format(Float.parseFloat(inseam));
        }
    }
    public String getInseam() {return inseam;}

    public void setComment(String comment) {this.comment = comment;}
    public String getComment() {return comment;}


    @Override
    public String toString() {
        return String.format("Name: %s Date: %s Neck: %s Bust: %s Chest: %s " +
                        "Waist: %s Hip: %s Inseam: %s Comment: %s ",
                name, date, neck, bust, chest, waist, hip, inseam, comment);

    }

}

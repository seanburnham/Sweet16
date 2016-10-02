/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author SeanBurnham
 */
public class Soccer extends Team {
   private String Region;
   private int GB;

    public Soccer() {
    }

    public Soccer(String Region, int GB, String Name, int Wins, int Losses) {
        super(Name, Wins, Losses);
        this.Region = Region;
        this.GB = GB;
    }

    public String getRegion() {
        return Region;
    }

    public void setRegion(String Region) {
        this.Region = Region;
    }

    public int getGB() {
        return GB;
    }

    public void setGB(int GB) {
        this.GB = GB;
    }
    
   
}

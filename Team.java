/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.text.DecimalFormat;
/**
 *
 * @author SeanBurnham
 */
public class Team {
    protected String Name;
    protected int Wins;
    protected int Losses;
    protected double WinLossPct;

    public Team() {
    }

    public Team(String Name) {
        this.Name = Name;
    }

    public Team(String Name, int Wins, int Losses) {
        this.Name = Name;
        this.Wins = Wins;
        this.Losses = Losses;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getWins() {
        return Wins;
    }

    public void setWins(int Wins) {
        this.Wins = Wins;
    }

    public int getLosses() {
        return Losses;
    }

    public void setLosses(int Losses) {
        this.Losses = Losses;
    }

    public double getWinLossPct() {
        return WinLossPct;
    }

    public void setWinLossPct(double WinLossPct) {
        this.WinLossPct = WinLossPct;
    }
    
    public double CalcWinLossPct(int Wins, int Losses)
    {
        DecimalFormat df = new DecimalFormat("#.###");
        this.Wins = Wins;
        this.Losses = Losses;
        
        this.WinLossPct = (double)Wins / (Wins+Losses);
        return this.WinLossPct;
    } 
}

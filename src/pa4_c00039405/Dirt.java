/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pa4_c00039405;

/**
 *
 * @author CodyB
 */
public class Dirt {

    private float sand;
    private float clay;

    public Dirt() {
    }

    public Dirt(float sand, float clay) {
    }

    public float getSand() {
        return this.sand;
    }

    public float getClay() {
        return this.clay;
    }

    public void setSand(float setting) {
        if (setting > 0) {
            this.sand = setting;
        }
    }

    public void setClay(float setting) {
        if (setting > 0) {
            this.clay = setting;
        }
    }

    public float total() {
        float sc = this.sand + this.clay;
        return sc;
    }

    public float perC() {
        float sc = this.sand + this.clay;
        float perc = (this.clay * 100) / sc;
        return perc;
    }

    public float perS() {
        float sc = this.clay + this.sand;
        float pers = (100 * this.sand) / sc;
        return pers;
    }
}

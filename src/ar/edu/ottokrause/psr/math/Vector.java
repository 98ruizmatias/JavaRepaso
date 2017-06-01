package ar.edu.ottokrause.psr.math;

/**
 * Created by pwnd on 31/5/2017.
 */
public class Vector {


    //Vars

    private int index;
    private double[] cordinate = new double[index];


    //Getter stuff

    public double getCordinate(int index){return this.cordinate[index];}


    //Init to 0

    public Vector(int index){
        for (int i = 0; i < index; i++){
            this.cordinate[i] = 0;
        }
    }


    // Getters Stuff

    public Vector(Vector v){
        for (int i = 0; i < this.cordinate.length; i++){
            this.cordinate[i] = v.cordinate[i];
        }
    }


    //Add Vector

    public Vector add(Vector v){
        for (int i = 0; i < this.cordinate.length; i++){
            this.cordinate[i] += v.cordinate[i];
        }
        return this;
    }


    //Prod

    public double prod(Vector v){
        double prod = 0;
        for (int i =0; i < this.cordinate.length; i++){
            prod += this.cordinate[i] * v.cordinate[i];
        }
        return prod;
    }


    //Norm

    public double norm(){
        return Math.sqrt(this.prod(this));
    }



}

package ar.edu.ottokrause.psr.math;

/**
 * Created by pwnd on 31/5/2017.
 */
public class Point {


    //Vars

    private double x;
    private double y;


    //Getters

    public double getX(){return this.x;}
    public double getY(){return this.y;}


    //Init to 0

    public Point(){
        this.x = 0;
        this.y = 0;
    }


    //Point get stufff

    public Point(double x, double y){
        this.x = x;
        this.y = y;
    }

    //Add thisPoint with point

    public Point add(Point p){
        this.x += p.x;
        this.y += p.y;
        return this;
    }

    //Prod

    public double prod(Point v){
        double prod = this.x * v.x + this.y * v.y;
        return prod;
    }


    //Norm

    public double norm(){
        return Math.sqrt(this.prod(this));
    }

}

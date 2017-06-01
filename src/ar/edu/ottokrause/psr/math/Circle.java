package ar.edu.ottokrause.psr.math;

/**
 * Created by pwnd on 31/5/2017.
 */
public class Circle {


    //Vars

    private Point center;
    private Point radius;

    //Getters

    public Point getCenter(){return this.center;}
    public Point getRadius(){return this.radius;}
    public double getLineRadius(Point v1, Point v2){return v2.getX() - v1.getX();}


    //Other get stuff

    public double getArea(){return 3.14 * (getLineRadius(getRadius(),getRadius()) * getLineRadius(getRadius(),getRadius())); }

    public double getPerimeter(){ return 2 * 3.14 * getLineRadius(getRadius(),getCenter());}



}

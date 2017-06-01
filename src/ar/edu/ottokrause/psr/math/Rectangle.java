package ar.edu.ottokrause.psr.math;

/**
 * Created by pwnd on 31/5/2017.
 */
public class Rectangle {


    //Vars

    private Point origin;
    private Point corner;


    //Getters

    public Point getOrigin(){return this.origin;}
    public Point getCorner(){return this.corner;}
    public double getA(){return this.getCorner().getX() - this.getOrigin().getX();}
    public double getB(){return this.getCorner().getY() - this.getCorner().getY();}


    //GetStuff

    public double getArea(){return this.getA() * this.getB();}
    public double getPerimeter(){return 2*(this.getA() + this.getB());}


}


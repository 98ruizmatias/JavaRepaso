package ar.edu.ottokrause.psr.math;

/**
 * Created by pwnd on 31/5/2017.
 */
public class Triangle {

    private Point[] vertices = new Point[3];


    //Getter

    public Point[] getVertices(){return this.vertices;}
    public Point getVertex(int i){return this.vertices[i];}

    public double getA(){ return this.vertices[0].norm() - this.vertices[1].norm();}
    public double getB(){ return this.vertices[0].norm() - this.vertices[2].norm();}
    public double getC(){ return this.vertices[1].norm() - this.vertices[2].norm();}
    public double getH(){return Math.sqrt(3*this.getA()) / 2;}


    //Some stuff

    public double getPerimeter(){return this.getA() + this.getB() + this.getC();}
    public double getArea(){return (this.getB() * this.getH()) / 2;}


}

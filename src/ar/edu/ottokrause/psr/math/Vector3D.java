package ar.edu.ottokrause.psr.math;

/**
 * Created by pwnd on 31/5/2017.
 */
public class Vector3D {


    //Vars

    private double x;
    private double y;
    private double z;


    //Getters stuff

    public double getX(){return this.x;}
    public double getY(){return this.y;}
    public double getZ(){return this.z;}

    //Init 0

    public Vector3D(){
        this.x = 0;
        this.y = 0;
        this.z = 0;
    }


    //Constructor

    public Vector3D(Vector3D v){
        this.x = v.x;
        this.y = v.y;
        this.z = v.z;
    }


    //Add

    public Vector3D add(Vector3D v){
        this.x += v.x;
        this.y += v.y;
        this.z += v.z;
        return this;
    }


    //Product

    public double product(Vector3D v){return (this.x * v.x + this.y * v.y + this.z * v.z);}


    //Norma

    public double norm(){
        return Math.sqrt(this.product(this));
    }

}

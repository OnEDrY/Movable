package com.company;

 class MovableCircle extends MovablePoint implements Moveble {
    private int radius;


    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
        this.radius = radius;
    }
    public MovableCircle()
    {

    }

    public void setRadius(int radius)
    {
        this.radius = radius;
    }

    public int getRadius()
    {
        return radius;
    }

    @Override
    public String toString() {
        return String.format("info : %d, %d, %d, %d, %d", (int)x,(int)y,(int)xSpeed,(int)ySpeed,(int)radius) ;
    }

     @Override
     public void moveUp() {
        this.y = y + 1;
     }

     @Override
     public void moveDown() {
        this.y = y - 1 ;
     }

     @Override
     public void moveRight() {
        this.x = x + 1;
     }


     public void moveLeft() {
        this.x = x - 1;
     }
 }

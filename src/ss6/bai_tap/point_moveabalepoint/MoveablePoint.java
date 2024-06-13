package ss6.bai_tap.point_moveabalepoint;

public class MoveablePoint extends Point {
    private float xSpeed;
    private float ySpeed;
    public MoveablePoint() {}
    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }
    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float [] getSpeed(){
        return new float[]{xSpeed,ySpeed};
    }

    @Override
    public String toString() {
        return "MoveablePoint{" +
                "x = " + super.getX() +
                ", y = " + super.getY() +
                ", xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}';
    }
    public float [] move() {
        float x = super.getX();
        float y = super.getY();
        x += xSpeed;
        y += ySpeed;
        return new float[]{x,y};
    }
}

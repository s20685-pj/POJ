public class Point {

    private int X;
    private int Y;

    public Point(){
        this.X = 320;
        this.Y = 200;
    }

    public Point(int x, int y){
        this.X = x;
        this.Y = y;
    }
    public int getX() {
        return X;
    }

    public void setX(int number) {
        X = number;
    }

    public int getY() {
        return Y;
    }

    public void setY(int number) {
        Y = number;
    }

    public Point getCoordinates(){
        return new Point(this.X, this.Y);
    }
    public void setCoordinates(int x, int y){
        this.X = x;
        this.Y = y;
    }

    public void setCoordinates(Point punkt){
        this.X = punkt.getX();
        this.Y = punkt.getY();
    }
}
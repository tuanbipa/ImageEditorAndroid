package cn.hzw.doodle;

public class DrawPathElement extends DrawExtraElement {
    private String mPen; // 画笔类型
    private String mShape; // 画笔形状
    float size;
    int color;
    float sx;
    float sy;
    float dx;
    float dy;

    public DrawPathElement(String mPen, String mShape, float size, int color, float sx, float sy, float dx, float dy) {
        this.mPen = mPen;
        this.mShape = mShape;
        this.size = size;
        this.color = color;
        this.sx = sx;
        this.sy = sy;
        this.dx = dx;
        this.dy = dy;
        this.setType("shape");
    }

    public String getmPen() {
        return mPen;
    }

    public String getmShape() {
        return mShape;
    }

    public float getSize() {
        return size;
    }

    public int getColor() {
        return color;
    }

    public float getSx() {
        return sx;
    }

    public float getSy() {
        return sy;
    }

    public float getDx() {
        return dx;
    }

    public float getDy() {
        return dy;
    }
}

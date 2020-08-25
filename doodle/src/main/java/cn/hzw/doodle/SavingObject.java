package cn.hzw.doodle;

import java.util.List;

import cn.hzw.doodle.core.IDoodleColor;
import cn.hzw.doodle.core.IDoodleItem;
import cn.hzw.doodle.core.IDoodlePen;
import cn.hzw.doodle.core.IDoodleShape;

public class SavingObject {

    private IDoodlePen mPen; // 画笔类型
    private IDoodleShape mShape; // 画笔形状
    float size;
    int color;
    float sx;
    float sy;
    float dx;
    float dy;

    public SavingObject(IDoodlePen mPen, IDoodleShape mShape, float size, int color, float sx, float sy, float dx, float dy) {
        this.mPen = mPen;
        this.mShape = mShape;
        this.size = size;
        this.color = color;
        this.sx = sx;
        this.sy = sy;
        this.dx = dx;
        this.dy = dy;
    }

    public IDoodlePen getmPen() {
        return mPen;
    }

    public IDoodleShape getmShape() {
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

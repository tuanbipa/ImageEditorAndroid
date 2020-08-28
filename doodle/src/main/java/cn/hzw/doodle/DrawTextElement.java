package cn.hzw.doodle;

import com.google.gson.annotations.SerializedName;

public class DrawTextElement extends DrawExtraElement {
    @SerializedName("text")
    String text;
    @SerializedName("size")
    float size;
    @SerializedName("color")
    int color;
    @SerializedName("x")
    float x;
    @SerializedName("y")
    float y;

    public DrawTextElement(String text, float size, int color, float x, float y) {
        this.text = text;
        this.size = size;
        this.color = color;
        this.x = x;
        this.y = y;
        this.setType("text");
    }

    public String getText() {
        return text;
    }

    public float getSize() {
        return size;
    }

    public int getColor() {
        return color;
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }
}

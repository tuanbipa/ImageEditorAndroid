package cn.hzw.doodle;

import android.graphics.Bitmap;

public class DoodleBitmapJson {
    Bitmap bitmap;
    String json;

    public DoodleBitmapJson(Bitmap bitmap, String json) {
        this.bitmap = bitmap;
        this.json = json;
    }

    public Bitmap getBitmap() {
        return bitmap;
    }

    public String getJson() {
        return json;
    }
}

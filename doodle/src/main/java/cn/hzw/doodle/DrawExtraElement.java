package cn.hzw.doodle;

import com.google.gson.annotations.SerializedName;

public abstract class DrawExtraElement {
    @SerializedName("type")
    String type;

    public void setType(String type) {
        this.type = type;
    }
}

package cn.hzw.doodle;

import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;

import java.lang.reflect.Type;

public class ElementJsonDeserializer implements JsonDeserializer<DrawExtraElement> {
    @Override
    public DrawExtraElement deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        String type = json.getAsJsonObject().get("type").getAsString();
        switch(type) {
            case "shape":
                return context.deserialize(json, DrawPathElement.class);
            case "text":
                return context.deserialize(json, DrawTextElement.class);
            default:
                throw new IllegalArgumentException("Neither path or shape");
        }
    }
}

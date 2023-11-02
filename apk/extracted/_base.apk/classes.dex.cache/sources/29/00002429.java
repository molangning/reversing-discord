package com.facebook.react.bridge;

import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JSONArguments {
    public static ReadableArray fromJSONArray(JSONArray jSONArray) {
        WritableArray createArray = Arguments.createArray();
        for (int i = 0; i < jSONArray.length(); i++) {
            Object obj = jSONArray.get(i);
            if (obj instanceof JSONObject) {
                createArray.pushMap(fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createArray.pushArray(fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                createArray.pushString((String) obj);
            } else if (obj instanceof Boolean) {
                createArray.pushBoolean(((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createArray.pushInt(((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                createArray.pushDouble(((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                createArray.pushInt(((Long) obj).intValue());
            } else if (jSONArray.isNull(i)) {
                createArray.pushNull();
            } else {
                throw new JSONException("Unexpected value when parsing JSON array. index: " + i);
            }
        }
        return createArray;
    }

    public static ReadableArray fromJSONArrayString(String str) {
        return fromJSONArray(new JSONArray(str));
    }

    public static ReadableMap fromJSONObject(JSONObject jSONObject) {
        WritableMap createMap = Arguments.createMap();
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            Object obj = jSONObject.get(next);
            if (obj instanceof JSONObject) {
                createMap.putMap(next, fromJSONObject((JSONObject) obj));
            } else if (obj instanceof JSONArray) {
                createMap.putArray(next, fromJSONArray((JSONArray) obj));
            } else if (obj instanceof String) {
                createMap.putString(next, (String) obj);
            } else if (obj instanceof Boolean) {
                createMap.putBoolean(next, ((Boolean) obj).booleanValue());
            } else if (obj instanceof Integer) {
                createMap.putInt(next, ((Integer) obj).intValue());
            } else if (obj instanceof Double) {
                createMap.putDouble(next, ((Double) obj).doubleValue());
            } else if (obj instanceof Long) {
                createMap.putInt(next, ((Long) obj).intValue());
            } else if (jSONObject.isNull(next)) {
                createMap.putNull(next);
            } else {
                throw new JSONException("Unexpected value when parsing JSON object. key: " + next);
            }
        }
        return createMap;
    }

    public static ReadableMap fromJSONObjectString(String str) {
        return fromJSONObject(new JSONObject(str));
    }
}
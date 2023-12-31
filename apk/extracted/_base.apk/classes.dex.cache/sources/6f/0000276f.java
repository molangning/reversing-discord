package com.facebook.react.util;

import android.util.JsonWriter;
import com.facebook.react.bridge.JsonWriterHelper;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableType;
import java.io.IOException;
import java.io.StringWriter;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ExceptionDataHelper {
    static final String EXTRA_DATA_FIELD = "extraData";

    public static String getExtraDataAsJson(ReadableMap readableMap) {
        if (readableMap != null && readableMap.getType(EXTRA_DATA_FIELD) != ReadableType.Null) {
            try {
                StringWriter stringWriter = new StringWriter();
                JsonWriter jsonWriter = new JsonWriter(stringWriter);
                JsonWriterHelper.value(jsonWriter, readableMap.getDynamic(EXTRA_DATA_FIELD));
                jsonWriter.close();
                stringWriter.close();
                return stringWriter.toString();
            } catch (IOException unused) {
            }
        }
        return null;
    }
}
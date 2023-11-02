package io.sentry.react;

import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.WritableArray;
import com.facebook.react.bridge.WritableMap;
import io.sentry.EnumC8021m4;
import io.sentry.InterfaceC8040o0;
import io.sentry.android.core.C7809t;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;
import java.util.Map;

/* renamed from: io.sentry.react.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8141a {

    /* renamed from: a */
    private static final InterfaceC8040o0 f22046a = new C7809t("RNSentry.MapConverter");

    /* renamed from: a */
    private static void m18438a(WritableArray writableArray, Object obj) {
        if (obj == null) {
            writableArray.pushNull();
        } else if (obj instanceof Boolean) {
            writableArray.pushBoolean(((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            writableArray.pushDouble(((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            writableArray.pushDouble(((Float) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableArray.pushInt(((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            writableArray.pushInt(((Short) obj).intValue());
        } else if (obj instanceof Byte) {
            writableArray.pushInt(((Byte) obj).intValue());
        } else if (obj instanceof Long) {
            writableArray.pushDouble(((Long) obj).doubleValue());
        } else if (obj instanceof BigInteger) {
            writableArray.pushDouble(((BigInteger) obj).doubleValue());
        } else if (obj instanceof BigDecimal) {
            writableArray.pushDouble(((BigDecimal) obj).doubleValue());
        } else if (obj instanceof String) {
            writableArray.pushString((String) obj);
        } else if (obj instanceof ReadableMap) {
            writableArray.pushMap((ReadableMap) obj);
        } else if (obj instanceof ReadableArray) {
            writableArray.pushArray((ReadableArray) obj);
        } else {
            InterfaceC8040o0 interfaceC8040o0 = f22046a;
            EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
            interfaceC8040o0.mo18135c(enumC8021m4, "Could not convert object: " + obj, new Object[0]);
        }
    }

    /* renamed from: b */
    private static void m18437b(WritableMap writableMap, String str, Object obj) {
        if (obj == null) {
            writableMap.putNull(str);
        } else if (obj instanceof Boolean) {
            writableMap.putBoolean(str, ((Boolean) obj).booleanValue());
        } else if (obj instanceof Double) {
            writableMap.putDouble(str, ((Double) obj).doubleValue());
        } else if (obj instanceof Float) {
            writableMap.putDouble(str, ((Float) obj).doubleValue());
        } else if (obj instanceof Integer) {
            writableMap.putInt(str, ((Integer) obj).intValue());
        } else if (obj instanceof Short) {
            writableMap.putInt(str, ((Short) obj).intValue());
        } else if (obj instanceof Byte) {
            writableMap.putInt(str, ((Byte) obj).intValue());
        } else if (obj instanceof Long) {
            writableMap.putDouble(str, ((Long) obj).doubleValue());
        } else if (obj instanceof BigInteger) {
            writableMap.putDouble(str, ((BigInteger) obj).doubleValue());
        } else if (obj instanceof BigDecimal) {
            writableMap.putDouble(str, ((BigDecimal) obj).doubleValue());
        } else if (obj instanceof String) {
            writableMap.putString(str, (String) obj);
        } else if (obj instanceof ReadableArray) {
            writableMap.putArray(str, (ReadableArray) obj);
        } else if (obj instanceof ReadableMap) {
            writableMap.putMap(str, (ReadableMap) obj);
        } else {
            InterfaceC8040o0 interfaceC8040o0 = f22046a;
            EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
            interfaceC8040o0.mo18135c(enumC8021m4, "Could not convert object" + obj, new Object[0]);
        }
    }

    /* renamed from: c */
    public static Object m18436c(Object obj) {
        if (obj instanceof List) {
            WritableArray createArray = Arguments.createArray();
            for (Object obj2 : (List) obj) {
                m18438a(createArray, m18436c(obj2));
            }
            return createArray;
        } else if (obj instanceof Map) {
            WritableMap createMap = Arguments.createMap();
            for (Map.Entry entry : ((Map) obj).entrySet()) {
                Object key = entry.getKey();
                Object value = entry.getValue();
                if (key instanceof String) {
                    m18437b(createMap, (String) key, m18436c(value));
                } else {
                    f22046a.mo18135c(EnumC8021m4.ERROR, "Only String keys are supported in Map.", key);
                }
            }
            return createMap;
        } else if (obj instanceof Byte) {
            return Integer.valueOf(((Byte) obj).byteValue());
        } else {
            if (obj instanceof Short) {
                return Integer.valueOf(((Short) obj).shortValue());
            }
            if (obj instanceof Float) {
                return Double.valueOf(((Float) obj).floatValue());
            }
            if (obj instanceof Long) {
                return Double.valueOf(((Long) obj).longValue());
            }
            if (obj instanceof BigInteger) {
                return Double.valueOf(((BigInteger) obj).doubleValue());
            }
            if (obj instanceof BigDecimal) {
                return Double.valueOf(((BigDecimal) obj).doubleValue());
            }
            if (!(obj instanceof Integer) && !(obj instanceof Double) && !(obj instanceof Boolean) && obj != null && !(obj instanceof String)) {
                InterfaceC8040o0 interfaceC8040o0 = f22046a;
                EnumC8021m4 enumC8021m4 = EnumC8021m4.ERROR;
                interfaceC8040o0.mo18135c(enumC8021m4, "Supplied serialized value could not be converted." + obj, new Object[0]);
                return null;
            }
            return obj;
        }
    }
}
package com.adjust.nativemodule;

import android.net.Uri;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONObject;
import p021b1.C2036g;
import p021b1.C2051j;
import p021b1.C2053k;
import p021b1.C2055l;
import p021b1.C2074o;
import p021b1.C2076p;
import p021b1.InterfaceC2025c0;

/* renamed from: com.adjust.nativemodule.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C2695a {

    /* renamed from: com.adjust.nativemodule.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C2696a {

        /* renamed from: a */
        static final /* synthetic */ int[] f7208a;

        static {
            int[] iArr = new int[ReadableType.values().length];
            f7208a = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f7208a[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f7208a[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f7208a[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                f7208a[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                f7208a[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    /* renamed from: a */
    public static WritableMap m32710a(C2036g c2036g) {
        double d;
        WritableMap createMap = Arguments.createMap();
        if (c2036g == null) {
            return createMap;
        }
        String str = c2036g.f5624j;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        createMap.putString("trackerToken", str);
        String str3 = c2036g.f5625k;
        if (str3 == null) {
            str3 = "";
        }
        createMap.putString("trackerName", str3);
        String str4 = c2036g.f5626l;
        if (str4 == null) {
            str4 = "";
        }
        createMap.putString("network", str4);
        String str5 = c2036g.f5627m;
        if (str5 == null) {
            str5 = "";
        }
        createMap.putString("campaign", str5);
        String str6 = c2036g.f5628n;
        if (str6 == null) {
            str6 = "";
        }
        createMap.putString("adgroup", str6);
        String str7 = c2036g.f5629o;
        if (str7 == null) {
            str7 = "";
        }
        createMap.putString("creative", str7);
        String str8 = c2036g.f5630p;
        if (str8 == null) {
            str8 = "";
        }
        createMap.putString("clickLabel", str8);
        String str9 = c2036g.f5631q;
        if (str9 == null) {
            str9 = "";
        }
        createMap.putString("adid", str9);
        String str10 = c2036g.f5632r;
        if (str10 == null) {
            str10 = "";
        }
        createMap.putString("costType", str10);
        Double d2 = c2036g.f5633s;
        if (d2 != null && !d2.isNaN()) {
            d = c2036g.f5633s.doubleValue();
        } else {
            d = 0.0d;
        }
        createMap.putDouble("costAmount", d);
        String str11 = c2036g.f5634t;
        if (str11 != null) {
            str2 = str11;
        }
        createMap.putString("costCurrency", str2);
        return createMap;
    }

    /* renamed from: b */
    public static WritableMap m32709b(Uri uri) {
        WritableMap createMap = Arguments.createMap();
        if (uri == null) {
            return createMap;
        }
        createMap.putString("uri", uri.toString());
        return createMap;
    }

    /* renamed from: c */
    public static WritableMap m32708c(C2051j c2051j) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (c2051j == null) {
            return createMap;
        }
        String str2 = c2051j.f5706c;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        createMap.putString("message", str2);
        String str4 = c2051j.f5707d;
        if (str4 == null) {
            str4 = "";
        }
        createMap.putString("timestamp", str4);
        String str5 = c2051j.f5705b;
        if (str5 == null) {
            str5 = "";
        }
        createMap.putString("adid", str5);
        String str6 = c2051j.f5708e;
        if (str6 == null) {
            str6 = "";
        }
        createMap.putString("eventToken", str6);
        String str7 = c2051j.f5709f;
        if (str7 == null) {
            str7 = "";
        }
        createMap.putString("callbackId", str7);
        if (c2051j.f5704a) {
            str = "true";
        } else {
            str = "false";
        }
        createMap.putString("willRetry", str);
        JSONObject jSONObject = c2051j.f5710g;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str3);
        return createMap;
    }

    /* renamed from: d */
    public static WritableMap m32707d(C2053k c2053k) {
        WritableMap createMap = Arguments.createMap();
        if (c2053k == null) {
            return createMap;
        }
        String str = c2053k.f5721b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        createMap.putString("message", str);
        String str3 = c2053k.f5722c;
        if (str3 == null) {
            str3 = "";
        }
        createMap.putString("timestamp", str3);
        String str4 = c2053k.f5720a;
        if (str4 == null) {
            str4 = "";
        }
        createMap.putString("adid", str4);
        String str5 = c2053k.f5723d;
        if (str5 == null) {
            str5 = "";
        }
        createMap.putString("eventToken", str5);
        String str6 = c2053k.f5724e;
        if (str6 == null) {
            str6 = "";
        }
        createMap.putString("callbackId", str6);
        JSONObject jSONObject = c2053k.f5725f;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str2);
        return createMap;
    }

    /* renamed from: e */
    public static WritableMap m32706e(C2074o c2074o) {
        String str;
        WritableMap createMap = Arguments.createMap();
        if (c2074o == null) {
            return createMap;
        }
        String str2 = c2074o.f5802c;
        String str3 = "";
        if (str2 == null) {
            str2 = "";
        }
        createMap.putString("message", str2);
        String str4 = c2074o.f5803d;
        if (str4 == null) {
            str4 = "";
        }
        createMap.putString("timestamp", str4);
        String str5 = c2074o.f5801b;
        if (str5 == null) {
            str5 = "";
        }
        createMap.putString("adid", str5);
        if (c2074o.f5800a) {
            str = "true";
        } else {
            str = "false";
        }
        createMap.putString("willRetry", str);
        JSONObject jSONObject = c2074o.f5804e;
        if (jSONObject != null) {
            str3 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str3);
        return createMap;
    }

    /* renamed from: f */
    public static WritableMap m32705f(C2076p c2076p) {
        WritableMap createMap = Arguments.createMap();
        if (c2076p == null) {
            return createMap;
        }
        String str = c2076p.f5806b;
        String str2 = "";
        if (str == null) {
            str = "";
        }
        createMap.putString("message", str);
        String str3 = c2076p.f5807c;
        if (str3 == null) {
            str3 = "";
        }
        createMap.putString("timestamp", str3);
        String str4 = c2076p.f5805a;
        if (str4 == null) {
            str4 = "";
        }
        createMap.putString("adid", str4);
        JSONObject jSONObject = c2076p.f5808d;
        if (jSONObject != null) {
            str2 = jSONObject.toString();
        }
        createMap.putString("jsonResponse", str2);
        return createMap;
    }

    /* renamed from: g */
    public static List<Object> m32704g(ReadableArray readableArray) {
        if (readableArray == null) {
            return null;
        }
        List<Object> arrayList = new ArrayList<>(readableArray.size());
        for (int i = 0; i < readableArray.size(); i++) {
            switch (C2696a.f7208a[readableArray.getType(i).ordinal()]) {
                case 1:
                    break;
                case 2:
                    arrayList.add(Boolean.valueOf(readableArray.getBoolean(i)));
                    break;
                case 3:
                    double d = readableArray.getDouble(i);
                    int i2 = (int) d;
                    if (d == i2) {
                        arrayList.add(Integer.valueOf(i2));
                        break;
                    } else {
                        arrayList.add(Double.valueOf(d));
                        break;
                    }
                case 4:
                    arrayList.add(readableArray.getString(i));
                    break;
                case 5:
                    arrayList.add(m32703h(readableArray.getMap(i)));
                    break;
                case 6:
                    arrayList = m32704g(readableArray.getArray(i));
                    break;
                default:
                    C2055l.m34422j().mo34444b("Could not convert object with index: " + i + ".", new Object[0]);
                    break;
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public static Map<String, Object> m32703h(ReadableMap readableMap) {
        if (readableMap == null) {
            return null;
        }
        ReadableMapKeySetIterator keySetIterator = readableMap.keySetIterator();
        if (!keySetIterator.hasNextKey()) {
            return null;
        }
        HashMap hashMap = new HashMap();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            String obj = m32702i(readableMap, nextKey).toString();
            if (obj == null) {
                InterfaceC2025c0 m34422j = C2055l.m34422j();
                m34422j.mo34445a("Null parameter inside key-value pair with key: " + nextKey, new Object[0]);
            } else {
                hashMap.put(nextKey, obj);
            }
        }
        return hashMap;
    }

    /* renamed from: i */
    private static Object m32702i(ReadableMap readableMap, String str) {
        if (readableMap == null) {
            return null;
        }
        switch (C2696a.f7208a[readableMap.getType(str).ordinal()]) {
            case 1:
                return null;
            case 2:
                return Boolean.valueOf(readableMap.getBoolean(str));
            case 3:
                double d = readableMap.getDouble(str);
                int i = (int) d;
                if (d == i) {
                    return Integer.valueOf(i);
                }
                return Double.valueOf(d);
            case 4:
                return readableMap.getString(str);
            case 5:
                return m32703h(readableMap.getMap(str));
            case 6:
                return m32704g(readableMap.getArray(str));
            default:
                InterfaceC2025c0 m34422j = C2055l.m34422j();
                m34422j.mo34444b("Could not convert object with key: " + str + ".", new Object[0]);
                return null;
        }
    }
}
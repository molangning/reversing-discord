package com.discord.react.utilities;

import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableNativeArray;
import com.facebook.react.bridge.ReadableType;
import com.facebook.react.bridge.WritableNativeArray;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import org.json.JSONArray;

@Metadata(m14358d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0015\n\u0002\u0010\u001e\n\u0000\n\u0002\u0010$\n\u0000\u001a#\u0010\u0000\u001a\u00020\u00012\u0016\u0010\u0002\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u00040\u0003\"\u0004\u0018\u00010\u0004¢\u0006\u0002\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00020\u0007\"\u0004\b\u0000\u0010\b*\u00020\t2\u0006\u0010\n\u001a\u0002H\b¢\u0006\u0002\u0010\u000b\u001a\n\u0010\f\u001a\u00020\r*\u00020\u000e\u001a\n\u0010\u000f\u001a\u00020\u0010*\u00020\u000e\u001a\n\u0010\u0011\u001a\u00020\u0012*\u00020\u000e\u001a\u001b\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0003¢\u0006\u0002\u0010\u0005\u001a\n\u0010\u0013\u001a\u00020\u0001*\u00020\u0015\u001a\u0016\u0010\u0013\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0014*\b\u0012\u0004\u0012\u0002H\u00140\u0016\u001a\"\u0010\u0017\u001a\u00020\u0001\"\u0004\b\u0000\u0010\b*\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u0002H\b0\u00180\u0016¨\u0006\u0019"}, m14357d2 = {"nativeArrayOf", "Lcom/facebook/react/bridge/ReadableNativeArray;", "elements", "", "", "([Ljava/lang/Object;)Lcom/facebook/react/bridge/ReadableNativeArray;", "push", "", "V", "Lcom/facebook/react/bridge/WritableNativeArray;", "value", "(Lcom/facebook/react/bridge/WritableNativeArray;Ljava/lang/Object;)V", "sizeRange", "Lkotlin/ranges/IntRange;", "Lcom/facebook/react/bridge/ReadableArray;", "toJson", "Lorg/json/JSONArray;", "toJsonString", "", "toNativeArray", "T", "", "", "toNativeArrayOfMaps", "", "react_utilities_release"}, m14356k = 2, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public final class NativeArrayExtensionsKt {

    @Metadata(m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final ReadableNativeArray nativeArrayOf(Object... elements) {
        C9612q.m13917h(elements, "elements");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (Object obj : elements) {
            push(writableNativeArray, obj);
        }
        return writableNativeArray;
    }

    public static final <V> void push(WritableNativeArray writableNativeArray, V v) {
        boolean z;
        C9612q.m13917h(writableNativeArray, "<this>");
        if (v instanceof String) {
            writableNativeArray.pushString((String) v);
        } else if (v instanceof Integer) {
            writableNativeArray.pushInt(((Number) v).intValue());
        } else if (v instanceof Double) {
            writableNativeArray.pushDouble(((Number) v).doubleValue());
        } else if (v instanceof Boolean) {
            writableNativeArray.pushBoolean(((Boolean) v).booleanValue());
        } else if (v instanceof ReadableArray) {
            writableNativeArray.pushArray((ReadableArray) v);
        } else if (v instanceof ReadableMap) {
            writableNativeArray.pushMap((ReadableMap) v);
        } else if (v instanceof Long) {
            writableNativeArray.pushDouble(((Number) v).longValue());
        } else {
            if (v == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                writableNativeArray.pushNull();
                return;
            }
            throw new IllegalArgumentException("Failed requirement.".toString());
        }
    }

    public static final IntRange sizeRange(ReadableArray readableArray) {
        IntRange m21916q;
        C9612q.m13917h(readableArray, "<this>");
        m21916q = C6759j.m21916q(0, readableArray.size());
        return m21916q;
    }

    public static final JSONArray toJson(ReadableArray readableArray) {
        C9612q.m13917h(readableArray, "<this>");
        JSONArray jSONArray = new JSONArray();
        int size = readableArray.size();
        for (int i = 0; i < size; i++) {
            int i2 = WhenMappings.$EnumSwitchMapping$0[readableArray.getType(i).ordinal()];
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            if (i2 == 6) {
                                ReadableArray array = readableArray.getArray(i);
                                C9612q.m13918g(array, "getArray(i)");
                                jSONArray.put(toJson(array));
                            }
                        } else {
                            ReadableMap map = readableArray.getMap(i);
                            C9612q.m13918g(map, "getMap(i)");
                            jSONArray.put(NativeMapExtensionsKt.toJson(map));
                        }
                    } else {
                        jSONArray.put(readableArray.getString(i));
                    }
                } else {
                    jSONArray.put(readableArray.getDouble(i));
                }
            } else {
                jSONArray.put(readableArray.getBoolean(i));
            }
        }
        return jSONArray;
    }

    public static final String toJsonString(ReadableArray readableArray) {
        C9612q.m13917h(readableArray, "<this>");
        String jSONArray = toJson(readableArray).toString();
        C9612q.m13918g(jSONArray, "toJson().toString()");
        return jSONArray;
    }

    public static final <T> ReadableNativeArray toNativeArray(Collection<? extends T> collection) {
        C9612q.m13917h(collection, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (T t : collection) {
            push(writableNativeArray, t);
        }
        return writableNativeArray;
    }

    public static final <V> ReadableNativeArray toNativeArrayOfMaps(Collection<? extends Map<String, ? extends V>> collection) {
        int m14093t;
        C9612q.m13917h(collection, "<this>");
        m14093t = C9546k.m14093t(collection, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            arrayList.add(NativeMapExtensionsKt.toNativeMap((Map) it.next()));
        }
        return toNativeArray(arrayList);
    }

    public static final <T> ReadableNativeArray toNativeArray(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (T t : tArr) {
            push(writableNativeArray, t);
        }
        return writableNativeArray;
    }

    public static final ReadableNativeArray toNativeArray(int[] iArr) {
        C9612q.m13917h(iArr, "<this>");
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (int i : iArr) {
            push(writableNativeArray, Integer.valueOf(i));
        }
        return writableNativeArray;
    }
}
package com.discord.react_resource_cache;

import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.WritableNativeArray;
import java.lang.Enum;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\f\b\u0000\u0010\u0001*\u0006\u0012\u0002\b\u00030\u00022\u00020\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bH&J\u0013\u0010\t\u001a\b\u0012\u0004\u0012\u00028\u00000\nH&¢\u0006\u0002\u0010\u000bJ\u0006\u0010\f\u001a\u00020\rJ*\u0010\u000e\u001a\u001e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000fj\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0010`\u00112\u0006\u0010\u0012\u001a\u00020\u0013¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/react_resource_cache/ReactResourceModule;", "T", "", "Lcom/facebook/react/bridge/ReactContextBaseJavaModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "cache", "Lcom/discord/react_resource_cache/ReactResourceCache;", "keys", "", "()[Ljava/lang/Enum;", "keysArray", "Lcom/facebook/react/bridge/WritableNativeArray;", "reactResources", "Ljava/util/HashMap;", "", "Lkotlin/collections/HashMap;", "values", "Lcom/facebook/react/bridge/ReadableArray;", "react_resource_cache_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes4.dex */
public abstract class ReactResourceModule<T extends Enum<?>> extends ReactContextBaseJavaModule {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReactResourceModule(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    public abstract ReactResourceCache<T> cache();

    public abstract T[] keys();

    public final WritableNativeArray keysArray() {
        WritableNativeArray writableNativeArray = new WritableNativeArray();
        for (T t : keys()) {
            writableNativeArray.pushString(t.name());
        }
        return writableNativeArray;
    }

    public final HashMap<String, String> reactResources(ReadableArray values) {
        C9612q.m13917h(values, "values");
        HashMap<String, String> hashMap = new HashMap<>(values.size());
        T[] keys = keys();
        int length = keys.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int i3 = i2 + 1;
            String name = keys[i].name();
            String string = values.getString(i2);
            C9612q.m13918g(string, "values.getString(index)");
            hashMap.put(name, string);
            i++;
            i2 = i3;
        }
        return hashMap;
    }
}
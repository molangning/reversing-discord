package com.facebook.react.bridge;

import com.facebook.jni.HybridData;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import p058d5.C5743a;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReadableNativeMap extends NativeMap implements ReadableMap {
    private static int mJniCallCounter;
    private String[] mKeys;
    private HashMap<String, Object> mLocalMap;
    private HashMap<String, ReadableType> mLocalTypeMap;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.facebook.react.bridge.ReadableNativeMap$3 */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C39933 {
        static final /* synthetic */ int[] $SwitchMap$com$facebook$react$bridge$ReadableType;

        static {
            int[] iArr = new int[ReadableType.values().length];
            $SwitchMap$com$facebook$react$bridge$ReadableType = iArr;
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$facebook$react$bridge$ReadableType[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
        }
    }

    static {
        ReactBridge.staticInit();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public ReadableNativeMap(HybridData hybridData) {
        super(hybridData);
    }

    private void checkInstance(String str, Object obj, Class cls) {
        if (obj != null && !cls.isInstance(obj)) {
            throw new UnexpectedNativeTypeException("Value for " + str + " cannot be cast from " + obj.getClass().getSimpleName() + " to " + cls.getSimpleName());
        }
    }

    private void ensureKeysAreImported() {
        if (this.mKeys != null) {
            return;
        }
        synchronized (this) {
            this.mKeys = (String[]) C5743a.m24583c(importKeys());
            mJniCallCounter++;
        }
    }

    public static int getJNIPassCounter() {
        return mJniCallCounter;
    }

    private HashMap<String, Object> getLocalMap() {
        HashMap<String, Object> hashMap = this.mLocalMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            ensureKeysAreImported();
            if (this.mLocalMap == null) {
                Object[] objArr = (Object[]) C5743a.m24583c(importValues());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalMap.put(this.mKeys[i], objArr[i]);
                }
            }
        }
        return this.mLocalMap;
    }

    private HashMap<String, ReadableType> getLocalTypeMap() {
        HashMap<String, ReadableType> hashMap = this.mLocalTypeMap;
        if (hashMap != null) {
            return hashMap;
        }
        synchronized (this) {
            ensureKeysAreImported();
            if (this.mLocalTypeMap == null) {
                Object[] objArr = (Object[]) C5743a.m24583c(importTypes());
                mJniCallCounter++;
                int length = this.mKeys.length;
                this.mLocalTypeMap = new HashMap<>(length);
                for (int i = 0; i < length; i++) {
                    this.mLocalTypeMap.put(this.mKeys[i], (ReadableType) objArr[i]);
                }
            }
        }
        return this.mLocalTypeMap;
    }

    private Object getNullableValue(String str) {
        if (hasKey(str)) {
            return getLocalMap().get(str);
        }
        return null;
    }

    private Object getValue(String str) {
        if (hasKey(str) && !isNull(str)) {
            return C5743a.m24583c(getLocalMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    private native String[] importKeys();

    private native Object[] importTypes();

    private native Object[] importValues();

    public boolean equals(Object obj) {
        if (!(obj instanceof ReadableNativeMap)) {
            return false;
        }
        return getLocalMap().equals(((ReadableNativeMap) obj).getLocalMap());
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableArray getArray(String str) {
        return (ReadableArray) getNullableValue(str, ReadableArray.class);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean getBoolean(String str) {
        return ((Boolean) getValue(str, Boolean.class)).booleanValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public double getDouble(String str) {
        return ((Double) getValue(str, Double.class)).doubleValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Dynamic getDynamic(String str) {
        return DynamicFromMap.create(this, str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public Iterator<Map.Entry<String, Object>> getEntryIterator() {
        Iterator<Map.Entry<String, Object>> it;
        synchronized (this) {
            ensureKeysAreImported();
            final String[] strArr = this.mKeys;
            final Object[] objArr = (Object[]) C5743a.m24583c(importValues());
            mJniCallCounter++;
            it = new Iterator<Map.Entry<String, Object>>() { // from class: com.facebook.react.bridge.ReadableNativeMap.1
                int currentIndex = 0;

                @Override // java.util.Iterator
                public boolean hasNext() {
                    return this.currentIndex < strArr.length;
                }

                @Override // java.util.Iterator
                public Map.Entry<String, Object> next() {
                    final int i = this.currentIndex;
                    this.currentIndex = i + 1;
                    return new Map.Entry<String, Object>() { // from class: com.facebook.react.bridge.ReadableNativeMap.1.1
                        @Override // java.util.Map.Entry
                        public Object getValue() {
                            return objArr[i];
                        }

                        @Override // java.util.Map.Entry
                        public Object setValue(Object obj) {
                            throw new UnsupportedOperationException("Can't set a value while iterating over a ReadableNativeMap");
                        }

                        @Override // java.util.Map.Entry
                        public String getKey() {
                            return strArr[i];
                        }
                    };
                }
            };
        }
        return it;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public int getInt(String str) {
        return ((Double) getValue(str, Double.class)).intValue();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public String getString(String str) {
        return (String) getNullableValue(str, String.class);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableType getType(String str) {
        if (getLocalTypeMap().containsKey(str)) {
            return (ReadableType) C5743a.m24583c(getLocalTypeMap().get(str));
        }
        throw new NoSuchKeyException(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean hasKey(String str) {
        return getLocalMap().containsKey(str);
    }

    public int hashCode() {
        return getLocalMap().hashCode();
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public boolean isNull(String str) {
        if (getLocalMap().containsKey(str)) {
            if (getLocalMap().get(str) == null) {
                return true;
            }
            return false;
        }
        throw new NoSuchKeyException(str);
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableMapKeySetIterator keySetIterator() {
        ensureKeysAreImported();
        final String[] strArr = this.mKeys;
        return new ReadableMapKeySetIterator() { // from class: com.facebook.react.bridge.ReadableNativeMap.2
            int currentIndex = 0;

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public boolean hasNextKey() {
                return this.currentIndex < strArr.length;
            }

            @Override // com.facebook.react.bridge.ReadableMapKeySetIterator
            public String nextKey() {
                String[] strArr2 = strArr;
                int i = this.currentIndex;
                this.currentIndex = i + 1;
                return strArr2[i];
            }
        };
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public HashMap<String, Object> toHashMap() {
        HashMap<String, Object> hashMap = new HashMap<>(getLocalMap());
        for (String str : hashMap.keySet()) {
            switch (C39933.$SwitchMap$com$facebook$react$bridge$ReadableType[getType(str).ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    break;
                case 5:
                    hashMap.put(str, ((ReadableNativeMap) C5743a.m24583c(getMap(str))).toHashMap());
                    break;
                case 6:
                    hashMap.put(str, ((ReadableArray) C5743a.m24583c(getArray(str))).toArrayList());
                    break;
                default:
                    throw new IllegalArgumentException("Could not convert object with key: " + str + ".");
            }
        }
        return hashMap;
    }

    @Override // com.facebook.react.bridge.ReadableMap
    public ReadableNativeMap getMap(String str) {
        return (ReadableNativeMap) getNullableValue(str, ReadableNativeMap.class);
    }

    private <T> T getNullableValue(String str, Class<T> cls) {
        T t = (T) getNullableValue(str);
        checkInstance(str, t, cls);
        return t;
    }

    private <T> T getValue(String str, Class<T> cls) {
        T t = (T) getValue(str);
        checkInstance(str, t, cls);
        return t;
    }
}

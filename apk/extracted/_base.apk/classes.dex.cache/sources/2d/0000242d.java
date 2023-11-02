package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import p058d5.C5743a;
import p127h3.C6889c;
import p148i3.C7380a;
import p150i5.C7384b;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JavaMethodWrapper implements NativeModule.NativeMethod {
    private ArgumentExtractor[] mArgumentExtractors;
    private Object[] mArguments;
    private boolean mArgumentsProcessed = false;
    private int mJSArgumentsNeeded;
    private final Method mMethod;
    private final JavaModuleWrapper mModuleWrapper;
    private final int mParamLength;
    private final Class[] mParameterTypes;
    private String mSignature;
    private String mType;
    private static final ArgumentExtractor<Boolean> ARGUMENT_EXTRACTOR_BOOLEAN = new ArgumentExtractor<Boolean>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.1
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Boolean extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Boolean.valueOf(readableArray.getBoolean(i));
        }
    };
    private static final ArgumentExtractor<Double> ARGUMENT_EXTRACTOR_DOUBLE = new ArgumentExtractor<Double>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.2
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Double extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Double.valueOf(readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Float> ARGUMENT_EXTRACTOR_FLOAT = new ArgumentExtractor<Float>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.3
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Float extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Float.valueOf((float) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Integer> ARGUMENT_EXTRACTOR_INTEGER = new ArgumentExtractor<Integer>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.4
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Integer extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return Integer.valueOf((int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<String> ARGUMENT_EXTRACTOR_STRING = new ArgumentExtractor<String>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.5
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public String extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getString(i);
        }
    };
    private static final ArgumentExtractor<ReadableArray> ARGUMENT_EXTRACTOR_ARRAY = new ArgumentExtractor<ReadableArray>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.6
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableArray extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getArray(i);
        }
    };
    private static final ArgumentExtractor<Dynamic> ARGUMENT_EXTRACTOR_DYNAMIC = new ArgumentExtractor<Dynamic>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.7
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Dynamic extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return DynamicFromArray.create(readableArray, i);
        }
    };
    private static final ArgumentExtractor<ReadableMap> ARGUMENT_EXTRACTOR_MAP = new ArgumentExtractor<ReadableMap>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.8
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public ReadableMap extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return readableArray.getMap(i);
        }
    };
    private static final ArgumentExtractor<Callback> ARGUMENT_EXTRACTOR_CALLBACK = new ArgumentExtractor<Callback>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.9
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Callback extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            if (readableArray.isNull(i)) {
                return null;
            }
            return new CallbackImpl(jSInstance, (int) readableArray.getDouble(i));
        }
    };
    private static final ArgumentExtractor<Promise> ARGUMENT_EXTRACTOR_PROMISE = new ArgumentExtractor<Promise>() { // from class: com.facebook.react.bridge.JavaMethodWrapper.10
        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public int getJSArgumentsNeeded() {
            return 2;
        }

        @Override // com.facebook.react.bridge.JavaMethodWrapper.ArgumentExtractor
        public Promise extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i) {
            return new PromiseImpl((Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i), (Callback) JavaMethodWrapper.ARGUMENT_EXTRACTOR_CALLBACK.extractArgument(jSInstance, readableArray, i + 1));
        }
    };
    private static final boolean DEBUG = C6889c.m21705a().mo21707b(C7380a.f19862d);

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static abstract class ArgumentExtractor<T> {
        private ArgumentExtractor() {
        }

        public abstract T extractArgument(JSInstance jSInstance, ReadableArray readableArray, int i);

        public int getJSArgumentsNeeded() {
            return 1;
        }
    }

    public JavaMethodWrapper(JavaModuleWrapper javaModuleWrapper, Method method, boolean z) {
        this.mType = BaseJavaModule.METHOD_TYPE_ASYNC;
        this.mModuleWrapper = javaModuleWrapper;
        this.mMethod = method;
        method.setAccessible(true);
        Class<?>[] parameterTypes = method.getParameterTypes();
        this.mParameterTypes = parameterTypes;
        int length = parameterTypes.length;
        this.mParamLength = length;
        if (z) {
            this.mType = BaseJavaModule.METHOD_TYPE_SYNC;
        } else if (length > 0 && parameterTypes[length - 1] == Promise.class) {
            this.mType = BaseJavaModule.METHOD_TYPE_PROMISE;
        }
    }

    private ArgumentExtractor[] buildArgumentExtractors(Class[] clsArr) {
        ArgumentExtractor[] argumentExtractorArr = new ArgumentExtractor[clsArr.length];
        for (int i = 0; i < clsArr.length; i += argumentExtractorArr[i].getJSArgumentsNeeded()) {
            Class cls = clsArr[i];
            if (cls != Boolean.class && cls != Boolean.TYPE) {
                if (cls != Integer.class && cls != Integer.TYPE) {
                    if (cls != Double.class && cls != Double.TYPE) {
                        if (cls != Float.class && cls != Float.TYPE) {
                            if (cls == String.class) {
                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_STRING;
                            } else if (cls == Callback.class) {
                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_CALLBACK;
                            } else if (cls == Promise.class) {
                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_PROMISE;
                                boolean z = true;
                                if (i != clsArr.length - 1) {
                                    z = false;
                                }
                                C5743a.m24584b(z, "Promise must be used as last parameter only");
                            } else if (cls == ReadableMap.class) {
                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_MAP;
                            } else if (cls == ReadableArray.class) {
                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_ARRAY;
                            } else if (cls == Dynamic.class) {
                                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DYNAMIC;
                            } else {
                                throw new RuntimeException("Got unknown argument class: " + cls.getSimpleName());
                            }
                        } else {
                            argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_FLOAT;
                        }
                    } else {
                        argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_DOUBLE;
                    }
                } else {
                    argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_INTEGER;
                }
            } else {
                argumentExtractorArr[i] = ARGUMENT_EXTRACTOR_BOOLEAN;
            }
        }
        return argumentExtractorArr;
    }

    private String buildSignature(Method method, Class[] clsArr, boolean z) {
        StringBuilder sb2 = new StringBuilder(clsArr.length + 2);
        if (z) {
            sb2.append(returnTypeToChar(method.getReturnType()));
            sb2.append('.');
        } else {
            sb2.append("v.");
        }
        for (int i = 0; i < clsArr.length; i++) {
            Class cls = clsArr[i];
            if (cls == Promise.class) {
                boolean z2 = true;
                if (i != clsArr.length - 1) {
                    z2 = false;
                }
                C5743a.m24584b(z2, "Promise must be used as last parameter only");
            }
            sb2.append(paramTypeToChar(cls));
        }
        return sb2.toString();
    }

    private int calculateJSArgumentsNeeded() {
        int i = 0;
        for (ArgumentExtractor argumentExtractor : (ArgumentExtractor[]) C5743a.m24583c(this.mArgumentExtractors)) {
            i += argumentExtractor.getJSArgumentsNeeded();
        }
        return i;
    }

    private static char commonTypeToChar(Class cls) {
        if (cls == Boolean.TYPE) {
            return 'z';
        }
        if (cls == Boolean.class) {
            return 'Z';
        }
        if (cls == Integer.TYPE) {
            return 'i';
        }
        if (cls == Integer.class) {
            return 'I';
        }
        if (cls == Double.TYPE) {
            return 'd';
        }
        if (cls == Double.class) {
            return 'D';
        }
        if (cls == Float.TYPE) {
            return 'f';
        }
        if (cls == Float.class) {
            return 'F';
        }
        if (cls == String.class) {
            return 'S';
        }
        return (char) 0;
    }

    private static String createInvokeExceptionMessage(String str) {
        return "Could not invoke " + str;
    }

    private String getAffectedRange(int i, int i2) {
        if (i2 > 1) {
            return "" + i + "-" + ((i + i2) - 1);
        }
        return "" + i;
    }

    private static char paramTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Callback.class) {
            return 'X';
        }
        if (cls == Promise.class) {
            return 'P';
        }
        if (cls == ReadableMap.class) {
            return 'M';
        }
        if (cls == ReadableArray.class) {
            return 'A';
        }
        if (cls == Dynamic.class) {
            return 'Y';
        }
        throw new RuntimeException("Got unknown param class: " + cls.getSimpleName());
    }

    private void processArguments() {
        if (this.mArgumentsProcessed) {
            return;
        }
        C7384b.AbstractC7385a m20802a = C7384b.m20802a(0L, "processArguments");
        m20802a.mo20799b("method", this.mModuleWrapper.getName() + "." + this.mMethod.getName()).mo20798c();
        try {
            this.mArgumentsProcessed = true;
            this.mArgumentExtractors = buildArgumentExtractors(this.mParameterTypes);
            this.mSignature = buildSignature(this.mMethod, this.mParameterTypes, this.mType.equals(BaseJavaModule.METHOD_TYPE_SYNC));
            this.mArguments = new Object[this.mParameterTypes.length];
            this.mJSArgumentsNeeded = calculateJSArgumentsNeeded();
        } finally {
            C7384b.m20801b(0L).mo20798c();
        }
    }

    private static char returnTypeToChar(Class cls) {
        char commonTypeToChar = commonTypeToChar(cls);
        if (commonTypeToChar != 0) {
            return commonTypeToChar;
        }
        if (cls == Void.TYPE) {
            return 'v';
        }
        if (cls == WritableMap.class) {
            return 'M';
        }
        if (cls == WritableArray.class) {
            return 'A';
        }
        throw new RuntimeException("Got unknown return class: " + cls.getSimpleName());
    }

    public Method getMethod() {
        return this.mMethod;
    }

    public String getSignature() {
        if (!this.mArgumentsProcessed) {
            processArguments();
        }
        return (String) C5743a.m24583c(this.mSignature);
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public String getType() {
        return this.mType;
    }

    @Override // com.facebook.react.bridge.NativeModule.NativeMethod
    public void invoke(JSInstance jSInstance, ReadableArray readableArray) {
        String str = this.mModuleWrapper.getName() + "." + this.mMethod.getName();
        C7384b.m20802a(0L, "callJavaModuleMethod").mo20799b("method", str).mo20798c();
        int i = 0;
        if (DEBUG) {
            C6889c.m21705a().mo21708a(C7380a.f19862d, "JS->Java: %s.%s()", this.mModuleWrapper.getName(), this.mMethod.getName());
        }
        try {
            if (!this.mArgumentsProcessed) {
                processArguments();
            }
            if (this.mArguments != null && this.mArgumentExtractors != null) {
                if (this.mJSArgumentsNeeded == readableArray.size()) {
                    int i2 = 0;
                    while (true) {
                        try {
                            ArgumentExtractor[] argumentExtractorArr = this.mArgumentExtractors;
                            if (i < argumentExtractorArr.length) {
                                this.mArguments[i] = argumentExtractorArr[i].extractArgument(jSInstance, readableArray, i2);
                                i2 += this.mArgumentExtractors[i].getJSArgumentsNeeded();
                                i++;
                            } else {
                                try {
                                    this.mMethod.invoke(this.mModuleWrapper.getModule(), this.mArguments);
                                    return;
                                } catch (IllegalAccessException e) {
                                    e = e;
                                    throw new RuntimeException(createInvokeExceptionMessage(str), e);
                                } catch (IllegalArgumentException e2) {
                                    e = e2;
                                    throw new RuntimeException(createInvokeExceptionMessage(str), e);
                                } catch (InvocationTargetException e3) {
                                    if (e3.getCause() instanceof RuntimeException) {
                                        throw ((RuntimeException) e3.getCause());
                                    }
                                    throw new RuntimeException(createInvokeExceptionMessage(str), e3);
                                }
                            }
                        } catch (UnexpectedNativeTypeException e4) {
                            e = e4;
                            throw new NativeArgumentsParseException(e.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i2, this.mArgumentExtractors[i].getJSArgumentsNeeded()) + ")", e);
                        } catch (NullPointerException e5) {
                            e = e5;
                            throw new NativeArgumentsParseException(e.getMessage() + " (constructing arguments for " + str + " at argument index " + getAffectedRange(i2, this.mArgumentExtractors[i].getJSArgumentsNeeded()) + ")", e);
                        }
                    }
                } else {
                    throw new NativeArgumentsParseException(str + " got " + readableArray.size() + " arguments, expected " + this.mJSArgumentsNeeded);
                }
            } else {
                throw new Error("processArguments failed");
            }
        } finally {
            C7384b.m20801b(0L).mo20798c();
        }
    }
}
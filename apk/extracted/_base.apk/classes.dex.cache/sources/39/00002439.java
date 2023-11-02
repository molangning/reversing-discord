package com.facebook.react.bridge;

import com.facebook.react.bridge.NativeModule;
import com.facebook.react.config.ReactFeatureFlags;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import p077e5.InterfaceC6107a;
import p150i5.C7382a;
import p150i5.C7384b;

@InterfaceC6107a
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class JavaModuleWrapper {
    private static final String TAG = "JavaModuleWrapper";
    private final JSInstance mJSInstance;
    private final ModuleHolder mModuleHolder;
    private final ArrayList<NativeModule.NativeMethod> mMethods = new ArrayList<>();
    private final ArrayList<MethodDescriptor> mDescs = new ArrayList<>();

    @InterfaceC6107a
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class MethodDescriptor {
        @InterfaceC6107a
        Method method;
        @InterfaceC6107a
        String name;
        @InterfaceC6107a
        String signature;
        @InterfaceC6107a
        String type;

        public MethodDescriptor() {
            JavaModuleWrapper.this = r1;
        }
    }

    public JavaModuleWrapper(JSInstance jSInstance, ModuleHolder moduleHolder) {
        this.mJSInstance = jSInstance;
        this.mModuleHolder = moduleHolder;
    }

    @InterfaceC6107a
    private void findMethods() {
        Method[] declaredMethods;
        C7382a.m20813c(0L, "findMethods");
        HashSet hashSet = new HashSet();
        Class<?> cls = this.mModuleHolder.getModule().getClass();
        Class<? super Object> superclass = cls.getSuperclass();
        if (ReactModuleWithSpec.class.isAssignableFrom(superclass)) {
            cls = superclass;
        }
        for (Method method : cls.getDeclaredMethods()) {
            ReactMethod reactMethod = (ReactMethod) method.getAnnotation(ReactMethod.class);
            if (reactMethod != null) {
                String name = method.getName();
                if (!hashSet.contains(name)) {
                    MethodDescriptor methodDescriptor = new MethodDescriptor();
                    JavaMethodWrapper javaMethodWrapper = new JavaMethodWrapper(this, method, reactMethod.isBlockingSynchronousMethod());
                    methodDescriptor.name = name;
                    String type = javaMethodWrapper.getType();
                    methodDescriptor.type = type;
                    if (type == BaseJavaModule.METHOD_TYPE_SYNC) {
                        methodDescriptor.signature = javaMethodWrapper.getSignature();
                        methodDescriptor.method = method;
                    }
                    this.mMethods.add(javaMethodWrapper);
                    this.mDescs.add(methodDescriptor);
                } else {
                    throw new IllegalArgumentException("Java Module " + getName() + " method name already registered: " + name);
                }
            }
        }
        C7382a.m20809g(0L);
    }

    @InterfaceC6107a
    public NativeMap getConstants() {
        if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Calling getConstants() on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
        }
        if (!this.mModuleHolder.getHasConstants()) {
            return null;
        }
        String name = getName();
        C7384b.m20802a(0L, "JavaModuleWrapper.getConstants").mo20799b("moduleName", name).mo20798c();
        ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_START, name);
        BaseJavaModule module = getModule();
        C7382a.m20813c(0L, "module.getConstants");
        Map<String, Object> constants = module.getConstants();
        C7382a.m20809g(0L);
        C7382a.m20813c(0L, "create WritableNativeMap");
        ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_START, name);
        try {
            return Arguments.makeNativeMap(constants);
        } finally {
            ReactMarker.logMarker(ReactMarkerConstants.CONVERT_CONSTANTS_END, name);
            C7382a.m20809g(0L);
            ReactMarker.logMarker(ReactMarkerConstants.GET_CONSTANTS_END, name);
            C7384b.m20801b(0L).mo20798c();
        }
    }

    @InterfaceC6107a
    public List<MethodDescriptor> getMethodDescriptors() {
        if (this.mDescs.isEmpty()) {
            findMethods();
        }
        return this.mDescs;
    }

    @InterfaceC6107a
    public BaseJavaModule getModule() {
        return (BaseJavaModule) this.mModuleHolder.getModule();
    }

    @InterfaceC6107a
    public String getName() {
        return this.mModuleHolder.getName();
    }

    @InterfaceC6107a
    public void invoke(int i, ReadableNativeArray readableNativeArray) {
        if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
            String str = TAG;
            ReactSoftExceptionLogger.logSoftException(str, new ReactNoCrashSoftException("Calling method on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
        }
        ArrayList<NativeModule.NativeMethod> arrayList = this.mMethods;
        if (arrayList != null && i < arrayList.size()) {
            if (ReactFeatureFlags.warnOnLegacyNativeModuleSystemUse) {
                String str2 = TAG;
                ReactSoftExceptionLogger.logSoftException(str2, new ReactNoCrashSoftException("Calling " + this.mDescs.get(i).name + "() on Java NativeModule (name = \"" + this.mModuleHolder.getName() + "\", className = " + this.mModuleHolder.getClassName() + ")."));
            }
            this.mMethods.get(i).invoke(this.mJSInstance, readableNativeArray);
        }
    }
}
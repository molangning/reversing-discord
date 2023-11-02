package com.facebook.react.modules.fresco;

import com.facebook.imagepipeline.backends.okhttp3.C3701a;
import com.facebook.imagepipeline.core.ImagePipeline;
import com.facebook.imagepipeline.core.ImagePipelineConfig;
import com.facebook.react.bridge.LifecycleEventListener;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.common.ReactConstants;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.modules.common.ModuleDataCleaner;
import com.facebook.react.modules.network.CookieJarContainer;
import com.facebook.react.modules.network.ForwardingCookieHandler;
import com.facebook.react.modules.network.OkHttpClientProvider;
import com.facebook.react.turbomodule.core.interfaces.TurboModule;
import java.util.HashSet;
import okhttp3.OkHttpClient;
import p208l3.C10035c;
import p328rj.C12311o;
import p414x2.C13677a;

@ReactModule(name = FrescoModule.NAME, needsEagerInit = true)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class FrescoModule extends ReactContextBaseJavaModule implements ModuleDataCleaner.Cleanable, LifecycleEventListener, TurboModule {
    public static final String NAME = "FrescoModule";
    private static boolean sHasBeenInitialized = false;
    private final boolean mClearOnDestroy;
    private ImagePipelineConfig mConfig;
    private ImagePipeline mImagePipeline;

    public FrescoModule(ReactApplicationContext reactApplicationContext) {
        this(reactApplicationContext, true, (ImagePipelineConfig) null);
    }

    private static ImagePipelineConfig getDefaultConfig(ReactContext reactContext) {
        return getDefaultConfigBuilder(reactContext).m31141K();
    }

    public static ImagePipelineConfig.Builder getDefaultConfigBuilder(ReactContext reactContext) {
        HashSet hashSet = new HashSet();
        hashSet.add(new SystraceRequestListener());
        OkHttpClient createClient = OkHttpClientProvider.createClient();
        ((CookieJarContainer) createClient.m8799q()).setCookieJar(new C12311o(new ForwardingCookieHandler(reactContext)));
        return C3701a.m31204a(reactContext.getApplicationContext(), createClient).m31136P(new ReactOkHttpNetworkFetcher(createClient)).m31138N(false).m31134R(hashSet);
    }

    private ImagePipeline getImagePipeline() {
        if (this.mImagePipeline == null) {
            this.mImagePipeline = C10035c.m12512a();
        }
        return this.mImagePipeline;
    }

    public static boolean hasBeenInitialized() {
        return sHasBeenInitialized;
    }

    @Override // com.facebook.react.modules.common.ModuleDataCleaner.Cleanable
    public void clearSensitiveData() {
        getImagePipeline().m31182a();
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        super.initialize();
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        reactApplicationContext.addLifecycleEventListener(this);
        if (!hasBeenInitialized()) {
            if (this.mConfig == null) {
                this.mConfig = getDefaultConfig(reactApplicationContext);
            }
            C10035c.m12510c(reactApplicationContext.getApplicationContext(), this.mConfig);
            sHasBeenInitialized = true;
        } else if (this.mConfig != null) {
            C13677a.m1870H(ReactConstants.TAG, "Fresco has already been initialized with a different config. The new Fresco configuration will be ignored!");
        }
        this.mConfig = null;
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void invalidate() {
        getReactApplicationContext().removeLifecycleEventListener(this);
        super.invalidate();
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostDestroy() {
        if (hasBeenInitialized() && this.mClearOnDestroy) {
            getImagePipeline().m31180c();
        }
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostPause() {
    }

    @Override // com.facebook.react.bridge.LifecycleEventListener
    public void onHostResume() {
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z) {
        this(reactApplicationContext, z, (ImagePipelineConfig) null);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z) {
        this(reactApplicationContext, imagePipeline, z, false);
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, ImagePipeline imagePipeline, boolean z, boolean z2) {
        this(reactApplicationContext, z);
        this.mImagePipeline = imagePipeline;
        if (z2) {
            sHasBeenInitialized = true;
        }
    }

    public FrescoModule(ReactApplicationContext reactApplicationContext, boolean z, ImagePipelineConfig imagePipelineConfig) {
        super(reactApplicationContext);
        this.mClearOnDestroy = z;
        this.mConfig = imagePipelineConfig;
    }
}
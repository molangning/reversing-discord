package com.discord.image.fresco;

import android.content.Context;
import com.discord.image.fresco.config.FrescoConfigKt;
import com.discord.image.fresco.config.FrescoMemoryTrimmer;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.modules.fresco.FrescoModule;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p208l3.C10035c;

@Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0018\u0000 \n2\u00020\u0001:\u0001\nB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0006H\u0016J\b\u0010\u0007\u001a\u00020\bH\u0016J\b\u0010\t\u001a\u00020\bH\u0002¨\u0006\u000b"}, m14357d2 = {"Lcom/discord/image/fresco/FrescoModuleDiscord;", "Lcom/facebook/react/modules/fresco/FrescoModule;", "reactContext", "Lcom/facebook/react/bridge/ReactApplicationContext;", "(Lcom/facebook/react/bridge/ReactApplicationContext;)V", "canOverrideExistingModule", "", "initialize", "", "initializeSkinny", "Companion", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class FrescoModuleDiscord extends FrescoModule {
    public static final Companion Companion = new Companion(null);
    private static boolean isFrescoExternallyInitialized;

    @Metadata(m14358d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bJ\b\u0010\t\u001a\u00020\u0004H\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, m14357d2 = {"Lcom/discord/image/fresco/FrescoModuleDiscord$Companion;", "", "()V", "isFrescoExternallyInitialized", "", "initializeFresco", "", "context", "Landroid/content/Context;", "isFrescoInitialized", "fresco_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private final synchronized boolean isFrescoInitialized() {
            boolean z;
            if (!FrescoModuleDiscord.isFrescoExternallyInitialized) {
                if (!FrescoModule.hasBeenInitialized()) {
                    z = false;
                }
            }
            z = true;
            return z;
        }

        public final synchronized void initializeFresco(Context context) {
            C9612q.m13917h(context, "context");
            if (!isFrescoInitialized()) {
                FrescoModuleDiscord.isFrescoExternallyInitialized = true;
                C10035c.m12510c(context, FrescoConfigKt.frescoConfig(context));
                FrescoMemoryTrimmer.INSTANCE.initialize(context);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FrescoModuleDiscord(ReactApplicationContext reactContext) {
        super(reactContext);
        C9612q.m13917h(reactContext, "reactContext");
    }

    private final void initializeSkinny() {
        getReactApplicationContext().addLifecycleEventListener(this);
    }

    @Override // com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public boolean canOverrideExistingModule() {
        return true;
    }

    @Override // com.facebook.react.modules.fresco.FrescoModule, com.facebook.react.bridge.BaseJavaModule, com.facebook.react.bridge.NativeModule
    public void initialize() {
        Companion companion = Companion;
        ReactApplicationContext reactApplicationContext = getReactApplicationContext();
        C9612q.m13918g(reactApplicationContext, "reactApplicationContext");
        companion.initializeFresco(reactApplicationContext);
        initializeSkinny();
    }
}

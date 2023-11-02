package com.facebook.react.defaults;

import com.facebook.jni.HybridData;
import com.facebook.react.fabric.ComponentFactory;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import p077e5.InterfaceC6107a;

@InterfaceC6107a
@Metadata(m14358d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 \b2\u00020\u0001:\u0001\bB\u000f\b\u0003\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0011\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0003H\u0083 R\u0010\u0010\u0005\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, m14357d2 = {"Lcom/facebook/react/defaults/DefaultComponentsRegistry;", "", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "(Lcom/facebook/react/fabric/ComponentFactory;)V", "hybridData", "Lcom/facebook/jni/HybridData;", "initHybrid", "Companion", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class DefaultComponentsRegistry {
    public static final Companion Companion = new Companion(null);
    @InterfaceC6107a
    private final HybridData hybridData;

    @Metadata(m14358d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007¨\u0006\u0007"}, m14357d2 = {"Lcom/facebook/react/defaults/DefaultComponentsRegistry$Companion;", "", "()V", "register", "Lcom/facebook/react/defaults/DefaultComponentsRegistry;", "componentFactory", "Lcom/facebook/react/fabric/ComponentFactory;", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @InterfaceC6107a
        public final DefaultComponentsRegistry register(ComponentFactory componentFactory) {
            C9612q.m13917h(componentFactory, "componentFactory");
            return new DefaultComponentsRegistry(componentFactory, null);
        }
    }

    @InterfaceC6107a
    private DefaultComponentsRegistry(ComponentFactory componentFactory) {
        this.hybridData = initHybrid(componentFactory);
    }

    public /* synthetic */ DefaultComponentsRegistry(ComponentFactory componentFactory, DefaultConstructorMarker defaultConstructorMarker) {
        this(componentFactory);
    }

    @InterfaceC6107a
    private final native HybridData initHybrid(ComponentFactory componentFactory);

    @InterfaceC6107a
    public static final DefaultComponentsRegistry register(ComponentFactory componentFactory) {
        return Companion.register(componentFactory);
    }
}
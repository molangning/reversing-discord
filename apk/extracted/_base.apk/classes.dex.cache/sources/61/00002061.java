package com.discord.sticker.react;

import com.discord.sticker.StickerView;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.viewmanagers.NativeLottieNodeManagerDelegate;
import com.facebook.react.viewmanagers.NativeLottieNodeManagerInterface;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = StickerViewManagerLottie.NAME)
@Metadata(m14358d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001f2\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u001fB\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0002H\u0016J\"\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\r2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0016JD\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\r2\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u001a2\u0006\u0010\u001d\u001a\u00020\u001eH\u0016R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006 "}, m14357d2 = {"Lcom/discord/sticker/react/StickerViewManagerLottie;", "Lcom/facebook/react/uimanager/SimpleViewManager;", "Lcom/discord/sticker/StickerView;", "Lcom/facebook/react/viewmanagers/NativeLottieNodeManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/NativeLottieNodeManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "reactContext", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "onDropViewInstance", "", "view", "receiveCommand", "node", "commandId", "args", "Lcom/facebook/react/bridge/ReadableArray;", StickerViewManagerLottie.SETUP_COMMAND_ID, "asset", "url", "width", "", "height", "renderMode", "animating", "", "Companion", "sticker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class StickerViewManagerLottie extends SimpleViewManager<StickerView> implements NativeLottieNodeManagerInterface<StickerView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "NativeLottieNode";
    private static final String SETUP_COMMAND_ID = "setup";
    private final NativeLottieNodeManagerDelegate<StickerView, StickerViewManagerLottie> delegate = new NativeLottieNodeManagerDelegate<>(this);

    @Metadata(m14358d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, m14357d2 = {"Lcom/discord/sticker/react/StickerViewManagerLottie$Companion;", "", "()V", "NAME", "", "SETUP_COMMAND_ID", "sticker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public StickerView createViewInstance(ThemedReactContext reactContext) {
        C9612q.m13917h(reactContext, "reactContext");
        StickerView stickerView = new StickerView(reactContext, null, 0, 6, null);
        stickerView.inflateLottieView();
        return stickerView;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public NativeLottieNodeManagerDelegate<StickerView, StickerViewManagerLottie> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void onDropViewInstance(StickerView view) {
        C9612q.m13917h(view, "view");
        super.onDropViewInstance((StickerViewManagerLottie) view);
        view.recycle();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(StickerView node, String commandId, ReadableArray readableArray) {
        C9612q.m13917h(node, "node");
        C9612q.m13917h(commandId, "commandId");
        if (!C9612q.m13922c(commandId, SETUP_COMMAND_ID) || readableArray == null) {
            return;
        }
        setup(node, readableArray.getString(0), readableArray.getString(1), readableArray.getInt(2), readableArray.getInt(3), readableArray.getInt(4), readableArray.getBoolean(5));
    }

    @Override // com.facebook.react.viewmanagers.NativeLottieNodeManagerInterface
    public void setup(StickerView view, String str, String str2, int i, int i2, int i3, boolean z) {
        C9612q.m13917h(view, "view");
        if (str == null || str2 == null) {
            return;
        }
        view.asLottie(str2, i, i2, z, str, i3);
    }
}
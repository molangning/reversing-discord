package com.facebook.react.animated;

import android.view.View;
import com.facebook.fbreact.specs.NativeFabricMeasurerTurboModuleSpec;
import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.UIManager;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.NativeViewMeasurer;
import com.facebook.react.uimanager.PixelUtil;
import com.facebook.react.uimanager.UIManagerHelper;

@ReactModule(name = NativeFabricMeasurerTurboModuleSpec.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class NativeFabricMeasurerModule extends NativeFabricMeasurerTurboModuleSpec implements NativeViewMeasurer.ViewProvider {
    private final NativeViewMeasurer measurer;

    public NativeFabricMeasurerModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
        this.measurer = new NativeViewMeasurer(this);
    }

    public /* synthetic */ void lambda$measureInWindowNatively$1(double d, Callback callback) {
        int[] measureInWindow = this.measurer.measureInWindow((int) d);
        callback.invoke(Float.valueOf(PixelUtil.toDIPFromPixel(measureInWindow[0])), Float.valueOf(PixelUtil.toDIPFromPixel(measureInWindow[1])), Float.valueOf(PixelUtil.toDIPFromPixel(measureInWindow[2])), Float.valueOf(PixelUtil.toDIPFromPixel(measureInWindow[3])));
    }

    public /* synthetic */ void lambda$measureNatively$0(double d, Callback callback) {
        int[] measure = this.measurer.measure((int) d);
        callback.invoke(0, 0, Float.valueOf(PixelUtil.toDIPFromPixel(measure[2])), Float.valueOf(PixelUtil.toDIPFromPixel(measure[3])), Float.valueOf(PixelUtil.toDIPFromPixel(measure[0])), Float.valueOf(PixelUtil.toDIPFromPixel(measure[1])));
    }

    @Override // com.facebook.fbreact.specs.NativeFabricMeasurerTurboModuleSpec
    public void measureInWindowNatively(final double d, final Callback callback) {
        getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.animated.d
            @Override // java.lang.Runnable
            public final void run() {
                NativeFabricMeasurerModule.this.lambda$measureInWindowNatively$1(d, callback);
            }
        });
    }

    @Override // com.facebook.fbreact.specs.NativeFabricMeasurerTurboModuleSpec
    public void measureNatively(final double d, final Callback callback) {
        getReactApplicationContext().runOnUiQueueThread(new Runnable() { // from class: com.facebook.react.animated.c
            @Override // java.lang.Runnable
            public final void run() {
                NativeFabricMeasurerModule.this.lambda$measureNatively$0(d, callback);
            }
        });
    }

    @Override // com.facebook.react.uimanager.NativeViewMeasurer.ViewProvider
    public View provideView(int i) {
        UIManager uIManager = UIManagerHelper.getUIManager(getReactApplicationContext(), 2);
        if (uIManager == null) {
            return null;
        }
        return uIManager.resolveView(i);
    }
}
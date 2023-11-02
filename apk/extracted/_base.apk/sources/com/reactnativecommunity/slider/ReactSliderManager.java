package com.reactnativecommunity.slider;

import android.view.View;
import android.widget.SeekBar;
import com.facebook.react.bridge.ReactContext;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.uimanager.SimpleViewManager;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.UIManagerModule;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.yoga.C4343g;
import com.facebook.yoga.YogaMeasureFunction;
import com.facebook.yoga.YogaMeasureMode;
import com.facebook.yoga.YogaNode;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class ReactSliderManager extends SimpleViewManager<C5396a> {
    private static final SeekBar.OnSeekBarChangeListener ON_CHANGE_LISTENER = new C5394a();

    /* renamed from: com.reactnativecommunity.slider.ReactSliderManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C5394a implements SeekBar.OnSeekBarChangeListener {
        C5394a() {
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onProgressChanged(SeekBar seekBar, int i, boolean z) {
            C5396a c5396a = (C5396a) seekBar;
            if (i < c5396a.getLowerLimit()) {
                i = c5396a.getLowerLimit();
                seekBar.setProgress(i);
            } else if (i > c5396a.getUpperLimit()) {
                i = c5396a.getUpperLimit();
                seekBar.setProgress(i);
            }
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            if (z) {
                ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C5399b(seekBar.getId(), c5396a.m25288e(i), true));
            }
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStartTrackingTouch(SeekBar seekBar) {
            C5396a c5396a = (C5396a) seekBar;
            c5396a.m25290c(true);
            ((UIManagerModule) ((ReactContext) seekBar.getContext()).getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C5404g(seekBar.getId(), c5396a.m25288e(seekBar.getProgress())));
        }

        @Override // android.widget.SeekBar.OnSeekBarChangeListener
        public void onStopTrackingTouch(SeekBar seekBar) {
            ReactContext reactContext = (ReactContext) seekBar.getContext();
            C5396a c5396a = (C5396a) seekBar;
            c5396a.m25290c(false);
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C5403f(seekBar.getId(), c5396a.m25288e(seekBar.getProgress())));
            ((UIManagerModule) reactContext.getNativeModule(UIManagerModule.class)).getEventDispatcher().dispatchEvent(new C5399b(seekBar.getId(), c5396a.m25288e(seekBar.getProgress()), !c5396a.m25289d()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.reactnativecommunity.slider.ReactSliderManager$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C5395b extends LayoutShadowNode implements YogaMeasureFunction {

        /* renamed from: a */
        private int f15284a;

        /* renamed from: b */
        private int f15285b;

        /* renamed from: c */
        private boolean f15286c;

        private C5395b() {
            initMeasureFunction();
        }

        private void initMeasureFunction() {
            setMeasureFunction(this);
        }

        @Override // com.facebook.yoga.YogaMeasureFunction
        public long measure(YogaNode yogaNode, float f, YogaMeasureMode yogaMeasureMode, float f2, YogaMeasureMode yogaMeasureMode2) {
            if (!this.f15286c) {
                C5396a c5396a = new C5396a(getThemedContext(), null);
                int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                c5396a.measure(makeMeasureSpec, makeMeasureSpec);
                this.f15284a = c5396a.getMeasuredWidth();
                this.f15285b = c5396a.getMeasuredHeight();
                this.f15286c = true;
            }
            return C4343g.m29966b(this.f15284a, this.f15285b);
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map getExportedCustomDirectEventTypeConstants() {
        return C5401d.m25278b();
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return "RNCSlider";
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public Class getShadowNodeClass() {
        return C5395b.class;
    }

    @ReactProp(name = "accessibilityIncrements")
    public void setAccessibilityIncrements(C5396a c5396a, ReadableArray readableArray) {
        C5401d.m25277c(c5396a, readableArray);
    }

    @ReactProp(name = "accessibilityUnits")
    public void setAccessibilityUnits(C5396a c5396a, String str) {
        C5401d.m25276d(c5396a, str);
    }

    @ReactProp(defaultBoolean = false, name = "disabled")
    public void setDisabled(C5396a c5396a, boolean z) {
        C5401d.m25275e(c5396a, z);
    }

    @ReactProp(defaultBoolean = false, name = "inverted")
    public void setInverted(C5396a c5396a, boolean z) {
        C5401d.m25274f(c5396a, z);
    }

    @ReactProp(name = "lowerLimit")
    public void setLowerLimit(C5396a c5396a, float f) {
        C5401d.m25273g(c5396a, f);
    }

    @ReactProp(customType = "Color", name = "maximumTrackTintColor")
    public void setMaximumTrackTintColor(C5396a c5396a, Integer num) {
        C5401d.m25272h(c5396a, num);
    }

    @ReactProp(defaultFloat = 1.0f, name = "maximumValue")
    public void setMaximumValue(C5396a c5396a, float f) {
        C5401d.m25271i(c5396a, f);
    }

    @ReactProp(customType = "Color", name = "minimumTrackTintColor")
    public void setMinimumTrackTintColor(C5396a c5396a, Integer num) {
        C5401d.m25270j(c5396a, num);
    }

    @ReactProp(defaultFloat = 0.0f, name = "minimumValue")
    public void setMinimumValue(C5396a c5396a, float f) {
        C5401d.m25269k(c5396a, f);
    }

    @ReactProp(defaultFloat = 0.0f, name = "step")
    public void setStep(C5396a c5396a, float f) {
        C5401d.m25268l(c5396a, f);
    }

    @ReactProp(name = "thumbImage")
    public void setThumbImage(C5396a c5396a, ReadableMap readableMap) {
        C5401d.m25267m(c5396a, readableMap);
    }

    @ReactProp(customType = "Color", name = "thumbTintColor")
    public void setThumbTintColor(C5396a c5396a, Integer num) {
        C5401d.m25266n(c5396a, num);
    }

    @ReactProp(name = "upperLimit")
    public void setUpperLimit(C5396a c5396a, float f) {
        C5401d.m25265o(c5396a, f);
    }

    @ReactProp(defaultFloat = 0.0f, name = "value")
    public void setValue(C5396a c5396a, float f) {
        C5401d.m25264p(c5396a, f);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public void addEventEmitters(ThemedReactContext themedReactContext, C5396a c5396a) {
        c5396a.setOnSeekBarChangeListener(ON_CHANGE_LISTENER);
    }

    @Override // com.facebook.react.uimanager.SimpleViewManager, com.facebook.react.uimanager.ViewManager
    public LayoutShadowNode createShadowNodeInstance() {
        return new C5395b();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C5396a createViewInstance(ThemedReactContext themedReactContext) {
        return C5401d.m25279a(themedReactContext);
    }
}

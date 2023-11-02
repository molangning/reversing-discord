package com.horcrux.svg;

import com.facebook.react.bridge.Callback;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactMethod;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.UiThreadUtil;
import com.facebook.react.module.annotations.ReactModule;
import com.horcrux.rnsvg.NativeSvgViewModuleSpec;

@ReactModule(name = SvgViewModule.NAME)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class SvgViewModule extends NativeSvgViewModuleSpec {
    public static final String NAME = "RNSVGSvgViewModule";

    /* renamed from: com.horcrux.svg.SvgViewModule$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC5192a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ int f14565j;

        /* renamed from: k */
        final /* synthetic */ ReadableMap f14566k;

        /* renamed from: l */
        final /* synthetic */ Callback f14567l;

        /* renamed from: m */
        final /* synthetic */ int f14568m;

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: com.horcrux.svg.SvgViewModule$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public class RunnableC5193a implements Runnable {

            /* renamed from: com.horcrux.svg.SvgViewModule$a$a$a */
            /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
            class RunnableC5194a implements Runnable {
                RunnableC5194a() {
                    RunnableC5193a.this = r1;
                }

                @Override // java.lang.Runnable
                public void run() {
                    RunnableC5192a runnableC5192a = RunnableC5192a.this;
                    SvgViewModule.toDataURL(runnableC5192a.f14565j, runnableC5192a.f14566k, runnableC5192a.f14567l, runnableC5192a.f14568m + 1);
                }
            }

            RunnableC5193a() {
                RunnableC5192a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(RunnableC5192a.this.f14565j);
                if (svgViewByTag == null) {
                    return;
                }
                svgViewByTag.setToDataUrlTask(new RunnableC5194a());
            }
        }

        /* renamed from: com.horcrux.svg.SvgViewModule$a$b */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class RunnableC5195b implements Runnable {
            RunnableC5195b() {
                RunnableC5192a.this = r1;
            }

            @Override // java.lang.Runnable
            public void run() {
                RunnableC5192a runnableC5192a = RunnableC5192a.this;
                SvgViewModule.toDataURL(runnableC5192a.f14565j, runnableC5192a.f14566k, runnableC5192a.f14567l, runnableC5192a.f14568m + 1);
            }
        }

        RunnableC5192a(int i, ReadableMap readableMap, Callback callback, int i2) {
            this.f14565j = i;
            this.f14566k = readableMap;
            this.f14567l = callback;
            this.f14568m = i2;
        }

        @Override // java.lang.Runnable
        public void run() {
            SvgView svgViewByTag = SvgViewManager.getSvgViewByTag(this.f14565j);
            if (svgViewByTag == null) {
                SvgViewManager.runWhenViewIsAvailable(this.f14565j, new RunnableC5193a());
            } else if (svgViewByTag.notRendered()) {
                svgViewByTag.setToDataUrlTask(new RunnableC5195b());
            } else {
                ReadableMap readableMap = this.f14566k;
                if (readableMap != null) {
                    this.f14567l.invoke(svgViewByTag.toDataURL(readableMap.getInt("width"), this.f14566k.getInt("height")));
                } else {
                    this.f14567l.invoke(svgViewByTag.toDataURL());
                }
            }
        }
    }

    public SvgViewModule(ReactApplicationContext reactApplicationContext) {
        super(reactApplicationContext);
    }

    public static void toDataURL(int i, ReadableMap readableMap, Callback callback, int i2) {
        UiThreadUtil.runOnUiThread(new RunnableC5192a(i, readableMap, callback, i2));
    }

    @Override // com.facebook.react.bridge.NativeModule
    public String getName() {
        return NAME;
    }

    @Override // com.horcrux.rnsvg.NativeSvgViewModuleSpec
    @ReactMethod
    public void toDataURL(Double d, ReadableMap readableMap, Callback callback) {
        toDataURL(d.intValue(), readableMap, callback, 0);
    }
}
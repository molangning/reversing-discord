package com.discord.clip;

import com.discord.misc.utilities.size.SizeUtilsKt;
import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.ClipViewManagerDelegate;
import com.facebook.react.viewmanagers.ClipViewManagerInterface;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.ranges.IntRange;
import p304qf.AbstractC11883p;

@ReactModule(name = ClipViewManager.NAME)
@Metadata(m14358d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00162\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\nH\u0014J$\u0010\u000b\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006H\u0014J\b\u0010\f\u001a\u00020\rH\u0016J\u0018\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0011\u001a\u00020\u0012H\u0017J\u001a\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00022\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0017R*\u0010\u0005\u001a\u001e\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00000\u00000\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, m14357d2 = {"Lcom/discord/clip/ClipViewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/discord/clip/ClipView;", "Lcom/facebook/react/viewmanagers/ClipViewManagerInterface;", "()V", "delegate", "Lcom/facebook/react/viewmanagers/ClipViewManagerDelegate;", "kotlin.jvm.PlatformType", "createViewInstance", "context", "Lcom/facebook/react/uimanager/ThemedReactContext;", "getDelegate", "getName", "", "setClipToCircle", "", "view", "clipToCircle", "", "setCutouts", "cutouts", "Lcom/facebook/react/bridge/ReadableArray;", "Companion", "clip_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class ClipViewManager extends ViewGroupManager<ClipView> implements ClipViewManagerInterface<ClipView> {
    public static final Companion Companion = new Companion(null);
    public static final String NAME = "ClipView";
    private final ClipViewManagerDelegate<ClipView, ClipViewManager> delegate = new ClipViewManagerDelegate<>(this);

    @Metadata(m14358d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, m14357d2 = {"Lcom/discord/clip/ClipViewManager$Companion;", "", "()V", "NAME", "", "clip_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
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

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ClipView createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new ClipView(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ClipViewManagerDelegate<ClipView, ClipViewManager> getDelegate() {
        return this.delegate;
    }

    @Override // com.facebook.react.viewmanagers.ClipViewManagerInterface
    @ReactProp(name = "clipToCircle")
    public void setClipToCircle(ClipView view, boolean z) {
        C9612q.m13917h(view, "view");
        view.clipToCircle(z);
    }

    @Override // com.facebook.react.viewmanagers.ClipViewManagerInterface
    @ReactProp(name = "cutouts")
    public void setCutouts(ClipView view, ReadableArray readableArray) {
        IntRange sizeRange;
        C9612q.m13917h(view, "view");
        view.resetCutouts();
        if (readableArray == null || (sizeRange = NativeArrayExtensionsKt.sizeRange(readableArray)) == null) {
            return;
        }
        Iterator<Integer> it = sizeRange.iterator();
        while (it.hasNext()) {
            ReadableMap map = readableArray.getMap(((AbstractC11883p) it).nextInt());
            C9612q.m13918g(map, "cutouts.getMap(index)");
            String string = map.getString("shape");
            if (string != null) {
                int hashCode = string.hashCode();
                if (hashCode != -1360216880) {
                    if (hashCode == 2002554116 && string.equals("rounded-rect")) {
                        view.addRoundedRectCutout(SizeUtilsKt.getDpToPx((float) map.getDouble("x")), SizeUtilsKt.getDpToPx((float) map.getDouble("y")), SizeUtilsKt.getDpToPx((float) map.getDouble("width")), SizeUtilsKt.getDpToPx((float) map.getDouble("height")), SizeUtilsKt.getDpToPx((float) map.getDouble("cornerRadius")));
                    }
                } else if (string.equals("circle")) {
                    view.addCircleCutout(SizeUtilsKt.getDpToPx((float) map.getDouble("x")), SizeUtilsKt.getDpToPx((float) map.getDouble("y")), SizeUtilsKt.getDpToPx((float) map.getDouble("size")));
                }
            }
        }
    }
}

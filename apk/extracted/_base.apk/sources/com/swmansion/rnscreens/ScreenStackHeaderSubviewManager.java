package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewManagerDelegate;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerDelegate;
import com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface;
import com.swmansion.rnscreens.C5651t;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = ScreenStackHeaderSubviewManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u00132\b\u0012\u0004\u0012\u00020\u00020\u00012\b\u0012\u0004\u0012\u00020\u00020\u0003:\u0001\u0014B\u0007¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\u0005\u001a\u00020\u0004H\u0016J\u0010\u0010\b\u001a\u00020\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0014J\u001a\u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\u00022\b\u0010\n\u001a\u0004\u0018\u00010\u0004H\u0017J\u000e\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00020\rH\u0014R\u001a\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010¨\u0006\u0015"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/t;", "Lcom/facebook/react/viewmanagers/RNSScreenStackHeaderSubviewManagerInterface;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "view", "type", "", "setType", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "getDelegate", "mDelegate", "Lcom/facebook/react/uimanager/ViewManagerDelegate;", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ScreenStackHeaderSubviewManager extends ViewGroupManager<C5651t> implements RNSScreenStackHeaderSubviewManagerInterface<C5651t> {
    public static final C5593a Companion = new C5593a(null);
    public static final String REACT_CLASS = "RNSScreenStackHeaderSubview";
    private final ViewManagerDelegate<C5651t> mDelegate = new RNSScreenStackHeaderSubviewManagerDelegate(this);

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/ScreenStackHeaderSubviewManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.ScreenStackHeaderSubviewManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5593a {
        private C5593a() {
        }

        public /* synthetic */ C5593a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public ViewManagerDelegate<C5651t> getDelegate() {
        return this.mDelegate;
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C5651t createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new C5651t(context);
    }

    @Override // com.facebook.react.viewmanagers.RNSScreenStackHeaderSubviewManagerInterface
    @ReactProp(name = "type")
    public void setType(C5651t view, String str) {
        C5651t.EnumC5652a enumC5652a;
        C9612q.m13917h(view, "view");
        if (str != null) {
            switch (str.hashCode()) {
                case -1364013995:
                    if (str.equals("center")) {
                        enumC5652a = C5651t.EnumC5652a.CENTER;
                        view.setType(enumC5652a);
                        return;
                    }
                    break;
                case 3015911:
                    if (str.equals("back")) {
                        enumC5652a = C5651t.EnumC5652a.BACK;
                        view.setType(enumC5652a);
                        return;
                    }
                    break;
                case 3317767:
                    if (str.equals(ViewProps.LEFT)) {
                        enumC5652a = C5651t.EnumC5652a.LEFT;
                        view.setType(enumC5652a);
                        return;
                    }
                    break;
                case 108511772:
                    if (str.equals(ViewProps.RIGHT)) {
                        enumC5652a = C5651t.EnumC5652a.RIGHT;
                        view.setType(enumC5652a);
                        return;
                    }
                    break;
                case 1778179403:
                    if (str.equals("searchBar")) {
                        enumC5652a = C5651t.EnumC5652a.SEARCH_BAR;
                        view.setType(enumC5652a);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unknown type " + str);
    }
}

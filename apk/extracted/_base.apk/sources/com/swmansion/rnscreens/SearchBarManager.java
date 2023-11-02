package com.swmansion.rnscreens;

import com.facebook.react.bridge.JSApplicationIllegalArgumentException;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.common.MapBuilder;
import com.facebook.react.module.annotations.ReactModule;
import com.facebook.react.uimanager.ThemedReactContext;
import com.facebook.react.uimanager.ViewGroupManager;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.uimanager.annotations.ReactProp;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@ReactModule(name = SearchBarManager.REACT_CLASS)
@Metadata(m14358d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\b\u0007\u0018\u0000 +2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001,B\u0007¢\u0006\u0004\b)\u0010*J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\u0010\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0014J\u0010\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u0002H\u0014J\u001a\u0010\f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000b\u001a\u0004\u0018\u00010\u0003H\u0007J!\u0010\u000f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u000f\u0010\u0010J!\u0010\u0013\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0016\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0015\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u0016\u0010\u0010J\u001a\u0010\u0018\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0017\u001a\u0004\u0018\u00010\u0003H\u0007J\u001a\u0010\u001a\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003H\u0007J!\u0010\u001b\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001b\u0010\u0014J!\u0010\u001c\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001c\u0010\u0014J!\u0010\u001d\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0007¢\u0006\u0004\b\u001d\u0010\u0014J!\u0010\u001f\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0007¢\u0006\u0004\b\u001f\u0010\u0010J\u0018\u0010 \u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00022\b\u0010\u0019\u001a\u0004\u0018\u00010\u0003J$\u0010%\u001a\u00020\t2\u0006\u0010!\u001a\u00020\u00022\b\u0010\"\u001a\u0004\u0018\u00010\u00032\b\u0010$\u001a\u0004\u0018\u00010#H\u0016J\u0016\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020'\u0018\u00010&H\u0016¨\u0006-"}, m14357d2 = {"Lcom/swmansion/rnscreens/SearchBarManager;", "Lcom/facebook/react/uimanager/ViewGroupManager;", "Lcom/swmansion/rnscreens/f0;", "", "getName", "Lcom/facebook/react/uimanager/ThemedReactContext;", "context", "createViewInstance", "view", "", "onAfterUpdateTransaction", "autoCapitalize", "setAutoCapitalize", "", "autoFocus", "setAutoFocus", "(Lcom/swmansion/rnscreens/f0;Ljava/lang/Boolean;)V", "", ViewProps.COLOR, "setTintColor", "(Lcom/swmansion/rnscreens/f0;Ljava/lang/Integer;)V", "disableBackButtonOverride", "setDisableBackButtonOverride", "inputType", "setInputType", ReactTextInputShadowNode.PROP_PLACEHOLDER, "setPlaceholder", "setTextColor", "setHeaderIconColor", "setHintTextColor", "shouldShowHintSearchIcon", "setShouldShowHintSearchIcon", "setPlacement", "root", "commandId", "Lcom/facebook/react/bridge/ReadableArray;", "args", "receiveCommand", "", "", "getExportedCustomDirectEventTypeConstants", "<init>", "()V", "Companion", "a", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class SearchBarManager extends ViewGroupManager<C5609f0> {
    public static final C5596a Companion = new C5596a(null);
    public static final String REACT_CLASS = "RNSSearchBar";

    @Metadata(m14358d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, m14357d2 = {"Lcom/swmansion/rnscreens/SearchBarManager$a;", "", "", "REACT_CLASS", "Ljava/lang/String;", "<init>", "()V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.SearchBarManager$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5596a {
        private C5596a() {
        }

        public /* synthetic */ C5596a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public Map<String, Object> getExportedCustomDirectEventTypeConstants() {
        return MapBuilder.m30465of("topBlur", MapBuilder.m30470of("registrationName", "onBlur"), "topChangeText", MapBuilder.m30470of("registrationName", "onChangeText"), "topClose", MapBuilder.m30470of("registrationName", "onClose"), "topFocus", MapBuilder.m30470of("registrationName", "onFocus"), "topOpen", MapBuilder.m30470of("registrationName", "onOpen"), "topSearchButtonPress", MapBuilder.m30470of("registrationName", "onSearchButtonPress"));
    }

    @Override // com.facebook.react.uimanager.ViewManager, com.facebook.react.bridge.NativeModule
    public String getName() {
        return REACT_CLASS;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0036, code lost:
        if (r3.equals(com.facebook.react.uimanager.ViewProps.NONE) != false) goto L21;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "autoCapitalize")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setAutoCapitalize(com.swmansion.rnscreens.C5609f0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            if (r3 == 0) goto L41
            int r0 = r3.hashCode()
            switch(r0) {
                case 3387192: goto L30;
                case 113318569: goto L25;
                case 490141296: goto L1a;
                case 1245424234: goto Lf;
                default: goto Le;
            }
        Le:
            goto L39
        Lf:
            java.lang.String r0 = "characters"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.f0$a r3 = com.swmansion.rnscreens.C5609f0.EnumC5610a.CHARACTERS
            goto L43
        L1a:
            java.lang.String r0 = "sentences"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.f0$a r3 = com.swmansion.rnscreens.C5609f0.EnumC5610a.SENTENCES
            goto L43
        L25:
            java.lang.String r0 = "words"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.f0$a r3 = com.swmansion.rnscreens.C5609f0.EnumC5610a.WORDS
            goto L43
        L30:
            java.lang.String r0 = "none"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            goto L41
        L39:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden auto capitalize value passed"
            r2.<init>(r3)
            throw r2
        L41:
            com.swmansion.rnscreens.f0$a r3 = com.swmansion.rnscreens.C5609f0.EnumC5610a.NONE
        L43:
            r2.setAutoCapitalize(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setAutoCapitalize(com.swmansion.rnscreens.f0, java.lang.String):void");
    }

    @ReactProp(name = "autoFocus")
    public final void setAutoFocus(C5609f0 view, Boolean bool) {
        boolean z;
        C9612q.m13917h(view, "view");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = false;
        }
        view.setAutoFocus(z);
    }

    @ReactProp(name = "disableBackButtonOverride")
    public final void setDisableBackButtonOverride(C5609f0 view, Boolean bool) {
        C9612q.m13917h(view, "view");
        view.setShouldOverrideBackButton(!C9612q.m13922c(bool, Boolean.TRUE));
    }

    @ReactProp(customType = "Color", name = "headerIconColor")
    public final void setHeaderIconColor(C5609f0 view, Integer num) {
        C9612q.m13917h(view, "view");
        view.setHeaderIconColor(num);
    }

    @ReactProp(customType = "Color", name = "hintTextColor")
    public final void setHintTextColor(C5609f0 view, Integer num) {
        C9612q.m13917h(view, "view");
        view.setHintTextColor(num);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x002b, code lost:
        if (r3.equals("text") != false) goto L21;
     */
    @com.facebook.react.uimanager.annotations.ReactProp(name = "inputType")
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void setInputType(com.swmansion.rnscreens.C5609f0 r2, java.lang.String r3) {
        /*
            r1 = this;
            java.lang.String r0 = "view"
            kotlin.jvm.internal.C9612q.m13917h(r2, r0)
            if (r3 == 0) goto L41
            int r0 = r3.hashCode()
            switch(r0) {
                case -1034364087: goto L2e;
                case 3556653: goto L25;
                case 96619420: goto L1a;
                case 106642798: goto Lf;
                default: goto Le;
            }
        Le:
            goto L39
        Lf:
            java.lang.String r0 = "phone"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.f0$b r3 = com.swmansion.rnscreens.C5609f0.EnumC5611b.f15640k
            goto L43
        L1a:
            java.lang.String r0 = "email"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.f0$b r3 = com.swmansion.rnscreens.C5609f0.EnumC5611b.f15642m
            goto L43
        L25:
            java.lang.String r0 = "text"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            goto L41
        L2e:
            java.lang.String r0 = "number"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L39
            com.swmansion.rnscreens.f0$b r3 = com.swmansion.rnscreens.C5609f0.EnumC5611b.f15641l
            goto L43
        L39:
            com.facebook.react.bridge.JSApplicationIllegalArgumentException r2 = new com.facebook.react.bridge.JSApplicationIllegalArgumentException
            java.lang.String r3 = "Forbidden input type value"
            r2.<init>(r3)
            throw r2
        L41:
            com.swmansion.rnscreens.f0$b r3 = com.swmansion.rnscreens.C5609f0.EnumC5611b.f15639j
        L43:
            r2.setInputType(r3)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.swmansion.rnscreens.SearchBarManager.setInputType(com.swmansion.rnscreens.f0, java.lang.String):void");
    }

    @ReactProp(name = ReactTextInputShadowNode.PROP_PLACEHOLDER)
    public final void setPlaceholder(C5609f0 view, String str) {
        C9612q.m13917h(view, "view");
        if (str != null) {
            view.setPlaceholder(str);
        }
    }

    public final void setPlacement(C5609f0 view, String str) {
        C9612q.m13917h(view, "view");
    }

    @ReactProp(name = "shouldShowHintSearchIcon")
    public final void setShouldShowHintSearchIcon(C5609f0 view, Boolean bool) {
        boolean z;
        C9612q.m13917h(view, "view");
        if (bool != null) {
            z = bool.booleanValue();
        } else {
            z = true;
        }
        view.setShouldShowHintSearchIcon(z);
    }

    @ReactProp(customType = "Color", name = "textColor")
    public final void setTextColor(C5609f0 view, Integer num) {
        C9612q.m13917h(view, "view");
        view.setTextColor(num);
    }

    @ReactProp(customType = "Color", name = "barTintColor")
    public final void setTintColor(C5609f0 view, Integer num) {
        C9612q.m13917h(view, "view");
        view.setTintColor(num);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.ViewManager
    public C5609f0 createViewInstance(ThemedReactContext context) {
        C9612q.m13917h(context, "context");
        return new C5609f0(context);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.facebook.react.uimanager.BaseViewManager, com.facebook.react.uimanager.ViewManager
    public void onAfterUpdateTransaction(C5609f0 view) {
        C9612q.m13917h(view, "view");
        super.onAfterUpdateTransaction((SearchBarManager) view);
        view.m24945u();
    }

    @Override // com.facebook.react.uimanager.ViewManager
    public void receiveCommand(C5609f0 root, String str, ReadableArray readableArray) {
        C9612q.m13917h(root, "root");
        if (str != null) {
            switch (str.hashCode()) {
                case -1270906598:
                    if (str.equals("clearText")) {
                        root.m24954l();
                        return;
                    }
                    break;
                case -664358976:
                    if (str.equals("toggleCancelButton")) {
                        root.m24946t(false);
                        return;
                    }
                    break;
                case 3027047:
                    if (str.equals("blur")) {
                        root.m24955k();
                        return;
                    }
                    break;
                case 97604824:
                    if (str.equals("focus")) {
                        root.m24951o();
                        return;
                    }
                    break;
                case 1984984239:
                    if (str.equals("setText")) {
                        root.m24949q(readableArray != null ? readableArray.getString(0) : null);
                        return;
                    }
                    break;
            }
        }
        throw new JSApplicationIllegalArgumentException("Unsupported native command received: " + str);
    }
}

package com.facebook.react.defaults;

import android.os.Bundle;
import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.ReactRootView;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001B'\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0002\u0010\tB\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\fH\u0014J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\b\u0010\u000f\u001a\u00020\u0007H\u0014R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, m14357d2 = {"Lcom/facebook/react/defaults/DefaultReactActivityDelegate;", "Lcom/facebook/react/ReactActivityDelegate;", "activity", "Lcom/facebook/react/ReactActivity;", "mainComponentName", "", "fabricEnabled", "", "concurrentReactEnabled", "(Lcom/facebook/react/ReactActivity;Ljava/lang/String;ZZ)V", "(Lcom/facebook/react/ReactActivity;Ljava/lang/String;Z)V", "createRootView", "Lcom/facebook/react/ReactRootView;", "bundle", "Landroid/os/Bundle;", "isFabricEnabled", "ReactAndroid_release"}, m14356k = 1, m14355mv = {1, 7, 1}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DefaultReactActivityDelegate extends ReactActivityDelegate {
    private final boolean fabricEnabled;

    public /* synthetic */ DefaultReactActivityDelegate(ReactActivity reactActivity, String str, boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(reactActivity, str, (i & 4) != 0 ? false : z);
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected ReactRootView createRootView() {
        ReactRootView reactRootView = new ReactRootView(getContext());
        reactRootView.setIsFabric(this.fabricEnabled);
        return reactRootView;
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected boolean isFabricEnabled() {
        return this.fabricEnabled;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DefaultReactActivityDelegate(ReactActivity activity, String mainComponentName, boolean z) {
        super(activity, mainComponentName);
        C9612q.m13917h(activity, "activity");
        C9612q.m13917h(mainComponentName, "mainComponentName");
        this.fabricEnabled = z;
    }

    @Override // com.facebook.react.ReactActivityDelegate
    protected ReactRootView createRootView(Bundle bundle) {
        ReactRootView reactRootView = new ReactRootView(getContext());
        reactRootView.setIsFabric(this.fabricEnabled);
        return reactRootView;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DefaultReactActivityDelegate(ReactActivity activity, String mainComponentName, boolean z, boolean z2) {
        this(activity, mainComponentName, z);
        C9612q.m13917h(activity, "activity");
        C9612q.m13917h(mainComponentName, "mainComponentName");
    }
}

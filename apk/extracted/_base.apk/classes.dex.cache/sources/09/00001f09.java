package com.discord.safearea;

import androidx.core.graphics.Insets;
import androidx.core.view.WindowInsetsCompat;
import com.discord.safearea.extensions.WindowInsetsCompatExtensionsKt;
import com.facebook.react.uimanager.ThemedReactContext;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, m14357d2 = {"<anonymous>", "", "insets", "Landroidx/core/view/WindowInsetsCompat;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SafeAreaProviderManager$addEventEmitters$2 extends AbstractC9614s implements Function1<WindowInsetsCompat, Unit> {
    final /* synthetic */ ThemedReactContext $reactContext;
    final /* synthetic */ SafeAreaProvider $view;
    final /* synthetic */ SafeAreaProviderManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeAreaProviderManager$addEventEmitters$2(SafeAreaProviderManager safeAreaProviderManager, ThemedReactContext themedReactContext, SafeAreaProvider safeAreaProvider) {
        super(1);
        this.this$0 = safeAreaProviderManager;
        this.$reactContext = themedReactContext;
        this.$view = safeAreaProvider;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(WindowInsetsCompat windowInsetsCompat) {
        invoke2(windowInsetsCompat);
        return Unit.f25302a;
    }

    /* renamed from: invoke */
    public final void invoke2(WindowInsetsCompat insets) {
        SafeAreaEdgeInsets safeAreaEdgeInsets;
        Insets insets2;
        C9612q.m13917h(insets, "insets");
        this.this$0.imeInsets = WindowInsetsCompatExtensionsKt.getImeInsets$default(insets, false, 1, null);
        SafeAreaProviderManager safeAreaProviderManager = this.this$0;
        ThemedReactContext themedReactContext = this.$reactContext;
        safeAreaEdgeInsets = safeAreaProviderManager.safeAreaEdgeInsets;
        insets2 = this.this$0.imeInsets;
        safeAreaProviderManager.handleInsetsChanged(themedReactContext, safeAreaEdgeInsets, insets2, this.$view);
    }
}
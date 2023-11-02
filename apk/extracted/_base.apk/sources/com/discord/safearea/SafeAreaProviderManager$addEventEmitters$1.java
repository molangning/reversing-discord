package com.discord.safearea;

import androidx.core.graphics.Insets;
import com.facebook.react.uimanager.ThemedReactContext;
import com.th3rdwave.safeareacontext.EdgeInsets;
import com.th3rdwave.safeareacontext.Rect;
import com.th3rdwave.safeareacontext.SafeAreaProvider;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(m14358d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\n¢\u0006\u0002\b\b"}, m14357d2 = {"<anonymous>", "", "<anonymous parameter 0>", "Lcom/th3rdwave/safeareacontext/SafeAreaProvider;", "insets", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "<anonymous parameter 2>", "Lcom/th3rdwave/safeareacontext/Rect;", "invoke"}, m14356k = 3, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public final class SafeAreaProviderManager$addEventEmitters$1 extends AbstractC9614s implements Function3<SafeAreaProvider, EdgeInsets, Rect, Unit> {
    final /* synthetic */ ThemedReactContext $reactContext;
    final /* synthetic */ SafeAreaProvider $view;
    final /* synthetic */ SafeAreaProviderManager this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SafeAreaProviderManager$addEventEmitters$1(SafeAreaProviderManager safeAreaProviderManager, ThemedReactContext themedReactContext, SafeAreaProvider safeAreaProvider) {
        super(3);
        this.this$0 = safeAreaProviderManager;
        this.$reactContext = themedReactContext;
        this.$view = safeAreaProvider;
    }

    @Override // kotlin.jvm.functions.Function3
    public /* bridge */ /* synthetic */ Unit invoke(SafeAreaProvider safeAreaProvider, EdgeInsets edgeInsets, Rect rect) {
        invoke2(safeAreaProvider, edgeInsets, rect);
        return Unit.f25302a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(SafeAreaProvider safeAreaProvider, EdgeInsets insets, Rect rect) {
        Insets insets2;
        C9612q.m13917h(safeAreaProvider, "<anonymous parameter 0>");
        C9612q.m13917h(insets, "insets");
        C9612q.m13917h(rect, "<anonymous parameter 2>");
        SafeAreaProviderManager safeAreaProviderManager = this.this$0;
        ThemedReactContext themedReactContext = this.$reactContext;
        SafeAreaEdgeInsets safeAreaEdgeInsets = new SafeAreaEdgeInsets(insets);
        insets2 = this.this$0.imeInsets;
        safeAreaProviderManager.handleInsetsChanged(themedReactContext, safeAreaEdgeInsets, insets2, this.$view);
    }
}

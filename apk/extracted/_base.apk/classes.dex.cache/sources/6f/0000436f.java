package me;

import android.content.Context;
import com.facebook.react.views.view.ReactViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0007\u001a\u00020\u0003H\u0016R\u0016\u0010\n\u001a\u00020\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\u000f"}, m14357d2 = {"Lme/d;", "Lcom/facebook/react/views/view/ReactViewGroup;", "Lme/c;", "", "value", "", "setIndex", "getIndex", "j", "I", "index", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "shopify_flash-list_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: me.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C10445d extends ReactViewGroup implements InterfaceC10444c {

    /* renamed from: j */
    private int f27285j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C10445d(Context context) {
        super(context);
        C9612q.m13917h(context, "context");
        this.f27285j = -1;
    }

    @Override // me.InterfaceC10444c
    public int getIndex() {
        return this.f27285j;
    }

    public void setIndex(int i) {
        this.f27285j = i;
    }
}
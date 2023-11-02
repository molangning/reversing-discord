package com.swmansion.rnscreens;

import android.content.Context;
import android.view.View;
import androidx.activity.AbstractC0256g;
import androidx.appcompat.widget.SearchView;
import androidx.fragment.app.Fragment;
import com.facebook.react.uimanager.ViewDefaults;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010%\u001a\u00020$\u0012\u0006\u0010'\u001a\u00020&¢\u0006\u0004\b(\u0010)J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002J\u000e\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005J\u0012\u0010\n\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0016J\u0012\u0010\f\u001a\u00020\u00022\b\u0010\t\u001a\u0004\u0018\u00010\u000bH\u0016J\b\u0010\r\u001a\u00020\u0002H\u0014J\b\u0010\u000e\u001a\u00020\u0002H\u0014R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0016\u0010\u0018\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR$\u0010#\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"¨\u0006*"}, m14357d2 = {"Lcom/swmansion/rnscreens/c;", "Landroidx/appcompat/widget/SearchView;", "", "p0", "o0", "", "text", "setText", "Landroidx/appcompat/widget/SearchView$l;", "listener", "setOnCloseListener", "Landroid/view/View$OnClickListener;", "setOnSearchClickListener", "onAttachedToWindow", "onDetachedFromWindow", "z0", "Landroidx/appcompat/widget/SearchView$l;", "mCustomOnCloseListener", "A0", "Landroid/view/View$OnClickListener;", "mCustomOnSearchClickedListener", "Landroidx/activity/g;", "B0", "Landroidx/activity/g;", "mOnBackPressedCallback", "Lcom/swmansion/rnscreens/f;", "C0", "Lcom/swmansion/rnscreens/f;", "backPressOverrider", "", "value", "getOverrideBackAction", "()Z", "setOverrideBackAction", "(Z)V", "overrideBackAction", "Landroid/content/Context;", "context", "Landroidx/fragment/app/Fragment;", "fragment", "<init>", "(Landroid/content/Context;Landroidx/fragment/app/Fragment;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5601c extends SearchView {

    /* renamed from: A0 */
    private View.OnClickListener f15609A0;

    /* renamed from: B0 */
    private AbstractC0256g f15610B0;

    /* renamed from: C0 */
    private final C5608f f15611C0;

    /* renamed from: z0 */
    private SearchView.InterfaceC0451l f15612z0;

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0003\u001a\u00020\u0002H\u0016¨\u0006\u0004"}, m14357d2 = {"com/swmansion/rnscreens/c$a", "Landroidx/activity/g;", "", "b", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: com.swmansion.rnscreens.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C5602a extends AbstractC0256g {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C5602a() {
            super(true);
            C5601c.this = r1;
        }

        @Override // androidx.activity.AbstractC0256g
        /* renamed from: b */
        public void mo24970b() {
            C5601c.this.setIconified(true);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5601c(Context context, Fragment fragment) {
        super(context);
        C9612q.m13917h(context, "context");
        C9612q.m13917h(fragment, "fragment");
        C5602a c5602a = new C5602a();
        this.f15610B0 = c5602a;
        this.f15611C0 = new C5608f(fragment, c5602a);
        super.setOnSearchClickListener(new View.OnClickListener() { // from class: com.swmansion.rnscreens.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C5601c.m24974m0(C5601c.this, view);
            }
        });
        super.setOnCloseListener(new SearchView.InterfaceC0451l() { // from class: com.swmansion.rnscreens.b
            @Override // androidx.appcompat.widget.SearchView.InterfaceC0451l
            /* renamed from: a */
            public final boolean mo24969a() {
                boolean m24973n0;
                m24973n0 = C5601c.m24973n0(C5601c.this);
                return m24973n0;
            }
        });
        setMaxWidth(ViewDefaults.NUMBER_OF_LINES);
    }

    /* renamed from: m0 */
    public static final void m24974m0(C5601c this$0, View view) {
        C9612q.m13917h(this$0, "this$0");
        View.OnClickListener onClickListener = this$0.f15609A0;
        if (onClickListener != null) {
            onClickListener.onClick(view);
        }
        this$0.f15611C0.m24967b();
    }

    /* renamed from: n0 */
    public static final boolean m24973n0(C5601c this$0) {
        boolean z;
        C9612q.m13917h(this$0, "this$0");
        SearchView.InterfaceC0451l interfaceC0451l = this$0.f15612z0;
        if (interfaceC0451l != null) {
            z = interfaceC0451l.mo24969a();
        } else {
            z = false;
        }
        this$0.f15611C0.m24966c();
        return z;
    }

    public final boolean getOverrideBackAction() {
        return this.f15611C0.m24968a();
    }

    /* renamed from: o0 */
    public final void m24972o0() {
        m40105b0("", false);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!m40123J()) {
            this.f15611C0.m24967b();
        }
    }

    @Override // androidx.appcompat.widget.SearchView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f15611C0.m24966c();
    }

    /* renamed from: p0 */
    public final void m24971p0() {
        setIconified(false);
        requestFocusFromTouch();
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnCloseListener(SearchView.InterfaceC0451l interfaceC0451l) {
        this.f15612z0 = interfaceC0451l;
    }

    @Override // androidx.appcompat.widget.SearchView
    public void setOnSearchClickListener(View.OnClickListener onClickListener) {
        this.f15609A0 = onClickListener;
    }

    public final void setOverrideBackAction(boolean z) {
        this.f15611C0.m24965d(z);
    }

    public final void setText(String text) {
        C9612q.m13917h(text, "text");
        m40105b0(text, false);
    }
}
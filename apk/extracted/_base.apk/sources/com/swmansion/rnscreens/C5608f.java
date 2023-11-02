package com.swmansion.rnscreens;

import androidx.activity.AbstractC0256g;
import androidx.activity.OnBackPressedDispatcher;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\b\u001a\u00020\u0005\u0012\u0006\u0010\u000b\u001a\u00020\t¢\u0006\u0004\b\u0013\u0010\u0014J\u0006\u0010\u0003\u001a\u00020\u0002J\u0006\u0010\u0004\u001a\u00020\u0002R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007R\u0014\u0010\u000b\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\nR\u0016\u0010\u000e\u001a\u00020\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0004\u0010\rR\"\u0010\u0012\u001a\u00020\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\r\u001a\u0004\b\u0006\u0010\u0010\"\u0004\b\u000f\u0010\u0011¨\u0006\u0015"}, m14357d2 = {"Lcom/swmansion/rnscreens/f;", "", "", "b", "c", "Landroidx/fragment/app/Fragment;", "a", "Landroidx/fragment/app/Fragment;", "fragment", "Landroidx/activity/g;", "Landroidx/activity/g;", "mOnBackPressedCallback", "", "Z", "mIsBackCallbackAdded", "d", "()Z", "(Z)V", "overrideBackAction", "<init>", "(Landroidx/fragment/app/Fragment;Landroidx/activity/g;)V", "react-native-screens_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.swmansion.rnscreens.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5608f {

    /* renamed from: a */
    private final Fragment f15618a;

    /* renamed from: b */
    private final AbstractC0256g f15619b;

    /* renamed from: c */
    private boolean f15620c;

    /* renamed from: d */
    private boolean f15621d;

    public C5608f(Fragment fragment, AbstractC0256g mOnBackPressedCallback) {
        C9612q.m13917h(fragment, "fragment");
        C9612q.m13917h(mOnBackPressedCallback, "mOnBackPressedCallback");
        this.f15618a = fragment;
        this.f15619b = mOnBackPressedCallback;
        this.f15621d = true;
    }

    /* renamed from: a */
    public final boolean m24968a() {
        return this.f15621d;
    }

    /* renamed from: b */
    public final void m24967b() {
        OnBackPressedDispatcher onBackPressedDispatcher;
        if (!this.f15620c && this.f15621d) {
            FragmentActivity activity = this.f15618a.getActivity();
            if (activity != null && (onBackPressedDispatcher = activity.getOnBackPressedDispatcher()) != null) {
                onBackPressedDispatcher.m40834b(this.f15618a, this.f15619b);
            }
            this.f15620c = true;
        }
    }

    /* renamed from: c */
    public final void m24966c() {
        if (this.f15620c) {
            this.f15619b.m40814d();
            this.f15620c = false;
        }
    }

    /* renamed from: d */
    public final void m24965d(boolean z) {
        this.f15621d = z;
    }
}

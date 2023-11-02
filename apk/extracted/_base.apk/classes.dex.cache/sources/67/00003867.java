package io.sentry.android.core.internal.gestures;

import android.content.res.Resources;
import android.view.View;
import android.widget.AbsListView;
import android.widget.ScrollView;
import androidx.core.view.ScrollingView;
import io.sentry.internal.gestures.C7981b;
import io.sentry.internal.gestures.InterfaceC7980a;

/* renamed from: io.sentry.android.core.internal.gestures.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7739a implements InterfaceC7980a {

    /* renamed from: a */
    private final boolean f21206a;

    /* renamed from: b */
    private final int[] f21207b = new int[2];

    public C7739a(boolean z) {
        this.f21206a = z;
    }

    /* renamed from: b */
    private C7981b m19831b(View view) {
        try {
            String m19793b = C7752j.m19793b(view);
            String canonicalName = view.getClass().getCanonicalName();
            if (canonicalName == null) {
                canonicalName = view.getClass().getSimpleName();
            }
            return new C7981b(view, canonicalName, m19793b, null, "old_view_system");
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static boolean m19830c(View view, boolean z) {
        if (z) {
            return ScrollingView.class.isAssignableFrom(view.getClass());
        }
        return false;
    }

    /* renamed from: d */
    private static boolean m19829d(View view, boolean z) {
        if ((m19830c(view, z) || AbsListView.class.isAssignableFrom(view.getClass()) || ScrollView.class.isAssignableFrom(view.getClass())) && view.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private static boolean m19828e(View view) {
        return view.isClickable() && view.getVisibility() == 0;
    }

    /* renamed from: f */
    private boolean m19827f(View view, float f, float f2) {
        view.getLocationOnScreen(this.f21207b);
        int[] iArr = this.f21207b;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = view.getWidth();
        int height = view.getHeight();
        if (f < i || f > i + width || f2 < i2 || f2 > i2 + height) {
            return false;
        }
        return true;
    }

    @Override // io.sentry.internal.gestures.InterfaceC7980a
    /* renamed from: a */
    public C7981b mo19107a(Object obj, float f, float f2, C7981b.EnumC7982a enumC7982a) {
        if (!(obj instanceof View)) {
            return null;
        }
        View view = (View) obj;
        if (m19827f(view, f, f2)) {
            if (enumC7982a == C7981b.EnumC7982a.CLICKABLE && m19828e(view)) {
                return m19831b(view);
            }
            if (enumC7982a == C7981b.EnumC7982a.SCROLLABLE && m19829d(view, this.f21206a)) {
                return m19831b(view);
            }
        }
        return null;
    }
}
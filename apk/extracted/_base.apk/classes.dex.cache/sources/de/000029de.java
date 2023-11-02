package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.text.Layout;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.webkit.WebView;
import android.widget.FrameLayout;
import com.facebook.react.uimanager.ViewProps;
import com.google.android.exoplayer2.p049ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p195k8.C9191p0;
import p383v7.C13126a;
import p383v7.C13127b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.ui.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4510i extends FrameLayout implements SubtitleView.InterfaceC4493a {

    /* renamed from: j */
    private final C4497a f12216j;

    /* renamed from: k */
    private final WebView f12217k;

    /* renamed from: l */
    private List<C13127b> f12218l;

    /* renamed from: m */
    private C13126a f12219m;

    /* renamed from: n */
    private float f12220n;

    /* renamed from: o */
    private int f12221o;

    /* renamed from: p */
    private float f12222p;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.exoplayer2.ui.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4511a extends WebView {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4511a(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            C4510i.this = r1;
        }

        @Override // android.webkit.WebView, android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            super.onTouchEvent(motionEvent);
            return false;
        }

        @Override // android.view.View
        public boolean performClick() {
            super.performClick();
            return false;
        }
    }

    /* renamed from: com.google.android.exoplayer2.ui.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C4512b {

        /* renamed from: a */
        static final /* synthetic */ int[] f12224a;

        static {
            int[] iArr = new int[Layout.Alignment.values().length];
            f12224a = iArr;
            try {
                iArr[Layout.Alignment.ALIGN_NORMAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f12224a[Layout.Alignment.ALIGN_OPPOSITE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f12224a[Layout.Alignment.ALIGN_CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C4510i(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static int m28792b(int i) {
        if (i != 1) {
            return i != 2 ? 0 : -100;
        }
        return -50;
    }

    /* renamed from: c */
    private static String m28791c(Layout.Alignment alignment) {
        if (alignment == null) {
            return "center";
        }
        int i = C4512b.f12224a[alignment.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return "center";
            }
            return ViewProps.END;
        }
        return ViewProps.START;
    }

    /* renamed from: d */
    private static String m28790d(C13126a c13126a) {
        int i = c13126a.f34098d;
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        return "unset";
                    }
                    return C9191p0.m16307D("-0.05em -0.05em 0.15em %s", C4498b.m28823b(c13126a.f34099e));
                }
                return C9191p0.m16307D("0.06em 0.08em 0.15em %s", C4498b.m28823b(c13126a.f34099e));
            }
            return C9191p0.m16307D("0.1em 0.12em 0.15em %s", C4498b.m28823b(c13126a.f34099e));
        }
        return C9191p0.m16307D("1px 1px 0 %1$s, 1px -1px 0 %1$s, -1px 1px 0 %1$s, -1px -1px 0 %1$s", C4498b.m28823b(c13126a.f34099e));
    }

    /* renamed from: e */
    private String m28789e(int i, float f) {
        float m28799a = C4507g.m28799a(i, f, getHeight(), (getHeight() - getPaddingTop()) - getPaddingBottom());
        if (m28799a == -3.4028235E38f) {
            return "unset";
        }
        return C9191p0.m16307D("%.2fpx", Float.valueOf(m28799a / getContext().getResources().getDisplayMetrics().density));
    }

    /* renamed from: f */
    private static String m28788f(int i) {
        return i != 1 ? i != 2 ? "horizontal-tb" : "vertical-lr" : "vertical-rl";
    }

    /* renamed from: h */
    private static String m28786h(C13127b c13127b) {
        String str;
        float f = c13127b.f34117p;
        if (f != 0.0f) {
            int i = c13127b.f34116o;
            if (i != 2 && i != 1) {
                str = "skewX";
            } else {
                str = "skewY";
            }
            return C9191p0.m16307D("%s(%.2fdeg)", str, Float.valueOf(f));
        }
        return "";
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x0144, code lost:
        if (r13 != 0) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:112:0x0147, code lost:
        if (r13 != 0) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x0149, code lost:
        r20 = com.facebook.react.uimanager.ViewProps.LEFT;
     */
    /* JADX WARN: Code restructure failed: missing block: B:114:0x014b, code lost:
        r21 = com.facebook.react.uimanager.ViewProps.TOP;
        r13 = 2;
        r22 = r20;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x013b  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0183  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0107  */
    /* renamed from: i */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m28785i() {
        /*
            Method dump skipped, instructions count: 653
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.exoplayer2.p049ui.C4510i.m28785i():void");
    }

    @Override // com.google.android.exoplayer2.p049ui.SubtitleView.InterfaceC4493a
    /* renamed from: a */
    public void mo28793a(List<C13127b> list, C13126a c13126a, float f, int i, float f2) {
        this.f12219m = c13126a;
        this.f12220n = f;
        this.f12221o = i;
        this.f12222p = f2;
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i2 = 0; i2 < list.size(); i2++) {
            C13127b c13127b = list.get(i2);
            if (c13127b.f34104c != null) {
                arrayList.add(c13127b);
            } else {
                arrayList2.add(c13127b);
            }
        }
        if (!this.f12218l.isEmpty() || !arrayList2.isEmpty()) {
            this.f12218l = arrayList2;
            m28785i();
        }
        this.f12216j.mo28793a(arrayList, c13126a, f, i, f2);
        invalidate();
    }

    /* renamed from: g */
    public void m28787g() {
        this.f12217k.destroy();
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        if (z && !this.f12218l.isEmpty()) {
            m28785i();
        }
    }

    public C4510i(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12218l = Collections.emptyList();
        this.f12219m = C13126a.f34094g;
        this.f12220n = 0.0533f;
        this.f12221o = 0;
        this.f12222p = 0.08f;
        C4497a c4497a = new C4497a(context, attributeSet);
        this.f12216j = c4497a;
        C4511a c4511a = new C4511a(context, attributeSet);
        this.f12217k = c4511a;
        c4511a.setBackgroundColor(0);
        addView(c4497a);
        addView(c4511a);
    }
}
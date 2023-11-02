package com.google.android.exoplayer2.p049ui;

import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import com.google.android.exoplayer2.p049ui.SubtitleView;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import p383v7.C13126a;
import p383v7.C13127b;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.google.android.exoplayer2.ui.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4497a extends View implements SubtitleView.InterfaceC4493a {

    /* renamed from: j */
    private final List<C4506f> f12163j;

    /* renamed from: k */
    private List<C13127b> f12164k;

    /* renamed from: l */
    private int f12165l;

    /* renamed from: m */
    private float f12166m;

    /* renamed from: n */
    private C13126a f12167n;

    /* renamed from: o */
    private float f12168o;

    public C4497a(Context context) {
        this(context, null);
    }

    /* renamed from: b */
    private static C13127b m28825b(C13127b c13127b) {
        C13127b.C13129b m3141o = c13127b.m3156a().m3146j(-3.4028235E38f).m3145k(Integer.MIN_VALUE).m3141o(null);
        if (c13127b.f34106e == 0) {
            m3141o.m3148h(1.0f - c13127b.f34105d, 0);
        } else {
            m3141o.m3148h((-c13127b.f34105d) - 1.0f, 1);
        }
        int i = c13127b.f34107f;
        if (i != 0) {
            if (i == 2) {
                m3141o.m3147i(0);
            }
        } else {
            m3141o.m3147i(2);
        }
        return m3141o.m3155a();
    }

    @Override // com.google.android.exoplayer2.p049ui.SubtitleView.InterfaceC4493a
    /* renamed from: a */
    public void mo28793a(List<C13127b> list, C13126a c13126a, float f, int i, float f2) {
        this.f12164k = list;
        this.f12167n = c13126a;
        this.f12166m = f;
        this.f12165l = i;
        this.f12168o = f2;
        while (this.f12163j.size() < list.size()) {
            this.f12163j.add(new C4506f(getContext()));
        }
        invalidate();
    }

    @Override // android.view.View
    public void dispatchDraw(Canvas canvas) {
        List<C13127b> list = this.f12164k;
        if (list.isEmpty()) {
            return;
        }
        int height = getHeight();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int width = getWidth() - getPaddingRight();
        int paddingBottom = height - getPaddingBottom();
        if (paddingBottom > paddingTop && width > paddingLeft) {
            int i = paddingBottom - paddingTop;
            float m28799a = C4507g.m28799a(this.f12165l, this.f12166m, height, i);
            if (m28799a <= 0.0f) {
                return;
            }
            int size = list.size();
            int i2 = 0;
            while (i2 < size) {
                C13127b c13127b = list.get(i2);
                if (c13127b.f34116o != Integer.MIN_VALUE) {
                    c13127b = m28825b(c13127b);
                }
                C13127b c13127b2 = c13127b;
                int i3 = paddingBottom;
                this.f12163j.get(i2).m28805b(c13127b2, this.f12167n, m28799a, C4507g.m28799a(c13127b2.f34114m, c13127b2.f34115n, height, i), this.f12168o, canvas, paddingLeft, paddingTop, width, i3);
                i2++;
                size = size;
                i = i;
                paddingBottom = i3;
                width = width;
            }
        }
    }

    public C4497a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f12163j = new ArrayList();
        this.f12164k = Collections.emptyList();
        this.f12165l = 0;
        this.f12166m = 0.0533f;
        this.f12167n = C13126a.f34094g;
        this.f12168o = 0.08f;
    }
}
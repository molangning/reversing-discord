package com.facebook.drawee.span;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.text.SpannableStringBuilder;
import android.view.View;
import com.facebook.drawee.controller.AbstractC3591a;
import com.facebook.drawee.interfaces.DraweeController;
import com.facebook.drawee.interfaces.DraweeHierarchy;
import com.facebook.drawee.view.DraweeHolder;
import com.facebook.imagepipeline.image.ImageInfo;
import java.util.HashSet;
import java.util.Set;
import p293q3.C11696a;
import p394w2.C13379j;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class DraweeSpanStringBuilder extends SpannableStringBuilder {

    /* renamed from: j */
    private final Set<C3635a> f9998j;

    /* renamed from: k */
    private final C3632b f9999k;

    /* renamed from: l */
    private View f10000l;

    /* renamed from: m */
    private Drawable f10001m;

    /* renamed from: com.facebook.drawee.span.DraweeSpanStringBuilder$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3632b implements Drawable.Callback {
        private C3632b() {
            DraweeSpanStringBuilder.this = r1;
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            if (DraweeSpanStringBuilder.this.f10000l != null) {
                DraweeSpanStringBuilder.this.f10000l.invalidate();
            } else if (DraweeSpanStringBuilder.this.f10001m != null) {
                DraweeSpanStringBuilder.this.f10001m.invalidateSelf();
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            if (DraweeSpanStringBuilder.this.f10000l != null) {
                DraweeSpanStringBuilder.this.f10000l.postDelayed(runnable, j - SystemClock.uptimeMillis());
            } else if (DraweeSpanStringBuilder.this.f10001m != null) {
                DraweeSpanStringBuilder.this.f10001m.scheduleSelf(runnable, j);
            }
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            if (DraweeSpanStringBuilder.this.f10000l != null) {
                DraweeSpanStringBuilder.this.f10000l.removeCallbacks(runnable);
            } else if (DraweeSpanStringBuilder.this.f10001m != null) {
                DraweeSpanStringBuilder.this.f10001m.unscheduleSelf(runnable);
            }
        }
    }

    /* renamed from: com.facebook.drawee.span.DraweeSpanStringBuilder$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C3633c extends C11696a<ImageInfo> {

        /* renamed from: k */
        private final C3635a f10003k;

        /* renamed from: l */
        private final boolean f10004l;

        /* renamed from: m */
        private final int f10005m;

        public C3633c(C3635a c3635a, boolean z, int i) {
            DraweeSpanStringBuilder.this = r1;
            C13379j.m2677g(c3635a);
            this.f10003k = c3635a;
            this.f10004l = z;
            this.f10005m = i;
        }

        @Override // p293q3.C11696a, com.facebook.drawee.controller.ControllerListener
        /* renamed from: b */
        public void onFinalImageSet(String str, ImageInfo imageInfo, Animatable animatable) {
            if (this.f10004l && imageInfo != null && this.f10003k.m31368c().m31356h() != null) {
                Drawable m31356h = this.f10003k.m31368c().m31356h();
                Rect bounds = m31356h.getBounds();
                int i = this.f10005m;
                if (i != -1) {
                    int height = (int) ((i / imageInfo.getHeight()) * imageInfo.getWidth());
                    if (bounds.width() != height || bounds.height() != this.f10005m) {
                        m31356h.setBounds(0, 0, height, this.f10005m);
                        DraweeSpanStringBuilder.m31381c(DraweeSpanStringBuilder.this);
                    }
                } else if (bounds.width() != imageInfo.getWidth() || bounds.height() != imageInfo.getHeight()) {
                    m31356h.setBounds(0, 0, imageInfo.getWidth(), imageInfo.getHeight());
                    DraweeSpanStringBuilder.m31381c(DraweeSpanStringBuilder.this);
                }
            }
        }
    }

    /* renamed from: com.facebook.drawee.span.DraweeSpanStringBuilder$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC3634d {
    }

    public DraweeSpanStringBuilder() {
        this.f9998j = new HashSet();
        this.f9999k = new C3632b();
    }

    /* renamed from: c */
    static /* synthetic */ InterfaceC3634d m31381c(DraweeSpanStringBuilder draweeSpanStringBuilder) {
        draweeSpanStringBuilder.getClass();
        return null;
    }

    /* renamed from: d */
    protected void m31380d(View view) {
        m31371m();
        this.f10000l = view;
    }

    /* renamed from: e */
    void m31379e() {
        for (C3635a c3635a : this.f9998j) {
            c3635a.m31367d();
        }
    }

    /* renamed from: f */
    public void m31378f(View view) {
        m31380d(view);
        m31379e();
    }

    /* renamed from: g */
    void m31377g() {
        for (C3635a c3635a : this.f9998j) {
            c3635a.m31366e();
        }
    }

    /* renamed from: h */
    public void m31376h(View view) {
        m31370n(view);
        m31377g();
    }

    /* renamed from: i */
    public void m31375i(Context context, DraweeHierarchy draweeHierarchy, DraweeController draweeController, int i, int i2, int i3, int i4, boolean z, int i5) {
        DraweeHolder m31360d = DraweeHolder.m31360d(draweeHierarchy, context);
        m31360d.m31349o(draweeController);
        m31373k(m31360d, i, i2, i3, i4, z, i5);
    }

    /* renamed from: j */
    public void m31374j(Context context, DraweeHierarchy draweeHierarchy, DraweeController draweeController, int i, int i2, int i3, boolean z, int i4) {
        m31375i(context, draweeHierarchy, draweeController, i, i, i2, i3, z, i4);
    }

    /* renamed from: k */
    public void m31373k(DraweeHolder draweeHolder, int i, int i2, int i3, int i4, boolean z, int i5) {
        if (i2 >= length()) {
            return;
        }
        Drawable m31356h = draweeHolder.m31356h();
        if (m31356h != null) {
            if (m31356h.getBounds().isEmpty()) {
                m31356h.setBounds(0, 0, i3, i4);
            }
            m31356h.setCallback(this.f9999k);
        }
        C3635a c3635a = new C3635a(draweeHolder, i5);
        DraweeController m31358f = draweeHolder.m31358f();
        if (m31358f instanceof AbstractC3591a) {
            ((AbstractC3591a) m31358f).m31562j(new C3633c(c3635a, z, i4));
        }
        this.f9998j.add(c3635a);
        setSpan(c3635a, i, i2 + 1, 33);
    }

    /* renamed from: l */
    protected void m31372l(Drawable drawable) {
        if (drawable != this.f10001m) {
            return;
        }
        this.f10001m = null;
    }

    /* renamed from: m */
    protected void m31371m() {
        View view = this.f10000l;
        if (view != null) {
            m31370n(view);
        }
        Drawable drawable = this.f10001m;
        if (drawable != null) {
            m31372l(drawable);
        }
    }

    /* renamed from: n */
    protected void m31370n(View view) {
        if (view != this.f10000l) {
            return;
        }
        this.f10000l = null;
    }

    public DraweeSpanStringBuilder(CharSequence charSequence) {
        super(charSequence);
        this.f9998j = new HashSet();
        this.f9999k = new C3632b();
    }
}
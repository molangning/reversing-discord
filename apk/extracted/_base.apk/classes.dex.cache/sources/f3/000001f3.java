package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.view.C1365w0;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: j */
    private TypedValue f1567j;

    /* renamed from: k */
    private TypedValue f1568k;

    /* renamed from: l */
    private TypedValue f1569l;

    /* renamed from: m */
    private TypedValue f1570m;

    /* renamed from: n */
    private TypedValue f1571n;

    /* renamed from: o */
    private TypedValue f1572o;

    /* renamed from: p */
    private final Rect f1573p;

    /* renamed from: q */
    private InterfaceC0438a f1574q;

    /* renamed from: androidx.appcompat.widget.ContentFrameLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC0438a {
        /* renamed from: a */
        void mo40133a();

        void onDetachedFromWindow();
    }

    public ContentFrameLayout(Context context) {
        this(context, null);
    }

    /* renamed from: a */
    public void m40134a(int i, int i2, int i3, int i4) {
        this.f1573p.set(i, i2, i3, i4);
        if (C1365w0.m37224U(this)) {
            requestLayout();
        }
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f1571n == null) {
            this.f1571n = new TypedValue();
        }
        return this.f1571n;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f1572o == null) {
            this.f1572o = new TypedValue();
        }
        return this.f1572o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f1569l == null) {
            this.f1569l = new TypedValue();
        }
        return this.f1569l;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f1570m == null) {
            this.f1570m = new TypedValue();
        }
        return this.f1570m;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f1567j == null) {
            this.f1567j = new TypedValue();
        }
        return this.f1567j;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f1568k == null) {
            this.f1568k = new TypedValue();
        }
        return this.f1568k;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0438a interfaceC0438a = this.f1574q;
        if (interfaceC0438a != null) {
            interfaceC0438a.mo40133a();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        InterfaceC0438a interfaceC0438a = this.f1574q;
        if (interfaceC0438a != null) {
            interfaceC0438a.onDetachedFromWindow();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x00be  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:123:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:83:0x004a  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0086  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r14, int r15) {
        /*
            Method dump skipped, instructions count: 226
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0438a interfaceC0438a) {
        this.f1574q = interfaceC0438a;
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public ContentFrameLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f1573p = new Rect();
    }
}
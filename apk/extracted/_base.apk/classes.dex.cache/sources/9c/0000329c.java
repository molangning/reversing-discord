package p090f;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import p090f.C6278b;

/* renamed from: f.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6284d extends C6278b {

    /* renamed from: v */
    private C6285a f17777v;

    /* renamed from: w */
    private boolean f17778w;

    /* renamed from: f.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6285a extends C6278b.AbstractC6282d {

        /* renamed from: J */
        int[][] f17779J;

        public C6285a(C6285a c6285a, C6284d c6284d, Resources resources) {
            super(c6285a, c6284d, resources);
            if (c6285a != null) {
                this.f17779J = c6285a.f17779J;
            } else {
                this.f17779J = new int[m23079f()];
            }
        }

        /* renamed from: A */
        public int m23056A(int[] iArr) {
            int[][] iArr2 = this.f17779J;
            int m23077h = m23077h();
            for (int i = 0; i < m23077h; i++) {
                if (StateSet.stateSetMatches(iArr2[i], iArr)) {
                    return i;
                }
            }
            return -1;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C6284d(this, null);
        }

        @Override // p090f.C6278b.AbstractC6282d
        /* renamed from: o */
        public void mo23055o(int i, int i2) {
            super.mo23055o(i, i2);
            int[][] iArr = new int[i2];
            System.arraycopy(this.f17779J, 0, iArr, 0, i);
            this.f17779J = iArr;
        }

        @Override // p090f.C6278b.AbstractC6282d
        /* renamed from: r */
        void mo23054r() {
            int[] iArr;
            int[][] iArr2 = this.f17779J;
            int[][] iArr3 = new int[iArr2.length];
            for (int length = iArr2.length - 1; length >= 0; length--) {
                int[] iArr4 = this.f17779J[length];
                if (iArr4 != null) {
                    iArr = (int[]) iArr4.clone();
                } else {
                    iArr = null;
                }
                iArr3[length] = iArr;
            }
            this.f17779J = iArr3;
        }

        /* renamed from: z */
        public int m23053z(int[] iArr, Drawable drawable) {
            int m23084a = m23084a(drawable);
            this.f17779J[m23084a] = iArr;
            return m23084a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C6284d(this, resources);
        }
    }

    C6284d(C6285a c6285a, Resources resources) {
        mo23059h(new C6285a(c6285a, this, resources));
        onStateChange(getState());
    }

    @Override // p090f.C6278b, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        super.applyTheme(theme);
        onStateChange(getState());
    }

    @Override // p090f.C6278b
    /* renamed from: h */
    public void mo23059h(C6278b.AbstractC6282d abstractC6282d) {
        super.mo23059h(abstractC6282d);
        if (abstractC6282d instanceof C6285a) {
            this.f17777v = (C6285a) abstractC6282d;
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p090f.C6278b
    /* renamed from: j */
    public C6285a mo23060b() {
        return new C6285a(this.f17777v, this, null);
    }

    /* renamed from: k */
    public int[] m23057k(AttributeSet attributeSet) {
        int attributeCount = attributeSet.getAttributeCount();
        int[] iArr = new int[attributeCount];
        int i = 0;
        for (int i2 = 0; i2 < attributeCount; i2++) {
            int attributeNameResource = attributeSet.getAttributeNameResource(i2);
            if (attributeNameResource != 0 && attributeNameResource != 16842960 && attributeNameResource != 16843161) {
                int i3 = i + 1;
                if (!attributeSet.getAttributeBooleanValue(i2, false)) {
                    attributeNameResource = -attributeNameResource;
                }
                iArr[i] = attributeNameResource;
                i = i3;
            }
        }
        return StateSet.trimStateSet(iArr, i);
    }

    @Override // p090f.C6278b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17778w && super.mutate() == this) {
            this.f17777v.mo23054r();
            this.f17778w = true;
        }
        return this;
    }

    @Override // p090f.C6278b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        int m23056A = this.f17777v.m23056A(iArr);
        if (m23056A < 0) {
            m23056A = this.f17777v.m23056A(StateSet.WILD_CARD);
        }
        if (!m23091g(m23056A) && !onStateChange) {
            return false;
        }
        return true;
    }

    public C6284d(C6285a c6285a) {
        if (c6285a != null) {
            mo23059h(c6285a);
        }
    }
}
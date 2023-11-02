package la;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0506f;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.widget.C1419c;
import com.google.android.material.internal.C4911o;
import p155ia.C7480b;
import p155ia.C7488j;
import pa.C11487a;

/* renamed from: la.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10102a extends C0506f {

    /* renamed from: q */
    private static final int f26329q = C7488j.f20278o;

    /* renamed from: r */
    private static final int[][] f26330r = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: n */
    private ColorStateList f26331n;

    /* renamed from: o */
    private boolean f26332o;

    /* renamed from: p */
    private boolean f26333p;

    public C10102a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20101d);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f26331n == null) {
            int[][] iArr = f26330r;
            int[] iArr2 = new int[iArr.length];
            int m8016d = C11487a.m8016d(this, C7480b.f20105h);
            int m8016d2 = C11487a.m8016d(this, C7480b.f20110m);
            int m8016d3 = C11487a.m8016d(this, C7480b.f20107j);
            iArr2[0] = C11487a.m8012h(m8016d2, m8016d, 1.0f);
            iArr2[1] = C11487a.m8012h(m8016d2, m8016d3, 0.54f);
            iArr2[2] = C11487a.m8012h(m8016d2, m8016d3, 0.38f);
            iArr2[3] = C11487a.m8012h(m8016d2, m8016d3, 0.38f);
            this.f26331n = new ColorStateList(iArr, iArr2);
        }
        return this.f26331n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f26332o && C1419c.m36921b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    @Override // android.widget.CompoundButton, android.widget.TextView, android.view.View
    protected void onDraw(Canvas canvas) {
        Drawable m36922a;
        int i;
        if (this.f26333p && TextUtils.isEmpty(getText()) && (m36922a = C1419c.m36922a(this)) != null) {
            if (C4911o.m26933e(this)) {
                i = -1;
            } else {
                i = 1;
            }
            int width = ((getWidth() - m36922a.getIntrinsicWidth()) / 2) * i;
            int save = canvas.save();
            canvas.translate(width, 0.0f);
            super.onDraw(canvas);
            canvas.restoreToCount(save);
            if (getBackground() != null) {
                Rect bounds = m36922a.getBounds();
                C1013a.m38086l(getBackground(), bounds.left + width, bounds.top, bounds.right + width, bounds.bottom);
                return;
            }
            return;
        }
        super.onDraw(canvas);
    }

    public void setCenterIfNoTextEnabled(boolean z) {
        this.f26333p = z;
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f26332o = z;
        if (z) {
            C1419c.m36920c(this, getMaterialThemeColorsTintList());
        } else {
            C1419c.m36920c(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public C10102a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = la.C10102a.f26329q
            android.content.Context r8 = p064db.C5810a.m24498c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p155ia.C7489k.f20686y3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r10 = p155ia.C7489k.f20694z3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p443ya.C13957c.m1089a(r8, r9, r10)
            androidx.core.widget.C1419c.m36920c(r7, r8)
        L28:
            int r8 = p155ia.C7489k.f20298B3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f26332o = r8
            int r8 = p155ia.C7489k.f20290A3
            r10 = 1
            boolean r8 = r9.getBoolean(r8, r10)
            r7.f26333p = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: la.C10102a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}
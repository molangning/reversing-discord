package p422xa;

import android.content.Context;
import android.content.res.ColorStateList;
import android.util.AttributeSet;
import androidx.appcompat.widget.C0554q;
import androidx.core.widget.C1419c;
import p155ia.C7480b;
import p155ia.C7488j;
import pa.C11487a;

/* renamed from: xa.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13774a extends C0554q {

    /* renamed from: p */
    private static final int f35511p = C7488j.f20279p;

    /* renamed from: q */
    private static final int[][] f35512q = {new int[]{16842910, 16842912}, new int[]{16842910, -16842912}, new int[]{-16842910, 16842912}, new int[]{-16842910, -16842912}};

    /* renamed from: n */
    private ColorStateList f35513n;

    /* renamed from: o */
    private boolean f35514o;

    public C13774a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20087B);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f35513n == null) {
            int m8016d = C11487a.m8016d(this, C7480b.f20105h);
            int m8016d2 = C11487a.m8016d(this, C7480b.f20107j);
            int m8016d3 = C11487a.m8016d(this, C7480b.f20110m);
            int[][] iArr = f35512q;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = C11487a.m8012h(m8016d3, m8016d, 1.0f);
            iArr2[1] = C11487a.m8012h(m8016d3, m8016d2, 0.54f);
            iArr2[2] = C11487a.m8012h(m8016d3, m8016d2, 0.38f);
            iArr2[3] = C11487a.m8012h(m8016d3, m8016d2, 0.38f);
            this.f35513n = new ColorStateList(iArr, iArr2);
        }
        return this.f35513n;
    }

    @Override // android.widget.TextView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f35514o && C1419c.m36921b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z) {
        this.f35514o = z;
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
    public C13774a(android.content.Context r8, android.util.AttributeSet r9, int r10) {
        /*
            r7 = this;
            int r4 = p422xa.C13774a.f35511p
            android.content.Context r8 = p064db.C5810a.m24498c(r8, r9, r10, r4)
            r7.<init>(r8, r9, r10)
            android.content.Context r8 = r7.getContext()
            int[] r2 = p155ia.C7489k.f20314D3
            r6 = 0
            int[] r5 = new int[r6]
            r0 = r8
            r1 = r9
            r3 = r10
            android.content.res.TypedArray r9 = com.google.android.material.internal.C4908m.m26945h(r0, r1, r2, r3, r4, r5)
            int r10 = p155ia.C7489k.f20322E3
            boolean r0 = r9.hasValue(r10)
            if (r0 == 0) goto L28
            android.content.res.ColorStateList r8 = p443ya.C13957c.m1089a(r8, r9, r10)
            androidx.core.widget.C1419c.m36920c(r7, r8)
        L28:
            int r8 = p155ia.C7489k.f20330F3
            boolean r8 = r9.getBoolean(r8, r6)
            r7.f35514o = r8
            r9.recycle()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p422xa.C13774a.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }
}

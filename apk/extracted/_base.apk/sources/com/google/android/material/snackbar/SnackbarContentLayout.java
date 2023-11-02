package com.google.android.material.snackbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1365w0;
import p155ia.C7484f;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class SnackbarContentLayout extends LinearLayout implements InterfaceC4956a {

    /* renamed from: j */
    private TextView f13914j;

    /* renamed from: k */
    private Button f13915k;

    /* renamed from: l */
    private int f13916l;

    public SnackbarContentLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: c */
    private static void m26784c(View view, int i, int i2) {
        if (C1365w0.m37222W(view)) {
            C1365w0.m37249F0(view, C1365w0.m37248G(view), i, C1365w0.m37250F(view), i2);
        } else {
            view.setPadding(view.getPaddingLeft(), i, view.getPaddingRight(), i2);
        }
    }

    /* renamed from: d */
    private boolean m26783d(int i, int i2, int i3) {
        boolean z;
        if (i != getOrientation()) {
            setOrientation(i);
            z = true;
        } else {
            z = false;
        }
        if (this.f13914j.getPaddingTop() == i2 && this.f13914j.getPaddingBottom() == i3) {
            return z;
        }
        m26784c(this.f13914j, i2, i3);
        return true;
    }

    @Override // com.google.android.material.snackbar.InterfaceC4956a
    /* renamed from: a */
    public void mo26782a(int i, int i2) {
        this.f13914j.setAlpha(0.0f);
        long j = i2;
        long j2 = i;
        this.f13914j.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f13915k.getVisibility() == 0) {
            this.f13915k.setAlpha(0.0f);
            this.f13915k.animate().alpha(1.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    @Override // com.google.android.material.snackbar.InterfaceC4956a
    /* renamed from: b */
    public void mo26781b(int i, int i2) {
        this.f13914j.setAlpha(1.0f);
        long j = i2;
        long j2 = i;
        this.f13914j.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        if (this.f13915k.getVisibility() == 0) {
            this.f13915k.setAlpha(1.0f);
            this.f13915k.animate().alpha(0.0f).setDuration(j).setStartDelay(j2).start();
        }
    }

    public Button getActionView() {
        return this.f13915k;
    }

    public TextView getMessageView() {
        return this.f13914j;
    }

    @Override // android.view.View
    protected void onFinishInflate() {
        super.onFinishInflate();
        this.f13914j = (TextView) findViewById(C7484f.f20193I);
        this.f13915k = (Button) findViewById(C7484f.f20192H);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0045, code lost:
        if (m26783d(1, r0, r0 - r2) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0050, code lost:
        if (m26783d(0, r0, r0) != false) goto L16;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0053, code lost:
        r1 = false;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0054, code lost:
        if (r1 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0056, code lost:
        super.onMeasure(r8, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0059, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:?, code lost:
        return;
     */
    @Override // android.widget.LinearLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    protected void onMeasure(int r8, int r9) {
        /*
            r7 = this;
            super.onMeasure(r8, r9)
            int r0 = r7.getOrientation()
            r1 = 1
            if (r0 != r1) goto Lb
            return
        Lb:
            android.content.res.Resources r0 = r7.getResources()
            int r2 = p155ia.C7482d.f20158g
            int r0 = r0.getDimensionPixelSize(r2)
            android.content.res.Resources r2 = r7.getResources()
            int r3 = p155ia.C7482d.f20157f
            int r2 = r2.getDimensionPixelSize(r3)
            android.widget.TextView r3 = r7.f13914j
            android.text.Layout r3 = r3.getLayout()
            int r3 = r3.getLineCount()
            r4 = 0
            if (r3 <= r1) goto L2e
            r3 = r1
            goto L2f
        L2e:
            r3 = r4
        L2f:
            if (r3 == 0) goto L48
            int r5 = r7.f13916l
            if (r5 <= 0) goto L48
            android.widget.Button r5 = r7.f13915k
            int r5 = r5.getMeasuredWidth()
            int r6 = r7.f13916l
            if (r5 <= r6) goto L48
            int r2 = r0 - r2
            boolean r0 = r7.m26783d(r1, r0, r2)
            if (r0 == 0) goto L53
            goto L54
        L48:
            if (r3 == 0) goto L4b
            goto L4c
        L4b:
            r0 = r2
        L4c:
            boolean r0 = r7.m26783d(r4, r0, r0)
            if (r0 == 0) goto L53
            goto L54
        L53:
            r1 = r4
        L54:
            if (r1 == 0) goto L59
            super.onMeasure(r8, r9)
        L59:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.snackbar.SnackbarContentLayout.onMeasure(int, int):void");
    }

    public void setMaxInlineActionWidth(int i) {
        this.f13916l = i;
    }
}

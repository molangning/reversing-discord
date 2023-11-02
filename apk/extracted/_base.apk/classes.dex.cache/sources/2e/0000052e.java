package androidx.core.view.accessibility;

import android.os.Bundle;
import android.text.style.ClickableSpan;
import android.view.View;

/* renamed from: androidx.core.view.accessibility.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1194a extends ClickableSpan {

    /* renamed from: j */
    private final int f3638j;

    /* renamed from: k */
    private final AccessibilityNodeInfoCompat f3639k;

    /* renamed from: l */
    private final int f3640l;

    public C1194a(int i, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat, int i2) {
        this.f3638j = i;
        this.f3639k = accessibilityNodeInfoCompat;
        this.f3640l = i2;
    }

    @Override // android.text.style.ClickableSpan
    public void onClick(View view) {
        Bundle bundle = new Bundle();
        bundle.putInt("ACCESSIBILITY_CLICKABLE_SPAN_ID", this.f3638j);
        this.f3639k.m37607W(this.f3640l, bundle);
    }
}
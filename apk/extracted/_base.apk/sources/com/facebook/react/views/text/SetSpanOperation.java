package com.facebook.react.views.text;

import android.text.SpannableStringBuilder;
import p414x2.C13677a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class SetSpanOperation {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    static final int SPAN_MAX_PRIORITY = 255;
    private static final String TAG = "SetSpanOperation";
    protected int end;
    protected int start;
    protected ReactSpan what;

    /* JADX INFO: Access modifiers changed from: package-private */
    public SetSpanOperation(int i, int i2, ReactSpan reactSpan) {
        this.start = i;
        this.end = i2;
        this.what = reactSpan;
    }

    public void execute(SpannableStringBuilder spannableStringBuilder, int i) {
        int i2;
        if (this.start == 0) {
            i2 = 18;
        } else {
            i2 = 34;
        }
        int i3 = 255 - i;
        if (i3 < 0) {
            C13677a.m1870H(TAG, "Text tree size exceeded the limit, styling may become unpredictable");
        }
        spannableStringBuilder.setSpan(this.what, this.start, this.end, ((Math.max(i3, 0) << 16) & 16711680) | (i2 & (-16711681)));
    }
}

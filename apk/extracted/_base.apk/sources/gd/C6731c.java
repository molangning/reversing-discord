package gd;

import android.view.View;
import android.widget.LinearLayout;
import com.henninghall.date_picker.C5149h;

/* renamed from: gd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
class C6731c {

    /* renamed from: a */
    private final LinearLayout f18946a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6731c(View view) {
        LinearLayout linearLayout = (LinearLayout) view.findViewById(C5149h.f14490k);
        this.f18946a = linearLayout;
        linearLayout.setWillNotDraw(false);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m22014a(View view) {
        this.f18946a.addView(view);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public void m22013b() {
        this.f18946a.removeAllViews();
    }
}

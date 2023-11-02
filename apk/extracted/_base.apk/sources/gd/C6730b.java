package gd;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.ImageView;
import com.henninghall.date_picker.C5149h;
import com.henninghall.date_picker.C5151j;

/* renamed from: gd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C6730b {

    /* renamed from: a */
    private final GradientDrawable f18943a;

    /* renamed from: b */
    private final GradientDrawable f18944b;

    /* renamed from: c */
    private final C5151j f18945c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C6730b(C5151j c5151j, View view) {
        this.f18945c = c5151j;
        this.f18943a = (GradientDrawable) ((ImageView) view.findViewById(C5149h.f14489j)).getDrawable();
        this.f18944b = (GradientDrawable) ((ImageView) view.findViewById(C5149h.f14488i)).getDrawable();
    }

    /* renamed from: b */
    private boolean m22015b(String str) {
        return str != null && str.length() == 7;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m22016a() {
        int i;
        String m26042p = this.f18945c.m26042p();
        if (m22015b(m26042p)) {
            i = 255;
        } else {
            i = 0;
        }
        this.f18943a.setAlpha(i);
        this.f18944b.setAlpha(i);
        if (m22015b(m26042p)) {
            int parseColor = Color.parseColor("#FF" + m26042p.substring(1));
            int parseColor2 = Color.parseColor("#00" + m26042p.substring(1));
            this.f18943a.setColors(new int[]{parseColor, parseColor2});
            this.f18944b.setColors(new int[]{parseColor, parseColor2});
        }
    }
}

package p092f1;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.os.LocaleList;
import p291q1.C11679k;

/* renamed from: f1.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6303a extends Paint {
    public C6303a() {
    }

    @Override // android.graphics.Paint
    public void setAlpha(int i) {
        if (Build.VERSION.SDK_INT < 30) {
            setColor((C11679k.m7201c(i, 0, 255) << 24) | (getColor() & 16777215));
            return;
        }
        super.setAlpha(C11679k.m7201c(i, 0, 255));
    }

    @Override // android.graphics.Paint
    public void setTextLocales(LocaleList localeList) {
    }

    public C6303a(int i) {
        super(i);
    }

    public C6303a(PorterDuff.Mode mode) {
        setXfermode(new PorterDuffXfermode(mode));
    }

    public C6303a(int i, PorterDuff.Mode mode) {
        super(i);
        setXfermode(new PorterDuffXfermode(mode));
    }
}

package p091f0;

import android.annotation.SuppressLint;
import android.text.Editable;
import androidx.emoji2.text.C1527n;

/* renamed from: f0.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
final class C6289b extends Editable.Factory {

    /* renamed from: a */
    private static final Object f17785a = new Object();

    /* renamed from: b */
    private static volatile Editable.Factory f17786b;

    /* renamed from: c */
    private static Class<?> f17787c;

    @SuppressLint({"PrivateApi"})
    private C6289b() {
        try {
            f17787c = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C6289b.class.getClassLoader());
        } catch (Throwable unused) {
        }
    }

    public static Editable.Factory getInstance() {
        if (f17786b == null) {
            synchronized (f17785a) {
                if (f17786b == null) {
                    f17786b = new C6289b();
                }
            }
        }
        return f17786b;
    }

    @Override // android.text.Editable.Factory
    public Editable newEditable(CharSequence charSequence) {
        Class<?> cls = f17787c;
        if (cls != null) {
            return C1527n.m36563c(cls, charSequence);
        }
        return super.newEditable(charSequence);
    }
}
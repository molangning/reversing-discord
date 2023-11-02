package p415x3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import p415x3.InterfaceC13680a;

/* renamed from: x3.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13681b<T extends InterfaceC13680a> implements InterfaceC13680a {

    /* renamed from: a */
    private T f35201a;

    /* renamed from: b */
    private int f35202b = -1;

    /* renamed from: c */
    private ColorFilter f35203c;

    /* renamed from: d */
    private Rect f35204d;

    public C13681b(T t) {
        this.f35201a = t;
    }

    @Override // p415x3.InterfaceC13685d
    /* renamed from: a */
    public int mo1347a() {
        T t = this.f35201a;
        if (t == null) {
            return 0;
        }
        return t.mo1347a();
    }

    @Override // p415x3.InterfaceC13685d
    /* renamed from: b */
    public int mo1346b() {
        T t = this.f35201a;
        if (t == null) {
            return 0;
        }
        return t.mo1346b();
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: c */
    public int mo1345c() {
        T t = this.f35201a;
        if (t == null) {
            return -1;
        }
        return t.mo1345c();
    }

    @Override // p415x3.InterfaceC13680a
    public void clear() {
        T t = this.f35201a;
        if (t != null) {
            t.clear();
        }
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: d */
    public void mo1344d(Rect rect) {
        T t = this.f35201a;
        if (t != null) {
            t.mo1344d(rect);
        }
        this.f35204d = rect;
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: e */
    public int mo1343e() {
        T t = this.f35201a;
        if (t == null) {
            return -1;
        }
        return t.mo1343e();
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: f */
    public void mo1342f(ColorFilter colorFilter) {
        T t = this.f35201a;
        if (t != null) {
            t.mo1342f(colorFilter);
        }
        this.f35203c = colorFilter;
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: g */
    public boolean mo1341g(Drawable drawable, Canvas canvas, int i) {
        T t = this.f35201a;
        return t != null && t.mo1341g(drawable, canvas, i);
    }

    @Override // p415x3.InterfaceC13685d
    /* renamed from: i */
    public int mo1339i(int i) {
        T t = this.f35201a;
        if (t == null) {
            return 0;
        }
        return t.mo1339i(i);
    }

    @Override // p415x3.InterfaceC13680a
    /* renamed from: j */
    public void mo1338j(int i) {
        T t = this.f35201a;
        if (t != null) {
            t.mo1338j(i);
        }
        this.f35202b = i;
    }
}

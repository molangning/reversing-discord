package p354te;

/* renamed from: te.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12670c {

    /* renamed from: a */
    private int f32846a;

    /* renamed from: b */
    private int f32847b;

    /* renamed from: c */
    private int f32848c;

    public C12670c(int i, int i2, int i3) {
        this.f32846a = i;
        this.f32847b = i2;
        this.f32848c = i3;
    }

    /* renamed from: a */
    public int m4558a() {
        return this.f32847b;
    }

    /* renamed from: b */
    public int m4557b() {
        return this.f32848c;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C12670c c12670c = (C12670c) obj;
        if (this.f32846a == c12670c.f32846a && this.f32847b == c12670c.f32847b && this.f32848c == c12670c.f32848c) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return (((this.f32846a * 31) + this.f32847b) * 31) + this.f32848c;
    }
}

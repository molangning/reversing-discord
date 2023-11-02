package androidx.appcompat.widget;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.appcompat.widget.e1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C0505e1 {

    /* renamed from: a */
    private int f1778a = 0;

    /* renamed from: b */
    private int f1779b = 0;

    /* renamed from: c */
    private int f1780c = Integer.MIN_VALUE;

    /* renamed from: d */
    private int f1781d = Integer.MIN_VALUE;

    /* renamed from: e */
    private int f1782e = 0;

    /* renamed from: f */
    private int f1783f = 0;

    /* renamed from: g */
    private boolean f1784g = false;

    /* renamed from: h */
    private boolean f1785h = false;

    /* renamed from: a */
    public int m39934a() {
        return this.f1784g ? this.f1778a : this.f1779b;
    }

    /* renamed from: b */
    public int m39933b() {
        return this.f1778a;
    }

    /* renamed from: c */
    public int m39932c() {
        return this.f1779b;
    }

    /* renamed from: d */
    public int m39931d() {
        return this.f1784g ? this.f1779b : this.f1778a;
    }

    /* renamed from: e */
    public void m39930e(int i, int i2) {
        this.f1785h = false;
        if (i != Integer.MIN_VALUE) {
            this.f1782e = i;
            this.f1778a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1783f = i2;
            this.f1779b = i2;
        }
    }

    /* renamed from: f */
    public void m39929f(boolean z) {
        if (z == this.f1784g) {
            return;
        }
        this.f1784g = z;
        if (this.f1785h) {
            if (z) {
                int i = this.f1781d;
                if (i == Integer.MIN_VALUE) {
                    i = this.f1782e;
                }
                this.f1778a = i;
                int i2 = this.f1780c;
                if (i2 == Integer.MIN_VALUE) {
                    i2 = this.f1783f;
                }
                this.f1779b = i2;
                return;
            }
            int i3 = this.f1780c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f1782e;
            }
            this.f1778a = i3;
            int i4 = this.f1781d;
            if (i4 == Integer.MIN_VALUE) {
                i4 = this.f1783f;
            }
            this.f1779b = i4;
            return;
        }
        this.f1778a = this.f1782e;
        this.f1779b = this.f1783f;
    }

    /* renamed from: g */
    public void m39928g(int i, int i2) {
        this.f1780c = i;
        this.f1781d = i2;
        this.f1785h = true;
        if (this.f1784g) {
            if (i2 != Integer.MIN_VALUE) {
                this.f1778a = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.f1779b = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.f1778a = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.f1779b = i2;
        }
    }
}
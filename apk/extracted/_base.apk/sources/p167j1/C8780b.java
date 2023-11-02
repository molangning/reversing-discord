package p167j1;

import android.graphics.PointF;

/* renamed from: j1.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C8780b {

    /* renamed from: a */
    public String f23025a;

    /* renamed from: b */
    public String f23026b;

    /* renamed from: c */
    public float f23027c;

    /* renamed from: d */
    public EnumC8781a f23028d;

    /* renamed from: e */
    public int f23029e;

    /* renamed from: f */
    public float f23030f;

    /* renamed from: g */
    public float f23031g;

    /* renamed from: h */
    public int f23032h;

    /* renamed from: i */
    public int f23033i;

    /* renamed from: j */
    public float f23034j;

    /* renamed from: k */
    public boolean f23035k;

    /* renamed from: l */
    public PointF f23036l;

    /* renamed from: m */
    public PointF f23037m;

    /* renamed from: j1.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC8781a {
        LEFT_ALIGN,
        RIGHT_ALIGN,
        CENTER
    }

    public C8780b(String str, String str2, float f, EnumC8781a enumC8781a, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        m17269a(str, str2, f, enumC8781a, i, f2, f3, i2, i3, f4, z, pointF, pointF2);
    }

    /* renamed from: a */
    public void m17269a(String str, String str2, float f, EnumC8781a enumC8781a, int i, float f2, float f3, int i2, int i3, float f4, boolean z, PointF pointF, PointF pointF2) {
        this.f23025a = str;
        this.f23026b = str2;
        this.f23027c = f;
        this.f23028d = enumC8781a;
        this.f23029e = i;
        this.f23030f = f2;
        this.f23031g = f3;
        this.f23032h = i2;
        this.f23033i = i3;
        this.f23034j = f4;
        this.f23035k = z;
        this.f23036l = pointF;
        this.f23037m = pointF2;
    }

    public int hashCode() {
        int hashCode = (((((int) ((((this.f23025a.hashCode() * 31) + this.f23026b.hashCode()) * 31) + this.f23027c)) * 31) + this.f23028d.ordinal()) * 31) + this.f23029e;
        long floatToRawIntBits = Float.floatToRawIntBits(this.f23030f);
        return (((hashCode * 31) + ((int) (floatToRawIntBits ^ (floatToRawIntBits >>> 32)))) * 31) + this.f23032h;
    }

    public C8780b() {
    }
}

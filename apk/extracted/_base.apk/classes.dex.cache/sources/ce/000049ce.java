package p291q1;

/* renamed from: q1.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C11678j {

    /* renamed from: a */
    private float f30459a;

    /* renamed from: b */
    private int f30460b;

    /* renamed from: a */
    public void m7204a(float f) {
        float f2 = this.f30459a + f;
        this.f30459a = f2;
        int i = this.f30460b + 1;
        this.f30460b = i;
        if (i == Integer.MAX_VALUE) {
            this.f30459a = f2 / 2.0f;
            this.f30460b = i / 2;
        }
    }
}
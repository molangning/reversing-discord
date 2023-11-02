package p248nd;

/* renamed from: nd.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public abstract class AbstractC10577d extends Exception {

    /* renamed from: j */
    private String f27605j;

    public AbstractC10577d(Throwable th2) {
        super(th2);
    }

    /* renamed from: a */
    public void m11197a(String str) {
        this.f27605j = str;
    }

    @Override // java.lang.Throwable
    public String toString() {
        return super.toString() + "Media transformation failed for job id: " + this.f27605j;
    }
}

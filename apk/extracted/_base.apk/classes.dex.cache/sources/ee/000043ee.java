package p248nd;

import java.util.Locale;

/* renamed from: nd.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10572a extends AbstractC10577d {

    /* renamed from: k */
    private final long f27589k;

    /* renamed from: l */
    private final long f27590l;

    public C10572a(long j, long j2) {
        this(j, j2, new Throwable());
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return String.format(Locale.ENGLISH, "Insufficient disk space, estimated file size in bytes %d, available disk space in bytes %d", Long.valueOf(this.f27589k), Long.valueOf(this.f27590l));
    }

    public C10572a(long j, long j2, Throwable th2) {
        super(th2);
        this.f27589k = j;
        this.f27590l = j2;
    }
}
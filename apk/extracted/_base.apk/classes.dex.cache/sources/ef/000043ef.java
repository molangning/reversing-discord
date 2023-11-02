package p248nd;

import android.net.Uri;

/* renamed from: nd.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10573b extends AbstractC10577d {

    /* renamed from: k */
    private final EnumC10574a f27591k;

    /* renamed from: l */
    private final Uri f27592l;

    /* renamed from: nd.b$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC10574a {
        DATA_SOURCE("data source error");
        

        /* renamed from: j */
        private final String f27595j;

        EnumC10574a(String str) {
            this.f27595j = str;
        }
    }

    public C10573b(EnumC10574a enumC10574a, Uri uri, Throwable th2) {
        super(th2);
        this.f27591k = enumC10574a;
        this.f27592l = uri;
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return "Failed to create media source due to a " + this.f27591k.f27595j;
    }

    @Override // p248nd.AbstractC10577d, java.lang.Throwable
    public String toString() {
        return super.toString() + "\nFailed to create media source due to a " + this.f27591k.f27595j + "\nUri: " + this.f27592l;
    }
}
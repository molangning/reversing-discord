package p248nd;

import android.net.Uri;

/* renamed from: nd.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10575c extends AbstractC10577d {

    /* renamed from: k */
    private final EnumC10576a f27596k;

    /* renamed from: l */
    private final String f27597l;

    /* renamed from: m */
    private final int f27598m;

    /* renamed from: nd.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC10576a {
        INVALID_PARAMS("Invalid parameters"),
        IO_FAILUE("Failed to open the media target for write."),
        UNSUPPORTED_URI_TYPE("URI type not supported at API level below 26"),
        NO_OUTPUT_TRACKS("No output tracks");
        

        /* renamed from: j */
        private final String f27604j;

        EnumC10576a(String str) {
            this.f27604j = str;
        }
    }

    public C10575c(EnumC10576a enumC10576a, Uri uri, int i, Throwable th2) {
        this(enumC10576a, uri.toString(), i, th2);
    }

    @Override // p248nd.AbstractC10577d, java.lang.Throwable
    public String toString() {
        return super.toString() + '\n' + this.f27596k.f27604j + "\nOutput file path or Uri encoded string: " + this.f27597l + "\nMediaMuxer output format: " + this.f27598m;
    }

    public C10575c(EnumC10576a enumC10576a, String str, int i, Throwable th2) {
        super(th2);
        this.f27596k = enumC10576a;
        this.f27597l = str;
        this.f27598m = i;
    }
}

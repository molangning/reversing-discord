package hk;

import java.security.MessageDigest;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000¨\u0006\u0004"}, m14357d2 = {"", "algorithm", "Lhk/c;", "a", "okio"}, m14356k = 2, m14355mv = {1, 4, 0})
/* renamed from: hk.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C7361d {

    @Metadata(m14358d1 = {"\u0000'\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J \u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0004H\u0016J\u0010\u0010\n\u001a\n \t*\u0004\u0018\u00010\u00020\u0002H\u0016R\u001c\u0010\r\u001a\n \t*\u0004\u0018\u00010\u000b0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\f¨\u0006\u000e"}, m14357d2 = {"hk/d$a", "Lhk/c;", "", "input", "", "offset", "byteCount", "", "update", "kotlin.jvm.PlatformType", "a", "Ljava/security/MessageDigest;", "Ljava/security/MessageDigest;", "digest", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: hk.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C7362a implements InterfaceC7360c {

        /* renamed from: a */
        private final MessageDigest f19833a;

        /* renamed from: b */
        final /* synthetic */ String f19834b;

        C7362a(String str) {
            this.f19834b = str;
            this.f19833a = MessageDigest.getInstance(str);
        }

        @Override // hk.InterfaceC7360c
        /* renamed from: a */
        public byte[] mo20836a() {
            return this.f19833a.digest();
        }

        @Override // hk.InterfaceC7360c
        public void update(byte[] input, int i, int i2) {
            C9612q.m13917h(input, "input");
            this.f19833a.update(input, i, i2);
        }
    }

    /* renamed from: a */
    public static final InterfaceC7360c m20837a(String algorithm) {
        C9612q.m13917h(algorithm, "algorithm");
        return new C7362a(algorithm);
    }
}
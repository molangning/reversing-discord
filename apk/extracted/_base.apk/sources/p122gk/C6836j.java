package p122gk;

import java.security.MessageDigest;
import javax.crypto.Mac;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.Buffer;
import okio.ByteString;
import okio.Sink;

@Metadata(m14358d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\u0018\u0000 \u001a2\u00020\u0001:\u0001\u0011B\u0019\b\u0010\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0016R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0016\u0010\u000f\u001a\u0004\u0018\u00010\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0013\u001a\u00020\u00108G¢\u0006\u0006\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u001b"}, m14357d2 = {"Lgk/j;", "Lgk/f;", "Lokio/Buffer;", "source", "", "byteCount", "", "L", "Ljava/security/MessageDigest;", "k", "Ljava/security/MessageDigest;", "messageDigest", "Ljavax/crypto/Mac;", "l", "Ljavax/crypto/Mac;", "mac", "Lokio/ByteString;", "a", "()Lokio/ByteString;", "hash", "Lokio/Sink;", "sink", "", "algorithm", "<init>", "(Lokio/Sink;Ljava/lang/String;)V", "m", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
/* renamed from: gk.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C6836j extends AbstractC6832f {

    /* renamed from: m */
    public static final C6837a f19046m = new C6837a(null);

    /* renamed from: k */
    private final MessageDigest f19047k;

    /* renamed from: l */
    private final Mac f19048l;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0007¨\u0006\b"}, m14357d2 = {"Lgk/j$a;", "", "Lokio/Sink;", "sink", "Lgk/j;", "a", "<init>", "()V", "okio"}, m14356k = 1, m14355mv = {1, 4, 0})
    /* renamed from: gk.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
    public static final class C6837a {
        private C6837a() {
        }

        public /* synthetic */ C6837a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* renamed from: a */
        public final C6836j m21836a(Sink sink) {
            C9612q.m13917h(sink, "sink");
            return new C6836j(sink, "MD5");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6836j(Sink sink, String algorithm) {
        super(sink);
        C9612q.m13917h(sink, "sink");
        C9612q.m13917h(algorithm, "algorithm");
        this.f19047k = MessageDigest.getInstance(algorithm);
        this.f19048l = null;
    }

    @Override // p122gk.AbstractC6832f, okio.Sink
    /* renamed from: L */
    public void mo46L(Buffer source, long j) {
        C9612q.m13917h(source, "source");
        C6829c.m21850b(source.size(), 0L, j);
        C6851u c6851u = source.f29470j;
        C9612q.m13920e(c6851u);
        long j2 = 0;
        while (j2 < j) {
            int min = (int) Math.min(j - j2, c6851u.f19078c - c6851u.f19077b);
            MessageDigest messageDigest = this.f19047k;
            if (messageDigest != null) {
                messageDigest.update(c6851u.f19076a, c6851u.f19077b, min);
            } else {
                Mac mac = this.f19048l;
                C9612q.m13920e(mac);
                mac.update(c6851u.f19076a, c6851u.f19077b, min);
            }
            j2 += min;
            c6851u = c6851u.f19081f;
            C9612q.m13920e(c6851u);
        }
        super.mo46L(source, j);
    }

    /* renamed from: a */
    public final ByteString m21837a() {
        byte[] result;
        MessageDigest messageDigest = this.f19047k;
        if (messageDigest != null) {
            result = messageDigest.digest();
        } else {
            Mac mac = this.f19048l;
            C9612q.m13920e(mac);
            result = mac.doFinal();
        }
        C9612q.m13918g(result, "result");
        return new ByteString(result);
    }
}

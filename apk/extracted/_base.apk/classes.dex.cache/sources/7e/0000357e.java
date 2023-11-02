package p131h7;

import com.google.android.exoplayer2.metadata.Metadata;
import java.nio.ByteBuffer;
import java.nio.charset.CharacterCodingException;
import java.nio.charset.CharsetDecoder;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import p060d7.AbstractC5780f;
import p060d7.C5778d;
import p102fb.C6374d;
import p195k8.C9191p0;

/* renamed from: h7.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C7022a extends AbstractC5780f {

    /* renamed from: c */
    private static final Pattern f19210c = Pattern.compile("(.+?)='(.*?)';", 32);

    /* renamed from: a */
    private final CharsetDecoder f19211a = C6374d.f18023c.newDecoder();

    /* renamed from: b */
    private final CharsetDecoder f19212b = C6374d.f18022b.newDecoder();

    /* renamed from: c */
    private String m21526c(ByteBuffer byteBuffer) {
        try {
            return this.f19211a.decode(byteBuffer).toString();
        } catch (CharacterCodingException unused) {
            try {
                String charBuffer = this.f19212b.decode(byteBuffer).toString();
                this.f19212b.reset();
                byteBuffer.rewind();
                return charBuffer;
            } catch (CharacterCodingException unused2) {
                this.f19212b.reset();
                byteBuffer.rewind();
                return null;
            } catch (Throwable th2) {
                this.f19212b.reset();
                byteBuffer.rewind();
                throw th2;
            }
        } finally {
            this.f19211a.reset();
            byteBuffer.rewind();
        }
    }

    @Override // p060d7.AbstractC5780f
    /* renamed from: b */
    protected Metadata mo16477b(C5778d c5778d, ByteBuffer byteBuffer) {
        String m21526c = m21526c(byteBuffer);
        byte[] bArr = new byte[byteBuffer.limit()];
        byteBuffer.get(bArr);
        String str = null;
        if (m21526c == null) {
            return new Metadata(new C7025c(bArr, null, null));
        }
        Matcher matcher = f19210c.matcher(m21526c);
        String str2 = null;
        for (int i = 0; matcher.find(i); i = matcher.end()) {
            String m16272U0 = C9191p0.m16272U0(matcher.group(1));
            String group = matcher.group(2);
            if (m16272U0 != null) {
                if (!m16272U0.equals("streamurl")) {
                    if (m16272U0.equals("streamtitle")) {
                        str = group;
                    }
                } else {
                    str2 = group;
                }
            }
        }
        return new Metadata(new C7025c(bArr, str, str2));
    }
}
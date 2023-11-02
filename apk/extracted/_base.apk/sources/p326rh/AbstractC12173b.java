package p326rh;

import java.io.IOException;
import java.io.InputStream;
import p326rh.AbstractC12170a;
import p326rh.InterfaceC12210q;

/* renamed from: rh.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC12173b<MessageType extends InterfaceC12210q> implements InterfaceC12213s<MessageType> {

    /* renamed from: a */
    private static final C12183g f31687a = C12183g.m5866c();

    /* renamed from: e */
    private MessageType m6016e(MessageType messagetype) {
        if (messagetype != null && !messagetype.mo5761j()) {
            throw m6015f(messagetype).m5702a().m5788i(messagetype);
        }
        return messagetype;
    }

    /* renamed from: f */
    private C12229w m6015f(MessageType messagetype) {
        if (messagetype instanceof AbstractC12170a) {
            return ((AbstractC12170a) messagetype).m6020a();
        }
        return new C12229w(messagetype);
    }

    @Override // p326rh.InterfaceC12213s
    /* renamed from: g */
    public MessageType mo5760a(InputStream inputStream, C12183g c12183g) {
        return m6016e(m6011j(inputStream, c12183g));
    }

    @Override // p326rh.InterfaceC12213s
    /* renamed from: h */
    public MessageType mo5758c(InputStream inputStream, C12183g c12183g) {
        return m6016e(m6010k(inputStream, c12183g));
    }

    @Override // p326rh.InterfaceC12213s
    /* renamed from: i */
    public MessageType mo5757d(AbstractC12177d abstractC12177d, C12183g c12183g) {
        return m6016e(m6009l(abstractC12177d, c12183g));
    }

    /* renamed from: j */
    public MessageType m6011j(InputStream inputStream, C12183g c12183g) {
        try {
            int read = inputStream.read();
            if (read == -1) {
                return null;
            }
            return m6010k(new AbstractC12170a.AbstractC12171a.C12172a(inputStream, C12180e.m5991B(read, inputStream)), c12183g);
        } catch (IOException e) {
            throw new C12199k(e.getMessage());
        }
    }

    /* renamed from: k */
    public MessageType m6010k(InputStream inputStream, C12183g c12183g) {
        C12180e m5966g = C12180e.m5966g(inputStream);
        MessageType messagetype = (MessageType) mo5759b(m5966g, c12183g);
        try {
            m5966g.m5972a(0);
            return messagetype;
        } catch (C12199k e) {
            throw e.m5788i(messagetype);
        }
    }

    /* renamed from: l */
    public MessageType m6009l(AbstractC12177d abstractC12177d, C12183g c12183g) {
        try {
            C12180e mo5743v = abstractC12177d.mo5743v();
            MessageType messagetype = (MessageType) mo5759b(mo5743v, c12183g);
            try {
                mo5743v.m5972a(0);
                return messagetype;
            } catch (C12199k e) {
                throw e.m5788i(messagetype);
            }
        } catch (C12199k e2) {
            throw e2;
        }
    }
}

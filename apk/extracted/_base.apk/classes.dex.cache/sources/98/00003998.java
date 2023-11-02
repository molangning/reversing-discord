package io.sentry;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import io.sentry.C7836b5;
import io.sentry.C7901e;
import io.sentry.C7909e4;
import io.sentry.C7911e5;
import io.sentry.C7923f4;
import io.sentry.C7932g5;
import io.sentry.C8027n2;
import io.sentry.C8030n3;
import io.sentry.C8032n4;
import io.sentry.C8042o2;
import io.sentry.C8248v5;
import io.sentry.EnumC7975i5;
import io.sentry.EnumC8011l4;
import io.sentry.EnumC8021m4;
import io.sentry.clientreport.C7871b;
import io.sentry.profilemeasurements.C8055a;
import io.sentry.profilemeasurements.C8057b;
import io.sentry.protocol.C8060a;
import io.sentry.protocol.C8062a0;
import io.sentry.protocol.C8064b;
import io.sentry.protocol.C8066b0;
import io.sentry.protocol.C8068c;
import io.sentry.protocol.C8070c0;
import io.sentry.protocol.C8072d;
import io.sentry.protocol.C8074e;
import io.sentry.protocol.C8078f;
import io.sentry.protocol.C8080g;
import io.sentry.protocol.C8082h;
import io.sentry.protocol.C8084i;
import io.sentry.protocol.C8086j;
import io.sentry.protocol.C8088k;
import io.sentry.protocol.C8090l;
import io.sentry.protocol.C8094n;
import io.sentry.protocol.C8096o;
import io.sentry.protocol.C8098p;
import io.sentry.protocol.C8102r;
import io.sentry.protocol.C8104s;
import io.sentry.protocol.C8106t;
import io.sentry.protocol.C8108u;
import io.sentry.protocol.C8110v;
import io.sentry.protocol.C8112w;
import io.sentry.protocol.C8114x;
import io.sentry.protocol.DebugImage;
import io.sentry.util.C8229o;
import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.StringWriter;
import java.io.Writer;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.sentry.o1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C8041o1 implements InterfaceC8243v0 {

    /* renamed from: c */
    private static final Charset f21764c = Charset.forName("UTF-8");

    /* renamed from: a */
    private final C8132r4 f21765a;

    /* renamed from: b */
    private final Map<Class<?>, InterfaceC7894d1<?>> f21766b;

    public C8041o1(C8132r4 c8132r4) {
        this.f21765a = c8132r4;
        HashMap hashMap = new HashMap();
        this.f21766b = hashMap;
        hashMap.put(C8060a.class, new C8060a.C8061a());
        hashMap.put(C7901e.class, new C7901e.C7902a());
        hashMap.put(C8064b.class, new C8064b.C8065a());
        hashMap.put(C8068c.class, new C8068c.C8069a());
        hashMap.put(DebugImage.class, new DebugImage.C8059a());
        hashMap.put(C8072d.class, new C8072d.C8073a());
        hashMap.put(C8074e.class, new C8074e.C8075a());
        hashMap.put(C8074e.EnumC8076b.class, new C8074e.EnumC8076b.C8077a());
        hashMap.put(C8080g.class, new C8080g.C8081a());
        hashMap.put(C8082h.class, new C8082h.C8083a());
        hashMap.put(C8084i.class, new C8084i.C8085a());
        hashMap.put(C8086j.class, new C8086j.C8087a());
        hashMap.put(C8088k.class, new C8088k.C8089a());
        hashMap.put(C8027n2.class, new C8027n2.C8029b());
        hashMap.put(C8042o2.class, new C8042o2.C8043a());
        hashMap.put(C8055a.class, new C8055a.C8056a());
        hashMap.put(C8057b.class, new C8057b.C8058a());
        hashMap.put(C8090l.class, new C8090l.C8091a());
        hashMap.put(C8094n.class, new C8094n.C8095a());
        hashMap.put(C8096o.class, new C8096o.C8097a());
        hashMap.put(C8030n3.class, new C8030n3.C8031a());
        hashMap.put(C7909e4.class, new C7909e4.C7910a());
        hashMap.put(C7923f4.class, new C7923f4.C7924a());
        hashMap.put(C8098p.class, new C8098p.C8099a());
        hashMap.put(EnumC8011l4.class, new EnumC8011l4.C8012a());
        hashMap.put(EnumC8021m4.class, new EnumC8021m4.C8022a());
        hashMap.put(C8032n4.class, new C8032n4.C8033a());
        hashMap.put(C8102r.class, new C8102r.C8103a());
        hashMap.put(C8104s.class, new C8104s.C8105a());
        hashMap.put(C8106t.class, new C8106t.C8107a());
        hashMap.put(C8108u.class, new C8108u.C8109a());
        hashMap.put(C8110v.class, new C8110v.C8111a());
        hashMap.put(C8112w.class, new C8112w.C8113a());
        hashMap.put(C8114x.class, new C8114x.C8115a());
        hashMap.put(C7836b5.class, new C7836b5.C7837a());
        hashMap.put(C7911e5.class, new C7911e5.C7912a());
        hashMap.put(C7932g5.class, new C7932g5.C7933a());
        hashMap.put(EnumC7975i5.class, new EnumC7975i5.C7976a());
        hashMap.put(C8062a0.class, new C8062a0.C8063a());
        hashMap.put(C8078f.class, new C8078f.C8079a());
        hashMap.put(C8248v5.class, new C8248v5.C8249a());
        hashMap.put(C7871b.class, new C7871b.C7872a());
        hashMap.put(C8070c0.class, new C8070c0.C8071a());
        hashMap.put(C8066b0.class, new C8066b0.C8067a());
    }

    /* renamed from: g */
    private <T> boolean m18920g(Class<T> cls) {
        if (!cls.isArray() && !Collection.class.isAssignableFrom(cls) && !String.class.isAssignableFrom(cls) && !Map.class.isAssignableFrom(cls)) {
            return false;
        }
        return true;
    }

    /* renamed from: h */
    private String m18919h(Object obj, boolean z) {
        StringWriter stringWriter = new StringWriter();
        C8008l1 c8008l1 = new C8008l1(stringWriter, this.f21765a.getMaxDepth());
        if (z) {
            c8008l1.m19016s("\t");
        }
        c8008l1.mo18188j(this.f21765a.getLogger(), obj);
        return stringWriter.toString();
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: a */
    public <T> void mo17984a(T t, Writer writer) {
        C8229o.m18169c(t, "The entity is required.");
        C8229o.m18169c(writer, "The Writer object is required.");
        InterfaceC8040o0 logger = this.f21765a.getLogger();
        EnumC8021m4 enumC8021m4 = EnumC8021m4.DEBUG;
        if (logger.mo18134d(enumC8021m4)) {
            this.f21765a.getLogger().mo18135c(enumC8021m4, "Serializing object: %s", m18919h(t, true));
        }
        new C8008l1(writer, this.f21765a.getMaxDepth()).mo18188j(this.f21765a.getLogger(), t);
        writer.flush();
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: b */
    public void mo17983b(C8020m3 c8020m3, OutputStream outputStream) {
        C8229o.m18169c(c8020m3, "The SentryEnvelope object is required.");
        C8229o.m18169c(outputStream, "The Stream object is required.");
        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(new BufferedOutputStream(outputStream), f21764c));
        try {
            c8020m3.m18987b().serialize(new C8008l1(bufferedWriter, this.f21765a.getMaxDepth()), this.f21765a.getLogger());
            bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            for (C7898d4 c7898d4 : c8020m3.m18986c()) {
                try {
                    byte[] m19361w = c7898d4.m19361w();
                    c7898d4.m19359y().serialize(new C8008l1(bufferedWriter, this.f21765a.getMaxDepth()), this.f21765a.getLogger());
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                    bufferedWriter.flush();
                    outputStream.write(m19361w);
                    bufferedWriter.write(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
                } catch (Exception e) {
                    this.f21765a.getLogger().mo18136b(EnumC8021m4.ERROR, "Failed to create envelope item. Dropping it.", e);
                }
            }
        } finally {
            bufferedWriter.flush();
        }
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: c */
    public <T> T mo17982c(Reader reader, Class<T> cls) {
        try {
            C7993j1 c7993j1 = new C7993j1(reader);
            InterfaceC7894d1<?> interfaceC7894d1 = this.f21766b.get(cls);
            if (interfaceC7894d1 != null) {
                return cls.cast(interfaceC7894d1.mo18130a(c7993j1, this.f21765a.getLogger()));
            }
            if (!m18920g(cls)) {
                return null;
            }
            return (T) c7993j1.m19063R0();
        } catch (Exception e) {
            this.f21765a.getLogger().mo18136b(EnumC8021m4.ERROR, "Error when deserializing", e);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: d */
    public C8020m3 mo17981d(InputStream inputStream) {
        C8229o.m18169c(inputStream, "The InputStream object is required.");
        try {
            return this.f21765a.getEnvelopeReader().mo18354a(inputStream);
        } catch (IOException e) {
            this.f21765a.getLogger().mo18136b(EnumC8021m4.ERROR, "Error deserializing envelope.", e);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: e */
    public <T, R> T mo17980e(Reader reader, Class<T> cls, InterfaceC7894d1<R> interfaceC7894d1) {
        try {
            C7993j1 c7993j1 = new C7993j1(reader);
            if (Collection.class.isAssignableFrom(cls)) {
                if (interfaceC7894d1 == null) {
                    return (T) c7993j1.m19063R0();
                }
                return (T) c7993j1.m19066O0(this.f21765a.getLogger(), interfaceC7894d1);
            }
            return (T) c7993j1.m19063R0();
        } catch (Throwable th2) {
            this.f21765a.getLogger().mo18136b(EnumC8021m4.ERROR, "Error when deserializing", th2);
            return null;
        }
    }

    @Override // io.sentry.InterfaceC8243v0
    /* renamed from: f */
    public String mo17979f(Map<String, Object> map) {
        return m18919h(map, false);
    }
}
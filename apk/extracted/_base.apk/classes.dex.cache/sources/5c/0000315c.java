package p070di;

import gg.C6759j;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kh.C9386c;
import kh.C9422m;
import kotlin.collections.C9546k;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C9612q;
import mh.AbstractC10456a;
import mh.InterfaceC10463c;
import p304qf.C11888u;
import p305qg.InterfaceC11900a1;
import ph.C11632b;

/* renamed from: di.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C5968y implements InterfaceC5931h {

    /* renamed from: a */
    private final InterfaceC10463c f16991a;

    /* renamed from: b */
    private final AbstractC10456a f16992b;

    /* renamed from: c */
    private final Function1<C11632b, InterfaceC11900a1> f16993c;

    /* renamed from: d */
    private final Map<C11632b, C9386c> f16994d;

    /* JADX WARN: Multi-variable type inference failed */
    public C5968y(C9422m proto, InterfaceC10463c nameResolver, AbstractC10456a metadataVersion, Function1<? super C11632b, ? extends InterfaceC11900a1> classSource) {
        int m14093t;
        int m6758d;
        int m21930c;
        C9612q.m13917h(proto, "proto");
        C9612q.m13917h(nameResolver, "nameResolver");
        C9612q.m13917h(metadataVersion, "metadataVersion");
        C9612q.m13917h(classSource, "classSource");
        this.f16991a = nameResolver;
        this.f16992b = metadataVersion;
        this.f16993c = classSource;
        List<C9386c> m15212K = proto.m15212K();
        C9612q.m13918g(m15212K, "proto.class_List");
        m14093t = C9546k.m14093t(m15212K, 10);
        m6758d = C11888u.m6758d(m14093t);
        m21930c = C6759j.m21930c(m6758d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
        for (Object obj : m15212K) {
            linkedHashMap.put(C5967x.m24062a(this.f16991a, ((C9386c) obj).m15640F0()), obj);
        }
        this.f16994d = linkedHashMap;
    }

    @Override // p070di.InterfaceC5931h
    /* renamed from: a */
    public C5930g mo20442a(C11632b classId) {
        C9612q.m13917h(classId, "classId");
        C9386c c9386c = this.f16994d.get(classId);
        if (c9386c == null) {
            return null;
        }
        return new C5930g(this.f16991a, c9386c, this.f16992b, this.f16993c.invoke(classId));
    }

    /* renamed from: b */
    public final Collection<C11632b> m24060b() {
        return this.f16994d.keySet();
    }
}
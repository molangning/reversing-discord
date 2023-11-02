package mh;

import java.util.LinkedList;
import java.util.List;
import kh.C9428o;
import kh.C9436p;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import pf.C11590w;

/* renamed from: mh.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C10464d implements InterfaceC10463c {

    /* renamed from: a */
    private final C9436p f27346a;

    /* renamed from: b */
    private final C9428o f27347b;

    /* renamed from: mh.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C10465a {

        /* renamed from: a */
        public static final /* synthetic */ int[] f27348a;

        static {
            int[] iArr = new int[C9428o.C9431c.EnumC9434c.values().length];
            try {
                iArr[C9428o.C9431c.EnumC9434c.CLASS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C9428o.C9431c.EnumC9434c.PACKAGE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C9428o.C9431c.EnumC9434c.LOCAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27348a = iArr;
        }
    }

    public C10464d(C9436p strings, C9428o qualifiedNames) {
        C9612q.m13917h(strings, "strings");
        C9612q.m13917h(qualifiedNames, "qualifiedNames");
        this.f27346a = strings;
        this.f27347b = qualifiedNames;
    }

    /* renamed from: c */
    private final C11590w<List<String>, List<String>, Boolean> m11486c(int i) {
        LinkedList linkedList = new LinkedList();
        LinkedList linkedList2 = new LinkedList();
        boolean z = false;
        while (i != -1) {
            C9428o.C9431c m15099w = this.f27347b.m15099w(i);
            String m15047w = this.f27346a.m15047w(m15099w.m15085A());
            C9428o.C9431c.EnumC9434c m15070y = m15099w.m15070y();
            C9612q.m13920e(m15070y);
            int i2 = C10465a.f27348a[m15070y.ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        linkedList2.addFirst(m15047w);
                        z = true;
                    }
                } else {
                    linkedList.addFirst(m15047w);
                }
            } else {
                linkedList2.addFirst(m15047w);
            }
            i = m15099w.m15069z();
        }
        return new C11590w<>(linkedList, linkedList2, Boolean.valueOf(z));
    }

    @Override // mh.InterfaceC10463c
    /* renamed from: a */
    public boolean mo9136a(int i) {
        return m11486c(i).m7578f().booleanValue();
    }

    @Override // mh.InterfaceC10463c
    /* renamed from: b */
    public String mo9135b(int i) {
        String m14046d0;
        String m14046d02;
        C11590w<List<String>, List<String>, Boolean> m11486c = m11486c(i);
        List<String> m7583a = m11486c.m7583a();
        m14046d0 = C9553r.m14046d0(m11486c.m7582b(), ".", null, null, 0, null, null, 62, null);
        if (!m7583a.isEmpty()) {
            StringBuilder sb2 = new StringBuilder();
            m14046d02 = C9553r.m14046d0(m7583a, "/", null, null, 0, null, null, 62, null);
            sb2.append(m14046d02);
            sb2.append('/');
            sb2.append(m14046d0);
            return sb2.toString();
        }
        return m14046d0;
    }

    @Override // mh.InterfaceC10463c
    public String getString(int i) {
        String m15047w = this.f27346a.m15047w(i);
        C9612q.m13918g(m15047w, "strings.getString(index)");
        return m15047w;
    }
}

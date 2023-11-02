package p270oh;

import gg.C6759j;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.C9545j;
import kotlin.collections.C9546k;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;
import mh.InterfaceC10463c;
import p250nh.C10890a;
import p304qf.C11880m;
import p304qf.C11888u;

/* renamed from: oh.g */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C11118g implements InterfaceC10463c {

    /* renamed from: d */
    public static final C11119a f29091d = new C11119a(null);

    /* renamed from: e */
    private static final String f29092e;

    /* renamed from: f */
    private static final List<String> f29093f;

    /* renamed from: g */
    private static final Map<String, Integer> f29094g;

    /* renamed from: a */
    private final String[] f29095a;

    /* renamed from: b */
    private final Set<Integer> f29096b;

    /* renamed from: c */
    private final List<C10890a.C10901e.C10904c> f29097c;

    /* renamed from: oh.g$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class C11119a {
        private C11119a() {
        }

        public /* synthetic */ C11119a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    /* renamed from: oh.g$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public /* synthetic */ class C11120b {

        /* renamed from: a */
        public static final /* synthetic */ int[] f29098a;

        static {
            int[] iArr = new int[C10890a.C10901e.C10904c.EnumC10907c.values().length];
            try {
                iArr[C10890a.C10901e.C10904c.EnumC10907c.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[C10890a.C10901e.C10904c.EnumC10907c.INTERNAL_TO_CLASS_ID.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[C10890a.C10901e.C10904c.EnumC10907c.DESC_TO_CLASS_ID.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f29098a = iArr;
        }
    }

    static {
        List m14101l;
        String m14046d0;
        List<String> m14101l2;
        Iterable<C11880m> m14069I0;
        int m14093t;
        int m6758d;
        int m21930c;
        m14101l = C9545j.m14101l('k', 'o', 't', 'l', 'i', 'n');
        m14046d0 = C9553r.m14046d0(m14101l, "", null, null, 0, null, null, 62, null);
        f29092e = m14046d0;
        m14101l2 = C9545j.m14101l(m14046d0 + "/Any", m14046d0 + "/Nothing", m14046d0 + "/Unit", m14046d0 + "/Throwable", m14046d0 + "/Number", m14046d0 + "/Byte", m14046d0 + "/Double", m14046d0 + "/Float", m14046d0 + "/Int", m14046d0 + "/Long", m14046d0 + "/Short", m14046d0 + "/Boolean", m14046d0 + "/Char", m14046d0 + "/CharSequence", m14046d0 + "/String", m14046d0 + "/Comparable", m14046d0 + "/Enum", m14046d0 + "/Array", m14046d0 + "/ByteArray", m14046d0 + "/DoubleArray", m14046d0 + "/FloatArray", m14046d0 + "/IntArray", m14046d0 + "/LongArray", m14046d0 + "/ShortArray", m14046d0 + "/BooleanArray", m14046d0 + "/CharArray", m14046d0 + "/Cloneable", m14046d0 + "/Annotation", m14046d0 + "/collections/Iterable", m14046d0 + "/collections/MutableIterable", m14046d0 + "/collections/Collection", m14046d0 + "/collections/MutableCollection", m14046d0 + "/collections/List", m14046d0 + "/collections/MutableList", m14046d0 + "/collections/Set", m14046d0 + "/collections/MutableSet", m14046d0 + "/collections/Map", m14046d0 + "/collections/MutableMap", m14046d0 + "/collections/Map.Entry", m14046d0 + "/collections/MutableMap.MutableEntry", m14046d0 + "/collections/Iterator", m14046d0 + "/collections/MutableIterator", m14046d0 + "/collections/ListIterator", m14046d0 + "/collections/MutableListIterator");
        f29093f = m14101l2;
        m14069I0 = C9553r.m14069I0(m14101l2);
        m14093t = C9546k.m14093t(m14069I0, 10);
        m6758d = C11888u.m6758d(m14093t);
        m21930c = C6759j.m21930c(m6758d, 16);
        LinkedHashMap linkedHashMap = new LinkedHashMap(m21930c);
        for (C11880m c11880m : m14069I0) {
            linkedHashMap.put((String) c11880m.m6779d(), Integer.valueOf(c11880m.m6780c()));
        }
        f29094g = linkedHashMap;
    }

    public C11118g(String[] strings, Set<Integer> localNameIndices, List<C10890a.C10901e.C10904c> records) {
        C9612q.m13917h(strings, "strings");
        C9612q.m13917h(localNameIndices, "localNameIndices");
        C9612q.m13917h(records, "records");
        this.f29095a = strings;
        this.f29096b = localNameIndices;
        this.f29097c = records;
    }

    @Override // mh.InterfaceC10463c
    /* renamed from: a */
    public boolean mo9136a(int i) {
        return this.f29096b.contains(Integer.valueOf(i));
    }

    @Override // mh.InterfaceC10463c
    /* renamed from: b */
    public String mo9135b(int i) {
        return getString(i);
    }

    @Override // mh.InterfaceC10463c
    public String getString(int i) {
        String string;
        boolean z;
        C10890a.C10901e.C10904c c10904c = this.f29097c.get(i);
        if (c10904c.m9605Q()) {
            string = c10904c.m9612J();
        } else {
            if (c10904c.m9607O()) {
                List<String> list = f29093f;
                int size = list.size();
                int m9616F = c10904c.m9616F();
                if (m9616F >= 0 && m9616F < size) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    string = list.get(c10904c.m9616F());
                }
            }
            string = this.f29095a[i];
        }
        if (c10904c.m9610L() >= 2) {
            List<Integer> substringIndexList = c10904c.m9609M();
            C9612q.m13918g(substringIndexList, "substringIndexList");
            Integer begin = substringIndexList.get(0);
            Integer end = substringIndexList.get(1);
            C9612q.m13918g(begin, "begin");
            if (begin.intValue() >= 0) {
                int intValue = begin.intValue();
                C9612q.m13918g(end, "end");
                if (intValue <= end.intValue() && end.intValue() <= string.length()) {
                    C9612q.m13918g(string, "string");
                    string = string.substring(begin.intValue(), end.intValue());
                    C9612q.m13918g(string, "this as java.lang.String…ing(startIndex, endIndex)");
                }
            }
        }
        String string2 = string;
        if (c10904c.m9614H() >= 2) {
            List<Integer> replaceCharList = c10904c.m9613I();
            C9612q.m13918g(replaceCharList, "replaceCharList");
            C9612q.m13918g(string2, "string");
            string2 = C9653o.m13763C(string2, (char) replaceCharList.get(0).intValue(), (char) replaceCharList.get(1).intValue(), false, 4, null);
        }
        String string3 = string2;
        C10890a.C10901e.C10904c.EnumC10907c m9617E = c10904c.m9617E();
        if (m9617E == null) {
            m9617E = C10890a.C10901e.C10904c.EnumC10907c.NONE;
        }
        int i2 = C11120b.f29098a[m9617E.ordinal()];
        if (i2 != 2) {
            if (i2 == 3) {
                if (string3.length() >= 2) {
                    C9612q.m13918g(string3, "string");
                    string3 = string3.substring(1, string3.length() - 1);
                    C9612q.m13918g(string3, "this as java.lang.String…ing(startIndex, endIndex)");
                }
                String string4 = string3;
                C9612q.m13918g(string4, "string");
                string3 = C9653o.m13763C(string4, '$', '.', false, 4, null);
            }
        } else {
            C9612q.m13918g(string3, "string");
            string3 = C9653o.m13763C(string3, '$', '.', false, 4, null);
        }
        C9612q.m13918g(string3, "string");
        return string3;
    }
}

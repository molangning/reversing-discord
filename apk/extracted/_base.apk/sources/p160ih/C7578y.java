package p160ih;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;

/* renamed from: ih.y */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
public final class C7578y {

    /* renamed from: a */
    public static final C7578y f20876a = new C7578y();

    /* renamed from: ih.y$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes8.dex */
    static final class C7579a extends AbstractC9614s implements Function1<String, CharSequence> {

        /* renamed from: j */
        public static final C7579a f20877j = new C7579a();

        C7579a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final CharSequence invoke(String it) {
            C9612q.m13917h(it, "it");
            return C7578y.f20876a.m20377c(it);
        }
    }

    private C7578y() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public final String m20377c(String str) {
        if (str.length() > 1) {
            return 'L' + str + ';';
        }
        return str;
    }

    /* renamed from: b */
    public final String[] m20378b(String... signatures) {
        C9612q.m13917h(signatures, "signatures");
        ArrayList arrayList = new ArrayList(signatures.length);
        for (String str : signatures) {
            arrayList.add("<init>(" + str + ")V");
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: d */
    public final Set<String> m20376d(String internalName, String... signatures) {
        C9612q.m13917h(internalName, "internalName");
        C9612q.m13917h(signatures, "signatures");
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        for (String str : signatures) {
            linkedHashSet.add(internalName + '.' + str);
        }
        return linkedHashSet;
    }

    /* renamed from: e */
    public final Set<String> m20375e(String name, String... signatures) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signatures, "signatures");
        return m20376d(m20372h(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    /* renamed from: f */
    public final Set<String> m20374f(String name, String... signatures) {
        C9612q.m13917h(name, "name");
        C9612q.m13917h(signatures, "signatures");
        return m20376d(m20371i(name), (String[]) Arrays.copyOf(signatures, signatures.length));
    }

    /* renamed from: g */
    public final String m20373g(String name) {
        C9612q.m13917h(name, "name");
        return "java/util/function/" + name;
    }

    /* renamed from: h */
    public final String m20372h(String name) {
        C9612q.m13917h(name, "name");
        return "java/lang/" + name;
    }

    /* renamed from: i */
    public final String m20371i(String name) {
        C9612q.m13917h(name, "name");
        return "java/util/" + name;
    }

    /* renamed from: j */
    public final String m20370j(String name, List<String> parameters, String ret) {
        String m14046d0;
        C9612q.m13917h(name, "name");
        C9612q.m13917h(parameters, "parameters");
        C9612q.m13917h(ret, "ret");
        StringBuilder sb2 = new StringBuilder();
        sb2.append(name);
        sb2.append('(');
        m14046d0 = C9553r.m14046d0(parameters, "", null, null, 0, null, C7579a.f20877j, 30, null);
        sb2.append(m14046d0);
        sb2.append(')');
        sb2.append(m20377c(ret));
        return sb2.toString();
    }

    /* renamed from: k */
    public final String m20369k(String internalName, String jvmDescriptor) {
        C9612q.m13917h(internalName, "internalName");
        C9612q.m13917h(jvmDescriptor, "jvmDescriptor");
        return internalName + '.' + jvmDescriptor;
    }
}

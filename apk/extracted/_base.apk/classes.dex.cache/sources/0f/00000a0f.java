package bj;

import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C9545j;
import kotlin.jvm.internal.C9612q;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u001b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\r\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010#\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\u0011\b\u0000\u0012\u0006\u0010\u0010\u001a\u00020\u0002¢\u0006\u0004\b%\u0010&J0\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\n\u001a\u00020\tR\u0017\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000fR.\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b\u0011\u0010\u0012\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R \u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00020\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0012\u001a\u0004\b\u001a\u0010\u0014R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR \u0010!\u001a\b\u0012\u0004\u0012\u00020\u00040\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b \u0010\u0012\u001a\u0004\b \u0010\u0014R&\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070\u00060\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u001d\u0010\u0014R \u0010$\u001a\b\u0012\u0004\u0012\u00020\t0\u00198\u0000X\u0080\u0004¢\u0006\f\n\u0004\b#\u0010\u0012\u001a\u0004\b#\u0010\u0014¨\u0006'"}, m14357d2 = {"Lbj/a;", "", "", "elementName", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "", "", "annotations", "", "isOptional", "", "a", "Ljava/lang/String;", "getSerialName", "()Ljava/lang/String;", "serialName", "b", "Ljava/util/List;", "c", "()Ljava/util/List;", "h", "(Ljava/util/List;)V", "getAnnotations$annotations", "()V", "", "f", "elementNames", "", "d", "Ljava/util/Set;", "uniqueNames", "e", "elementDescriptors", "elementAnnotations", "g", "elementOptionality", "<init>", "(Ljava/lang/String;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: bj.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2319a {

    /* renamed from: a */
    private final String f6425a;

    /* renamed from: b */
    private List<? extends Annotation> f6426b;

    /* renamed from: c */
    private final List<String> f6427c;

    /* renamed from: d */
    private final Set<String> f6428d;

    /* renamed from: e */
    private final List<SerialDescriptor> f6429e;

    /* renamed from: f */
    private final List<List<Annotation>> f6430f;

    /* renamed from: g */
    private final List<Boolean> f6431g;

    public C2319a(String serialName) {
        List<? extends Annotation> m14104i;
        C9612q.m13917h(serialName, "serialName");
        this.f6425a = serialName;
        m14104i = C9545j.m14104i();
        this.f6426b = m14104i;
        this.f6427c = new ArrayList();
        this.f6428d = new HashSet();
        this.f6429e = new ArrayList();
        this.f6430f = new ArrayList();
        this.f6431g = new ArrayList();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: b */
    public static /* synthetic */ void m33654b(C2319a c2319a, String str, SerialDescriptor serialDescriptor, List list, boolean z, int i, Object obj) {
        if ((i & 4) != 0) {
            list = C9545j.m14104i();
        }
        if ((i & 8) != 0) {
            z = false;
        }
        c2319a.m33655a(str, serialDescriptor, list, z);
    }

    /* renamed from: a */
    public final void m33655a(String elementName, SerialDescriptor descriptor, List<? extends Annotation> annotations, boolean z) {
        C9612q.m13917h(elementName, "elementName");
        C9612q.m13917h(descriptor, "descriptor");
        C9612q.m13917h(annotations, "annotations");
        if (this.f6428d.add(elementName)) {
            this.f6427c.add(elementName);
            this.f6429e.add(descriptor);
            this.f6430f.add(annotations);
            this.f6431g.add(Boolean.valueOf(z));
            return;
        }
        throw new IllegalArgumentException(("Element with name '" + elementName + "' is already registered in " + this.f6425a).toString());
    }

    /* renamed from: c */
    public final List<Annotation> m33653c() {
        return this.f6426b;
    }

    /* renamed from: d */
    public final List<List<Annotation>> m33652d() {
        return this.f6430f;
    }

    /* renamed from: e */
    public final List<SerialDescriptor> m33651e() {
        return this.f6429e;
    }

    /* renamed from: f */
    public final List<String> m33650f() {
        return this.f6427c;
    }

    /* renamed from: g */
    public final List<Boolean> m33649g() {
        return this.f6431g;
    }

    /* renamed from: h */
    public final void m33648h(List<? extends Annotation> list) {
        C9612q.m13917h(list, "<set-?>");
        this.f6426b = list;
    }
}
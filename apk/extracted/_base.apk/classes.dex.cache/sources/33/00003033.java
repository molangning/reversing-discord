package com.th3rdwave.safeareacontext;

import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u000e\u001a\u00020\t\u0012\u0006\u0010\u0013\u001a\u00020\u000f\u0012\u0006\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\t\u0010\u0003\u001a\u00020\u0002HÖ\u0001J\t\u0010\u0005\u001a\u00020\u0004HÖ\u0001J\u0013\u0010\b\u001a\u00020\u00072\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001HÖ\u0003R\u0017\u0010\u000e\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0013\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\f\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0017\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u0015\u001a\u0004\b\n\u0010\u0016¨\u0006\u001a"}, m14357d2 = {"Lcom/th3rdwave/safeareacontext/l;", "", "", "toString", "", "hashCode", "other", "", "equals", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "a", "Lcom/th3rdwave/safeareacontext/EdgeInsets;", "b", "()Lcom/th3rdwave/safeareacontext/EdgeInsets;", "insets", "Lcom/th3rdwave/safeareacontext/m;", "Lcom/th3rdwave/safeareacontext/m;", "c", "()Lcom/th3rdwave/safeareacontext/m;", "mode", "Lcom/th3rdwave/safeareacontext/k;", "Lcom/th3rdwave/safeareacontext/k;", "()Lcom/th3rdwave/safeareacontext/k;", "edges", "<init>", "(Lcom/th3rdwave/safeareacontext/EdgeInsets;Lcom/th3rdwave/safeareacontext/m;Lcom/th3rdwave/safeareacontext/k;)V", "react-native-safe-area-context_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: com.th3rdwave.safeareacontext.l */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C5678l {

    /* renamed from: a */
    private final EdgeInsets f15856a;

    /* renamed from: b */
    private final EnumC5679m f15857b;

    /* renamed from: c */
    private final C5677k f15858c;

    public C5678l(EdgeInsets insets, EnumC5679m mode, C5677k edges) {
        C9612q.m13917h(insets, "insets");
        C9612q.m13917h(mode, "mode");
        C9612q.m13917h(edges, "edges");
        this.f15856a = insets;
        this.f15857b = mode;
        this.f15858c = edges;
    }

    /* renamed from: a */
    public final C5677k m24759a() {
        return this.f15858c;
    }

    /* renamed from: b */
    public final EdgeInsets m24758b() {
        return this.f15856a;
    }

    /* renamed from: c */
    public final EnumC5679m m24757c() {
        return this.f15857b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5678l) {
            C5678l c5678l = (C5678l) obj;
            return C9612q.m13922c(this.f15856a, c5678l.f15856a) && this.f15857b == c5678l.f15857b && C9612q.m13922c(this.f15858c, c5678l.f15858c);
        }
        return false;
    }

    public int hashCode() {
        return (((this.f15856a.hashCode() * 31) + this.f15857b.hashCode()) * 31) + this.f15858c.hashCode();
    }

    public String toString() {
        return "SafeAreaViewLocalData(insets=" + this.f15856a + ", mode=" + this.f15857b + ", edges=" + this.f15858c + ')';
    }
}
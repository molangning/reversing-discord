package dj;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.ArrayDeque;
import kotlin.jvm.internal.C9612q;

@Metadata(m14358d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0019\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0010\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0004J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0004H\u0004R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\nR\u0016\u0010\r\u001a\u00020\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u0010"}, m14357d2 = {"Ldj/f;", "", "", "size", "", "b", "array", "", "a", "Lkotlin/collections/ArrayDeque;", "Lkotlin/collections/ArrayDeque;", "arrays", "I", "charsTotal", "<init>", "()V", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: dj.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public class C5984f {

    /* renamed from: a */
    private final ArrayDeque<char[]> f17022a = new ArrayDeque<>();

    /* renamed from: b */
    private int f17023b;

    /* renamed from: a */
    public final void m23961a(char[] array) {
        int i;
        C9612q.m13917h(array, "array");
        synchronized (this) {
            int length = this.f17023b + array.length;
            i = C5980d.f17019a;
            if (length < i) {
                this.f17023b += array.length;
                this.f17022a.addLast(array);
            }
            Unit unit = Unit.f25302a;
        }
    }

    /* renamed from: b */
    public final char[] m23960b(int i) {
        char[] m14339u;
        synchronized (this) {
            m14339u = this.f17022a.m14339u();
            if (m14339u != null) {
                this.f17023b -= m14339u.length;
            } else {
                m14339u = null;
            }
        }
        if (m14339u == null) {
            return new char[i];
        }
        return m14339u;
    }
}
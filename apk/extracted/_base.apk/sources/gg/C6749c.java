package gg;

import com.facebook.react.uimanager.ViewProps;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;

@Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\f\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\u0018\u0000 \u00122\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\b\u0012\u0004\u0012\u00020\u00030\u0002:\u0001\u0013B\u0017\u0012\u0006\u0010\u000e\u001a\u00020\u0003\u0012\u0006\u0010\u000f\u001a\u00020\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0005H\u0016J\u0013\u0010\t\u001a\u00020\u00052\b\u0010\b\u001a\u0004\u0018\u00010\u0002H\u0096\u0002J\b\u0010\u000b\u001a\u00020\nH\u0016J\b\u0010\r\u001a\u00020\fH\u0016¨\u0006\u0014"}, m14357d2 = {"Lgg/c;", "Lgg/a;", "", "", "value", "", "i", "isEmpty", "other", "equals", "", "hashCode", "", "toString", ViewProps.START, "endInclusive", "<init>", "(CC)V", "n", "a", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: gg.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C6749c extends C6746a {

    /* renamed from: n */
    public static final C6750a f18979n = new C6750a(null);

    /* renamed from: o */
    private static final C6749c f18980o = new C6749c(1, 0);

    @Metadata(m14358d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, m14357d2 = {"Lgg/c$a;", "", "<init>", "()V", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: gg.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C6750a {
        private C6750a() {
        }

        public /* synthetic */ C6750a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public C6749c(char c, char c2) {
        super(c, c2, 1);
    }

    public boolean equals(Object obj) {
        if (obj instanceof C6749c) {
            if (!isEmpty() || !((C6749c) obj).isEmpty()) {
                C6749c c6749c = (C6749c) obj;
                if (m21960a() != c6749c.m21960a() || m21959e() != c6749c.m21959e()) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (m21960a() * 31) + m21959e();
    }

    /* renamed from: i */
    public boolean m21957i(char c) {
        return C9612q.m13915j(m21960a(), c) <= 0 && C9612q.m13915j(c, m21959e()) <= 0;
    }

    public boolean isEmpty() {
        return C9612q.m13915j(m21960a(), m21959e()) > 0;
    }

    public String toString() {
        return m21960a() + ".." + m21959e();
    }
}

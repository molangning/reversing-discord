package p227m5;

import java.io.Serializable;
import p210l5.InterfaceC10050e;

/* renamed from: m5.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10262c implements InterfaceC10050e, Serializable {

    /* renamed from: k */
    private static final C10261b f26727k = C10261b.m11994a();

    /* renamed from: j */
    protected final String f26728j;

    public C10262c(String str) {
        if (str != null) {
            this.f26728j = str;
            return;
        }
        throw new IllegalStateException("Null String illegal for SerializedString");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && obj.getClass() == getClass()) {
            return this.f26728j.equals(((C10262c) obj).f26728j);
        }
        return false;
    }

    public final int hashCode() {
        return this.f26728j.hashCode();
    }

    public final String toString() {
        return this.f26728j;
    }
}
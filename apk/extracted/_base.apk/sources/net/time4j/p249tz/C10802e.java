package net.time4j.p249tz;

import java.io.Serializable;

/* renamed from: net.time4j.tz.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
class C10802e implements InterfaceC10808k, Serializable {
    private static final long serialVersionUID = -4889632013137688471L;
    private final String tzid;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C10802e(String str) {
        this.tzid = str;
    }

    @Override // net.time4j.p249tz.InterfaceC10808k
    /* renamed from: a */
    public String mo10035a() {
        return this.tzid;
    }

    public boolean equals(Object obj) {
        if (obj instanceof C10802e) {
            return this.tzid.equals(((C10802e) obj).tzid);
        }
        return false;
    }

    public int hashCode() {
        return this.tzid.hashCode();
    }

    public String toString() {
        return getClass().getName() + "@" + this.tzid;
    }
}

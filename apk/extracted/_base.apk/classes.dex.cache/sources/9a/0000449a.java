package net.time4j.history;

import net.time4j.C10697f0;
import p162ij.EnumC7627a0;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.history.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10739f {

    /* renamed from: a */
    final long f28040a;

    /* renamed from: b */
    final EnumC10732c f28041b;

    /* renamed from: c */
    final C10741h f28042c;

    /* renamed from: d */
    final C10741h f28043d;

    public C10739f(long j, EnumC10732c enumC10732c, EnumC10732c enumC10732c2) {
        this.f28040a = j;
        this.f28041b = enumC10732c2;
        if (j == Long.MIN_VALUE) {
            C10741h c10741h = new C10741h(EnumC10744j.BC, 1000000000, 1, 1);
            this.f28042c = c10741h;
            this.f28043d = c10741h;
            return;
        }
        this.f28042c = enumC10732c2.mo10435c(j);
        this.f28043d = enumC10732c.mo10435c(j - 1);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C10739f)) {
            return false;
        }
        C10739f c10739f = (C10739f) obj;
        if (this.f28040a == c10739f.f28040a && this.f28041b == c10739f.f28041b && this.f28043d.equals(c10739f.f28043d)) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        long j = this.f28040a;
        return (int) (j ^ (j >>> 32));
    }

    public String toString() {
        return C10739f.class.getName() + "[start=" + this.f28040a + " (" + C10697f0.m10707R0(this.f28040a, EnumC7627a0.MODIFIED_JULIAN_DATE) + "),algorithm=" + this.f28041b + ",date-before-cutover=" + this.f28043d + ",date-at-cutover=" + this.f28042c + ']';
    }
}
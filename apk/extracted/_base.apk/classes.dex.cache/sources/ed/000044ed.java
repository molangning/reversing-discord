package net.time4j.p249tz.model;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import net.time4j.base.InterfaceC10614a;
import net.time4j.base.InterfaceC10620f;
import net.time4j.base.InterfaceC10621g;
import net.time4j.p249tz.C10835p;
import net.time4j.p249tz.C10836q;
import net.time4j.p249tz.InterfaceC10815m;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: net.time4j.tz.model.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes6.dex */
public final class C10820e implements InterfaceC10815m, Serializable {
    private static final long serialVersionUID = 1374714021808040253L;
    private final C10835p offset;

    public C10820e(C10835p c10835p) {
        this.offset = c10835p;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: a */
    public C10836q mo10063a(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return null;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: b */
    public C10836q mo10062b(InterfaceC10620f interfaceC10620f) {
        return null;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: c */
    public boolean mo10061c() {
        return false;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: d */
    public C10835p mo10060d() {
        return this.offset;
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    /* renamed from: e */
    public List<C10835p> mo10059e(InterfaceC10614a interfaceC10614a, InterfaceC10621g interfaceC10621g) {
        return Collections.singletonList(this.offset);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C10820e) {
            return this.offset.equals(((C10820e) obj).offset);
        }
        return false;
    }

    public int hashCode() {
        return this.offset.hashCode();
    }

    @Override // net.time4j.p249tz.InterfaceC10815m
    public boolean isEmpty() {
        return true;
    }

    public String toString() {
        return "EmptyTransitionModel=" + this.offset.mo10035a();
    }
}
package p206l1;

import java.util.Arrays;
import java.util.List;
import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6522d;
import p111g1.InterfaceC6521c;
import p223m1.AbstractC10231b;

/* renamed from: l1.p */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10023p implements InterfaceC10007c {

    /* renamed from: a */
    private final String f26040a;

    /* renamed from: b */
    private final List<InterfaceC10007c> f26041b;

    /* renamed from: c */
    private final boolean f26042c;

    public C10023p(String str, List<InterfaceC10007c> list, boolean z) {
        this.f26040a = str;
        this.f26041b = list;
        this.f26042c = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        return new C6522d(c6059j0, abstractC10231b, this, c6062k);
    }

    /* renamed from: b */
    public List<InterfaceC10007c> m12543b() {
        return this.f26041b;
    }

    /* renamed from: c */
    public String m12542c() {
        return this.f26040a;
    }

    /* renamed from: d */
    public boolean m12541d() {
        return this.f26042c;
    }

    public String toString() {
        return "ShapeGroup{name='" + this.f26040a + "' Shapes: " + Arrays.toString(this.f26041b.toArray()) + '}';
    }
}
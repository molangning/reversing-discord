package p206l1;

import p073e1.C6059j0;
import p073e1.C6062k;
import p111g1.C6530l;
import p111g1.InterfaceC6521c;
import p223m1.AbstractC10231b;
import p291q1.C11674f;

/* renamed from: l1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10014i implements InterfaceC10007c {

    /* renamed from: a */
    private final String f25995a;

    /* renamed from: b */
    private final EnumC10015a f25996b;

    /* renamed from: c */
    private final boolean f25997c;

    /* renamed from: l1.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC10015a {
        MERGE,
        ADD,
        SUBTRACT,
        INTERSECT,
        EXCLUDE_INTERSECTIONS;

        /* renamed from: b */
        public static EnumC10015a m12580b(int i) {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        if (i != 4) {
                            if (i != 5) {
                                return MERGE;
                            }
                            return EXCLUDE_INTERSECTIONS;
                        }
                        return INTERSECT;
                    }
                    return SUBTRACT;
                }
                return ADD;
            }
            return MERGE;
        }
    }

    public C10014i(String str, EnumC10015a enumC10015a, boolean z) {
        this.f25995a = str;
        this.f25996b = enumC10015a;
        this.f25997c = z;
    }

    @Override // p206l1.InterfaceC10007c
    /* renamed from: a */
    public InterfaceC6521c mo12523a(C6059j0 c6059j0, C6062k c6062k, AbstractC10231b abstractC10231b) {
        if (!c6059j0.m23788A()) {
            C11674f.m7233c("Animation contains merge paths but they are disabled.");
            return null;
        }
        return new C6530l(this);
    }

    /* renamed from: b */
    public EnumC10015a m12584b() {
        return this.f25996b;
    }

    /* renamed from: c */
    public String m12583c() {
        return this.f25995a;
    }

    /* renamed from: d */
    public boolean m12582d() {
        return this.f25997c;
    }

    public String toString() {
        return "MergePaths{mode=" + this.f25996b + '}';
    }
}
package p389vh;

import java.util.Arrays;
import kotlin.jvm.internal.C9612q;
import p142hi.AbstractC7302o0;
import p305qg.InterfaceC11928h0;

/* renamed from: vh.e */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C13299e extends AbstractC13318o<Character> {
    public C13299e(char c) {
        super(Character.valueOf(c));
    }

    /* renamed from: c */
    private final String m2827c(char c) {
        if (c == '\b') {
            return "\\b";
        }
        if (c == '\t') {
            return "\\t";
        }
        if (c == '\n') {
            return "\\n";
        }
        if (c == '\f') {
            return "\\f";
        }
        if (c == '\r') {
            return "\\r";
        }
        if (m2825e(c)) {
            return String.valueOf(c);
        }
        return "?";
    }

    /* renamed from: e */
    private final boolean m2825e(char c) {
        byte type = (byte) Character.getType(c);
        return (type == 0 || type == 13 || type == 14 || type == 15 || type == 16 || type == 18 || type == 19) ? false : true;
    }

    @Override // p389vh.AbstractC13301g
    /* renamed from: d */
    public AbstractC7302o0 mo2775a(InterfaceC11928h0 module) {
        C9612q.m13917h(module, "module");
        AbstractC7302o0 m9786u = module.mo4194n().m9786u();
        C9612q.m13918g(m9786u, "module.builtIns.charType");
        return m9786u;
    }

    @Override // p389vh.AbstractC13301g
    public String toString() {
        String format = String.format("\\u%04X ('%s')", Arrays.copyOf(new Object[]{Integer.valueOf(mo2813b().charValue()), m2827c(mo2813b().charValue())}, 2));
        C9612q.m13918g(format, "format(this, *args)");
        return format;
    }
}

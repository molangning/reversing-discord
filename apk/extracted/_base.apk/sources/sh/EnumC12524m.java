package sh;

import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.C9653o;

/* renamed from: sh.m */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public enum EnumC12524m {
    PLAIN { // from class: sh.m.b
        @Override // sh.EnumC12524m
        /* renamed from: b */
        public String mo4936b(String string) {
            C9612q.m13917h(string, "string");
            return string;
        }
    },
    HTML { // from class: sh.m.a
        @Override // sh.EnumC12524m
        /* renamed from: b */
        public String mo4936b(String string) {
            String m13762D;
            String m13762D2;
            C9612q.m13917h(string, "string");
            m13762D = C9653o.m13762D(string, "<", "&lt;", false, 4, null);
            m13762D2 = C9653o.m13762D(m13762D, ">", "&gt;", false, 4, null);
            return m13762D2;
        }
    };

    /* synthetic */ EnumC12524m(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    /* renamed from: b */
    public abstract String mo4936b(String str);
}

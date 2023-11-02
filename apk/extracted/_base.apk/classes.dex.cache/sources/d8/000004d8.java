package androidx.core.text;

import java.util.Locale;

/* renamed from: androidx.core.text.t */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1123t {

    /* renamed from: a */
    public static final InterfaceC1122s f3489a = new C1128e(null, false);

    /* renamed from: b */
    public static final InterfaceC1122s f3490b = new C1128e(null, true);

    /* renamed from: c */
    public static final InterfaceC1122s f3491c;

    /* renamed from: d */
    public static final InterfaceC1122s f3492d;

    /* renamed from: e */
    public static final InterfaceC1122s f3493e;

    /* renamed from: f */
    public static final InterfaceC1122s f3494f;

    /* renamed from: androidx.core.text.t$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1124a implements InterfaceC1126c {

        /* renamed from: b */
        static final C1124a f3495b = new C1124a(true);

        /* renamed from: a */
        private final boolean f3496a;

        private C1124a(boolean z) {
            this.f3496a = z;
        }

        @Override // androidx.core.text.C1123t.InterfaceC1126c
        /* renamed from: a */
        public int mo37848a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            boolean z = false;
            while (i < i3) {
                int m37850a = C1123t.m37850a(Character.getDirectionality(charSequence.charAt(i)));
                if (m37850a != 0) {
                    if (m37850a == 1) {
                        if (!this.f3496a) {
                            return 1;
                        }
                    } else {
                        continue;
                        i++;
                        z = z;
                    }
                } else if (this.f3496a) {
                    return 0;
                }
                z = true;
                i++;
                z = z;
            }
            if (z) {
                return this.f3496a ? 1 : 0;
            }
            return 2;
        }
    }

    /* renamed from: androidx.core.text.t$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1125b implements InterfaceC1126c {

        /* renamed from: a */
        static final C1125b f3497a = new C1125b();

        private C1125b() {
        }

        @Override // androidx.core.text.C1123t.InterfaceC1126c
        /* renamed from: a */
        public int mo37848a(CharSequence charSequence, int i, int i2) {
            int i3 = i2 + i;
            int i4 = 2;
            while (i < i3 && i4 == 2) {
                i4 = C1123t.m37849b(Character.getDirectionality(charSequence.charAt(i)));
                i++;
            }
            return i4;
        }
    }

    /* renamed from: androidx.core.text.t$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC1126c {
        /* renamed from: a */
        int mo37848a(CharSequence charSequence, int i, int i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.core.text.t$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC1127d implements InterfaceC1122s {

        /* renamed from: a */
        private final InterfaceC1126c f3498a;

        AbstractC1127d(InterfaceC1126c interfaceC1126c) {
            this.f3498a = interfaceC1126c;
        }

        /* renamed from: b */
        private boolean m37847b(CharSequence charSequence, int i, int i2) {
            int mo37848a = this.f3498a.mo37848a(charSequence, i, i2);
            if (mo37848a == 0) {
                return true;
            }
            if (mo37848a != 1) {
                return mo37846a();
            }
            return false;
        }

        /* renamed from: a */
        protected abstract boolean mo37846a();

        @Override // androidx.core.text.InterfaceC1122s
        public boolean isRtl(CharSequence charSequence, int i, int i2) {
            if (charSequence != null && i >= 0 && i2 >= 0 && charSequence.length() - i2 >= i) {
                if (this.f3498a == null) {
                    return mo37846a();
                }
                return m37847b(charSequence, i, i2);
            }
            throw new IllegalArgumentException();
        }
    }

    /* renamed from: androidx.core.text.t$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1128e extends AbstractC1127d {

        /* renamed from: b */
        private final boolean f3499b;

        C1128e(InterfaceC1126c interfaceC1126c, boolean z) {
            super(interfaceC1126c);
            this.f3499b = z;
        }

        @Override // androidx.core.text.C1123t.AbstractC1127d
        /* renamed from: a */
        protected boolean mo37846a() {
            return this.f3499b;
        }
    }

    /* renamed from: androidx.core.text.t$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1129f extends AbstractC1127d {

        /* renamed from: b */
        static final C1129f f3500b = new C1129f();

        C1129f() {
            super(null);
        }

        @Override // androidx.core.text.C1123t.AbstractC1127d
        /* renamed from: a */
        protected boolean mo37846a() {
            return C1130u.m37845a(Locale.getDefault()) == 1;
        }
    }

    static {
        C1125b c1125b = C1125b.f3497a;
        f3491c = new C1128e(c1125b, false);
        f3492d = new C1128e(c1125b, true);
        f3493e = new C1128e(C1124a.f3495b, false);
        f3494f = C1129f.f3500b;
    }

    /* renamed from: a */
    static int m37850a(int i) {
        if (i != 0) {
            return (i == 1 || i == 2) ? 0 : 2;
        }
        return 1;
    }

    /* renamed from: b */
    static int m37849b(int i) {
        if (i != 0) {
            if (i == 1 || i == 2) {
                return 0;
            }
            switch (i) {
                case 14:
                case 15:
                    break;
                case 16:
                case 17:
                    return 0;
                default:
                    return 2;
            }
        }
        return 1;
    }
}
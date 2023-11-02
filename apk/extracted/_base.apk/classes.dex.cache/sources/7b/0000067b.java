package androidx.emoji2.text;

import android.text.Editable;
import android.text.Selection;
import android.text.Spannable;
import android.text.method.MetaKeyKeyListener;
import android.view.KeyEvent;
import android.view.inputmethod.InputConnection;
import androidx.emoji2.text.C1500e;
import androidx.emoji2.text.C1525m;
import java.util.Arrays;

/* renamed from: androidx.emoji2.text.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1513h {

    /* renamed from: a */
    private final C1500e.C1510i f3942a;

    /* renamed from: b */
    private final C1525m f3943b;

    /* renamed from: c */
    private C1500e.InterfaceC1505d f3944c;

    /* renamed from: d */
    private final boolean f3945d;

    /* renamed from: e */
    private final int[] f3946e;

    /* renamed from: androidx.emoji2.text.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1514a {
        /* renamed from: a */
        static int m36606a(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    i--;
                    if (i < 0) {
                        if (z) {
                            return -1;
                        }
                        return 0;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isHighSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                    } else if (Character.isHighSurrogate(charAt)) {
                        return -1;
                    } else {
                        z = true;
                    }
                }
                return i;
            }
        }

        /* renamed from: b */
        static int m36605b(CharSequence charSequence, int i, int i2) {
            int length = charSequence.length();
            if (i < 0 || length < i || i2 < 0) {
                return -1;
            }
            while (true) {
                boolean z = false;
                while (i2 != 0) {
                    if (i >= length) {
                        if (z) {
                            return -1;
                        }
                        return length;
                    }
                    char charAt = charSequence.charAt(i);
                    if (z) {
                        if (!Character.isLowSurrogate(charAt)) {
                            return -1;
                        }
                        i2--;
                        i++;
                    } else if (!Character.isSurrogate(charAt)) {
                        i2--;
                        i++;
                    } else if (Character.isLowSurrogate(charAt)) {
                        return -1;
                    } else {
                        i++;
                        z = true;
                    }
                }
                return i;
            }
        }
    }

    /* renamed from: androidx.emoji2.text.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1515b {

        /* renamed from: a */
        private int f3947a = 1;

        /* renamed from: b */
        private final C1525m.C1526a f3948b;

        /* renamed from: c */
        private C1525m.C1526a f3949c;

        /* renamed from: d */
        private C1525m.C1526a f3950d;

        /* renamed from: e */
        private int f3951e;

        /* renamed from: f */
        private int f3952f;

        /* renamed from: g */
        private final boolean f3953g;

        /* renamed from: h */
        private final int[] f3954h;

        C1515b(C1525m.C1526a c1526a, boolean z, int[] iArr) {
            this.f3948b = c1526a;
            this.f3949c = c1526a;
            this.f3953g = z;
            this.f3954h = iArr;
        }

        /* renamed from: d */
        private static boolean m36601d(int i) {
            return i == 65039;
        }

        /* renamed from: f */
        private static boolean m36599f(int i) {
            return i == 65038;
        }

        /* renamed from: g */
        private int m36598g() {
            this.f3947a = 1;
            this.f3949c = this.f3948b;
            this.f3952f = 0;
            return 1;
        }

        /* renamed from: h */
        private boolean m36597h() {
            if (this.f3949c.m36567b().m36616j() || m36601d(this.f3951e)) {
                return true;
            }
            if (this.f3953g) {
                if (this.f3954h == null) {
                    return true;
                }
                if (Arrays.binarySearch(this.f3954h, this.f3949c.m36567b().m36624b(0)) < 0) {
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        int m36604a(int i) {
            C1525m.C1526a m36568a = this.f3949c.m36568a(i);
            int i2 = 2;
            if (this.f3947a != 2) {
                if (m36568a == null) {
                    i2 = m36598g();
                } else {
                    this.f3947a = 2;
                    this.f3949c = m36568a;
                    this.f3952f = 1;
                }
            } else if (m36568a != null) {
                this.f3949c = m36568a;
                this.f3952f++;
            } else if (m36599f(i)) {
                i2 = m36598g();
            } else if (!m36601d(i)) {
                if (this.f3949c.m36567b() != null) {
                    i2 = 3;
                    if (this.f3952f == 1) {
                        if (m36597h()) {
                            this.f3950d = this.f3949c;
                            m36598g();
                        } else {
                            i2 = m36598g();
                        }
                    } else {
                        this.f3950d = this.f3949c;
                        m36598g();
                    }
                } else {
                    i2 = m36598g();
                }
            }
            this.f3951e = i;
            return i2;
        }

        /* renamed from: b */
        C1512g m36603b() {
            return this.f3949c.m36567b();
        }

        /* renamed from: c */
        C1512g m36602c() {
            return this.f3950d.m36567b();
        }

        /* renamed from: e */
        boolean m36600e() {
            if (this.f3947a == 2 && this.f3949c.m36567b() != null && (this.f3952f > 1 || m36597h())) {
                return true;
            }
            return false;
        }
    }

    public C1513h(C1525m c1525m, C1500e.C1510i c1510i, C1500e.InterfaceC1505d interfaceC1505d, boolean z, int[] iArr) {
        this.f3942a = c1510i;
        this.f3943b = c1525m;
        this.f3944c = interfaceC1505d;
        this.f3945d = z;
        this.f3946e = iArr;
    }

    /* renamed from: a */
    private void m36614a(Spannable spannable, C1512g c1512g, int i, int i2) {
        spannable.setSpan(this.f3942a.m36626a(c1512g), i, i2, 33);
    }

    /* renamed from: b */
    private static boolean m36613b(Editable editable, KeyEvent keyEvent, boolean z) {
        AbstractC1516i[] abstractC1516iArr;
        if (m36608g(keyEvent)) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (!m36609f(selectionStart, selectionEnd) && (abstractC1516iArr = (AbstractC1516i[]) editable.getSpans(selectionStart, selectionEnd, AbstractC1516i.class)) != null && abstractC1516iArr.length > 0) {
            for (AbstractC1516i abstractC1516i : abstractC1516iArr) {
                int spanStart = editable.getSpanStart(abstractC1516i);
                int spanEnd = editable.getSpanEnd(abstractC1516i);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public static boolean m36612c(InputConnection inputConnection, Editable editable, int i, int i2, boolean z) {
        int max;
        int min;
        if (editable != null && inputConnection != null && i >= 0 && i2 >= 0) {
            int selectionStart = Selection.getSelectionStart(editable);
            int selectionEnd = Selection.getSelectionEnd(editable);
            if (m36609f(selectionStart, selectionEnd)) {
                return false;
            }
            if (z) {
                max = C1514a.m36606a(editable, selectionStart, Math.max(i, 0));
                min = C1514a.m36605b(editable, selectionEnd, Math.max(i2, 0));
                if (max == -1 || min == -1) {
                    return false;
                }
            } else {
                max = Math.max(selectionStart - i, 0);
                min = Math.min(selectionEnd + i2, editable.length());
            }
            AbstractC1516i[] abstractC1516iArr = (AbstractC1516i[]) editable.getSpans(max, min, AbstractC1516i.class);
            if (abstractC1516iArr != null && abstractC1516iArr.length > 0) {
                for (AbstractC1516i abstractC1516i : abstractC1516iArr) {
                    int spanStart = editable.getSpanStart(abstractC1516i);
                    int spanEnd = editable.getSpanEnd(abstractC1516i);
                    max = Math.min(spanStart, max);
                    min = Math.max(spanEnd, min);
                }
                int max2 = Math.max(max, 0);
                int min2 = Math.min(min, editable.length());
                inputConnection.beginBatchEdit();
                editable.delete(max2, min2);
                inputConnection.endBatchEdit();
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public static boolean m36611d(Editable editable, int i, KeyEvent keyEvent) {
        boolean m36613b;
        if (i != 67) {
            if (i != 112) {
                m36613b = false;
            } else {
                m36613b = m36613b(editable, keyEvent, true);
            }
        } else {
            m36613b = m36613b(editable, keyEvent, false);
        }
        if (!m36613b) {
            return false;
        }
        MetaKeyKeyListener.adjustMetaAfterKeypress(editable);
        return true;
    }

    /* renamed from: e */
    private boolean m36610e(CharSequence charSequence, int i, int i2, C1512g c1512g) {
        if (c1512g.m36622d() == 0) {
            c1512g.m36615k(this.f3944c.mo36630a(charSequence, i, i2, c1512g.m36618h()));
        }
        if (c1512g.m36622d() == 2) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    private static boolean m36609f(int i, int i2) {
        return i == -1 || i2 == -1 || i != i2;
    }

    /* renamed from: g */
    private static boolean m36608g(KeyEvent keyEvent) {
        return !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState());
    }

    /* JADX WARN: Code restructure failed: missing block: B:187:0x0122, code lost:
        ((androidx.emoji2.text.C1527n) r11).m36562d();
     */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0046 A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:115:0x000e, B:118:0x0013, B:120:0x0017, B:122:0x0024, B:127:0x0037, B:129:0x003f, B:131:0x0042, B:133:0x0046, B:135:0x0052, B:136:0x0055, B:138:0x0062, B:144:0x0071, B:145:0x007d, B:149:0x0098, B:157:0x00a8, B:160:0x00b4, B:161:0x00be, B:162:0x00c8, B:164:0x00cf, B:165:0x00d4, B:167:0x00df, B:169:0x00e6, B:173:0x00f0, B:176:0x00fc, B:177:0x0102, B:179:0x010b, B:124:0x002c), top: B:193:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:176:0x00fc A[Catch: all -> 0x0129, TryCatch #0 {all -> 0x0129, blocks: (B:115:0x000e, B:118:0x0013, B:120:0x0017, B:122:0x0024, B:127:0x0037, B:129:0x003f, B:131:0x0042, B:133:0x0046, B:135:0x0052, B:136:0x0055, B:138:0x0062, B:144:0x0071, B:145:0x007d, B:149:0x0098, B:157:0x00a8, B:160:0x00b4, B:161:0x00be, B:162:0x00c8, B:164:0x00cf, B:165:0x00d4, B:167:0x00df, B:169:0x00e6, B:173:0x00f0, B:176:0x00fc, B:177:0x0102, B:179:0x010b, B:124:0x002c), top: B:193:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x010b A[Catch: all -> 0x0129, TRY_LEAVE, TryCatch #0 {all -> 0x0129, blocks: (B:115:0x000e, B:118:0x0013, B:120:0x0017, B:122:0x0024, B:127:0x0037, B:129:0x003f, B:131:0x0042, B:133:0x0046, B:135:0x0052, B:136:0x0055, B:138:0x0062, B:144:0x0071, B:145:0x007d, B:149:0x0098, B:157:0x00a8, B:160:0x00b4, B:161:0x00be, B:162:0x00c8, B:164:0x00cf, B:165:0x00d4, B:167:0x00df, B:169:0x00e6, B:173:0x00f0, B:176:0x00fc, B:177:0x0102, B:179:0x010b, B:124:0x002c), top: B:193:0x000e }] */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x00d4 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:210:0x009f A[SYNTHETIC] */
    /* renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.CharSequence m36607h(java.lang.CharSequence r11, int r12, int r13, int r14, boolean r15) {
        /*
            Method dump skipped, instructions count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.emoji2.text.C1513h.m36607h(java.lang.CharSequence, int, int, int, boolean):java.lang.CharSequence");
    }
}
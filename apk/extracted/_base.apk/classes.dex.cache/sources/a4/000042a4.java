package p223m1;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.Typeface;
import androidx.collection.C0629d;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p073e1.C6059j0;
import p073e1.C6062k;
import p073e1.InterfaceC6071o0;
import p111g1.C6522d;
import p125h1.AbstractC6861a;
import p125h1.C6882o;
import p125h1.C6885q;
import p167j1.C8780b;
import p167j1.C8782c;
import p167j1.C8783d;
import p188k1.C9037a;
import p188k1.C9038b;
import p188k1.C9047k;
import p206l1.C10023p;
import p291q1.C11680l;
import p311r1.C12022c;

/* renamed from: m1.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C10242i extends AbstractC10231b {

    /* renamed from: D */
    private final StringBuilder f26658D;

    /* renamed from: E */
    private final RectF f26659E;

    /* renamed from: F */
    private final Matrix f26660F;

    /* renamed from: G */
    private final Paint f26661G;

    /* renamed from: H */
    private final Paint f26662H;

    /* renamed from: I */
    private final Map<C8783d, List<C6522d>> f26663I;

    /* renamed from: J */
    private final C0629d<String> f26664J;

    /* renamed from: K */
    private final List<C10246d> f26665K;

    /* renamed from: L */
    private final C6882o f26666L;

    /* renamed from: M */
    private final C6059j0 f26667M;

    /* renamed from: N */
    private final C6062k f26668N;

    /* renamed from: O */
    private AbstractC6861a<Integer, Integer> f26669O;

    /* renamed from: P */
    private AbstractC6861a<Integer, Integer> f26670P;

    /* renamed from: Q */
    private AbstractC6861a<Integer, Integer> f26671Q;

    /* renamed from: R */
    private AbstractC6861a<Integer, Integer> f26672R;

    /* renamed from: S */
    private AbstractC6861a<Float, Float> f26673S;

    /* renamed from: T */
    private AbstractC6861a<Float, Float> f26674T;

    /* renamed from: U */
    private AbstractC6861a<Float, Float> f26675U;

    /* renamed from: V */
    private AbstractC6861a<Float, Float> f26676V;

    /* renamed from: W */
    private AbstractC6861a<Float, Float> f26677W;

    /* renamed from: X */
    private AbstractC6861a<Typeface, Typeface> f26678X;

    /* renamed from: m1.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C10243a extends Paint {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10243a(int i) {
            super(i);
            C10242i.this = r1;
            setStyle(Paint.Style.FILL);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m1.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C10244b extends Paint {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C10244b(int i) {
            super(i);
            C10242i.this = r1;
            setStyle(Paint.Style.STROKE);
        }
    }

    /* renamed from: m1.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static /* synthetic */ class C10245c {

        /* renamed from: a */
        static final /* synthetic */ int[] f26681a;

        static {
            int[] iArr = new int[C8780b.EnumC8781a.values().length];
            f26681a = iArr;
            try {
                iArr[C8780b.EnumC8781a.LEFT_ALIGN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26681a[C8780b.EnumC8781a.RIGHT_ALIGN.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26681a[C8780b.EnumC8781a.CENTER.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public C10242i(C6059j0 c6059j0, C10236e c10236e) {
        super(c6059j0, c10236e);
        C9038b c9038b;
        C9038b c9038b2;
        C9037a c9037a;
        C9037a c9037a2;
        this.f26658D = new StringBuilder(2);
        this.f26659E = new RectF();
        this.f26660F = new Matrix();
        this.f26661G = new C10243a(1);
        this.f26662H = new C10244b(1);
        this.f26663I = new HashMap();
        this.f26664J = new C0629d<>();
        this.f26665K = new ArrayList();
        this.f26667M = c6059j0;
        this.f26668N = c10236e.m12082b();
        C6882o mo16817a = c10236e.m12065s().mo16817a();
        this.f26666L = mo16817a;
        mo16817a.m21774a(this);
        m12102j(mo16817a);
        C9047k m12064t = c10236e.m12064t();
        if (m12064t != null && (c9037a2 = m12064t.f23701a) != null) {
            AbstractC6861a<Integer, Integer> mo16817a2 = c9037a2.mo16817a();
            this.f26669O = mo16817a2;
            mo16817a2.m21774a(this);
            m12102j(this.f26669O);
        }
        if (m12064t != null && (c9037a = m12064t.f23702b) != null) {
            AbstractC6861a<Integer, Integer> mo16817a3 = c9037a.mo16817a();
            this.f26671Q = mo16817a3;
            mo16817a3.m21774a(this);
            m12102j(this.f26671Q);
        }
        if (m12064t != null && (c9038b2 = m12064t.f23703c) != null) {
            AbstractC6861a<Float, Float> mo16817a4 = c9038b2.mo16817a();
            this.f26673S = mo16817a4;
            mo16817a4.m21774a(this);
            m12102j(this.f26673S);
        }
        if (m12064t != null && (c9038b = m12064t.f23704d) != null) {
            AbstractC6861a<Float, Float> mo16817a5 = c9038b.mo16817a();
            this.f26675U = mo16817a5;
            mo16817a5.m21774a(this);
            m12102j(this.f26675U);
        }
    }

    /* renamed from: P */
    private String m12053P(String str, int i) {
        int codePointAt = str.codePointAt(i);
        int charCount = Character.charCount(codePointAt) + i;
        while (charCount < str.length()) {
            int codePointAt2 = str.codePointAt(charCount);
            if (!m12039d0(codePointAt2)) {
                break;
            }
            charCount += Character.charCount(codePointAt2);
            codePointAt = (codePointAt * 31) + codePointAt2;
        }
        long j = codePointAt;
        if (this.f26664J.m39490e(j)) {
            return this.f26664J.m39488g(j);
        }
        this.f26658D.setLength(0);
        while (i < charCount) {
            int codePointAt3 = str.codePointAt(i);
            this.f26658D.appendCodePoint(codePointAt3);
            i += Character.charCount(codePointAt3);
        }
        String sb2 = this.f26658D.toString();
        this.f26664J.m39484m(j, sb2);
        return sb2;
    }

    /* renamed from: Q */
    private void m12052Q(C8780b c8780b, int i) {
        int intValue;
        AbstractC6861a<Integer, Integer> abstractC6861a = this.f26670P;
        if (abstractC6861a != null) {
            this.f26661G.setColor(abstractC6861a.mo21712h().intValue());
        } else {
            AbstractC6861a<Integer, Integer> abstractC6861a2 = this.f26669O;
            if (abstractC6861a2 != null) {
                this.f26661G.setColor(abstractC6861a2.mo21712h().intValue());
            } else {
                this.f26661G.setColor(c8780b.f23032h);
            }
        }
        AbstractC6861a<Integer, Integer> abstractC6861a3 = this.f26672R;
        if (abstractC6861a3 != null) {
            this.f26662H.setColor(abstractC6861a3.mo21712h().intValue());
        } else {
            AbstractC6861a<Integer, Integer> abstractC6861a4 = this.f26671Q;
            if (abstractC6861a4 != null) {
                this.f26662H.setColor(abstractC6861a4.mo21712h().intValue());
            } else {
                this.f26662H.setColor(c8780b.f23033i);
            }
        }
        if (this.f26592x.m21716h() == null) {
            intValue = 100;
        } else {
            intValue = this.f26592x.m21716h().mo21712h().intValue();
        }
        int i2 = (((intValue * 255) / 100) * i) / 255;
        this.f26661G.setAlpha(i2);
        this.f26662H.setAlpha(i2);
        AbstractC6861a<Float, Float> abstractC6861a5 = this.f26674T;
        if (abstractC6861a5 != null) {
            this.f26662H.setStrokeWidth(abstractC6861a5.mo21712h().floatValue());
            return;
        }
        AbstractC6861a<Float, Float> abstractC6861a6 = this.f26673S;
        if (abstractC6861a6 != null) {
            this.f26662H.setStrokeWidth(abstractC6861a6.mo21712h().floatValue());
        } else {
            this.f26662H.setStrokeWidth(c8780b.f23034j * C11680l.m7188e());
        }
    }

    /* renamed from: R */
    private void m12051R(String str, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawText(str, 0, str.length(), 0.0f, 0.0f, paint);
    }

    /* renamed from: S */
    private void m12050S(C8783d c8783d, float f, C8780b c8780b, Canvas canvas) {
        List<C6522d> m12042a0 = m12042a0(c8783d);
        for (int i = 0; i < m12042a0.size(); i++) {
            Path mo22429c = m12042a0.get(i).mo22429c();
            mo22429c.computeBounds(this.f26659E, false);
            this.f26660F.reset();
            this.f26660F.preTranslate(0.0f, (-c8780b.f23031g) * C11680l.m7188e());
            this.f26660F.preScale(f, f);
            mo22429c.transform(this.f26660F);
            if (c8780b.f23035k) {
                m12047V(mo22429c, this.f26661G, canvas);
                m12047V(mo22429c, this.f26662H, canvas);
            } else {
                m12047V(mo22429c, this.f26662H, canvas);
                m12047V(mo22429c, this.f26661G, canvas);
            }
        }
    }

    /* renamed from: T */
    private void m12049T(String str, C8780b c8780b, Canvas canvas) {
        if (c8780b.f23035k) {
            m12051R(str, this.f26661G, canvas);
            m12051R(str, this.f26662H, canvas);
            return;
        }
        m12051R(str, this.f26662H, canvas);
        m12051R(str, this.f26661G, canvas);
    }

    /* renamed from: U */
    private void m12048U(String str, C8780b c8780b, Canvas canvas, float f) {
        int i = 0;
        while (i < str.length()) {
            String m12053P = m12053P(str, i);
            i += m12053P.length();
            m12049T(m12053P, c8780b, canvas);
            canvas.translate(this.f26661G.measureText(m12053P) + f, 0.0f);
        }
    }

    /* renamed from: V */
    private void m12047V(Path path, Paint paint, Canvas canvas) {
        if (paint.getColor() == 0) {
            return;
        }
        if (paint.getStyle() == Paint.Style.STROKE && paint.getStrokeWidth() == 0.0f) {
            return;
        }
        canvas.drawPath(path, paint);
    }

    /* renamed from: W */
    private void m12046W(String str, C8780b c8780b, C8782c c8782c, Canvas canvas, float f, float f2, float f3) {
        for (int i = 0; i < str.length(); i++) {
            C8783d m39516f = this.f26668N.m23674c().m39516f(C8783d.m17260c(str.charAt(i), c8782c.m17267a(), c8782c.m17265c()));
            if (m39516f != null) {
                m12050S(m39516f, f2, c8780b, canvas);
                canvas.translate((((float) m39516f.m17261b()) * f2 * C11680l.m7188e()) + f3, 0.0f);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0094  */
    /* renamed from: X */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12045X(p167j1.C8780b r19, p167j1.C8782c r20, android.graphics.Canvas r21) {
        /*
            r18 = this;
            r7 = r18
            r8 = r19
            r9 = r20
            r10 = r21
            android.graphics.Typeface r0 = r7.m12040c0(r9)
            if (r0 != 0) goto Lf
            return
        Lf:
            java.lang.String r1 = r8.f23025a
            e1.j0 r2 = r7.f26667M
            e1.y0 r2 = r2.m23740Y()
            if (r2 == 0) goto L21
            java.lang.String r3 = r18.getName()
            java.lang.String r1 = r2.m23585c(r3, r1)
        L21:
            android.graphics.Paint r2 = r7.f26661G
            r2.setTypeface(r0)
            h1.a<java.lang.Float, java.lang.Float> r0 = r7.f26677W
            if (r0 == 0) goto L35
            java.lang.Object r0 = r0.mo21712h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L37
        L35:
            float r0 = r8.f23027c
        L37:
            android.graphics.Paint r2 = r7.f26661G
            float r3 = p291q1.C11680l.m7188e()
            float r3 = r3 * r0
            r2.setTextSize(r3)
            android.graphics.Paint r2 = r7.f26662H
            android.graphics.Paint r3 = r7.f26661G
            android.graphics.Typeface r3 = r3.getTypeface()
            r2.setTypeface(r3)
            android.graphics.Paint r2 = r7.f26662H
            android.graphics.Paint r3 = r7.f26661G
            float r3 = r3.getTextSize()
            r2.setTextSize(r3)
            int r2 = r8.f23029e
            float r2 = (float) r2
            r3 = 1092616192(0x41200000, float:10.0)
            float r2 = r2 / r3
            h1.a<java.lang.Float, java.lang.Float> r3 = r7.f26676V
            if (r3 == 0) goto L6d
            java.lang.Object r3 = r3.mo21712h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
        L6b:
            float r2 = r2 + r3
            goto L7c
        L6d:
            h1.a<java.lang.Float, java.lang.Float> r3 = r7.f26675U
            if (r3 == 0) goto L7c
            java.lang.Object r3 = r3.mo21712h()
            java.lang.Float r3 = (java.lang.Float) r3
            float r3 = r3.floatValue()
            goto L6b
        L7c:
            float r3 = p291q1.C11680l.m7188e()
            float r2 = r2 * r3
            float r2 = r2 * r0
            r0 = 1120403456(0x42c80000, float:100.0)
            float r11 = r2 / r0
            java.util.List r12 = r7.m12041b0(r1)
            int r13 = r12.size()
            r14 = 0
            r0 = -1
            r15 = r0
            r6 = r14
        L92:
            if (r6 >= r13) goto Ldd
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r8.f23037m
            if (r0 != 0) goto La1
            r0 = 0
            goto La3
        La1:
            float r0 = r0.x
        La3:
            r2 = r0
            r4 = 0
            r16 = 0
            r0 = r18
            r3 = r20
            r5 = r11
            r17 = r6
            r6 = r16
            java.util.List r0 = r0.m12036f0(r1, r2, r3, r4, r5, r6)
            r1 = r14
        Lb5:
            int r2 = r0.size()
            if (r1 >= r2) goto Lda
            java.lang.Object r2 = r0.get(r1)
            m1.i$d r2 = (p223m1.C10242i.C10246d) r2
            int r15 = r15 + 1
            r21.save()
            float r3 = p223m1.C10242i.C10246d.m12033a(r2)
            r7.m12037e0(r10, r8, r15, r3)
            java.lang.String r2 = p223m1.C10242i.C10246d.m12032b(r2)
            r7.m12048U(r2, r8, r10, r11)
            r21.restore()
            int r1 = r1 + 1
            goto Lb5
        Lda:
            int r6 = r17 + 1
            goto L92
        Ldd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223m1.C10242i.m12045X(j1.b, j1.c, android.graphics.Canvas):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:42:0x0053  */
    /* renamed from: Y */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void m12044Y(p167j1.C8780b r21, android.graphics.Matrix r22, p167j1.C8782c r23, android.graphics.Canvas r24) {
        /*
            r20 = this;
            r8 = r20
            r9 = r21
            h1.a<java.lang.Float, java.lang.Float> r0 = r8.f26677W
            if (r0 == 0) goto L13
            java.lang.Object r0 = r0.mo21712h()
            java.lang.Float r0 = (java.lang.Float) r0
            float r0 = r0.floatValue()
            goto L15
        L13:
            float r0 = r9.f23027c
        L15:
            r1 = 1120403456(0x42c80000, float:100.0)
            float r10 = r0 / r1
            float r11 = p291q1.C11680l.m7186g(r22)
            java.lang.String r0 = r9.f23025a
            java.util.List r12 = r8.m12041b0(r0)
            int r13 = r12.size()
            int r0 = r9.f23029e
            float r0 = (float) r0
            r1 = 1092616192(0x41200000, float:10.0)
            float r0 = r0 / r1
            h1.a<java.lang.Float, java.lang.Float> r1 = r8.f26676V
            if (r1 == 0) goto L3d
            java.lang.Object r1 = r1.mo21712h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
        L3b:
            float r0 = r0 + r1
            goto L4c
        L3d:
            h1.a<java.lang.Float, java.lang.Float> r1 = r8.f26675U
            if (r1 == 0) goto L4c
            java.lang.Object r1 = r1.mo21712h()
            java.lang.Float r1 = (java.lang.Float) r1
            float r1 = r1.floatValue()
            goto L3b
        L4c:
            r14 = r0
            r15 = 0
            r0 = -1
            r7 = r0
            r6 = r15
        L51:
            if (r6 >= r13) goto Lb1
            java.lang.Object r0 = r12.get(r6)
            r1 = r0
            java.lang.String r1 = (java.lang.String) r1
            android.graphics.PointF r0 = r9.f23037m
            if (r0 != 0) goto L60
            r0 = 0
            goto L62
        L60:
            float r0 = r0.x
        L62:
            r2 = r0
            r16 = 1
            r0 = r20
            r3 = r23
            r4 = r10
            r5 = r14
            r17 = r6
            r6 = r16
            java.util.List r6 = r0.m12036f0(r1, r2, r3, r4, r5, r6)
            r5 = r15
        L74:
            int r0 = r6.size()
            if (r5 >= r0) goto Lae
            java.lang.Object r0 = r6.get(r5)
            m1.i$d r0 = (p223m1.C10242i.C10246d) r0
            int r7 = r7 + 1
            r24.save()
            float r1 = p223m1.C10242i.C10246d.m12033a(r0)
            r4 = r24
            r8.m12037e0(r4, r9, r7, r1)
            java.lang.String r1 = p223m1.C10242i.C10246d.m12032b(r0)
            r0 = r20
            r2 = r21
            r3 = r23
            r16 = r5
            r5 = r11
            r18 = r6
            r6 = r10
            r19 = r7
            r7 = r14
            r0.m12046W(r1, r2, r3, r4, r5, r6, r7)
            r24.restore()
            int r5 = r16 + 1
            r6 = r18
            r7 = r19
            goto L74
        Lae:
            int r6 = r17 + 1
            goto L51
        Lb1:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p223m1.C10242i.m12044Y(j1.b, android.graphics.Matrix, j1.c, android.graphics.Canvas):void");
    }

    /* renamed from: Z */
    private C10246d m12043Z(int i) {
        for (int size = this.f26665K.size(); size < i; size++) {
            this.f26665K.add(new C10246d(null));
        }
        return this.f26665K.get(i - 1);
    }

    /* renamed from: a0 */
    private List<C6522d> m12042a0(C8783d c8783d) {
        if (this.f26663I.containsKey(c8783d)) {
            return this.f26663I.get(c8783d);
        }
        List<C10023p> m17262a = c8783d.m17262a();
        int size = m17262a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i = 0; i < size; i++) {
            arrayList.add(new C6522d(this.f26667M, this, m17262a.get(i), this.f26668N));
        }
        this.f26663I.put(c8783d, arrayList);
        return arrayList;
    }

    /* renamed from: b0 */
    private List<String> m12041b0(String str) {
        return Arrays.asList(str.replaceAll("\r\n", "\r").replaceAll("\u0003", "\r").replaceAll(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE, "\r").split("\r"));
    }

    /* renamed from: c0 */
    private Typeface m12040c0(C8782c c8782c) {
        Typeface mo21712h;
        AbstractC6861a<Typeface, Typeface> abstractC6861a = this.f26678X;
        if (abstractC6861a != null && (mo21712h = abstractC6861a.mo21712h()) != null) {
            return mo21712h;
        }
        Typeface m23738Z = this.f26667M.m23738Z(c8782c);
        if (m23738Z != null) {
            return m23738Z;
        }
        return c8782c.m17264d();
    }

    /* renamed from: d0 */
    private boolean m12039d0(int i) {
        if (Character.getType(i) != 16 && Character.getType(i) != 27 && Character.getType(i) != 6 && Character.getType(i) != 28 && Character.getType(i) != 8 && Character.getType(i) != 19) {
            return false;
        }
        return true;
    }

    /* renamed from: e0 */
    private void m12037e0(Canvas canvas, C8780b c8780b, int i, float f) {
        float f2;
        float f3;
        PointF pointF = c8780b.f23036l;
        PointF pointF2 = c8780b.f23037m;
        float m7188e = C11680l.m7188e();
        float f4 = 0.0f;
        if (pointF == null) {
            f2 = 0.0f;
        } else {
            f2 = (c8780b.f23030f * m7188e) + pointF.y;
        }
        float f5 = (i * c8780b.f23030f * m7188e) + f2;
        if (pointF == null) {
            f3 = 0.0f;
        } else {
            f3 = pointF.x;
        }
        if (pointF2 != null) {
            f4 = pointF2.x;
        }
        int i2 = C10245c.f26681a[c8780b.f23028d.ordinal()];
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    canvas.translate((f3 + (f4 / 2.0f)) - (f / 2.0f), f5);
                    return;
                }
                return;
            }
            canvas.translate((f3 + f4) - f, f5);
            return;
        }
        canvas.translate(f3, f5);
    }

    /* renamed from: f0 */
    private List<C10246d> m12036f0(String str, float f, C8782c c8782c, float f2, float f3, boolean z) {
        float measureText;
        String substring;
        String trim;
        String substring2;
        String trim2;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        int i3 = 0;
        float f4 = 0.0f;
        float f5 = 0.0f;
        float f6 = 0.0f;
        for (int i4 = 0; i4 < str.length(); i4++) {
            char charAt = str.charAt(i4);
            if (z) {
                C8783d m39516f = this.f26668N.m23674c().m39516f(C8783d.m17260c(charAt, c8782c.m17267a(), c8782c.m17265c()));
                if (m39516f != null) {
                    measureText = ((float) m39516f.m17261b()) * f2 * C11680l.m7188e();
                }
            } else {
                measureText = this.f26661G.measureText(str.substring(i4, i4 + 1));
            }
            float f7 = measureText + f3;
            if (charAt == ' ') {
                z2 = true;
                f6 = f7;
            } else if (z2) {
                z2 = false;
                i3 = i4;
                f5 = f7;
            } else {
                f5 += f7;
            }
            f4 += f7;
            if (f > 0.0f && f4 >= f && charAt != ' ') {
                i++;
                C10246d m12043Z = m12043Z(i);
                if (i3 == i2) {
                    m12043Z.m12031c(str.substring(i2, i4).trim(), (f4 - f7) - ((trim2.length() - substring2.length()) * f6));
                    i2 = i4;
                    i3 = i2;
                    f4 = f7;
                    f5 = f4;
                } else {
                    m12043Z.m12031c(str.substring(i2, i3 - 1).trim(), ((f4 - f5) - ((substring.length() - trim.length()) * f6)) - f6);
                    f4 = f5;
                    i2 = i3;
                }
            }
        }
        if (f4 > 0.0f) {
            i++;
            m12043Z(i).m12031c(str.substring(i2), f4);
        }
        return this.f26665K.subList(0, i);
    }

    @Override // p223m1.AbstractC10231b, p111g1.InterfaceC6523e
    /* renamed from: e */
    public void mo12038e(RectF rectF, Matrix matrix, boolean z) {
        super.mo12038e(rectF, matrix, z);
        rectF.set(0.0f, 0.0f, this.f26668N.m23675b().width(), this.f26668N.m23675b().height());
    }

    @Override // p223m1.AbstractC10231b, p167j1.InterfaceC8785f
    /* renamed from: i */
    public <T> void mo12035i(T t, C12022c<T> c12022c) {
        super.mo12035i(t, c12022c);
        if (t == InterfaceC6071o0.f17261a) {
            AbstractC6861a<Integer, Integer> abstractC6861a = this.f26670P;
            if (abstractC6861a != null) {
                m12112H(abstractC6861a);
            }
            if (c12022c == null) {
                this.f26670P = null;
                return;
            }
            C6885q c6885q = new C6885q(c12022c);
            this.f26670P = c6885q;
            c6885q.m21774a(this);
            m12102j(this.f26670P);
        } else if (t == InterfaceC6071o0.f17262b) {
            AbstractC6861a<Integer, Integer> abstractC6861a2 = this.f26672R;
            if (abstractC6861a2 != null) {
                m12112H(abstractC6861a2);
            }
            if (c12022c == null) {
                this.f26672R = null;
                return;
            }
            C6885q c6885q2 = new C6885q(c12022c);
            this.f26672R = c6885q2;
            c6885q2.m21774a(this);
            m12102j(this.f26672R);
        } else if (t == InterfaceC6071o0.f17279s) {
            AbstractC6861a<Float, Float> abstractC6861a3 = this.f26674T;
            if (abstractC6861a3 != null) {
                m12112H(abstractC6861a3);
            }
            if (c12022c == null) {
                this.f26674T = null;
                return;
            }
            C6885q c6885q3 = new C6885q(c12022c);
            this.f26674T = c6885q3;
            c6885q3.m21774a(this);
            m12102j(this.f26674T);
        } else if (t == InterfaceC6071o0.f17280t) {
            AbstractC6861a<Float, Float> abstractC6861a4 = this.f26676V;
            if (abstractC6861a4 != null) {
                m12112H(abstractC6861a4);
            }
            if (c12022c == null) {
                this.f26676V = null;
                return;
            }
            C6885q c6885q4 = new C6885q(c12022c);
            this.f26676V = c6885q4;
            c6885q4.m21774a(this);
            m12102j(this.f26676V);
        } else if (t == InterfaceC6071o0.f17251F) {
            AbstractC6861a<Float, Float> abstractC6861a5 = this.f26677W;
            if (abstractC6861a5 != null) {
                m12112H(abstractC6861a5);
            }
            if (c12022c == null) {
                this.f26677W = null;
                return;
            }
            C6885q c6885q5 = new C6885q(c12022c);
            this.f26677W = c6885q5;
            c6885q5.m21774a(this);
            m12102j(this.f26677W);
        } else if (t == InterfaceC6071o0.f17258M) {
            AbstractC6861a<Typeface, Typeface> abstractC6861a6 = this.f26678X;
            if (abstractC6861a6 != null) {
                m12112H(abstractC6861a6);
            }
            if (c12022c == null) {
                this.f26678X = null;
                return;
            }
            C6885q c6885q6 = new C6885q(c12022c);
            this.f26678X = c6885q6;
            c6885q6.m21774a(this);
            m12102j(this.f26678X);
        } else if (t == InterfaceC6071o0.f17260O) {
            this.f26666L.m21725q(c12022c);
        }
    }

    @Override // p223m1.AbstractC10231b
    /* renamed from: u */
    void mo12034u(Canvas canvas, Matrix matrix, int i) {
        C8780b mo21712h = this.f26666L.mo21712h();
        C8782c c8782c = this.f26668N.m23670g().get(mo21712h.f23026b);
        if (c8782c == null) {
            return;
        }
        canvas.save();
        canvas.concat(matrix);
        m12052Q(mo21712h, i);
        if (this.f26667M.m23716g1()) {
            m12044Y(mo21712h, matrix, c8782c, canvas);
        } else {
            m12045X(mo21712h, c8782c, canvas);
        }
        canvas.restore();
    }

    /* renamed from: m1.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C10246d {

        /* renamed from: a */
        private String f26682a;

        /* renamed from: b */
        private float f26683b;

        private C10246d() {
            this.f26682a = "";
            this.f26683b = 0.0f;
        }

        /* renamed from: c */
        void m12031c(String str, float f) {
            this.f26682a = str;
            this.f26683b = f;
        }

        /* synthetic */ C10246d(C10243a c10243a) {
            this();
        }
    }
}
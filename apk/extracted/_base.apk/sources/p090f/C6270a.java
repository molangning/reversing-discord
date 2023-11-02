package p090f;

import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.util.StateSet;
import androidx.appcompat.widget.C0492c1;
import androidx.collection.C0629d;
import androidx.collection.SparseArrayCompat;
import androidx.core.content.res.C0992l;
import androidx.vectordrawable.graphics.drawable.C1906c;
import androidx.vectordrawable.graphics.drawable.C1915h;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;
import p090f.C6278b;
import p090f.C6284d;
import p109g.C6505b;
import p109g.C6506c;
import p109g.C6508e;

/* renamed from: f.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6270a extends C6284d {

    /* renamed from: A */
    private int f17713A;

    /* renamed from: B */
    private boolean f17714B;

    /* renamed from: x */
    private C6273c f17715x;

    /* renamed from: y */
    private AbstractC6277g f17716y;

    /* renamed from: z */
    private int f17717z;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6272b extends AbstractC6277g {

        /* renamed from: a */
        private final Animatable f17718a;

        C6272b(Animatable animatable) {
            super();
            this.f17718a = animatable;
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: c */
        public void mo23098c() {
            this.f17718a.start();
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: d */
        public void mo23097d() {
            this.f17718a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: f.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6273c extends C6284d.C6285a {

        /* renamed from: K */
        C0629d<Long> f17719K;

        /* renamed from: L */
        SparseArrayCompat<Integer> f17720L;

        C6273c(C6273c c6273c, C6270a c6270a, Resources resources) {
            super(c6273c, c6270a, resources);
            if (c6273c != null) {
                this.f17719K = c6273c.f17719K;
                this.f17720L = c6273c.f17720L;
                return;
            }
            this.f17719K = new C0629d<>();
            this.f17720L = new SparseArrayCompat<>();
        }

        /* renamed from: D */
        private static long m23108D(int i, int i2) {
            return i2 | (i << 32);
        }

        /* renamed from: B */
        int m23110B(int[] iArr, Drawable drawable, int i) {
            int m23053z = super.m23053z(iArr, drawable);
            this.f17720L.m39512l(m23053z, Integer.valueOf(i));
            return m23053z;
        }

        /* renamed from: C */
        int m23109C(int i, int i2, Drawable drawable, boolean z) {
            long j;
            int m23084a = super.m23084a(drawable);
            long m23108D = m23108D(i, i2);
            if (z) {
                j = 8589934592L;
            } else {
                j = 0;
            }
            long j2 = m23084a;
            this.f17719K.m39493b(m23108D, Long.valueOf(j2 | j));
            if (z) {
                this.f17719K.m39493b(m23108D(i2, i), Long.valueOf(4294967296L | j2 | j));
            }
            return m23084a;
        }

        /* renamed from: E */
        int m23107E(int i) {
            if (i < 0) {
                return 0;
            }
            return this.f17720L.m39515g(i, 0).intValue();
        }

        /* renamed from: F */
        int m23106F(int[] iArr) {
            int m23056A = super.m23056A(iArr);
            if (m23056A >= 0) {
                return m23056A;
            }
            return super.m23056A(StateSet.WILD_CARD);
        }

        /* renamed from: G */
        int m23105G(int i, int i2) {
            return (int) this.f17719K.m39487j(m23108D(i, i2), -1L).longValue();
        }

        /* renamed from: H */
        boolean m23104H(int i, int i2) {
            if ((this.f17719K.m39487j(m23108D(i, i2), -1L).longValue() & 4294967296L) != 0) {
                return true;
            }
            return false;
        }

        /* renamed from: I */
        boolean m23103I(int i, int i2) {
            if ((this.f17719K.m39487j(m23108D(i, i2), -1L).longValue() & 8589934592L) != 0) {
                return true;
            }
            return false;
        }

        @Override // p090f.C6284d.C6285a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            return new C6270a(this, null);
        }

        @Override // p090f.C6284d.C6285a, p090f.C6278b.AbstractC6282d
        /* renamed from: r */
        void mo23054r() {
            this.f17719K = this.f17719K.clone();
            this.f17720L = this.f17720L.clone();
        }

        @Override // p090f.C6284d.C6285a, android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            return new C6270a(this, resources);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6274d extends AbstractC6277g {

        /* renamed from: a */
        private final C1906c f17721a;

        C6274d(C1906c c1906c) {
            super();
            this.f17721a = c1906c;
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: c */
        public void mo23098c() {
            this.f17721a.start();
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: d */
        public void mo23097d() {
            this.f17721a.stop();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6275e extends AbstractC6277g {

        /* renamed from: a */
        private final ObjectAnimator f17722a;

        /* renamed from: b */
        private final boolean f17723b;

        C6275e(AnimationDrawable animationDrawable, boolean z, boolean z2) {
            super();
            int i;
            int i2;
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            if (z) {
                i = numberOfFrames - 1;
            } else {
                i = 0;
            }
            if (z) {
                i2 = 0;
            } else {
                i2 = numberOfFrames - 1;
            }
            C6276f c6276f = new C6276f(animationDrawable, z);
            ObjectAnimator ofInt = ObjectAnimator.ofInt(animationDrawable, "currentIndex", i, i2);
            C6505b.m22555a(ofInt, true);
            ofInt.setDuration(c6276f.m23102a());
            ofInt.setInterpolator(c6276f);
            this.f17723b = z2;
            this.f17722a = ofInt;
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: a */
        public boolean mo23100a() {
            return this.f17723b;
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: b */
        public void mo23099b() {
            this.f17722a.reverse();
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: c */
        public void mo23098c() {
            this.f17722a.start();
        }

        @Override // p090f.C6270a.AbstractC6277g
        /* renamed from: d */
        public void mo23097d() {
            this.f17722a.cancel();
        }
    }

    /* renamed from: f.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C6276f implements TimeInterpolator {

        /* renamed from: a */
        private int[] f17724a;

        /* renamed from: b */
        private int f17725b;

        /* renamed from: c */
        private int f17726c;

        C6276f(AnimationDrawable animationDrawable, boolean z) {
            m23101b(animationDrawable, z);
        }

        /* renamed from: a */
        int m23102a() {
            return this.f17726c;
        }

        /* renamed from: b */
        int m23101b(AnimationDrawable animationDrawable, boolean z) {
            int numberOfFrames = animationDrawable.getNumberOfFrames();
            this.f17725b = numberOfFrames;
            int[] iArr = this.f17724a;
            if (iArr == null || iArr.length < numberOfFrames) {
                this.f17724a = new int[numberOfFrames];
            }
            int[] iArr2 = this.f17724a;
            int i = 0;
            for (int i2 = 0; i2 < numberOfFrames; i2++) {
                int duration = animationDrawable.getDuration(z ? (numberOfFrames - i2) - 1 : i2);
                iArr2[i2] = duration;
                i += duration;
            }
            this.f17726c = i;
            return i;
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f) {
            float f2;
            int i = (int) ((f * this.f17726c) + 0.5f);
            int i2 = this.f17725b;
            int[] iArr = this.f17724a;
            int i3 = 0;
            while (i3 < i2) {
                int i4 = iArr[i3];
                if (i < i4) {
                    break;
                }
                i -= i4;
                i3++;
            }
            if (i3 < i2) {
                f2 = i / this.f17726c;
            } else {
                f2 = 0.0f;
            }
            return (i3 / i2) + f2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f.a$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static abstract class AbstractC6277g {
        private AbstractC6277g() {
        }

        /* renamed from: a */
        public boolean mo23100a() {
            return false;
        }

        /* renamed from: b */
        public void mo23099b() {
        }

        /* renamed from: c */
        public abstract void mo23098c();

        /* renamed from: d */
        public abstract void mo23097d();
    }

    public C6270a() {
        this(null, null);
    }

    /* renamed from: m */
    public static C6270a m23118m(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        String name = xmlPullParser.getName();
        if (name.equals("animated-selector")) {
            C6270a c6270a = new C6270a();
            c6270a.m23117n(context, resources, xmlPullParser, attributeSet, theme);
            return c6270a;
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": invalid animated-selector tag " + name);
    }

    /* renamed from: o */
    private void m23116o(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        int depth = xmlPullParser.getDepth() + 1;
        while (true) {
            int next = xmlPullParser.next();
            if (next != 1) {
                int depth2 = xmlPullParser.getDepth();
                if (depth2 >= depth || next != 3) {
                    if (next == 2 && depth2 <= depth) {
                        if (xmlPullParser.getName().equals("item")) {
                            m23114q(context, resources, xmlPullParser, attributeSet, theme);
                        } else if (xmlPullParser.getName().equals("transition")) {
                            m23113r(context, resources, xmlPullParser, attributeSet, theme);
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: p */
    private void m23115p() {
        onStateChange(getState());
    }

    /* renamed from: q */
    private int m23114q(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C6508e.f18318h);
        int resourceId = m38206k.getResourceId(C6508e.f18319i, 0);
        int resourceId2 = m38206k.getResourceId(C6508e.f18320j, -1);
        if (resourceId2 > 0) {
            drawable = C0492c1.m39959h().m39957j(context, resourceId2);
        } else {
            drawable = null;
        }
        m38206k.recycle();
        int[] m23057k = m23057k(attributeSet);
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("vector")) {
                    drawable = C1915h.m35051c(resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = C6506c.m22554a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable != null) {
            return this.f17715x.m23110B(m23057k, drawable, resourceId);
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <item> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: r */
    private int m23113r(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable;
        int next;
        TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C6508e.f18321k);
        int resourceId = m38206k.getResourceId(C6508e.f18324n, -1);
        int resourceId2 = m38206k.getResourceId(C6508e.f18323m, -1);
        int resourceId3 = m38206k.getResourceId(C6508e.f18322l, -1);
        if (resourceId3 > 0) {
            drawable = C0492c1.m39959h().m39957j(context, resourceId3);
        } else {
            drawable = null;
        }
        boolean z = m38206k.getBoolean(C6508e.f18325o, false);
        m38206k.recycle();
        if (drawable == null) {
            do {
                next = xmlPullParser.next();
            } while (next == 4);
            if (next == 2) {
                if (xmlPullParser.getName().equals("animated-vector")) {
                    drawable = C1906c.m35078a(context, resources, xmlPullParser, attributeSet, theme);
                } else {
                    drawable = C6506c.m22554a(resources, xmlPullParser, attributeSet, theme);
                }
            } else {
                throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
            }
        }
        if (drawable != null) {
            if (resourceId != -1 && resourceId2 != -1) {
                return this.f17715x.m23109C(resourceId, resourceId2, drawable, z);
            }
            throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires 'fromId' & 'toId' attributes");
        }
        throw new XmlPullParserException(xmlPullParser.getPositionDescription() + ": <transition> tag requires a 'drawable' attribute or child tag defining a drawable");
    }

    /* renamed from: s */
    private boolean m23112s(int i) {
        int m23095c;
        int m23105G;
        AbstractC6277g c6272b;
        AbstractC6277g abstractC6277g = this.f17716y;
        if (abstractC6277g != null) {
            if (i == this.f17717z) {
                return true;
            }
            if (i == this.f17713A && abstractC6277g.mo23100a()) {
                abstractC6277g.mo23099b();
                this.f17717z = this.f17713A;
                this.f17713A = i;
                return true;
            }
            m23095c = this.f17717z;
            abstractC6277g.mo23097d();
        } else {
            m23095c = m23095c();
        }
        this.f17716y = null;
        this.f17713A = -1;
        this.f17717z = -1;
        C6273c c6273c = this.f17715x;
        int m23107E = c6273c.m23107E(m23095c);
        int m23107E2 = c6273c.m23107E(i);
        if (m23107E2 == 0 || m23107E == 0 || (m23105G = c6273c.m23105G(m23107E, m23107E2)) < 0) {
            return false;
        }
        boolean m23103I = c6273c.m23103I(m23107E, m23107E2);
        m23091g(m23105G);
        Drawable current = getCurrent();
        if (current instanceof AnimationDrawable) {
            c6272b = new C6275e((AnimationDrawable) current, c6273c.m23104H(m23107E, m23107E2), m23103I);
        } else if (current instanceof C1906c) {
            c6272b = new C6274d((C1906c) current);
        } else {
            if (current instanceof Animatable) {
                c6272b = new C6272b((Animatable) current);
            }
            return false;
        }
        c6272b.mo23098c();
        this.f17716y = c6272b;
        this.f17713A = m23095c;
        this.f17717z = i;
        return true;
    }

    /* renamed from: t */
    private void m23111t(TypedArray typedArray) {
        C6273c c6273c = this.f17715x;
        c6273c.f17753d |= C6506c.m22553b(typedArray);
        c6273c.m23063x(typedArray.getBoolean(C6508e.f18314d, c6273c.f17758i));
        c6273c.m23067t(typedArray.getBoolean(C6508e.f18315e, c6273c.f17761l));
        c6273c.m23066u(typedArray.getInt(C6508e.f18316f, c6273c.f17741A));
        c6273c.m23065v(typedArray.getInt(C6508e.f18317g, c6273c.f17742B));
        setDither(typedArray.getBoolean(C6508e.f18312b, c6273c.f17773x));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p090f.C6284d, p090f.C6278b
    /* renamed from: h */
    public void mo23059h(C6278b.AbstractC6282d abstractC6282d) {
        super.mo23059h(abstractC6282d);
        if (abstractC6282d instanceof C6273c) {
            this.f17715x = (C6273c) abstractC6282d;
        }
    }

    @Override // p090f.C6284d, android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // p090f.C6278b, android.graphics.drawable.Drawable
    public void jumpToCurrentState() {
        super.jumpToCurrentState();
        AbstractC6277g abstractC6277g = this.f17716y;
        if (abstractC6277g != null) {
            abstractC6277g.mo23097d();
            this.f17716y = null;
            m23091g(this.f17717z);
            this.f17717z = -1;
            this.f17713A = -1;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // p090f.C6284d
    /* renamed from: l */
    public C6273c mo23058j() {
        return new C6273c(this.f17715x, this, null);
    }

    @Override // p090f.C6284d, p090f.C6278b, android.graphics.drawable.Drawable
    public Drawable mutate() {
        if (!this.f17714B && super.mutate() == this) {
            this.f17715x.mo23054r();
            this.f17714B = true;
        }
        return this;
    }

    /* renamed from: n */
    public void m23117n(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C6508e.f18311a);
        setVisible(m38206k.getBoolean(C6508e.f18313c, true), true);
        m23111t(m38206k);
        m23090i(resources);
        m38206k.recycle();
        m23116o(context, resources, xmlPullParser, attributeSet, theme);
        m23115p();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p090f.C6284d, p090f.C6278b, android.graphics.drawable.Drawable
    public boolean onStateChange(int[] iArr) {
        boolean z;
        int m23106F = this.f17715x.m23106F(iArr);
        if (m23106F != m23095c() && (m23112s(m23106F) || m23091g(m23106F))) {
            z = true;
        } else {
            z = false;
        }
        Drawable current = getCurrent();
        if (current != null) {
            return z | current.setState(iArr);
        }
        return z;
    }

    @Override // p090f.C6278b, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        AbstractC6277g abstractC6277g = this.f17716y;
        if (abstractC6277g != null && (visible || z2)) {
            if (z) {
                abstractC6277g.mo23098c();
            } else {
                jumpToCurrentState();
            }
        }
        return visible;
    }

    C6270a(C6273c c6273c, Resources resources) {
        super(null);
        this.f17717z = -1;
        this.f17713A = -1;
        mo23059h(new C6273c(c6273c, this, resources));
        onStateChange(getState());
        jumpToCurrentState();
    }
}

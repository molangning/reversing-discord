package p453z0;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.os.Message;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.Scroller;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.views.image.ReactImageView;
import java.util.Map;
import p164j$.util.concurrent.ConcurrentHashMap;

/* renamed from: z0.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C14061a extends View {

    /* renamed from: A */
    private int f36102A;

    /* renamed from: A0 */
    private float f36103A0;

    /* renamed from: B */
    private int f36104B;

    /* renamed from: B0 */
    private float f36105B0;

    /* renamed from: C */
    private int f36106C;

    /* renamed from: C0 */
    private boolean f36107C0;

    /* renamed from: D */
    private int f36108D;

    /* renamed from: D0 */
    private int f36109D0;

    /* renamed from: E */
    private int f36110E;

    /* renamed from: E0 */
    private int f36111E0;

    /* renamed from: F */
    private int f36112F;

    /* renamed from: F0 */
    private int f36113F0;

    /* renamed from: G */
    private int f36114G;

    /* renamed from: G0 */
    private float f36115G0;

    /* renamed from: H */
    private int f36116H;

    /* renamed from: H0 */
    private float f36117H0;

    /* renamed from: I */
    private int f36118I;

    /* renamed from: I0 */
    private float f36119I0;

    /* renamed from: J */
    private int f36120J;

    /* renamed from: J0 */
    private int f36121J0;

    /* renamed from: K */
    private int f36122K;

    /* renamed from: K0 */
    private int f36123K0;

    /* renamed from: L */
    private int f36124L;

    /* renamed from: L0 */
    private int f36125L0;

    /* renamed from: M */
    private int f36126M;

    /* renamed from: M0 */
    private int f36127M0;

    /* renamed from: N */
    private String f36128N;

    /* renamed from: N0 */
    private int f36129N0;

    /* renamed from: O */
    private String f36130O;

    /* renamed from: P */
    private String f36131P;

    /* renamed from: Q */
    private String f36132Q;

    /* renamed from: R */
    private float f36133R;

    /* renamed from: S */
    private float f36134S;

    /* renamed from: T */
    private float f36135T;

    /* renamed from: U */
    private float f36136U;

    /* renamed from: V */
    private boolean f36137V;

    /* renamed from: W */
    private boolean f36138W;

    /* renamed from: a0 */
    private boolean f36139a0;

    /* renamed from: b0 */
    private boolean f36140b0;

    /* renamed from: c0 */
    private boolean f36141c0;

    /* renamed from: d0 */
    private boolean f36142d0;

    /* renamed from: e0 */
    private boolean f36143e0;

    /* renamed from: f0 */
    private boolean f36144f0;

    /* renamed from: g0 */
    private Scroller f36145g0;

    /* renamed from: h0 */
    private VelocityTracker f36146h0;

    /* renamed from: i0 */
    private Paint f36147i0;

    /* renamed from: j */
    private int f36148j;

    /* renamed from: j0 */
    private TextPaint f36149j0;

    /* renamed from: k */
    private int f36150k;

    /* renamed from: k0 */
    private Paint f36151k0;

    /* renamed from: l */
    private int f36152l;

    /* renamed from: l0 */
    private String[] f36153l0;

    /* renamed from: m */
    private int f36154m;

    /* renamed from: m0 */
    private CharSequence[] f36155m0;

    /* renamed from: n */
    private int f36156n;

    /* renamed from: n0 */
    private CharSequence[] f36157n0;

    /* renamed from: o */
    private int f36158o;

    /* renamed from: o0 */
    private HandlerThread f36159o0;

    /* renamed from: p */
    private int f36160p;

    /* renamed from: p0 */
    private Handler f36161p0;

    /* renamed from: q */
    private int f36162q;

    /* renamed from: q0 */
    private Handler f36163q0;

    /* renamed from: r */
    private int f36164r;

    /* renamed from: r0 */
    private Map<String, Integer> f36165r0;

    /* renamed from: s */
    private int f36166s;

    /* renamed from: s0 */
    private InterfaceC14065d f36167s0;

    /* renamed from: t */
    private int f36168t;

    /* renamed from: t0 */
    private InterfaceC14066e f36169t0;

    /* renamed from: u */
    private int f36170u;

    /* renamed from: u0 */
    private int f36171u0;

    /* renamed from: v */
    private int f36172v;

    /* renamed from: v0 */
    private int f36173v0;

    /* renamed from: w */
    private int f36174w;

    /* renamed from: w0 */
    private int f36175w0;

    /* renamed from: x */
    private int f36176x;

    /* renamed from: x0 */
    private int f36177x0;

    /* renamed from: y */
    private int f36178y;

    /* renamed from: y0 */
    private int f36179y0;

    /* renamed from: z */
    private int f36180z;

    /* renamed from: z0 */
    private float f36181z0;

    /* renamed from: z0.a$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class HandlerC14062a extends Handler {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        HandlerC14062a(Looper looper) {
            super(looper);
            C14061a.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            int m790H;
            int i;
            int i2 = message.what;
            if (i2 != 1) {
                if (i2 == 2) {
                    C14061a.this.m775W(message.arg1, message.arg2, message.obj);
                    return;
                }
                return;
            }
            int i3 = 0;
            if (!C14061a.this.f36145g0.isFinished()) {
                if (C14061a.this.f36171u0 == 0) {
                    C14061a.this.m778T(1);
                }
                C14061a.this.f36161p0.sendMessageDelayed(C14061a.this.m793E(1, 0, 0, message.obj), 32L);
                return;
            }
            if (C14061a.this.f36123K0 != 0) {
                if (C14061a.this.f36171u0 == 0) {
                    C14061a.this.m778T(1);
                }
                if (C14061a.this.f36123K0 < (-C14061a.this.f36113F0) / 2) {
                    i = (int) (((C14061a.this.f36113F0 + C14061a.this.f36123K0) * 300.0f) / C14061a.this.f36113F0);
                    C14061a.this.f36145g0.startScroll(0, C14061a.this.f36125L0, 0, C14061a.this.f36123K0 + C14061a.this.f36113F0, i * 3);
                    C14061a c14061a = C14061a.this;
                    m790H = c14061a.m790H(c14061a.f36125L0 + C14061a.this.f36113F0 + C14061a.this.f36123K0);
                } else {
                    i = (int) (((-C14061a.this.f36123K0) * 300.0f) / C14061a.this.f36113F0);
                    C14061a.this.f36145g0.startScroll(0, C14061a.this.f36125L0, 0, C14061a.this.f36123K0, i * 3);
                    C14061a c14061a2 = C14061a.this;
                    m790H = c14061a2.m790H(c14061a2.f36125L0 + C14061a.this.f36123K0);
                }
                i3 = i;
                C14061a.this.postInvalidate();
            } else {
                C14061a.this.m778T(0);
                C14061a c14061a3 = C14061a.this;
                m790H = c14061a3.m790H(c14061a3.f36125L0);
            }
            C14061a c14061a4 = C14061a.this;
            Message m793E = c14061a4.m793E(2, c14061a4.f36122K, m790H, message.obj);
            if (C14061a.this.f36144f0) {
                C14061a.this.f36163q0.sendMessageDelayed(m793E, i3 * 2);
            } else {
                C14061a.this.f36161p0.sendMessageDelayed(m793E, i3 * 2);
            }
        }
    }

    /* renamed from: z0.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class HandlerC14063b extends Handler {
        HandlerC14063b() {
            C14061a.this = r1;
        }

        @Override // android.os.Handler
        public void handleMessage(Message message) {
            super.handleMessage(message);
            int i = message.what;
            if (i != 2) {
                if (i == 3) {
                    C14061a.this.requestLayout();
                    return;
                }
                return;
            }
            C14061a.this.m775W(message.arg1, message.arg2, message.obj);
        }
    }

    /* renamed from: z0.a$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC14064c {
    }

    /* renamed from: z0.a$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC14065d {
        /* renamed from: a */
        void mo731a(C14061a c14061a, int i, int i2);
    }

    /* renamed from: z0.a$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC14066e {
        /* renamed from: a */
        void mo730a(C14061a c14061a, int i, int i2);
    }

    /* renamed from: z0.a$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public interface InterfaceC14067f {
    }

    public C14061a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f36148j = -13421773;
        this.f36150k = -695533;
        this.f36152l = -695533;
        this.f36154m = 0;
        this.f36156n = 0;
        this.f36158o = 0;
        this.f36160p = 0;
        this.f36162q = 0;
        this.f36164r = 0;
        this.f36166s = 0;
        this.f36168t = 0;
        this.f36170u = 0;
        this.f36172v = -695533;
        this.f36174w = 2;
        this.f36176x = 0;
        this.f36178y = 0;
        this.f36180z = 3;
        this.f36102A = 0;
        this.f36104B = 0;
        this.f36106C = -1;
        this.f36108D = -1;
        this.f36110E = 0;
        this.f36112F = 0;
        this.f36114G = 0;
        this.f36116H = 0;
        this.f36118I = 0;
        this.f36120J = 0;
        this.f36122K = 0;
        this.f36124L = 150;
        this.f36126M = 8;
        this.f36133R = 1.0f;
        this.f36134S = 0.0f;
        this.f36135T = 0.0f;
        this.f36136U = 0.0f;
        this.f36137V = true;
        this.f36138W = true;
        this.f36139a0 = false;
        this.f36140b0 = false;
        this.f36141c0 = true;
        this.f36142d0 = false;
        this.f36143e0 = false;
        this.f36144f0 = true;
        this.f36147i0 = new Paint();
        this.f36149j0 = new TextPaint();
        this.f36151k0 = new Paint();
        this.f36165r0 = new ConcurrentHashMap();
        this.f36171u0 = 0;
        this.f36181z0 = 0.0f;
        this.f36103A0 = 0.0f;
        this.f36105B0 = 0.0f;
        this.f36107C0 = false;
        this.f36121J0 = 0;
        this.f36123K0 = 0;
        this.f36125L0 = 0;
        this.f36127M0 = 0;
        this.f36129N0 = 0;
        m787K(context, attributeSet);
        m788J(context);
    }

    /* renamed from: A */
    private float m797A(float f, float f2, float f3) {
        return f2 + ((f3 - f2) * f);
    }

    /* renamed from: B */
    private int m796B(int i, int i2, boolean z) {
        if (i2 <= 0) {
            return 0;
        }
        if (z) {
            int i3 = i % i2;
            return i3 < 0 ? i3 + i2 : i3;
        }
        return i;
    }

    /* renamed from: C */
    private int m795C(CharSequence[] charSequenceArr, Paint paint) {
        if (charSequenceArr == null) {
            return 0;
        }
        int i = 0;
        for (CharSequence charSequence : charSequenceArr) {
            if (charSequence != null) {
                i = Math.max(m791G(charSequence, paint), i);
            }
        }
        return i;
    }

    /* renamed from: D */
    private Message m794D(int i) {
        return m793E(i, 0, 0, null);
    }

    /* renamed from: E */
    public Message m793E(int i, int i2, int i3, Object obj) {
        Message obtain = Message.obtain();
        obtain.what = i;
        obtain.arg1 = i2;
        obtain.arg2 = i3;
        obtain.obj = obj;
        return obtain;
    }

    /* renamed from: F */
    private float m792F(Paint.FontMetrics fontMetrics) {
        if (fontMetrics == null) {
            return 0.0f;
        }
        return Math.abs(fontMetrics.top + fontMetrics.bottom) / 2.0f;
    }

    /* renamed from: G */
    private int m791G(CharSequence charSequence, Paint paint) {
        Integer num;
        if (TextUtils.isEmpty(charSequence)) {
            return 0;
        }
        String charSequence2 = charSequence.toString();
        if (this.f36165r0.containsKey(charSequence2) && (num = this.f36165r0.get(charSequence2)) != null) {
            return num.intValue();
        }
        int measureText = (int) (paint.measureText(charSequence2) + 0.5f);
        this.f36165r0.put(charSequence2, Integer.valueOf(measureText));
        return measureText;
    }

    /* renamed from: H */
    public int m790H(int i) {
        int i2 = this.f36113F0;
        boolean z = false;
        if (i2 == 0) {
            return 0;
        }
        int i3 = (i / i2) + (this.f36180z / 2);
        int oneRecycleSize = getOneRecycleSize();
        if (this.f36138W && this.f36141c0) {
            z = true;
        }
        int m796B = m796B(i3, oneRecycleSize, z);
        if (m796B >= 0 && m796B < getOneRecycleSize()) {
            return m796B + this.f36106C;
        }
        return getOneRecycleSize() - 1;
    }

    /* renamed from: I */
    private void m789I() {
        if (this.f36153l0 == null) {
            this.f36153l0 = r0;
            String[] strArr = {""};
        }
    }

    /* renamed from: J */
    private void m788J(Context context) {
        this.f36145g0 = new Scroller(context);
        this.f36124L = ViewConfiguration.get(getContext()).getScaledMinimumFlingVelocity();
        this.f36126M = ViewConfiguration.get(getContext()).getScaledTouchSlop();
        if (this.f36154m == 0) {
            this.f36154m = m765d0(context, 14.0f);
        }
        if (this.f36156n == 0) {
            this.f36156n = m765d0(context, 16.0f);
        }
        if (this.f36158o == 0) {
            this.f36158o = m765d0(context, 14.0f);
        }
        if (this.f36164r == 0) {
            this.f36164r = m736v(context, 8.0f);
        }
        if (this.f36166s == 0) {
            this.f36166s = m736v(context, 8.0f);
        }
        this.f36147i0.setColor(this.f36172v);
        this.f36147i0.setAntiAlias(true);
        this.f36147i0.setStyle(Paint.Style.STROKE);
        this.f36147i0.setStrokeWidth(this.f36174w);
        this.f36149j0.setColor(this.f36148j);
        this.f36149j0.setAntiAlias(true);
        this.f36149j0.setTextAlign(Paint.Align.RIGHT);
        this.f36151k0.setColor(this.f36152l);
        this.f36151k0.setAntiAlias(true);
        this.f36151k0.setTextAlign(Paint.Align.CENTER);
        this.f36151k0.setTextSize(this.f36158o);
        int i = this.f36180z;
        if (i % 2 == 0) {
            this.f36180z = i + 1;
        }
        if (this.f36106C == -1 || this.f36108D == -1) {
            m745n0();
        }
        m786L();
    }

    /* renamed from: K */
    private void m787K(Context context, AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C14068b.f36187a);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == C14068b.f36206t) {
                this.f36180z = obtainStyledAttributes.getInt(index, 3);
            } else if (index == C14068b.f36191e) {
                this.f36172v = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == C14068b.f36192f) {
                this.f36174w = obtainStyledAttributes.getDimensionPixelSize(index, 2);
            } else if (index == C14068b.f36193g) {
                this.f36176x = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == C14068b.f36194h) {
                this.f36178y = obtainStyledAttributes.getDimensionPixelSize(index, 0);
            } else if (index == C14068b.f36207u) {
                this.f36153l0 = m738t(obtainStyledAttributes.getTextArray(index));
            } else if (index == C14068b.f36209w) {
                this.f36148j = obtainStyledAttributes.getColor(index, -13421773);
            } else if (index == C14068b.f36210x) {
                this.f36150k = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == C14068b.f36208v) {
                this.f36152l = obtainStyledAttributes.getColor(index, -695533);
            } else if (index == C14068b.f36184A) {
                this.f36154m = obtainStyledAttributes.getDimensionPixelSize(index, m765d0(context, 14.0f));
            } else if (index == C14068b.f36185B) {
                this.f36156n = obtainStyledAttributes.getDimensionPixelSize(index, m765d0(context, 16.0f));
            } else if (index == C14068b.f36212z) {
                this.f36158o = obtainStyledAttributes.getDimensionPixelSize(index, m765d0(context, 14.0f));
            } else if (index == C14068b.f36202p) {
                this.f36106C = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == C14068b.f36201o) {
                this.f36108D = obtainStyledAttributes.getInteger(index, 0);
            } else if (index == C14068b.f36186C) {
                this.f36138W = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == C14068b.f36205s) {
                this.f36137V = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == C14068b.f36196j) {
                this.f36128N = obtainStyledAttributes.getString(index);
            } else if (index == C14068b.f36188b) {
                this.f36132Q = obtainStyledAttributes.getString(index);
            } else if (index == C14068b.f36195i) {
                this.f36131P = obtainStyledAttributes.getString(index);
            } else if (index == C14068b.f36200n) {
                this.f36164r = obtainStyledAttributes.getDimensionPixelSize(index, m736v(context, 8.0f));
            } else if (index == C14068b.f36199m) {
                this.f36166s = obtainStyledAttributes.getDimensionPixelSize(index, m736v(context, 8.0f));
            } else if (index == C14068b.f36198l) {
                this.f36168t = obtainStyledAttributes.getDimensionPixelSize(index, m736v(context, 2.0f));
            } else if (index == C14068b.f36197k) {
                this.f36170u = obtainStyledAttributes.getDimensionPixelSize(index, m736v(context, 5.0f));
            } else if (index == C14068b.f36189c) {
                this.f36155m0 = obtainStyledAttributes.getTextArray(index);
            } else if (index == C14068b.f36190d) {
                this.f36157n0 = obtainStyledAttributes.getTextArray(index);
            } else if (index == C14068b.f36204r) {
                this.f36143e0 = obtainStyledAttributes.getBoolean(index, false);
            } else if (index == C14068b.f36203q) {
                this.f36144f0 = obtainStyledAttributes.getBoolean(index, true);
            } else if (index == C14068b.f36211y) {
                this.f36130O = obtainStyledAttributes.getString(index);
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* renamed from: L */
    private void m786L() {
        HandlerThread handlerThread = new HandlerThread("HandlerThread-For-Refreshing");
        this.f36159o0 = handlerThread;
        handlerThread.start();
        this.f36161p0 = new HandlerC14062a(this.f36159o0.getLooper());
        this.f36163q0 = new HandlerC14063b();
    }

    /* renamed from: M */
    private void m785M() {
        if (!this.f36159o0.isAlive()) {
            m786L();
        }
    }

    /* renamed from: N */
    private void m784N() {
        m737u(getPickedIndexRelativeToRaw() - this.f36106C, false);
        this.f36138W = false;
        postInvalidate();
    }

    /* renamed from: P */
    private boolean m782P(String str, String str2) {
        return str == null ? str2 == null : str.equals(str2);
    }

    /* renamed from: Q */
    private int m781Q(int i) {
        if (this.f36138W && this.f36141c0) {
            return i;
        }
        int i2 = this.f36179y0;
        if (i < i2 || i > (i2 = this.f36177x0)) {
            return i2;
        }
        return i;
    }

    /* renamed from: R */
    private int m780R(int i) {
        int mode = View.MeasureSpec.getMode(i);
        this.f36129N0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int paddingTop = getPaddingTop() + getPaddingBottom() + (this.f36180z * (this.f36116H + (this.f36168t * 2)));
            if (mode == Integer.MIN_VALUE) {
                return Math.min(paddingTop, size);
            }
            return paddingTop;
        }
        return size;
    }

    /* renamed from: S */
    private int m779S(int i) {
        int i2;
        int mode = View.MeasureSpec.getMode(i);
        this.f36127M0 = mode;
        int size = View.MeasureSpec.getSize(i);
        if (mode != 1073741824) {
            int i3 = 0;
            if (Math.max(this.f36160p, this.f36162q) == 0) {
                i2 = 0;
            } else {
                i2 = this.f36166s;
            }
            if (Math.max(this.f36160p, this.f36162q) != 0) {
                i3 = this.f36164r;
            }
            int paddingLeft = getPaddingLeft() + getPaddingRight() + Math.max(this.f36118I, Math.max(this.f36114G, this.f36120J) + ((i3 + Math.max(this.f36160p, this.f36162q) + i2 + (this.f36170u * 2)) * 2));
            if (mode == Integer.MIN_VALUE) {
                return Math.min(paddingLeft, size);
            }
            return paddingLeft;
        }
        return size;
    }

    /* renamed from: T */
    public void m778T(int i) {
        if (this.f36171u0 == i) {
            return;
        }
        this.f36171u0 = i;
    }

    /* renamed from: U */
    private int m777U(int i, int i2, int i3, boolean z) {
        if (z) {
            if (i > i3) {
                return (((i - i3) % getOneRecycleSize()) + i2) - 1;
            }
            if (i < i2) {
                return ((i - i2) % getOneRecycleSize()) + i3 + 1;
            }
            return i;
        } else if (i > i3) {
            return i3;
        } else {
            if (i < i2) {
                return i2;
            }
            return i;
        }
    }

    /* renamed from: V */
    private void m776V() {
        VelocityTracker velocityTracker = this.f36146h0;
        if (velocityTracker != null) {
            velocityTracker.clear();
            this.f36146h0.recycle();
            this.f36146h0 = null;
        }
    }

    /* renamed from: W */
    public void m775W(int i, int i2, Object obj) {
        InterfaceC14065d interfaceC14065d;
        m778T(0);
        if (i != i2) {
            if ((obj == null || !(obj instanceof Boolean) || ((Boolean) obj).booleanValue()) && (interfaceC14065d = this.f36167s0) != null) {
                int i3 = this.f36110E;
                interfaceC14065d.mo731a(this, i + i3, i3 + i2);
            }
            this.f36122K = i2;
        }
        if (this.f36142d0) {
            this.f36142d0 = false;
            m784N();
        }
    }

    /* renamed from: X */
    private void m774X(int i, int i2) {
        this.f36169t0.mo730a(this, i, i2);
    }

    /* renamed from: Y */
    private void m773Y(int i) {
        m772Z(i, true);
    }

    /* renamed from: Z */
    private void m772Z(int i, boolean z) {
        int pickedIndexRelativeToRaw;
        int pickedIndexRelativeToRaw2;
        int i2;
        int i3;
        int i4;
        m785M();
        if ((!this.f36138W || !this.f36141c0) && ((pickedIndexRelativeToRaw2 = (pickedIndexRelativeToRaw = getPickedIndexRelativeToRaw()) + i) > (i2 = this.f36108D) || pickedIndexRelativeToRaw2 < (i2 = this.f36106C))) {
            i = i2 - pickedIndexRelativeToRaw;
        }
        int i5 = this.f36123K0;
        int i6 = this.f36113F0;
        if (i5 < (-i6) / 2) {
            int i7 = i6 + i5;
            int i8 = (int) (((i5 + i6) * 300.0f) / i6);
            if (i < 0) {
                i4 = (-i8) - (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            } else {
                i4 = i8 + (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            }
            i3 = i4;
            i5 = i7;
        } else {
            int i9 = (int) (((-i5) * 300.0f) / i6);
            if (i < 0) {
                i3 = i9 - (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            } else {
                i3 = i9 + (i * ReactImageView.REMOTE_IMAGE_FADE_DURATION_MS);
            }
        }
        int i10 = i5 + (i * i6);
        if (i3 < 300) {
            i3 = 300;
        }
        if (i3 > 600) {
            i3 = 600;
        }
        this.f36145g0.startScroll(0, this.f36125L0, 0, i10, i3);
        if (z) {
            this.f36161p0.sendMessageDelayed(m794D(1), i3 / 4);
        } else {
            this.f36161p0.sendMessageDelayed(m793E(1, 0, 0, new Boolean(z)), i3 / 4);
        }
        postInvalidate();
    }

    /* renamed from: d0 */
    private int m765d0(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().scaledDensity) + 0.5f);
    }

    /* renamed from: e0 */
    private void m763e0() {
        Handler handler = this.f36161p0;
        if (handler != null) {
            handler.removeMessages(1);
        }
    }

    /* renamed from: g0 */
    private void m759g0(String[] strArr) {
        this.f36153l0 = strArr;
        m743o0();
    }

    private TextUtils.TruncateAt getEllipsizeType() {
        String str = this.f36130O;
        str.hashCode();
        char c = 65535;
        switch (str.hashCode()) {
            case -1074341483:
                if (str.equals("middle")) {
                    c = 0;
                    break;
                }
                break;
            case 100571:
                if (str.equals(ViewProps.END)) {
                    c = 1;
                    break;
                }
                break;
            case 109757538:
                if (str.equals(ViewProps.START)) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return TextUtils.TruncateAt.MIDDLE;
            case 1:
                return TextUtils.TruncateAt.END;
            case 2:
                return TextUtils.TruncateAt.START;
            default:
                throw new IllegalArgumentException("Illegal text ellipsize type.");
        }
    }

    /* renamed from: h0 */
    private void m757h0() {
        int i;
        int i2;
        int i3;
        int i4 = this.f36180z / 2;
        this.f36102A = i4;
        this.f36104B = i4 + 1;
        int i5 = this.f36111E0;
        this.f36115G0 = (i4 * i5) / i;
        this.f36117H0 = (i2 * i5) / i;
        if (this.f36176x < 0) {
            this.f36176x = 0;
        }
        if (this.f36178y < 0) {
            this.f36178y = 0;
        }
        if (this.f36176x + this.f36178y != 0 && getPaddingLeft() + this.f36176x >= (this.f36109D0 - getPaddingRight()) - this.f36178y) {
            int paddingLeft = getPaddingLeft() + this.f36176x + getPaddingRight();
            int i6 = this.f36178y;
            int i7 = (paddingLeft + i6) - this.f36109D0;
            int i8 = this.f36176x;
            float f = i7;
            this.f36176x = (int) (i8 - ((i8 * f) / (i8 + i6)));
            this.f36178y = (int) (i6 - ((f * i6) / (i3 + i6)));
        }
    }

    /* renamed from: i0 */
    private void m755i0() {
        int i = this.f36154m;
        int i2 = this.f36113F0;
        if (i > i2) {
            this.f36154m = i2;
        }
        if (this.f36156n > i2) {
            this.f36156n = i2;
        }
        Paint paint = this.f36151k0;
        if (paint != null) {
            paint.setTextSize(this.f36158o);
            this.f36136U = m792F(this.f36151k0.getFontMetrics());
            this.f36160p = m791G(this.f36128N, this.f36151k0);
            TextPaint textPaint = this.f36149j0;
            if (textPaint != null) {
                textPaint.setTextSize(this.f36156n);
                this.f36135T = m792F(this.f36149j0.getFontMetrics());
                this.f36149j0.setTextSize(this.f36154m);
                this.f36134S = m792F(this.f36149j0.getFontMetrics());
                return;
            }
            throw new IllegalArgumentException("mPaintText should not be null.");
        }
        throw new IllegalArgumentException("mPaintHint should not be null.");
    }

    /* renamed from: j0 */
    private void m753j0() {
        float textSize = this.f36149j0.getTextSize();
        this.f36149j0.setTextSize(this.f36156n);
        this.f36116H = (int) ((this.f36149j0.getFontMetrics().bottom - this.f36149j0.getFontMetrics().top) + 0.5d);
        this.f36149j0.setTextSize(textSize);
    }

    /* renamed from: k0 */
    private void m751k0(boolean z) {
        m749l0();
        m753j0();
        if (z) {
            if (this.f36127M0 == Integer.MIN_VALUE || this.f36129N0 == Integer.MIN_VALUE) {
                this.f36163q0.sendEmptyMessage(3);
            }
        }
    }

    /* renamed from: l0 */
    private void m749l0() {
        float textSize = this.f36149j0.getTextSize();
        this.f36149j0.setTextSize(this.f36156n);
        this.f36114G = m795C(this.f36153l0, this.f36149j0);
        this.f36118I = m795C(this.f36155m0, this.f36149j0);
        this.f36120J = m795C(this.f36157n0, this.f36149j0);
        this.f36149j0.setTextSize(this.f36158o);
        this.f36162q = m791G(this.f36132Q, this.f36149j0);
        this.f36149j0.setTextSize(textSize);
    }

    /* renamed from: m0 */
    private void m747m0() {
        this.f36177x0 = 0;
        this.f36179y0 = (-this.f36180z) * this.f36113F0;
        if (this.f36153l0 != null) {
            int oneRecycleSize = getOneRecycleSize();
            int i = this.f36180z;
            int i2 = this.f36113F0;
            this.f36177x0 = ((oneRecycleSize - (i / 2)) - 1) * i2;
            this.f36179y0 = (-(i / 2)) * i2;
        }
    }

    /* renamed from: n0 */
    private void m745n0() {
        m789I();
        m743o0();
        if (this.f36106C == -1) {
            this.f36106C = 0;
        }
        if (this.f36108D == -1) {
            this.f36108D = this.f36153l0.length - 1;
        }
        m768b0(this.f36106C, this.f36108D, false);
    }

    /* renamed from: o0 */
    private void m743o0() {
        this.f36141c0 = this.f36153l0.length > this.f36180z;
    }

    /* renamed from: q */
    private void m741q() {
        int floor = (int) Math.floor(this.f36125L0 / this.f36113F0);
        this.f36121J0 = floor;
        int i = this.f36125L0;
        int i2 = this.f36113F0;
        int i3 = -(i - (floor * i2));
        this.f36123K0 = i3;
        if (this.f36169t0 != null) {
            if ((-i3) > i2 / 2) {
                this.f36175w0 = floor + 1 + (this.f36180z / 2);
            } else {
                this.f36175w0 = floor + (this.f36180z / 2);
            }
            int oneRecycleSize = this.f36175w0 % getOneRecycleSize();
            this.f36175w0 = oneRecycleSize;
            if (oneRecycleSize < 0) {
                this.f36175w0 = oneRecycleSize + getOneRecycleSize();
            }
            int i4 = this.f36173v0;
            int i5 = this.f36175w0;
            if (i4 != i5) {
                int i6 = this.f36110E;
                m774X(i4 + i6, i5 + i6);
            }
            this.f36173v0 = this.f36175w0;
        }
    }

    /* renamed from: r */
    private void m740r(MotionEvent motionEvent) {
        float y = motionEvent.getY();
        for (int i = 0; i < this.f36180z; i++) {
            int i2 = this.f36113F0;
            if (i2 * i <= y && y < i2 * (i + 1)) {
                m739s(i);
                return;
            }
        }
    }

    /* renamed from: s */
    private void m739s(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f36180z)) {
            m773Y(i - (i2 / 2));
        }
    }

    /* renamed from: t */
    private String[] m738t(CharSequence[] charSequenceArr) {
        if (charSequenceArr == null) {
            return null;
        }
        String[] strArr = new String[charSequenceArr.length];
        for (int i = 0; i < charSequenceArr.length; i++) {
            strArr[i] = charSequenceArr[i].toString();
        }
        return strArr;
    }

    /* renamed from: u */
    private void m737u(int i, boolean z) {
        int i2 = i - ((this.f36180z - 1) / 2);
        this.f36121J0 = i2;
        int m796B = m796B(i2, getOneRecycleSize(), z);
        this.f36121J0 = m796B;
        int i3 = this.f36113F0;
        if (i3 == 0) {
            this.f36139a0 = true;
            return;
        }
        this.f36125L0 = i3 * m796B;
        int i4 = m796B + (this.f36180z / 2);
        this.f36173v0 = i4;
        int oneRecycleSize = i4 % getOneRecycleSize();
        this.f36173v0 = oneRecycleSize;
        if (oneRecycleSize < 0) {
            this.f36173v0 = oneRecycleSize + getOneRecycleSize();
        }
        this.f36175w0 = this.f36173v0;
        m741q();
    }

    /* renamed from: v */
    private int m736v(Context context, float f) {
        return (int) ((f * context.getResources().getDisplayMetrics().density) + 0.5f);
    }

    /* renamed from: w */
    private void m735w(Canvas canvas) {
        boolean z;
        float f;
        float f2;
        float f3;
        int i;
        int i2;
        int i3;
        float f4 = 0.0f;
        int i4 = 0;
        while (i4 < this.f36180z + 1) {
            float f5 = this.f36123K0 + (this.f36113F0 * i4);
            int i5 = this.f36121J0 + i4;
            int oneRecycleSize = getOneRecycleSize();
            if (this.f36138W && this.f36141c0) {
                z = true;
            } else {
                z = false;
            }
            int m796B = m796B(i5, oneRecycleSize, z);
            int i6 = this.f36180z;
            if (i4 == i6 / 2) {
                f3 = (this.f36123K0 + i3) / this.f36113F0;
                i = m732z(f3, this.f36148j, this.f36150k);
                f = m797A(f3, this.f36154m, this.f36156n);
                f2 = m797A(f3, this.f36134S, this.f36135T);
            } else if (i4 == (i6 / 2) + 1) {
                float f6 = 1.0f - f4;
                int m732z = m732z(f6, this.f36148j, this.f36150k);
                float m797A = m797A(f6, this.f36154m, this.f36156n);
                float m797A2 = m797A(f6, this.f36134S, this.f36135T);
                f3 = f4;
                i = m732z;
                f = m797A;
                f2 = m797A2;
            } else {
                int i7 = this.f36148j;
                f = this.f36154m;
                f2 = this.f36134S;
                f3 = f4;
                i = i7;
            }
            this.f36149j0.setColor(i);
            this.f36149j0.setTextSize(f);
            if (m796B >= 0 && m796B < getOneRecycleSize()) {
                CharSequence charSequence = this.f36153l0[m796B + this.f36106C];
                if (this.f36130O != null) {
                    charSequence = TextUtils.ellipsize(charSequence, this.f36149j0, getWidth() - (this.f36170u * 2), getEllipsizeType());
                }
                if (this.f36149j0.getTextAlign() == Paint.Align.RIGHT) {
                    i2 = this.f36109D0 - (this.f36170u * 2);
                } else {
                    i2 = this.f36170u * 2;
                }
                canvas.drawText(charSequence.toString(), i2, f5 + (this.f36113F0 / 2) + f2, this.f36149j0);
            } else if (!TextUtils.isEmpty(this.f36131P)) {
                canvas.drawText(this.f36131P, this.f36119I0, f5 + (this.f36113F0 / 2) + f2, this.f36149j0);
            }
            i4++;
            f4 = f3;
        }
    }

    /* renamed from: x */
    private void m734x(Canvas canvas) {
        if (TextUtils.isEmpty(this.f36128N)) {
            return;
        }
        canvas.drawText(this.f36128N, this.f36119I0 + ((this.f36114G + this.f36160p) / 2) + this.f36164r, ((this.f36115G0 + this.f36117H0) / 2.0f) + this.f36136U, this.f36151k0);
    }

    /* renamed from: y */
    private void m733y(Canvas canvas) {
        if (this.f36137V) {
            canvas.drawLine(getPaddingLeft() + this.f36176x, this.f36115G0, (this.f36109D0 - getPaddingRight()) - this.f36178y, this.f36115G0, this.f36147i0);
            canvas.drawLine(getPaddingLeft() + this.f36176x, this.f36117H0, (this.f36109D0 - getPaddingRight()) - this.f36178y, this.f36117H0, this.f36147i0);
        }
    }

    /* renamed from: z */
    private int m732z(float f, int i, int i2) {
        int i3 = (i & (-16777216)) >>> 24;
        int i4 = (i & 16711680) >>> 16;
        int i5 = (i & 65280) >>> 8;
        int i6 = (i & 255) >>> 0;
        return ((int) (i6 + ((((i2 & 255) >>> 0) - i6) * f))) | (((int) (i3 + (((((-16777216) & i2) >>> 24) - i3) * f))) << 24) | (((int) (i4 + ((((16711680 & i2) >>> 16) - i4) * f))) << 16) | (((int) (i5 + ((((65280 & i2) >>> 8) - i5) * f))) << 8);
    }

    /* renamed from: O */
    public boolean m783O() {
        return this.f36171u0 == 2;
    }

    /* renamed from: a */
    public void m771a(int i, boolean z) {
        m767c0(getValue(), i, z);
    }

    /* renamed from: a0 */
    public void m770a0(int i, int i2) {
        m768b0(i, i2, true);
    }

    /* renamed from: b */
    public void m769b(int i) {
        m767c0(getValue(), i, true);
    }

    /* renamed from: b0 */
    public void m768b0(int i, int i2, boolean z) {
        if (i <= i2) {
            String[] strArr = this.f36153l0;
            if (strArr != null) {
                if (i >= 0) {
                    boolean z2 = true;
                    if (i <= strArr.length - 1) {
                        if (i2 >= 0) {
                            if (i2 <= strArr.length - 1) {
                                this.f36106C = i;
                                this.f36108D = i2;
                                if (z) {
                                    this.f36122K = i + 0;
                                    if (!this.f36138W || !this.f36141c0) {
                                        z2 = false;
                                    }
                                    m737u(0, z2);
                                    postInvalidate();
                                    return;
                                }
                                return;
                            }
                            throw new IllegalArgumentException("maxShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f36153l0.length - 1) + " maxShowIndex is " + i2);
                        }
                        throw new IllegalArgumentException("maxShowIndex should not be less than 0, now maxShowIndex is " + i2);
                    }
                    throw new IllegalArgumentException("minShowIndex should not be greater than (mDisplayedValues.length - 1), now (mDisplayedValues.length - 1) is " + (this.f36153l0.length - 1) + " minShowIndex is " + i);
                }
                throw new IllegalArgumentException("minShowIndex should not be less than 0, now minShowIndex is " + i);
            }
            throw new IllegalArgumentException("mDisplayedValues should not be null, you need to set mDisplayedValues first.");
        }
        throw new IllegalArgumentException("minShowIndex should be less than maxShowIndex, minShowIndex is " + i + ", maxShowIndex is " + i2 + ".");
    }

    /* renamed from: c0 */
    public void m767c0(int i, int i2, boolean z) {
        boolean z2;
        int i3;
        int i4 = this.f36110E;
        int i5 = this.f36112F;
        boolean z3 = true;
        if (this.f36138W && this.f36141c0) {
            z2 = true;
        } else {
            z2 = false;
        }
        int m777U = m777U(i, i4, i5, z2);
        int i6 = this.f36110E;
        int i7 = this.f36112F;
        if (!this.f36138W || !this.f36141c0) {
            z3 = false;
        }
        int m777U2 = m777U(i2, i6, i7, z3);
        if (this.f36138W && this.f36141c0) {
            i3 = m777U2 - m777U;
            int oneRecycleSize = getOneRecycleSize() / 2;
            if (i3 < (-oneRecycleSize) || oneRecycleSize < i3) {
                int oneRecycleSize2 = getOneRecycleSize();
                if (i3 > 0) {
                    i3 -= oneRecycleSize2;
                } else {
                    i3 += oneRecycleSize2;
                }
            }
        } else {
            i3 = m777U2 - m777U;
        }
        setValue(m777U);
        if (m777U == m777U2) {
            return;
        }
        m772Z(i3, z);
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f36113F0 != 0 && this.f36145g0.computeScrollOffset()) {
            this.f36125L0 = this.f36145g0.getCurrY();
            m741q();
            postInvalidate();
        }
    }

    /* renamed from: f0 */
    public void m761f0() {
        Scroller scroller = this.f36145g0;
        if (scroller != null && !scroller.isFinished()) {
            Scroller scroller2 = this.f36145g0;
            scroller2.startScroll(0, scroller2.getCurrY(), 0, 0, 1);
            this.f36145g0.abortAnimation();
            postInvalidate();
        }
    }

    public String getContentByCurrValue() {
        return this.f36153l0[getValue() - this.f36110E];
    }

    public String[] getDisplayedValues() {
        return this.f36153l0;
    }

    public int getMaxValue() {
        return this.f36112F;
    }

    public int getMinValue() {
        return this.f36110E;
    }

    public int getOneRecycleSize() {
        return (this.f36108D - this.f36106C) + 1;
    }

    public int getPickedIndexRelativeToRaw() {
        int i = this.f36123K0;
        if (i != 0) {
            int i2 = this.f36113F0;
            if (i < (-i2) / 2) {
                return m790H(this.f36125L0 + i2 + i);
            }
            return m790H(this.f36125L0 + i);
        }
        return m790H(this.f36125L0);
    }

    public int getRawContentSize() {
        String[] strArr = this.f36153l0;
        if (strArr != null) {
            return strArr.length;
        }
        return 0;
    }

    public int getValue() {
        return getPickedIndexRelativeToRaw() + this.f36110E;
    }

    public boolean getWrapSelectorWheel() {
        return this.f36138W;
    }

    public boolean getWrapSelectorWheelAbsolutely() {
        return this.f36138W && this.f36141c0;
    }

    @Override // android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        HandlerThread handlerThread = this.f36159o0;
        if (handlerThread == null || !handlerThread.isAlive()) {
            m786L();
        }
    }

    @Override // android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f36159o0.quit();
        if (this.f36113F0 == 0) {
            return;
        }
        if (!this.f36145g0.isFinished()) {
            this.f36145g0.abortAnimation();
            this.f36125L0 = this.f36145g0.getCurrY();
            m741q();
            int i = this.f36123K0;
            if (i != 0) {
                int i2 = this.f36113F0;
                if (i < (-i2) / 2) {
                    this.f36125L0 = this.f36125L0 + i2 + i;
                } else {
                    this.f36125L0 += i;
                }
                m741q();
            }
            m778T(0);
        }
        int m790H = m790H(this.f36125L0);
        int i3 = this.f36122K;
        if (m790H != i3 && this.f36143e0) {
            try {
                InterfaceC14065d interfaceC14065d = this.f36167s0;
                if (interfaceC14065d != null) {
                    int i4 = this.f36110E;
                    interfaceC14065d.mo731a(this, i3 + i4, i4 + m790H);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        this.f36122K = m790H;
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        m735w(canvas);
        m733y(canvas);
        m734x(canvas);
    }

    @Override // android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        m751k0(false);
        setMeasuredDimension(m779S(i), m780R(i2));
    }

    @Override // android.view.View
    protected void onSizeChanged(int i, int i2, int i3, int i4) {
        int i5;
        super.onSizeChanged(i, i2, i3, i4);
        this.f36109D0 = i;
        this.f36111E0 = i2;
        this.f36113F0 = i2 / this.f36180z;
        this.f36119I0 = ((i + getPaddingLeft()) - getPaddingRight()) / 2.0f;
        boolean z = false;
        if (getOneRecycleSize() > 1) {
            if (this.f36140b0) {
                i5 = getValue() - this.f36110E;
            } else if (this.f36139a0) {
                i5 = this.f36121J0 + ((this.f36180z - 1) / 2);
            }
            if (this.f36138W && this.f36141c0) {
                z = true;
            }
            m737u(i5, z);
            m755i0();
            m747m0();
            m757h0();
            this.f36140b0 = true;
        }
        i5 = 0;
        if (this.f36138W) {
            z = true;
        }
        m737u(i5, z);
        m755i0();
        m747m0();
        m757h0();
        this.f36140b0 = true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:57:0x005c, code lost:
        if (r1 < r3) goto L23;
     */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public boolean onTouchEvent(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 225
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p453z0.C14061a.onTouchEvent(android.view.MotionEvent):boolean");
    }

    public void setContentTextTypeface(Typeface typeface) {
        this.f36149j0.setTypeface(typeface);
    }

    public void setDisplayedValues(String[] strArr) {
        m763e0();
        m761f0();
        if (strArr != null) {
            boolean z = true;
            if ((this.f36112F - this.f36110E) + 1 <= strArr.length) {
                m759g0(strArr);
                m751k0(true);
                this.f36122K = this.f36106C + 0;
                if (!this.f36138W || !this.f36141c0) {
                    z = false;
                }
                m737u(0, z);
                postInvalidate();
                this.f36163q0.sendEmptyMessage(3);
                return;
            }
            throw new IllegalArgumentException("mMaxValue - mMinValue + 1 should not be greater than mDisplayedValues.length, now ((mMaxValue - mMinValue + 1) is " + ((this.f36112F - this.f36110E) + 1) + " newDisplayedValues.length is " + strArr.length + ", you need to set MaxValue and MinValue before setDisplayedValues(String[])");
        }
        throw new IllegalArgumentException("newDisplayedValues should not be null.");
    }

    public void setDividerColor(int i) {
        if (this.f36172v == i) {
            return;
        }
        this.f36172v = i;
        this.f36147i0.setColor(i);
        postInvalidate();
    }

    public void setDividerHeight(int i) {
        if (this.f36174w == i) {
            return;
        }
        this.f36174w = i;
        this.f36147i0.setStrokeWidth(i);
        postInvalidate();
    }

    public void setFriction(float f) {
        if (f > 0.0f) {
            ViewConfiguration.get(getContext());
            this.f36133R = ViewConfiguration.getScrollFriction() / f;
            return;
        }
        throw new IllegalArgumentException("you should set a a positive float friction, now friction is " + f);
    }

    public void setHintText(String str) {
        if (m782P(this.f36128N, str)) {
            return;
        }
        this.f36128N = str;
        this.f36136U = m792F(this.f36151k0.getFontMetrics());
        this.f36160p = m791G(this.f36128N, this.f36151k0);
        this.f36163q0.sendEmptyMessage(3);
    }

    public void setHintTextColor(int i) {
        if (this.f36152l == i) {
            return;
        }
        this.f36152l = i;
        this.f36151k0.setColor(i);
        postInvalidate();
    }

    public void setHintTextTypeface(Typeface typeface) {
        this.f36151k0.setTypeface(typeface);
    }

    public void setItemPaddingHorizontal(int i) {
        this.f36170u = i;
        postInvalidate();
    }

    public void setMaxValue(int i) {
        String[] strArr = this.f36153l0;
        if (strArr != null) {
            int i2 = this.f36110E;
            if ((i - i2) + 1 <= strArr.length) {
                this.f36112F = i;
                int i3 = this.f36106C;
                int i4 = (i - i2) + i3;
                this.f36108D = i4;
                m770a0(i3, i4);
                m747m0();
                return;
            }
            throw new IllegalArgumentException("(maxValue - mMinValue + 1) should not be greater than mDisplayedValues.length now  (maxValue - mMinValue + 1) is " + ((i - this.f36110E) + 1) + " and mDisplayedValues.length is " + this.f36153l0.length);
        }
        throw new NullPointerException("mDisplayedValues should not be null");
    }

    public void setMinValue(int i) {
        this.f36110E = i;
        this.f36106C = 0;
        m747m0();
    }

    public void setNormalTextColor(int i) {
        if (this.f36148j == i) {
            return;
        }
        this.f36148j = i;
        postInvalidate();
    }

    public void setOnScrollListener(InterfaceC14064c interfaceC14064c) {
    }

    public void setOnValueChangeListenerInScrolling(InterfaceC14066e interfaceC14066e) {
        this.f36169t0 = interfaceC14066e;
    }

    public void setOnValueChangedListener(InterfaceC14065d interfaceC14065d) {
        this.f36167s0 = interfaceC14065d;
    }

    public void setOnValueChangedListenerRelativeToRaw(InterfaceC14067f interfaceC14067f) {
    }

    public void setPickedIndexRelativeToMin(int i) {
        boolean z;
        if (i >= 0 && i < getOneRecycleSize()) {
            this.f36122K = this.f36106C + i;
            if (this.f36138W && this.f36141c0) {
                z = true;
            } else {
                z = false;
            }
            m737u(i, z);
            postInvalidate();
        }
    }

    public void setPickedIndexRelativeToRaw(int i) {
        boolean z;
        int i2 = this.f36106C;
        if (i2 > -1 && i2 <= i && i <= this.f36108D) {
            this.f36122K = i;
            int i3 = i - i2;
            if (this.f36138W && this.f36141c0) {
                z = true;
            } else {
                z = false;
            }
            m737u(i3, z);
            postInvalidate();
        }
    }

    public void setSelectedTextColor(int i) {
        if (this.f36150k == i) {
            return;
        }
        this.f36150k = i;
        postInvalidate();
    }

    public void setShownCount(int i) {
        this.f36180z = i;
    }

    public void setTextAlign(Paint.Align align) {
        this.f36149j0.setTextAlign(align);
    }

    public void setValue(int i) {
        int i2 = this.f36110E;
        if (i >= i2) {
            if (i <= this.f36112F) {
                setPickedIndexRelativeToRaw(i - i2);
                return;
            }
            throw new IllegalArgumentException("should not set a value greater than mMaxValue, value is " + i);
        }
        throw new IllegalArgumentException("should not set a value less than mMinValue, value is " + i);
    }

    public void setWrapSelectorWheel(boolean z) {
        if (this.f36138W != z) {
            if (!z) {
                if (this.f36171u0 == 0) {
                    m784N();
                    return;
                } else {
                    this.f36142d0 = true;
                    return;
                }
            }
            this.f36138W = z;
            m743o0();
            postInvalidate();
        }
    }
}
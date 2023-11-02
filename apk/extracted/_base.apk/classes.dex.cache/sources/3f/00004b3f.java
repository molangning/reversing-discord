package p313r3;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.ScalingUtils;
import com.facebook.react.uimanager.ViewProps;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p333s3.InterfaceC12395b;

/* renamed from: r3.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12047a extends Drawable implements InterfaceC12395b {

    /* renamed from: A */
    private int f31110A;

    /* renamed from: B */
    private int f31111B;

    /* renamed from: C */
    private int f31112C;

    /* renamed from: D */
    private long f31113D;

    /* renamed from: E */
    private String f31114E;

    /* renamed from: j */
    private String f31117j;

    /* renamed from: k */
    private String f31118k;

    /* renamed from: l */
    private int f31119l;

    /* renamed from: m */
    private int f31120m;

    /* renamed from: n */
    private int f31121n;

    /* renamed from: o */
    private String f31122o;

    /* renamed from: p */
    private ScalingUtils.ScaleType f31123p;

    /* renamed from: r */
    private int f31125r;

    /* renamed from: s */
    private int f31126s;

    /* renamed from: y */
    private int f31132y;

    /* renamed from: z */
    private int f31133z;

    /* renamed from: q */
    private HashMap<String, String> f31124q = new HashMap<>();

    /* renamed from: t */
    private int f31127t = 80;

    /* renamed from: u */
    private final Paint f31128u = new Paint(1);

    /* renamed from: v */
    private final Matrix f31129v = new Matrix();

    /* renamed from: w */
    private final Rect f31130w = new Rect();

    /* renamed from: x */
    private final RectF f31131x = new RectF();

    /* renamed from: F */
    private int f31115F = -1;

    /* renamed from: G */
    private int f31116G = 0;

    public C12047a() {
        m6474h();
    }

    /* renamed from: b */
    private void m6480b(Canvas canvas, String str, Object obj) {
        m6478d(canvas, str, String.valueOf(obj), -1);
    }

    /* renamed from: c */
    private void m6479c(Canvas canvas, String str, String str2) {
        m6478d(canvas, str, str2, -1);
    }

    /* renamed from: d */
    private void m6478d(Canvas canvas, String str, String str2, int i) {
        String str3 = str + ": ";
        float measureText = this.f31128u.measureText(str3);
        float measureText2 = this.f31128u.measureText(str2);
        this.f31128u.setColor(1711276032);
        int i2 = this.f31111B;
        int i3 = this.f31112C;
        canvas.drawRect(i2 - 4, i3 + 8, i2 + measureText + measureText2 + 4.0f, i3 + this.f31110A + 8, this.f31128u);
        this.f31128u.setColor(-1);
        canvas.drawText(str3, this.f31111B, this.f31112C, this.f31128u);
        this.f31128u.setColor(i);
        canvas.drawText(str2, this.f31111B + measureText, this.f31112C, this.f31128u);
        this.f31112C += this.f31110A;
    }

    /* renamed from: f */
    private static String m6476f(String str, Object... objArr) {
        return objArr == null ? str : String.format(Locale.US, str, objArr);
    }

    /* renamed from: g */
    private void m6475g(Rect rect, int i, int i2) {
        int i3;
        int min = Math.min(40, Math.max(10, Math.min(rect.width() / i2, rect.height() / i)));
        this.f31128u.setTextSize(min);
        int i4 = min + 8;
        this.f31110A = i4;
        int i5 = this.f31127t;
        if (i5 == 80) {
            this.f31110A = i4 * (-1);
        }
        this.f31132y = rect.left + 10;
        if (i5 == 80) {
            i3 = rect.bottom - 10;
        } else {
            i3 = rect.top + 10 + 10;
        }
        this.f31133z = i3;
    }

    @Override // p333s3.InterfaceC12395b
    /* renamed from: a */
    public void mo5413a(long j) {
        this.f31113D = j;
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Rect bounds = getBounds();
        this.f31128u.setStyle(Paint.Style.STROKE);
        this.f31128u.setStrokeWidth(2.0f);
        this.f31128u.setColor(-26624);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f31128u);
        this.f31128u.setStyle(Paint.Style.FILL);
        this.f31128u.setColor(this.f31116G);
        canvas.drawRect(bounds.left, bounds.top, bounds.right, bounds.bottom, this.f31128u);
        this.f31128u.setStyle(Paint.Style.FILL);
        this.f31128u.setStrokeWidth(0.0f);
        this.f31128u.setColor(-1);
        this.f31111B = this.f31132y;
        this.f31112C = this.f31133z;
        String str = this.f31118k;
        if (str != null) {
            m6479c(canvas, "IDs", m6476f("%s, %s", this.f31117j, str));
        } else {
            m6479c(canvas, "ID", this.f31117j);
        }
        m6479c(canvas, "D", m6476f("%dx%d", Integer.valueOf(bounds.width()), Integer.valueOf(bounds.height())));
        m6478d(canvas, "I", m6476f("%dx%d", Integer.valueOf(this.f31119l), Integer.valueOf(this.f31120m)), m6477e(this.f31119l, this.f31120m, this.f31123p));
        m6479c(canvas, "I", m6476f("%d KiB", Integer.valueOf(this.f31121n / 1024)));
        String str2 = this.f31122o;
        if (str2 != null) {
            m6479c(canvas, "i format", str2);
        }
        int i = this.f31125r;
        if (i > 0) {
            m6479c(canvas, "anim", m6476f("f %d, l %d", Integer.valueOf(i), Integer.valueOf(this.f31126s)));
        }
        ScalingUtils.ScaleType scaleType = this.f31123p;
        if (scaleType != null) {
            m6480b(canvas, "scale", scaleType);
        }
        long j = this.f31113D;
        if (j >= 0) {
            m6479c(canvas, "t", m6476f("%d ms", Long.valueOf(j)));
        }
        String str3 = this.f31114E;
        if (str3 != null) {
            m6478d(canvas, "origin", str3, this.f31115F);
        }
        for (Map.Entry<String, String> entry : this.f31124q.entrySet()) {
            m6479c(canvas, entry.getKey(), entry.getValue());
        }
    }

    /* renamed from: e */
    int m6477e(int i, int i2, ScalingUtils.ScaleType scaleType) {
        int width = getBounds().width();
        int height = getBounds().height();
        if (width > 0 && height > 0 && i > 0 && i2 > 0) {
            if (scaleType != null) {
                Rect rect = this.f31130w;
                rect.top = 0;
                rect.left = 0;
                rect.right = width;
                rect.bottom = height;
                this.f31129v.reset();
                scaleType.getTransform(this.f31129v, this.f31130w, i, i2, 0.0f, 0.0f);
                RectF rectF = this.f31131x;
                rectF.top = 0.0f;
                rectF.left = 0.0f;
                rectF.right = i;
                rectF.bottom = i2;
                this.f31129v.mapRect(rectF);
                width = Math.min(width, (int) this.f31131x.width());
                height = Math.min(height, (int) this.f31131x.height());
            }
            float f = width;
            float f2 = f * 0.1f;
            float f3 = f * 0.5f;
            float f4 = height;
            float f5 = 0.1f * f4;
            float f6 = f4 * 0.5f;
            int abs = Math.abs(i - width);
            int abs2 = Math.abs(i2 - height);
            float f7 = abs;
            if (f7 < f2 && abs2 < f5) {
                return -16711936;
            }
            if (f7 < f3 && abs2 < f6) {
                return -256;
            }
        }
        return -65536;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    /* renamed from: h */
    public void m6474h() {
        this.f31119l = -1;
        this.f31120m = -1;
        this.f31121n = -1;
        this.f31124q = new HashMap<>();
        this.f31125r = -1;
        this.f31126s = -1;
        this.f31122o = null;
        m6473i(null);
        this.f31113D = -1L;
        this.f31114E = null;
        this.f31115F = -1;
        invalidateSelf();
    }

    /* renamed from: i */
    public void m6473i(String str) {
        if (str == null) {
            str = ViewProps.NONE;
        }
        this.f31117j = str;
        invalidateSelf();
    }

    /* renamed from: j */
    public void m6472j(int i, int i2) {
        this.f31119l = i;
        this.f31120m = i2;
        invalidateSelf();
    }

    /* renamed from: k */
    public void m6471k(int i) {
        this.f31121n = i;
    }

    /* renamed from: l */
    public void m6470l(String str, int i) {
        this.f31114E = str;
        this.f31115F = i;
        invalidateSelf();
    }

    /* renamed from: m */
    public void m6469m(ScalingUtils.ScaleType scaleType) {
        this.f31123p = scaleType;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m6475g(rect, 9, 8);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
    }
}
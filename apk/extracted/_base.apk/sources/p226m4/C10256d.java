package p226m4;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import com.facebook.common.references.CloseableReference;
import p191k4.C9054b;
import p191k4.C9059e;
import p191k4.InterfaceC9053a;

/* renamed from: m4.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C10256d {

    /* renamed from: a */
    private final InterfaceC9053a f26705a;

    /* renamed from: b */
    private final InterfaceC10258b f26706b;

    /* renamed from: c */
    private final Paint f26707c;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: m4.d$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static /* synthetic */ class C10257a {

        /* renamed from: a */
        static final /* synthetic */ int[] f26708a;

        static {
            int[] iArr = new int[EnumC10259c.values().length];
            f26708a = iArr;
            try {
                iArr[EnumC10259c.REQUIRED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f26708a[EnumC10259c.NOT_REQUIRED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f26708a[EnumC10259c.ABORT.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                f26708a[EnumC10259c.SKIP.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    /* renamed from: m4.d$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC10258b {
        /* renamed from: a */
        void mo11998a(int i, Bitmap bitmap);

        /* renamed from: b */
        CloseableReference<Bitmap> mo11997b(int i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m4.d$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC10259c {
        REQUIRED,
        NOT_REQUIRED,
        SKIP,
        ABORT
    }

    public C10256d(InterfaceC9053a interfaceC9053a, InterfaceC10258b interfaceC10258b) {
        this.f26705a = interfaceC9053a;
        this.f26706b = interfaceC10258b;
        Paint paint = new Paint();
        this.f26707c = paint;
        paint.setColor(0);
        paint.setStyle(Paint.Style.FILL);
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC));
    }

    /* renamed from: a */
    private void m12005a(Canvas canvas, C9054b c9054b) {
        int i = c9054b.f23755b;
        int i2 = c9054b.f23756c;
        canvas.drawRect(i, i2, i + c9054b.f23757d, i2 + c9054b.f23758e, this.f26707c);
    }

    /* renamed from: b */
    private EnumC10259c m12004b(int i) {
        C9054b mo12026c = this.f26705a.mo12026c(i);
        C9054b.EnumC9056b enumC9056b = mo12026c.f23760g;
        if (enumC9056b == C9054b.EnumC9056b.DISPOSE_DO_NOT) {
            return EnumC10259c.REQUIRED;
        }
        if (enumC9056b == C9054b.EnumC9056b.DISPOSE_TO_BACKGROUND) {
            if (m12003c(mo12026c)) {
                return EnumC10259c.NOT_REQUIRED;
            }
            return EnumC10259c.REQUIRED;
        } else if (enumC9056b == C9054b.EnumC9056b.DISPOSE_TO_PREVIOUS) {
            return EnumC10259c.SKIP;
        } else {
            return EnumC10259c.ABORT;
        }
    }

    /* renamed from: c */
    private boolean m12003c(C9054b c9054b) {
        if (c9054b.f23755b == 0 && c9054b.f23756c == 0 && c9054b.f23757d == this.f26705a.mo12021h() && c9054b.f23758e == this.f26705a.mo12022g()) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    private boolean m12002d(int i) {
        if (i == 0) {
            return true;
        }
        C9054b mo12026c = this.f26705a.mo12026c(i);
        C9054b mo12026c2 = this.f26705a.mo12026c(i - 1);
        if (mo12026c.f23759f == C9054b.EnumC9055a.NO_BLEND && m12003c(mo12026c)) {
            return true;
        }
        if (mo12026c2.f23760g == C9054b.EnumC9056b.DISPOSE_TO_BACKGROUND && m12003c(mo12026c2)) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    private void m12001e(Bitmap bitmap) {
        C9059e mo12020i = this.f26705a.mo12020i();
        if (mo12020i == null) {
            return;
        }
        mo12020i.m16801c();
    }

    /* renamed from: f */
    private int m12000f(int i, Canvas canvas) {
        while (i >= 0) {
            int i2 = C10257a.f26708a[m12004b(i).ordinal()];
            if (i2 != 1) {
                if (i2 != 2) {
                    if (i2 == 3) {
                        return i;
                    }
                } else {
                    return i + 1;
                }
            } else {
                C9054b mo12026c = this.f26705a.mo12026c(i);
                CloseableReference<Bitmap> mo11997b = this.f26706b.mo11997b(i);
                if (mo11997b != null) {
                    try {
                        canvas.drawBitmap(mo11997b.m31730D(), 0.0f, 0.0f, (Paint) null);
                        if (mo12026c.f23760g == C9054b.EnumC9056b.DISPOSE_TO_BACKGROUND) {
                            m12005a(canvas, mo12026c);
                        }
                        return i + 1;
                    } finally {
                        mo11997b.close();
                    }
                } else if (m12002d(i)) {
                    return i;
                }
            }
            i--;
        }
        return 0;
    }

    /* renamed from: g */
    public void m11999g(int i, Bitmap bitmap) {
        int i2;
        Canvas canvas = new Canvas(bitmap);
        canvas.drawColor(0, PorterDuff.Mode.SRC);
        if (!m12002d(i)) {
            i2 = m12000f(i - 1, canvas);
        } else {
            i2 = i;
        }
        while (i2 < i) {
            C9054b mo12026c = this.f26705a.mo12026c(i2);
            C9054b.EnumC9056b enumC9056b = mo12026c.f23760g;
            if (enumC9056b != C9054b.EnumC9056b.DISPOSE_TO_PREVIOUS) {
                if (mo12026c.f23759f == C9054b.EnumC9055a.NO_BLEND) {
                    m12005a(canvas, mo12026c);
                }
                this.f26705a.mo12025d(i2, canvas);
                this.f26706b.mo11998a(i2, bitmap);
                if (enumC9056b == C9054b.EnumC9056b.DISPOSE_TO_BACKGROUND) {
                    m12005a(canvas, mo12026c);
                }
            }
            i2++;
        }
        C9054b mo12026c2 = this.f26705a.mo12026c(i);
        if (mo12026c2.f23759f == C9054b.EnumC9055a.NO_BLEND) {
            m12005a(canvas, mo12026c2);
        }
        this.f26705a.mo12025d(i, canvas);
        m12001e(bitmap);
    }
}

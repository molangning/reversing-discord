package ve;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;

/* renamed from: ve.d */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C13259d extends Drawable {

    /* renamed from: b */
    private Bitmap f34323b;

    /* renamed from: d */
    private int f34325d;

    /* renamed from: e */
    private int f34326e;

    /* renamed from: a */
    private final Paint f34322a = new Paint(2);

    /* renamed from: c */
    private int f34324c = 255;

    public C13259d(Bitmap bitmap) {
        m2903b(bitmap);
    }

    /* renamed from: a */
    public Bitmap m2904a() {
        return this.f34323b;
    }

    /* renamed from: b */
    public void m2903b(Bitmap bitmap) {
        this.f34323b = bitmap;
        if (bitmap != null) {
            this.f34325d = bitmap.getWidth();
            this.f34326e = this.f34323b.getHeight();
            return;
        }
        this.f34326e = 0;
        this.f34325d = 0;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap = this.f34323b;
        if (bitmap != null && !bitmap.isRecycled()) {
            canvas.drawBitmap(this.f34323b, (Rect) null, getBounds(), this.f34322a);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        return this.f34324c;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.f34326e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.f34325d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumHeight() {
        return this.f34326e;
    }

    @Override // android.graphics.drawable.Drawable
    public int getMinimumWidth() {
        return this.f34325d;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f34324c = i;
        this.f34322a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f34322a.setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Drawable
    public void setFilterBitmap(boolean z) {
        this.f34322a.setFilterBitmap(z);
    }
}

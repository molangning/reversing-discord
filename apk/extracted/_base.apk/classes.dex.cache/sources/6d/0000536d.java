package za;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import bb.C2232g;
import bb.C2239k;
import bb.InterfaceC2255n;

/* renamed from: za.a */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C14140a extends Drawable implements InterfaceC2255n {

    /* renamed from: j */
    private C14142b f36372j;

    @Override // android.graphics.drawable.Drawable
    /* renamed from: a */
    public C14140a mutate() {
        this.f36372j = new C14142b(this.f36372j);
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        C14142b c14142b = this.f36372j;
        if (c14142b.f36374b) {
            c14142b.f36373a.draw(canvas);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.f36372j;
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return this.f36372j.f36373a.getOpacity();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        return true;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.f36372j.f36373a.setBounds(rect);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        boolean onStateChange = super.onStateChange(iArr);
        if (this.f36372j.f36373a.setState(iArr)) {
            onStateChange = true;
        }
        boolean m589b = C14143b.m589b(iArr);
        C14142b c14142b = this.f36372j;
        if (c14142b.f36374b != m589b) {
            c14142b.f36374b = m589b;
            return true;
        }
        return onStateChange;
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        this.f36372j.f36373a.setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        this.f36372j.f36373a.setColorFilter(colorFilter);
    }

    @Override // bb.InterfaceC2255n
    public void setShapeAppearanceModel(C2239k c2239k) {
        this.f36372j.f36373a.setShapeAppearanceModel(c2239k);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        this.f36372j.f36373a.setTint(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        this.f36372j.f36373a.setTintList(colorStateList);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        this.f36372j.f36373a.setTintMode(mode);
    }

    public C14140a(C2239k c2239k) {
        this(new C14142b(new C2232g(c2239k)));
    }

    /* renamed from: za.a$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C14142b extends Drawable.ConstantState {

        /* renamed from: a */
        C2232g f36373a;

        /* renamed from: b */
        boolean f36374b;

        public C14142b(C2232g c2232g) {
            this.f36373a = c2232g;
            this.f36374b = false;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        /* renamed from: a */
        public C14140a newDrawable() {
            return new C14140a(new C14142b(this));
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return 0;
        }

        public C14142b(C14142b c14142b) {
            this.f36373a = (C2232g) c14142b.f36373a.getConstantState().newDrawable();
            this.f36374b = c14142b.f36374b;
        }
    }

    private C14140a(C14142b c14142b) {
        this.f36372j = c14142b;
    }
}
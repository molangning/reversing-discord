package p345t3;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import com.facebook.drawee.drawable.C3614f;
import com.facebook.drawee.drawable.InterfaceC3626p;
import com.facebook.drawee.drawable.InterfaceC3627q;

/* renamed from: t3.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C12575b extends C3614f implements InterfaceC3626p {

    /* renamed from: j */
    Drawable f32639j;

    /* renamed from: k */
    private InterfaceC3627q f32640k;

    public C12575b(Drawable drawable) {
        super(drawable);
        this.f32639j = null;
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    @SuppressLint({"WrongCall"})
    public void draw(Canvas canvas) {
        if (!isVisible()) {
            return;
        }
        InterfaceC3627q interfaceC3627q = this.f32640k;
        if (interfaceC3627q != null) {
            interfaceC3627q.onDraw();
        }
        super.draw(canvas);
        Drawable drawable = this.f32639j;
        if (drawable != null) {
            drawable.setBounds(getBounds());
            this.f32639j.draw(canvas);
        }
    }

    @Override // com.facebook.drawee.drawable.InterfaceC3626p
    /* renamed from: f */
    public void mo4774f(InterfaceC3627q interfaceC3627q) {
        this.f32640k = interfaceC3627q;
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return -1;
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return -1;
    }

    /* renamed from: h */
    public void m4773h(Drawable drawable) {
        this.f32639j = drawable;
        invalidateSelf();
    }

    @Override // com.facebook.drawee.drawable.C3614f, android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        InterfaceC3627q interfaceC3627q = this.f32640k;
        if (interfaceC3627q != null) {
            interfaceC3627q.mo31363a(z);
        }
        return super.setVisible(z, z2);
    }
}

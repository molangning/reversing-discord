package androidx.vectordrawable.graphics.drawable;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ArgbEvaluator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedVectorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import androidx.collection.C0624a;
import androidx.core.content.res.C0992l;
import androidx.core.graphics.drawable.C1013a;
import com.facebook.react.uimanager.events.TouchesHelper;
import java.util.ArrayList;
import org.xmlpull.v1.XmlPullParser;

/* renamed from: androidx.vectordrawable.graphics.drawable.c */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1906c extends AbstractC1914g implements Animatable {

    /* renamed from: k */
    private C1908b f5234k;

    /* renamed from: l */
    private Context f5235l;

    /* renamed from: m */
    private ArgbEvaluator f5236m;

    /* renamed from: n */
    private Animator.AnimatorListener f5237n;

    /* renamed from: o */
    ArrayList<AbstractC1905b> f5238o;

    /* renamed from: p */
    final Drawable.Callback f5239p;

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1907a implements Drawable.Callback {
        C1907a() {
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void invalidateDrawable(Drawable drawable) {
            C1906c.this.invalidateSelf();
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
            C1906c.this.scheduleSelf(runnable, j);
        }

        @Override // android.graphics.drawable.Drawable.Callback
        public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
            C1906c.this.unscheduleSelf(runnable);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.vectordrawable.graphics.drawable.c$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1908b extends Drawable.ConstantState {

        /* renamed from: a */
        int f5241a;

        /* renamed from: b */
        C1915h f5242b;

        /* renamed from: c */
        AnimatorSet f5243c;

        /* renamed from: d */
        ArrayList<Animator> f5244d;

        /* renamed from: e */
        C0624a<Animator, String> f5245e;

        public C1908b(Context context, C1908b c1908b, Drawable.Callback callback, Resources resources) {
            if (c1908b != null) {
                this.f5241a = c1908b.f5241a;
                C1915h c1915h = c1908b.f5242b;
                if (c1915h != null) {
                    Drawable.ConstantState constantState = c1915h.getConstantState();
                    if (resources != null) {
                        this.f5242b = (C1915h) constantState.newDrawable(resources);
                    } else {
                        this.f5242b = (C1915h) constantState.newDrawable();
                    }
                    C1915h c1915h2 = (C1915h) this.f5242b.mutate();
                    this.f5242b = c1915h2;
                    c1915h2.setCallback(callback);
                    this.f5242b.setBounds(c1908b.f5242b.getBounds());
                    this.f5242b.m35046h(false);
                }
                ArrayList<Animator> arrayList = c1908b.f5244d;
                if (arrayList != null) {
                    int size = arrayList.size();
                    this.f5244d = new ArrayList<>(size);
                    this.f5245e = new C0624a<>(size);
                    for (int i = 0; i < size; i++) {
                        Animator animator = c1908b.f5244d.get(i);
                        Animator clone = animator.clone();
                        String str = c1908b.f5245e.get(animator);
                        clone.setTarget(this.f5242b.m35050d(str));
                        this.f5244d.add(clone);
                        this.f5245e.put(clone, str);
                    }
                    m35076a();
                }
            }
        }

        /* renamed from: a */
        public void m35076a() {
            if (this.f5243c == null) {
                this.f5243c = new AnimatorSet();
            }
            this.f5243c.playTogether(this.f5244d);
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5241a;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            throw new IllegalStateException("No constant state support for SDK < 24.");
        }
    }

    C1906c() {
        this(null, null, null);
    }

    /* renamed from: a */
    public static C1906c m35078a(Context context, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        C1906c c1906c = new C1906c(context);
        c1906c.inflate(resources, xmlPullParser, attributeSet, theme);
        return c1906c;
    }

    /* renamed from: b */
    private void m35077b(String str, Animator animator) {
        animator.setTarget(this.f5234k.f5242b.m35050d(str));
        C1908b c1908b = this.f5234k;
        if (c1908b.f5244d == null) {
            c1908b.f5244d = new ArrayList<>();
            this.f5234k.f5245e = new C0624a<>();
        }
        this.f5234k.f5244d.add(animator);
        this.f5234k.f5245e.put(animator, str);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public void applyTheme(Resources.Theme theme) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38097a(drawable, theme);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean canApplyTheme() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return C1013a.m38096b(drawable);
        }
        return false;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void clearColorFilter() {
        super.clearColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.draw(canvas);
            return;
        }
        this.f5234k.f5242b.draw(canvas);
        if (this.f5234k.f5243c.isStarted()) {
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Drawable
    public int getAlpha() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return C1013a.m38094d(drawable);
        }
        return this.f5234k.f5242b.getAlpha();
    }

    @Override // android.graphics.drawable.Drawable
    public int getChangingConfigurations() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getChangingConfigurations();
        }
        return super.getChangingConfigurations() | this.f5234k.f5241a;
    }

    @Override // android.graphics.drawable.Drawable
    public ColorFilter getColorFilter() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return C1013a.m38093e(drawable);
        }
        return this.f5234k.f5242b.getColorFilter();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        if (this.f5249j != null && Build.VERSION.SDK_INT >= 24) {
            return new C1909c(this.f5249j.getConstantState());
        }
        return null;
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Drawable getCurrent() {
        return super.getCurrent();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getIntrinsicHeight();
        }
        return this.f5234k.f5242b.getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getIntrinsicWidth();
        }
        return this.f5234k.f5242b.getIntrinsicWidth();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumHeight() {
        return super.getMinimumHeight();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int getMinimumWidth() {
        return super.getMinimumWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.getOpacity();
        }
        return this.f5234k.f5242b.getOpacity();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean getPadding(Rect rect) {
        return super.getPadding(rect);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ int[] getState() {
        return super.getState();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ Region getTransparentRegion() {
        return super.getTransparentRegion();
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38091g(drawable, resources, xmlPullParser, attributeSet, theme);
            return;
        }
        int eventType = xmlPullParser.getEventType();
        int depth = xmlPullParser.getDepth() + 1;
        while (eventType != 1 && (xmlPullParser.getDepth() >= depth || eventType != 3)) {
            if (eventType == 2) {
                String name = xmlPullParser.getName();
                if ("animated-vector".equals(name)) {
                    TypedArray m38206k = C0992l.m38206k(resources, theme, attributeSet, C1904a.f5226e);
                    int resourceId = m38206k.getResourceId(0, 0);
                    if (resourceId != 0) {
                        C1915h m35052b = C1915h.m35052b(resources, resourceId, theme);
                        m35052b.m35046h(false);
                        m35052b.setCallback(this.f5239p);
                        C1915h c1915h = this.f5234k.f5242b;
                        if (c1915h != null) {
                            c1915h.setCallback(null);
                        }
                        this.f5234k.f5242b = m35052b;
                    }
                    m38206k.recycle();
                } else if (TouchesHelper.TARGET_KEY.equals(name)) {
                    TypedArray obtainAttributes = resources.obtainAttributes(attributeSet, C1904a.f5227f);
                    String string = obtainAttributes.getString(0);
                    int resourceId2 = obtainAttributes.getResourceId(1, 0);
                    if (resourceId2 != 0) {
                        Context context = this.f5235l;
                        if (context != null) {
                            m35077b(string, C1911e.m35066i(context, resourceId2));
                        } else {
                            obtainAttributes.recycle();
                            throw new IllegalStateException("Context can't be null when inflating animators");
                        }
                    }
                    obtainAttributes.recycle();
                } else {
                    continue;
                }
            }
            eventType = xmlPullParser.next();
        }
        this.f5234k.m35076a();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isAutoMirrored() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return C1013a.m38090h(drawable);
        }
        return this.f5234k.f5242b.isAutoMirrored();
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return ((AnimatedVectorDrawable) drawable).isRunning();
        }
        return this.f5234k.f5243c.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public boolean isStateful() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.isStateful();
        }
        return this.f5234k.f5242b.isStateful();
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void jumpToCurrentState() {
        super.jumpToCurrentState();
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable mutate() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.mutate();
        }
        return this;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.setBounds(rect);
        } else {
            this.f5234k.f5242b.setBounds(rect);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    protected boolean onLevelChange(int i) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.setLevel(i);
        }
        return this.f5234k.f5242b.setLevel(i);
    }

    @Override // android.graphics.drawable.Drawable
    protected boolean onStateChange(int[] iArr) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.setState(iArr);
        }
        return this.f5234k.f5242b.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.setAlpha(i);
        } else {
            this.f5234k.f5242b.setAlpha(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setAutoMirrored(boolean z) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38088j(drawable, z);
        } else {
            this.f5234k.f5242b.setAutoMirrored(z);
        }
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setChangingConfigurations(int i) {
        super.setChangingConfigurations(i);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setColorFilter(int i, PorterDuff.Mode mode) {
        super.setColorFilter(i, mode);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setFilterBitmap(boolean z) {
        super.setFilterBitmap(z);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspot(float f, float f2) {
        super.setHotspot(f, f2);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ void setHotspotBounds(int i, int i2, int i3, int i4) {
        super.setHotspotBounds(i, i2, i3, i4);
    }

    @Override // androidx.vectordrawable.graphics.drawable.AbstractC1914g, android.graphics.drawable.Drawable
    public /* bridge */ /* synthetic */ boolean setState(int[] iArr) {
        return super.setState(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public void setTint(int i) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38084n(drawable, i);
        } else {
            this.f5234k.f5242b.setTint(i);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintList(ColorStateList colorStateList) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38083o(drawable, colorStateList);
        } else {
            this.f5234k.f5242b.setTintList(colorStateList);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void setTintMode(PorterDuff.Mode mode) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            C1013a.m38082p(drawable, mode);
        } else {
            this.f5234k.f5242b.setTintMode(mode);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            return drawable.setVisible(z, z2);
        }
        this.f5234k.f5242b.setVisible(z, z2);
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).start();
        } else if (this.f5234k.f5243c.isStarted()) {
        } else {
            this.f5234k.f5243c.start();
            invalidateSelf();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            ((AnimatedVectorDrawable) drawable).stop();
        } else {
            this.f5234k.f5243c.end();
        }
    }

    private C1906c(Context context) {
        this(context, null, null);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        Drawable drawable = this.f5249j;
        if (drawable != null) {
            drawable.setColorFilter(colorFilter);
        } else {
            this.f5234k.f5242b.setColorFilter(colorFilter);
        }
    }

    /* renamed from: androidx.vectordrawable.graphics.drawable.c$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    private static class C1909c extends Drawable.ConstantState {

        /* renamed from: a */
        private final Drawable.ConstantState f5246a;

        public C1909c(Drawable.ConstantState constantState) {
            this.f5246a = constantState;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public boolean canApplyTheme() {
            return this.f5246a.canApplyTheme();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public int getChangingConfigurations() {
            return this.f5246a.getChangingConfigurations();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable() {
            C1906c c1906c = new C1906c();
            Drawable newDrawable = this.f5246a.newDrawable();
            c1906c.f5249j = newDrawable;
            newDrawable.setCallback(c1906c.f5239p);
            return c1906c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources) {
            C1906c c1906c = new C1906c();
            Drawable newDrawable = this.f5246a.newDrawable(resources);
            c1906c.f5249j = newDrawable;
            newDrawable.setCallback(c1906c.f5239p);
            return c1906c;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public Drawable newDrawable(Resources resources, Resources.Theme theme) {
            C1906c c1906c = new C1906c();
            Drawable newDrawable = this.f5246a.newDrawable(resources, theme);
            c1906c.f5249j = newDrawable;
            newDrawable.setCallback(c1906c.f5239p);
            return c1906c;
        }
    }

    private C1906c(Context context, C1908b c1908b, Resources resources) {
        this.f5236m = null;
        this.f5237n = null;
        this.f5238o = null;
        C1907a c1907a = new C1907a();
        this.f5239p = c1907a;
        this.f5235l = context;
        if (c1908b != null) {
            this.f5234k = c1908b;
        } else {
            this.f5234k = new C1908b(context, c1908b, c1907a, resources);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public void inflate(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet) {
        inflate(resources, xmlPullParser, attributeSet, null);
    }
}

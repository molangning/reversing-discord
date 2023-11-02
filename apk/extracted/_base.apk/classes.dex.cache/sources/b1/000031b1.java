package p073e1;

import android.animation.Animator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import androidx.appcompat.widget.C0539m;
import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import p071e.C6029a;
import p167j1.C8784e;
import p291q1.C11674f;
import p291q1.C11680l;
import p311r1.C12022c;

/* renamed from: e1.j */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C6053j extends C0539m {

    /* renamed from: x */
    private static final String f17140x = "j";

    /* renamed from: y */
    private static final InterfaceC6065l0<Throwable> f17141y = new InterfaceC6065l0() { // from class: e1.g
        @Override // p073e1.InterfaceC6065l0
        public final void onResult(Object obj) {
            C6053j.m23798v((Throwable) obj);
        }
    };

    /* renamed from: j */
    private final InterfaceC6065l0<C6062k> f17142j;

    /* renamed from: k */
    private final InterfaceC6065l0<Throwable> f17143k;

    /* renamed from: l */
    private InterfaceC6065l0<Throwable> f17144l;

    /* renamed from: m */
    private int f17145m;

    /* renamed from: n */
    private final C6059j0 f17146n;

    /* renamed from: o */
    private String f17147o;

    /* renamed from: p */
    private int f17148p;

    /* renamed from: q */
    private boolean f17149q;

    /* renamed from: r */
    private boolean f17150r;

    /* renamed from: s */
    private boolean f17151s;

    /* renamed from: t */
    private final Set<EnumC6056b> f17152t;

    /* renamed from: u */
    private final Set<InterfaceC6069n0> f17153u;

    /* renamed from: v */
    private C6077r0<C6062k> f17154v;

    /* renamed from: w */
    private C6062k f17155w;

    /* renamed from: e1.j$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6054a extends View.BaseSavedState {
        public static final Parcelable.Creator<C6054a> CREATOR = new C6055a();

        /* renamed from: j */
        String f17156j;

        /* renamed from: k */
        int f17157k;

        /* renamed from: l */
        float f17158l;

        /* renamed from: m */
        boolean f17159m;

        /* renamed from: n */
        String f17160n;

        /* renamed from: o */
        int f17161o;

        /* renamed from: p */
        int f17162p;

        /* renamed from: e1.j$a$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
        class C6055a implements Parcelable.Creator<C6054a> {
            C6055a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C6054a createFromParcel(Parcel parcel) {
                return new C6054a(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b */
            public C6054a[] newArray(int i) {
                return new C6054a[i];
            }
        }

        /* synthetic */ C6054a(Parcel parcel, C6051i c6051i) {
            this(parcel);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.f17156j);
            parcel.writeFloat(this.f17158l);
            parcel.writeInt(this.f17159m ? 1 : 0);
            parcel.writeString(this.f17160n);
            parcel.writeInt(this.f17161o);
            parcel.writeInt(this.f17162p);
        }

        C6054a(Parcelable parcelable) {
            super(parcelable);
        }

        private C6054a(Parcel parcel) {
            super(parcel);
            this.f17156j = parcel.readString();
            this.f17158l = parcel.readFloat();
            this.f17159m = parcel.readInt() == 1;
            this.f17160n = parcel.readString();
            this.f17161o = parcel.readInt();
            this.f17162p = parcel.readInt();
        }
    }

    /* renamed from: e1.j$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public enum EnumC6056b {
        SET_ANIMATION,
        SET_PROGRESS,
        SET_REPEAT_MODE,
        SET_REPEAT_COUNT,
        SET_IMAGE_ASSETS,
        PLAY_OPTION
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1.j$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6057c implements InterfaceC6065l0<Throwable> {

        /* renamed from: a */
        private final WeakReference<C6053j> f17170a;

        public C6057c(C6053j c6053j) {
            this.f17170a = new WeakReference<>(c6053j);
        }

        @Override // p073e1.InterfaceC6065l0
        /* renamed from: a */
        public void onResult(Throwable th2) {
            InterfaceC6065l0 interfaceC6065l0;
            C6053j c6053j = this.f17170a.get();
            if (c6053j == null) {
                return;
            }
            if (c6053j.f17145m != 0) {
                c6053j.setImageResource(c6053j.f17145m);
            }
            if (c6053j.f17144l == null) {
                interfaceC6065l0 = C6053j.f17141y;
            } else {
                interfaceC6065l0 = c6053j.f17144l;
            }
            interfaceC6065l0.onResult(th2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e1.j$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C6058d implements InterfaceC6065l0<C6062k> {

        /* renamed from: a */
        private final WeakReference<C6053j> f17171a;

        public C6058d(C6053j c6053j) {
            this.f17171a = new WeakReference<>(c6053j);
        }

        @Override // p073e1.InterfaceC6065l0
        /* renamed from: a */
        public void onResult(C6062k c6062k) {
            C6053j c6053j = this.f17171a.get();
            if (c6053j == null) {
                return;
            }
            c6053j.setComposition(c6062k);
        }
    }

    public C6053j(Context context) {
        super(context);
        this.f17142j = new C6058d(this);
        this.f17143k = new C6057c(this);
        this.f17145m = 0;
        this.f17146n = new C6059j0();
        this.f17149q = false;
        this.f17150r = false;
        this.f17151s = true;
        this.f17152t = new HashSet();
        this.f17153u = new HashSet();
        m23802r(null, C6086u0.f17316a);
    }

    /* renamed from: B */
    private void m23820B() {
        boolean m23801s = m23801s();
        setImageDrawable(null);
        setImageDrawable(this.f17146n);
        if (m23801s) {
            this.f17146n.m23682x0();
        }
    }

    /* renamed from: D */
    private void m23818D(float f, boolean z) {
        if (z) {
            this.f17152t.add(EnumC6056b.SET_PROGRESS);
        }
        this.f17146n.m23743W0(f);
    }

    /* renamed from: m */
    private void m23807m() {
        C6077r0<C6062k> c6077r0 = this.f17154v;
        if (c6077r0 != null) {
            c6077r0.m23636j(this.f17142j);
            this.f17154v.m23637i(this.f17143k);
        }
    }

    /* renamed from: n */
    private void m23806n() {
        this.f17155w = null;
        this.f17146n.m23689u();
    }

    /* renamed from: p */
    private C6077r0<C6062k> m23804p(final String str) {
        if (isInEditMode()) {
            return new C6077r0<>(new Callable() { // from class: e1.h
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C6073p0 m23800t;
                    m23800t = C6053j.this.m23800t(str);
                    return m23800t;
                }
            }, true);
        }
        if (this.f17151s) {
            return C6081t.m23609k(getContext(), str);
        }
        return C6081t.m23608l(getContext(), str, null);
    }

    /* renamed from: q */
    private C6077r0<C6062k> m23803q(final int i) {
        if (isInEditMode()) {
            return new C6077r0<>(new Callable() { // from class: e1.f
                @Override // java.util.concurrent.Callable
                public final Object call() {
                    C6073p0 m23799u;
                    m23799u = C6053j.this.m23799u(i);
                    return m23799u;
                }
            }, true);
        }
        if (this.f17151s) {
            return C6081t.m23600t(getContext(), i);
        }
        return C6081t.m23599u(getContext(), i, null);
    }

    /* renamed from: r */
    private void m23802r(AttributeSet attributeSet, int i) {
        String string;
        boolean z = false;
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C6088v0.f17319a, i, 0);
        this.f17151s = obtainStyledAttributes.getBoolean(C6088v0.f17322d, true);
        int i2 = C6088v0.f17333o;
        boolean hasValue = obtainStyledAttributes.hasValue(i2);
        int i3 = C6088v0.f17328j;
        boolean hasValue2 = obtainStyledAttributes.hasValue(i3);
        int i4 = C6088v0.f17338t;
        boolean hasValue3 = obtainStyledAttributes.hasValue(i4);
        if (hasValue && hasValue2) {
            throw new IllegalArgumentException("lottie_rawRes and lottie_fileName cannot be used at the same time. Please use only one at once.");
        }
        if (hasValue) {
            int resourceId = obtainStyledAttributes.getResourceId(i2, 0);
            if (resourceId != 0) {
                setAnimation(resourceId);
            }
        } else if (hasValue2) {
            String string2 = obtainStyledAttributes.getString(i3);
            if (string2 != null) {
                setAnimation(string2);
            }
        } else if (hasValue3 && (string = obtainStyledAttributes.getString(i4)) != null) {
            setAnimationFromUrl(string);
        }
        setFallbackResource(obtainStyledAttributes.getResourceId(C6088v0.f17327i, 0));
        if (obtainStyledAttributes.getBoolean(C6088v0.f17321c, false)) {
            this.f17150r = true;
        }
        if (obtainStyledAttributes.getBoolean(C6088v0.f17331m, false)) {
            this.f17146n.m23739Y0(-1);
        }
        int i5 = C6088v0.f17336r;
        if (obtainStyledAttributes.hasValue(i5)) {
            setRepeatMode(obtainStyledAttributes.getInt(i5, 1));
        }
        int i6 = C6088v0.f17335q;
        if (obtainStyledAttributes.hasValue(i6)) {
            setRepeatCount(obtainStyledAttributes.getInt(i6, -1));
        }
        int i7 = C6088v0.f17337s;
        if (obtainStyledAttributes.hasValue(i7)) {
            setSpeed(obtainStyledAttributes.getFloat(i7, 1.0f));
        }
        int i8 = C6088v0.f17323e;
        if (obtainStyledAttributes.hasValue(i8)) {
            setClipToCompositionBounds(obtainStyledAttributes.getBoolean(i8, true));
        }
        int i9 = C6088v0.f17325g;
        if (obtainStyledAttributes.hasValue(i9)) {
            setDefaultFontFileExtension(obtainStyledAttributes.getString(i9));
        }
        setImageAssetsFolder(obtainStyledAttributes.getString(C6088v0.f17330l));
        int i10 = C6088v0.f17332n;
        m23818D(obtainStyledAttributes.getFloat(i10, 0.0f), obtainStyledAttributes.hasValue(i10));
        m23805o(obtainStyledAttributes.getBoolean(C6088v0.f17326h, false));
        int i11 = C6088v0.f17324f;
        if (obtainStyledAttributes.hasValue(i11)) {
            m23809k(new C8784e("**"), InterfaceC6071o0.f17256K, new C12022c(new C6093x0(C6029a.m23854a(getContext(), obtainStyledAttributes.getResourceId(i11, -1)).getDefaultColor())));
        }
        int i12 = C6088v0.f17334p;
        if (obtainStyledAttributes.hasValue(i12)) {
            EnumC6090w0 enumC6090w0 = EnumC6090w0.AUTOMATIC;
            int i13 = obtainStyledAttributes.getInt(i12, enumC6090w0.ordinal());
            if (i13 >= EnumC6090w0.values().length) {
                i13 = enumC6090w0.ordinal();
            }
            setRenderMode(EnumC6090w0.values()[i13]);
        }
        int i14 = C6088v0.f17320b;
        if (obtainStyledAttributes.hasValue(i14)) {
            EnumC6035a enumC6035a = EnumC6035a.AUTOMATIC;
            int i15 = obtainStyledAttributes.getInt(i14, enumC6035a.ordinal());
            if (i15 >= EnumC6090w0.values().length) {
                i15 = enumC6035a.ordinal();
            }
            setAsyncUpdates(EnumC6035a.values()[i15]);
        }
        setIgnoreDisabledSystemAnimations(obtainStyledAttributes.getBoolean(C6088v0.f17329k, false));
        int i16 = C6088v0.f17339u;
        if (obtainStyledAttributes.hasValue(i16)) {
            setUseCompositionFrameRate(obtainStyledAttributes.getBoolean(i16, false));
        }
        obtainStyledAttributes.recycle();
        C6059j0 c6059j0 = this.f17146n;
        if (C11680l.m7187f(getContext()) != 0.0f) {
            z = true;
        }
        c6059j0.m23728c1(Boolean.valueOf(z));
    }

    private void setCompositionTask(C6077r0<C6062k> c6077r0) {
        this.f17152t.add(EnumC6056b.SET_ANIMATION);
        m23806n();
        m23807m();
        this.f17154v = c6077r0.m23642d(this.f17142j).m23643c(this.f17143k);
    }

    /* renamed from: t */
    public /* synthetic */ C6073p0 m23800t(String str) {
        if (this.f17151s) {
            return C6081t.m23607m(getContext(), str);
        }
        return C6081t.m23606n(getContext(), str, null);
    }

    /* renamed from: u */
    public /* synthetic */ C6073p0 m23799u(int i) {
        if (this.f17151s) {
            return C6081t.m23598v(getContext(), i);
        }
        return C6081t.m23597w(getContext(), i, null);
    }

    /* renamed from: v */
    public static /* synthetic */ void m23798v(Throwable th2) {
        if (C11680l.m7182k(th2)) {
            C11674f.m7232d("Unable to load composition.", th2);
            return;
        }
        throw new IllegalStateException("Unable to parse composition", th2);
    }

    /* renamed from: A */
    public void m23821A(String str, String str2) {
        setCompositionTask(C6081t.m23595y(getContext(), str, str2));
    }

    /* renamed from: C */
    public void m23819C(int i, int i2) {
        this.f17146n.m23757P0(i, i2);
    }

    public EnumC6035a getAsyncUpdates() {
        return this.f17146n.m23780E();
    }

    public boolean getAsyncUpdatesEnabled() {
        return this.f17146n.m23778F();
    }

    public boolean getClipToCompositionBounds() {
        return this.f17146n.m23774H();
    }

    public C6062k getComposition() {
        return this.f17155w;
    }

    public long getDuration() {
        C6062k c6062k = this.f17155w;
        if (c6062k != null) {
            return c6062k.m23673d();
        }
        return 0L;
    }

    public int getFrame() {
        return this.f17146n.m23766L();
    }

    public String getImageAssetsFolder() {
        return this.f17146n.m23762N();
    }

    public boolean getMaintainOriginalImageBounds() {
        return this.f17146n.m23758P();
    }

    public float getMaxFrame() {
        return this.f17146n.m23756Q();
    }

    public float getMinFrame() {
        return this.f17146n.m23754R();
    }

    public C6082t0 getPerformanceTracker() {
        return this.f17146n.m23752S();
    }

    public float getProgress() {
        return this.f17146n.m23750T();
    }

    public EnumC6090w0 getRenderMode() {
        return this.f17146n.m23748U();
    }

    public int getRepeatCount() {
        return this.f17146n.m23746V();
    }

    public int getRepeatMode() {
        return this.f17146n.m23744W();
    }

    public float getSpeed() {
        return this.f17146n.m23742X();
    }

    /* renamed from: i */
    public void m23811i(Animator.AnimatorListener animatorListener) {
        this.f17146n.m23699p(animatorListener);
    }

    @Override // android.view.View
    public void invalidate() {
        super.invalidate();
        Drawable drawable = getDrawable();
        if ((drawable instanceof C6059j0) && ((C6059j0) drawable).m23748U() == EnumC6090w0.SOFTWARE) {
            this.f17146n.invalidateSelf();
        }
    }

    @Override // android.widget.ImageView, android.view.View, android.graphics.drawable.Drawable.Callback
    public void invalidateDrawable(Drawable drawable) {
        Drawable drawable2 = getDrawable();
        C6059j0 c6059j0 = this.f17146n;
        if (drawable2 == c6059j0) {
            super.invalidateDrawable(c6059j0);
        } else {
            super.invalidateDrawable(drawable);
        }
    }

    /* renamed from: j */
    public boolean m23810j(InterfaceC6069n0 interfaceC6069n0) {
        C6062k c6062k = this.f17155w;
        if (c6062k != null) {
            interfaceC6069n0.mo23648a(c6062k);
        }
        return this.f17153u.add(interfaceC6069n0);
    }

    /* renamed from: k */
    public <T> void m23809k(C8784e c8784e, T t, C12022c<T> c12022c) {
        this.f17146n.m23697q(c8784e, t, c12022c);
    }

    /* renamed from: l */
    public void m23808l() {
        this.f17152t.add(EnumC6056b.PLAY_OPTION);
        this.f17146n.m23691t();
    }

    /* renamed from: o */
    public void m23805o(boolean z) {
        this.f17146n.m23679z(z);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (!isInEditMode() && this.f17150r) {
            this.f17146n.m23688u0();
        }
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        int i;
        if (!(parcelable instanceof C6054a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C6054a c6054a = (C6054a) parcelable;
        super.onRestoreInstanceState(c6054a.getSuperState());
        this.f17147o = c6054a.f17156j;
        Set<EnumC6056b> set = this.f17152t;
        EnumC6056b enumC6056b = EnumC6056b.SET_ANIMATION;
        if (!set.contains(enumC6056b) && !TextUtils.isEmpty(this.f17147o)) {
            setAnimation(this.f17147o);
        }
        this.f17148p = c6054a.f17157k;
        if (!this.f17152t.contains(enumC6056b) && (i = this.f17148p) != 0) {
            setAnimation(i);
        }
        if (!this.f17152t.contains(EnumC6056b.SET_PROGRESS)) {
            m23818D(c6054a.f17158l, false);
        }
        if (!this.f17152t.contains(EnumC6056b.PLAY_OPTION) && c6054a.f17159m) {
            playAnimation();
        }
        if (!this.f17152t.contains(EnumC6056b.SET_IMAGE_ASSETS)) {
            setImageAssetsFolder(c6054a.f17160n);
        }
        if (!this.f17152t.contains(EnumC6056b.SET_REPEAT_MODE)) {
            setRepeatMode(c6054a.f17161o);
        }
        if (!this.f17152t.contains(EnumC6056b.SET_REPEAT_COUNT)) {
            setRepeatCount(c6054a.f17162p);
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        C6054a c6054a = new C6054a(super.onSaveInstanceState());
        c6054a.f17156j = this.f17147o;
        c6054a.f17157k = this.f17148p;
        c6054a.f17158l = this.f17146n.m23750T();
        c6054a.f17159m = this.f17146n.m23729c0();
        c6054a.f17160n = this.f17146n.m23762N();
        c6054a.f17161o = this.f17146n.m23744W();
        c6054a.f17162p = this.f17146n.m23746V();
        return c6054a;
    }

    public void pauseAnimation() {
        this.f17150r = false;
        this.f17146n.m23690t0();
    }

    public void playAnimation() {
        this.f17152t.add(EnumC6056b.PLAY_OPTION);
        this.f17146n.m23688u0();
    }

    /* renamed from: s */
    public boolean m23801s() {
        return this.f17146n.m23732b0();
    }

    public void setAnimation(int i) {
        this.f17148p = i;
        this.f17147o = null;
        setCompositionTask(m23803q(i));
    }

    @Deprecated
    public void setAnimationFromJson(String str) {
        m23794z(str, null);
    }

    public void setAnimationFromUrl(String str) {
        C6077r0<C6062k> m23595y;
        if (this.f17151s) {
            m23595y = C6081t.m23596x(getContext(), str);
        } else {
            m23595y = C6081t.m23595y(getContext(), str, null);
        }
        setCompositionTask(m23595y);
    }

    public void setApplyingOpacityToLayersEnabled(boolean z) {
        this.f17146n.m23787A0(z);
    }

    public void setAsyncUpdates(EnumC6035a enumC6035a) {
        this.f17146n.m23785B0(enumC6035a);
    }

    public void setCacheComposition(boolean z) {
        this.f17151s = z;
    }

    public void setClipToCompositionBounds(boolean z) {
        this.f17146n.m23783C0(z);
    }

    public void setComposition(C6062k c6062k) {
        if (C6043e.f17116a) {
            String str = f17140x;
            Log.v(str, "Set Composition \n" + c6062k);
        }
        this.f17146n.setCallback(this);
        this.f17155w = c6062k;
        this.f17149q = true;
        boolean m23781D0 = this.f17146n.m23781D0(c6062k);
        this.f17149q = false;
        if (getDrawable() == this.f17146n && !m23781D0) {
            return;
        }
        if (!m23781D0) {
            m23820B();
        }
        onVisibilityChanged(this, getVisibility());
        requestLayout();
        for (InterfaceC6069n0 interfaceC6069n0 : this.f17153u) {
            interfaceC6069n0.mo23648a(c6062k);
        }
    }

    public void setDefaultFontFileExtension(String str) {
        this.f17146n.m23779E0(str);
    }

    public void setFailureListener(InterfaceC6065l0<Throwable> interfaceC6065l0) {
        this.f17144l = interfaceC6065l0;
    }

    public void setFallbackResource(int i) {
        this.f17145m = i;
    }

    public void setFontAssetDelegate(C6037b c6037b) {
        this.f17146n.m23777F0(c6037b);
    }

    public void setFontMap(Map<String, Typeface> map) {
        this.f17146n.m23775G0(map);
    }

    public void setFrame(int i) {
        this.f17146n.m23773H0(i);
    }

    public void setIgnoreDisabledSystemAnimations(boolean z) {
        this.f17146n.m23771I0(z);
    }

    public void setImageAssetDelegate(InterfaceC6039c interfaceC6039c) {
        this.f17146n.m23769J0(interfaceC6039c);
    }

    public void setImageAssetsFolder(String str) {
        this.f17146n.m23767K0(str);
    }

    @Override // androidx.appcompat.widget.C0539m, android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        m23807m();
        super.setImageBitmap(bitmap);
    }

    @Override // androidx.appcompat.widget.C0539m, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        m23807m();
        super.setImageDrawable(drawable);
    }

    @Override // androidx.appcompat.widget.C0539m, android.widget.ImageView
    public void setImageResource(int i) {
        m23807m();
        super.setImageResource(i);
    }

    public void setMaintainOriginalImageBounds(boolean z) {
        this.f17146n.m23765L0(z);
    }

    public void setMaxFrame(int i) {
        this.f17146n.m23763M0(i);
    }

    public void setMaxProgress(float f) {
        this.f17146n.m23759O0(f);
    }

    public void setMinAndMaxFrame(String str) {
        this.f17146n.m23755Q0(str);
    }

    public void setMinFrame(int i) {
        this.f17146n.m23753R0(i);
    }

    public void setMinProgress(float f) {
        this.f17146n.m23749T0(f);
    }

    public void setOutlineMasksAndMattes(boolean z) {
        this.f17146n.m23747U0(z);
    }

    public void setPerformanceTrackingEnabled(boolean z) {
        this.f17146n.m23745V0(z);
    }

    public void setProgress(float f) {
        m23818D(f, true);
    }

    public void setRenderMode(EnumC6090w0 enumC6090w0) {
        this.f17146n.m23741X0(enumC6090w0);
    }

    public void setRepeatCount(int i) {
        this.f17152t.add(EnumC6056b.SET_REPEAT_COUNT);
        this.f17146n.m23739Y0(i);
    }

    public void setRepeatMode(int i) {
        this.f17152t.add(EnumC6056b.SET_REPEAT_MODE);
        this.f17146n.m23737Z0(i);
    }

    public void setSafeMode(boolean z) {
        this.f17146n.m23734a1(z);
    }

    public void setSpeed(float f) {
        this.f17146n.m23731b1(f);
    }

    public void setTextDelegate(C6095y0 c6095y0) {
        this.f17146n.m23725d1(c6095y0);
    }

    public void setUseCompositionFrameRate(boolean z) {
        this.f17146n.m23722e1(z);
    }

    @Override // android.view.View
    public void unscheduleDrawable(Drawable drawable) {
        C6059j0 c6059j0;
        if (!this.f17149q && drawable == (c6059j0 = this.f17146n) && c6059j0.m23732b0()) {
            pauseAnimation();
        } else if (!this.f17149q && (drawable instanceof C6059j0)) {
            C6059j0 c6059j02 = (C6059j0) drawable;
            if (c6059j02.m23732b0()) {
                c6059j02.m23690t0();
            }
        }
        super.unscheduleDrawable(drawable);
    }

    /* renamed from: w */
    public void m23797w() {
        this.f17152t.add(EnumC6056b.PLAY_OPTION);
        this.f17146n.m23682x0();
    }

    /* renamed from: x */
    public void m23796x() {
        this.f17146n.m23680y0();
    }

    /* renamed from: y */
    public void m23795y(InputStream inputStream, String str) {
        setCompositionTask(C6081t.m23605o(inputStream, str));
    }

    /* renamed from: z */
    public void m23794z(String str, String str2) {
        m23795y(new ByteArrayInputStream(str.getBytes()), str2);
    }

    public void setMaxFrame(String str) {
        this.f17146n.m23761N0(str);
    }

    public void setMinFrame(String str) {
        this.f17146n.m23751S0(str);
    }

    public void setAnimation(String str) {
        this.f17147o = str;
        this.f17148p = 0;
        setCompositionTask(m23804p(str));
    }
}
package com.google.android.material.textfield;

import android.animation.ValueAnimator;
import android.annotation.TargetApi;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Typeface;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStructure;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.C0529j;
import androidx.appcompat.widget.C0550p0;
import androidx.core.content.C0946a;
import androidx.core.graphics.drawable.C1013a;
import androidx.core.text.C1100a;
import androidx.core.view.C1170a;
import androidx.core.view.C1363w;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.core.widget.C1435k;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.C1867c;
import androidx.transition.C1881j;
import bb.C2232g;
import bb.C2239k;
import com.google.android.material.internal.C4890b;
import com.google.android.material.internal.C4892c;
import com.google.android.material.internal.C4911o;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p020b0.AbstractC1964a;
import p071e.C6029a;
import p155ia.C7480b;
import p155ia.C7481c;
import p155ia.C7482d;
import p155ia.C7484f;
import p155ia.C7487i;
import p155ia.C7488j;
import p176ja.C8878a;
import p443ya.C13957c;
import pa.C11487a;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class TextInputLayout extends LinearLayout {

    /* renamed from: R0 */
    private static final int f13928R0 = C7488j.f20271h;

    /* renamed from: A */
    private CharSequence f13929A;

    /* renamed from: A0 */
    private ColorStateList f13930A0;

    /* renamed from: B */
    private boolean f13931B;

    /* renamed from: B0 */
    private int f13932B0;

    /* renamed from: C */
    private TextView f13933C;

    /* renamed from: C0 */
    private int f13934C0;

    /* renamed from: D */
    private ColorStateList f13935D;

    /* renamed from: D0 */
    private int f13936D0;

    /* renamed from: E */
    private int f13937E;

    /* renamed from: E0 */
    private ColorStateList f13938E0;

    /* renamed from: F */
    private C1867c f13939F;

    /* renamed from: F0 */
    private int f13940F0;

    /* renamed from: G */
    private C1867c f13941G;

    /* renamed from: G0 */
    private int f13942G0;

    /* renamed from: H */
    private ColorStateList f13943H;

    /* renamed from: H0 */
    private int f13944H0;

    /* renamed from: I */
    private ColorStateList f13945I;

    /* renamed from: I0 */
    private int f13946I0;

    /* renamed from: J */
    private CharSequence f13947J;

    /* renamed from: J0 */
    private int f13948J0;

    /* renamed from: K */
    private final TextView f13949K;

    /* renamed from: K0 */
    private boolean f13950K0;

    /* renamed from: L */
    private boolean f13951L;

    /* renamed from: L0 */
    final C4890b f13952L0;

    /* renamed from: M */
    private CharSequence f13953M;

    /* renamed from: M0 */
    private boolean f13954M0;

    /* renamed from: N */
    private boolean f13955N;

    /* renamed from: N0 */
    private boolean f13956N0;

    /* renamed from: O */
    private C2232g f13957O;

    /* renamed from: O0 */
    private ValueAnimator f13958O0;

    /* renamed from: P */
    private C2232g f13959P;

    /* renamed from: P0 */
    private boolean f13960P0;

    /* renamed from: Q */
    private C2232g f13961Q;

    /* renamed from: Q0 */
    private boolean f13962Q0;

    /* renamed from: R */
    private C2239k f13963R;

    /* renamed from: S */
    private boolean f13964S;

    /* renamed from: T */
    private final int f13965T;

    /* renamed from: U */
    private int f13966U;

    /* renamed from: V */
    private int f13967V;

    /* renamed from: W */
    private int f13968W;

    /* renamed from: a0 */
    private int f13969a0;

    /* renamed from: b0 */
    private int f13970b0;

    /* renamed from: c0 */
    private int f13971c0;

    /* renamed from: d0 */
    private int f13972d0;

    /* renamed from: e0 */
    private final Rect f13973e0;

    /* renamed from: f0 */
    private final Rect f13974f0;

    /* renamed from: g0 */
    private final RectF f13975g0;

    /* renamed from: h0 */
    private Typeface f13976h0;

    /* renamed from: i0 */
    private Drawable f13977i0;

    /* renamed from: j */
    private final FrameLayout f13978j;

    /* renamed from: j0 */
    private int f13979j0;

    /* renamed from: k */
    private final C5013l f13980k;

    /* renamed from: k0 */
    private final LinkedHashSet<InterfaceC4966f> f13981k0;

    /* renamed from: l */
    private final LinearLayout f13982l;

    /* renamed from: l0 */
    private int f13983l0;

    /* renamed from: m */
    private final FrameLayout f13984m;

    /* renamed from: m0 */
    private final SparseArray<AbstractC4999f> f13985m0;

    /* renamed from: n */
    EditText f13986n;

    /* renamed from: n0 */
    private final CheckableImageButton f13987n0;

    /* renamed from: o */
    private CharSequence f13988o;

    /* renamed from: o0 */
    private final LinkedHashSet<InterfaceC4967g> f13989o0;

    /* renamed from: p */
    private int f13990p;

    /* renamed from: p0 */
    private ColorStateList f13991p0;

    /* renamed from: q */
    private int f13992q;

    /* renamed from: q0 */
    private PorterDuff.Mode f13993q0;

    /* renamed from: r */
    private int f13994r;

    /* renamed from: r0 */
    private Drawable f13995r0;

    /* renamed from: s */
    private int f13996s;

    /* renamed from: s0 */
    private int f13997s0;

    /* renamed from: t */
    private final C5001h f13998t;

    /* renamed from: t0 */
    private Drawable f13999t0;

    /* renamed from: u */
    boolean f14000u;

    /* renamed from: u0 */
    private View.OnLongClickListener f14001u0;

    /* renamed from: v */
    private int f14002v;

    /* renamed from: v0 */
    private View.OnLongClickListener f14003v0;

    /* renamed from: w */
    private boolean f14004w;

    /* renamed from: w0 */
    private final CheckableImageButton f14005w0;

    /* renamed from: x */
    private TextView f14006x;

    /* renamed from: x0 */
    private ColorStateList f14007x0;

    /* renamed from: y */
    private int f14008y;

    /* renamed from: y0 */
    private PorterDuff.Mode f14009y0;

    /* renamed from: z */
    private int f14010z;

    /* renamed from: z0 */
    private ColorStateList f14011z0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4961a implements TextWatcher {
        C4961a() {
        }

        @Override // android.text.TextWatcher
        public void afterTextChanged(Editable editable) {
            TextInputLayout textInputLayout = TextInputLayout.this;
            textInputLayout.m26688w0(!textInputLayout.f13962Q0);
            TextInputLayout textInputLayout2 = TextInputLayout.this;
            if (textInputLayout2.f14000u) {
                textInputLayout2.m26708m0(editable.length());
            }
            if (TextInputLayout.this.f13931B) {
                TextInputLayout.this.m26763A0(editable.length());
            }
        }

        @Override // android.text.TextWatcher
        public void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC4962b implements Runnable {
        RunnableC4962b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f13987n0.performClick();
            TextInputLayout.this.f13987n0.jumpDrawablesToCurrentState();
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class RunnableC4963c implements Runnable {
        RunnableC4963c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            TextInputLayout.this.f13986n.requestLayout();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4964d implements ValueAnimator.AnimatorUpdateListener {
        C4964d() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(ValueAnimator valueAnimator) {
            TextInputLayout.this.f13952L0.m27016d0(((Float) valueAnimator.getAnimatedValue()).floatValue());
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4965e extends C1170a {

        /* renamed from: a */
        private final TextInputLayout f14016a;

        public C4965e(TextInputLayout textInputLayout) {
            this.f14016a = textInputLayout;
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            CharSequence charSequence;
            boolean z;
            String str;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            EditText editText = this.f14016a.getEditText();
            if (editText != null) {
                charSequence = editText.getText();
            } else {
                charSequence = null;
            }
            CharSequence hint = this.f14016a.getHint();
            CharSequence error = this.f14016a.getError();
            CharSequence placeholderText = this.f14016a.getPlaceholderText();
            int counterMaxLength = this.f14016a.getCounterMaxLength();
            CharSequence counterOverflowDescription = this.f14016a.getCounterOverflowDescription();
            boolean z2 = !TextUtils.isEmpty(charSequence);
            boolean z3 = !TextUtils.isEmpty(hint);
            boolean z4 = !this.f14016a.m26746N();
            boolean z5 = !TextUtils.isEmpty(error);
            if (!z5 && TextUtils.isEmpty(counterOverflowDescription)) {
                z = false;
            } else {
                z = true;
            }
            if (z3) {
                str = hint.toString();
            } else {
                str = "";
            }
            this.f14016a.f13980k.m26540v(accessibilityNodeInfoCompat);
            if (z2) {
                accessibilityNodeInfoCompat.m37626J0(charSequence);
            } else if (!TextUtils.isEmpty(str)) {
                accessibilityNodeInfoCompat.m37626J0(str);
                if (z4 && placeholderText != null) {
                    accessibilityNodeInfoCompat.m37626J0(str + ", " + ((Object) placeholderText));
                }
            } else if (placeholderText != null) {
                accessibilityNodeInfoCompat.m37626J0(placeholderText);
            }
            if (!TextUtils.isEmpty(str)) {
                if (Build.VERSION.SDK_INT >= 26) {
                    accessibilityNodeInfoCompat.m37570q0(str);
                } else {
                    if (z2) {
                        str = ((Object) charSequence) + ", " + str;
                    }
                    accessibilityNodeInfoCompat.m37626J0(str);
                }
                accessibilityNodeInfoCompat.m37634F0(!z2);
            }
            accessibilityNodeInfoCompat.m37562u0((charSequence == null || charSequence.length() != counterMaxLength) ? -1 : -1);
            if (z) {
                if (!z5) {
                    error = counterOverflowDescription;
                }
                accessibilityNodeInfoCompat.m37578m0(error);
            }
            View m26581s = this.f14016a.f13998t.m26581s();
            if (m26581s != null) {
                accessibilityNodeInfoCompat.m37566s0(m26581s);
            }
        }
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4966f {
        /* renamed from: a */
        void mo26563a(TextInputLayout textInputLayout);
    }

    /* renamed from: com.google.android.material.textfield.TextInputLayout$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4967g {
        /* renamed from: a */
        void mo26562a(TextInputLayout textInputLayout, int i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.google.android.material.textfield.TextInputLayout$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static class C4968h extends AbstractC1964a {
        public static final Parcelable.Creator<C4968h> CREATOR = new C4969a();

        /* renamed from: l */
        CharSequence f14017l;

        /* renamed from: m */
        boolean f14018m;

        /* renamed from: n */
        CharSequence f14019n;

        /* renamed from: o */
        CharSequence f14020o;

        /* renamed from: p */
        CharSequence f14021p;

        /* renamed from: com.google.android.material.textfield.TextInputLayout$h$a */
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        class C4969a implements Parcelable.ClassLoaderCreator<C4968h> {
            C4969a() {
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: a */
            public C4968h createFromParcel(Parcel parcel) {
                return new C4968h(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* renamed from: b */
            public C4968h createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new C4968h(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: c */
            public C4968h[] newArray(int i) {
                return new C4968h[i];
            }
        }

        C4968h(Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "TextInputLayout.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " error=" + ((Object) this.f14017l) + " hint=" + ((Object) this.f14019n) + " helperText=" + ((Object) this.f14020o) + " placeholderText=" + ((Object) this.f14021p) + "}";
        }

        @Override // p020b0.AbstractC1964a, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            TextUtils.writeToParcel(this.f14017l, parcel, i);
            parcel.writeInt(this.f14018m ? 1 : 0);
            TextUtils.writeToParcel(this.f14019n, parcel, i);
            TextUtils.writeToParcel(this.f14020o, parcel, i);
            TextUtils.writeToParcel(this.f14021p, parcel, i);
        }

        C4968h(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f14017l = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14018m = parcel.readInt() == 1;
            this.f14019n = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14020o = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
            this.f14021p = (CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        }
    }

    public TextInputLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, C7480b.f20095J);
    }

    /* renamed from: A */
    private boolean m26764A() {
        return this.f13951L && !TextUtils.isEmpty(this.f13953M) && (this.f13957O instanceof C4983d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: A0 */
    public void m26763A0(int i) {
        if (i == 0 && !this.f13950K0) {
            m26718h0();
        } else {
            m26750J();
        }
    }

    /* renamed from: B */
    private void m26762B() {
        Iterator<InterfaceC4966f> it = this.f13981k0.iterator();
        while (it.hasNext()) {
            it.next().mo26563a(this);
        }
    }

    /* renamed from: B0 */
    private void m26761B0(boolean z, boolean z2) {
        int defaultColor = this.f13938E0.getDefaultColor();
        int colorForState = this.f13938E0.getColorForState(new int[]{16843623, 16842910}, defaultColor);
        int colorForState2 = this.f13938E0.getColorForState(new int[]{16843518, 16842910}, defaultColor);
        if (z) {
            this.f13971c0 = colorForState2;
        } else if (z2) {
            this.f13971c0 = colorForState;
        } else {
            this.f13971c0 = defaultColor;
        }
    }

    /* renamed from: C */
    private void m26760C(int i) {
        Iterator<InterfaceC4967g> it = this.f13989o0.iterator();
        while (it.hasNext()) {
            it.next().mo26562a(this, i);
        }
    }

    /* renamed from: C0 */
    private void m26759C0() {
        int i;
        if (this.f13986n == null) {
            return;
        }
        if (!m26749K() && !m26748L()) {
            i = C1365w0.m37250F(this.f13986n);
        } else {
            i = 0;
        }
        C1365w0.m37249F0(this.f13949K, getContext().getResources().getDimensionPixelSize(C7482d.f20173v), this.f13986n.getPaddingTop(), i, this.f13986n.getPaddingBottom());
    }

    /* renamed from: D */
    private void m26758D(Canvas canvas) {
        C2232g c2232g;
        if (this.f13961Q != null && (c2232g = this.f13959P) != null) {
            c2232g.draw(canvas);
            if (this.f13986n.isFocused()) {
                Rect bounds = this.f13961Q.getBounds();
                Rect bounds2 = this.f13959P.getBounds();
                float m26989x = this.f13952L0.m26989x();
                int centerX = bounds2.centerX();
                bounds.left = C8878a.m17110c(centerX, bounds2.left, m26989x);
                bounds.right = C8878a.m17110c(centerX, bounds2.right, m26989x);
                this.f13961Q.draw(canvas);
            }
        }
    }

    /* renamed from: D0 */
    private void m26757D0() {
        int i;
        int visibility = this.f13949K.getVisibility();
        boolean z = false;
        if (this.f13947J != null && !m26746N()) {
            i = 0;
        } else {
            i = 8;
        }
        if (visibility != i) {
            AbstractC4999f endIconDelegate = getEndIconDelegate();
            if (i == 0) {
                z = true;
            }
            endIconDelegate.mo26624c(z);
        }
        m26694t0();
        this.f13949K.setVisibility(i);
        m26700q0();
    }

    /* renamed from: E */
    private void m26756E(Canvas canvas) {
        if (this.f13951L) {
            this.f13952L0.m27001l(canvas);
        }
    }

    /* renamed from: F */
    private void m26754F(boolean z) {
        ValueAnimator valueAnimator = this.f13958O0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f13958O0.cancel();
        }
        if (z && this.f13956N0) {
            m26713k(0.0f);
        } else {
            this.f13952L0.m27016d0(0.0f);
        }
        if (m26764A() && ((C4983d) this.f13957O).m26668l0()) {
            m26687x();
        }
        this.f13950K0 = true;
        m26750J();
        this.f13980k.m26553i(true);
        m26757D0();
    }

    /* renamed from: G */
    private int m26753G(int i, boolean z) {
        int compoundPaddingLeft = i + this.f13986n.getCompoundPaddingLeft();
        if (getPrefixText() != null && !z) {
            return (compoundPaddingLeft - getPrefixTextView().getMeasuredWidth()) + getPrefixTextView().getPaddingLeft();
        }
        return compoundPaddingLeft;
    }

    /* renamed from: H */
    private int m26752H(int i, boolean z) {
        int compoundPaddingRight = i - this.f13986n.getCompoundPaddingRight();
        if (getPrefixText() != null && z) {
            return compoundPaddingRight + (getPrefixTextView().getMeasuredWidth() - getPrefixTextView().getPaddingRight());
        }
        return compoundPaddingRight;
    }

    /* renamed from: I */
    private boolean m26751I() {
        return this.f13983l0 != 0;
    }

    /* renamed from: J */
    private void m26750J() {
        TextView textView = this.f13933C;
        if (textView != null && this.f13931B) {
            textView.setText((CharSequence) null);
            C1881j.m35148a(this.f13978j, this.f13941G);
            this.f13933C.setVisibility(4);
        }
    }

    /* renamed from: L */
    private boolean m26748L() {
        return this.f14005w0.getVisibility() == 0;
    }

    /* renamed from: P */
    private boolean m26744P() {
        if (this.f13966U == 1 && this.f13986n.getMinLines() <= 1) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private void m26743Q() {
        m26705o();
        m26734Z();
        m26755E0();
        m26714j0();
        m26715j();
        if (this.f13966U != 0) {
            m26690v0();
        }
    }

    /* renamed from: R */
    private void m26742R() {
        if (!m26764A()) {
            return;
        }
        RectF rectF = this.f13975g0;
        this.f13952L0.m26998o(rectF, this.f13986n.getWidth(), this.f13986n.getGravity());
        m26707n(rectF);
        rectF.offset(-getPaddingLeft(), ((-getPaddingTop()) - (rectF.height() / 2.0f)) + this.f13968W);
        ((C4983d) this.f13957O).m26665o0(rectF);
    }

    /* renamed from: S */
    private void m26741S() {
        if (m26764A() && !this.f13950K0) {
            m26687x();
            m26742R();
        }
    }

    /* renamed from: T */
    private static void m26740T(ViewGroup viewGroup, boolean z) {
        int childCount = viewGroup.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = viewGroup.getChildAt(i);
            childAt.setEnabled(z);
            if (childAt instanceof ViewGroup) {
                m26740T((ViewGroup) childAt, z);
            }
        }
    }

    /* renamed from: X */
    private void m26736X() {
        TextView textView = this.f13933C;
        if (textView != null) {
            textView.setVisibility(8);
        }
    }

    /* renamed from: Z */
    private void m26734Z() {
        if (m26720g0()) {
            C1365w0.m37177u0(this.f13986n, this.f13957O);
        }
    }

    /* renamed from: a0 */
    private static void m26732a0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        boolean z;
        boolean m37230P = C1365w0.m37230P(checkableImageButton);
        boolean z2 = false;
        int i = 1;
        if (onLongClickListener != null) {
            z = true;
        } else {
            z = false;
        }
        if (m37230P || z) {
            z2 = true;
        }
        checkableImageButton.setFocusable(z2);
        checkableImageButton.setClickable(m37230P);
        checkableImageButton.setPressable(m37230P);
        checkableImageButton.setLongClickable(z);
        if (!z2) {
            i = 2;
        }
        C1365w0.m37259A0(checkableImageButton, i);
    }

    /* renamed from: b0 */
    private static void m26730b0(CheckableImageButton checkableImageButton, View.OnClickListener onClickListener, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnClickListener(onClickListener);
        m26732a0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: c0 */
    private static void m26728c0(CheckableImageButton checkableImageButton, View.OnLongClickListener onLongClickListener) {
        checkableImageButton.setOnLongClickListener(onLongClickListener);
        m26732a0(checkableImageButton, onLongClickListener);
    }

    /* renamed from: e0 */
    private boolean m26724e0() {
        if ((this.f14005w0.getVisibility() == 0 || ((m26751I() && m26749K()) || this.f13947J != null)) && this.f13982l.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: f0 */
    private boolean m26722f0() {
        if ((getStartIconDrawable() != null || (getPrefixText() != null && getPrefixTextView().getVisibility() == 0)) && this.f13980k.getMeasuredWidth() > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: g0 */
    private boolean m26720g0() {
        EditText editText = this.f13986n;
        if (editText != null && this.f13957O != null && editText.getBackground() == null && this.f13966U != 0) {
            return true;
        }
        return false;
    }

    private AbstractC4999f getEndIconDelegate() {
        AbstractC4999f abstractC4999f = this.f13985m0.get(this.f13983l0);
        if (abstractC4999f == null) {
            return this.f13985m0.get(0);
        }
        return abstractC4999f;
    }

    private CheckableImageButton getEndIconToUpdateDummyDrawable() {
        if (this.f14005w0.getVisibility() == 0) {
            return this.f14005w0;
        }
        if (m26751I() && m26749K()) {
            return this.f13987n0;
        }
        return null;
    }

    /* renamed from: h0 */
    private void m26718h0() {
        if (this.f13933C != null && this.f13931B && !TextUtils.isEmpty(this.f13929A)) {
            this.f13933C.setText(this.f13929A);
            C1881j.m35148a(this.f13978j, this.f13939F);
            this.f13933C.setVisibility(0);
            this.f13933C.bringToFront();
            announceForAccessibility(this.f13929A);
        }
    }

    /* renamed from: i */
    private void m26717i() {
        TextView textView = this.f13933C;
        if (textView != null) {
            this.f13978j.addView(textView);
            this.f13933C.setVisibility(0);
        }
    }

    /* renamed from: i0 */
    private void m26716i0(boolean z) {
        if (z && getEndIconDrawable() != null) {
            Drawable mutate = C1013a.m38080r(getEndIconDrawable()).mutate();
            C1013a.m38084n(mutate, this.f13998t.m26584p());
            this.f13987n0.setImageDrawable(mutate);
            return;
        }
        C5000g.m26622a(this, this.f13987n0, this.f13991p0, this.f13993q0);
    }

    /* renamed from: j */
    private void m26715j() {
        if (this.f13986n != null && this.f13966U == 1) {
            if (C13957c.m1082h(getContext())) {
                EditText editText = this.f13986n;
                C1365w0.m37249F0(editText, C1365w0.m37248G(editText), getResources().getDimensionPixelSize(C7482d.f20167p), C1365w0.m37250F(this.f13986n), getResources().getDimensionPixelSize(C7482d.f20166o));
            } else if (C13957c.m1083g(getContext())) {
                EditText editText2 = this.f13986n;
                C1365w0.m37249F0(editText2, C1365w0.m37248G(editText2), getResources().getDimensionPixelSize(C7482d.f20165n), C1365w0.m37250F(this.f13986n), getResources().getDimensionPixelSize(C7482d.f20164m));
            }
        }
    }

    /* renamed from: j0 */
    private void m26714j0() {
        if (this.f13966U == 1) {
            if (C13957c.m1082h(getContext())) {
                this.f13967V = getResources().getDimensionPixelSize(C7482d.f20169r);
            } else if (C13957c.m1083g(getContext())) {
                this.f13967V = getResources().getDimensionPixelSize(C7482d.f20168q);
            }
        }
    }

    /* renamed from: k0 */
    private void m26712k0(Rect rect) {
        C2232g c2232g = this.f13959P;
        if (c2232g != null) {
            int i = rect.bottom;
            c2232g.setBounds(rect.left, i - this.f13969a0, rect.right, i);
        }
        C2232g c2232g2 = this.f13961Q;
        if (c2232g2 != null) {
            int i2 = rect.bottom;
            c2232g2.setBounds(rect.left, i2 - this.f13970b0, rect.right, i2);
        }
    }

    /* renamed from: l */
    private void m26711l() {
        C2232g c2232g = this.f13957O;
        if (c2232g == null) {
            return;
        }
        C2239k m33939E = c2232g.m33939E();
        C2239k c2239k = this.f13963R;
        if (m33939E != c2239k) {
            this.f13957O.setShapeAppearanceModel(c2239k);
            m26702p0();
        }
        if (m26691v()) {
            this.f13957O.m33909e0(this.f13968W, this.f13971c0);
        }
        int m26703p = m26703p();
        this.f13972d0 = m26703p;
        this.f13957O.m33919Y(ColorStateList.valueOf(m26703p));
        if (this.f13983l0 == 3) {
            this.f13986n.getBackground().invalidateSelf();
        }
        m26709m();
        invalidate();
    }

    /* renamed from: l0 */
    private void m26710l0() {
        int length;
        if (this.f14006x != null) {
            EditText editText = this.f13986n;
            if (editText == null) {
                length = 0;
            } else {
                length = editText.getText().length();
            }
            m26708m0(length);
        }
    }

    /* renamed from: m */
    private void m26709m() {
        ColorStateList valueOf;
        if (this.f13959P != null && this.f13961Q != null) {
            if (m26689w()) {
                C2232g c2232g = this.f13959P;
                if (this.f13986n.isFocused()) {
                    valueOf = ColorStateList.valueOf(this.f13932B0);
                } else {
                    valueOf = ColorStateList.valueOf(this.f13971c0);
                }
                c2232g.m33919Y(valueOf);
                this.f13961Q.m33919Y(ColorStateList.valueOf(this.f13971c0));
            }
            invalidate();
        }
    }

    /* renamed from: n */
    private void m26707n(RectF rectF) {
        float f = rectF.left;
        int i = this.f13965T;
        rectF.left = f - i;
        rectF.right += i;
    }

    /* renamed from: n0 */
    private static void m26706n0(Context context, TextView textView, int i, int i2, boolean z) {
        int i3;
        if (z) {
            i3 = C7487i.f20250c;
        } else {
            i3 = C7487i.f20249b;
        }
        textView.setContentDescription(context.getString(i3, Integer.valueOf(i), Integer.valueOf(i2)));
    }

    /* renamed from: o */
    private void m26705o() {
        int i = this.f13966U;
        if (i != 0) {
            if (i != 1) {
                if (i == 2) {
                    if (this.f13951L && !(this.f13957O instanceof C4983d)) {
                        this.f13957O = new C4983d(this.f13963R);
                    } else {
                        this.f13957O = new C2232g(this.f13963R);
                    }
                    this.f13959P = null;
                    this.f13961Q = null;
                    return;
                }
                throw new IllegalArgumentException(this.f13966U + " is illegal; only @BoxBackgroundMode constants are supported.");
            }
            this.f13957O = new C2232g(this.f13963R);
            this.f13959P = new C2232g();
            this.f13961Q = new C2232g();
            return;
        }
        this.f13957O = null;
        this.f13959P = null;
        this.f13961Q = null;
    }

    /* renamed from: o0 */
    private void m26704o0() {
        int i;
        ColorStateList colorStateList;
        ColorStateList colorStateList2;
        TextView textView = this.f14006x;
        if (textView != null) {
            if (this.f14004w) {
                i = this.f14008y;
            } else {
                i = this.f14010z;
            }
            m26726d0(textView, i);
            if (!this.f14004w && (colorStateList2 = this.f13943H) != null) {
                this.f14006x.setTextColor(colorStateList2);
            }
            if (this.f14004w && (colorStateList = this.f13945I) != null) {
                this.f14006x.setTextColor(colorStateList);
            }
        }
    }

    /* renamed from: p */
    private int m26703p() {
        int i = this.f13972d0;
        if (this.f13966U == 1) {
            return C11487a.m8013g(C11487a.m8015e(this, C7480b.f20110m, 0), this.f13972d0);
        }
        return i;
    }

    /* renamed from: p0 */
    private void m26702p0() {
        if (this.f13983l0 == 3 && this.f13966U == 2) {
            ((C4984e) this.f13985m0.get(3)).m26648O((AutoCompleteTextView) this.f13986n);
        }
    }

    /* renamed from: q */
    private Rect m26701q(Rect rect) {
        if (this.f13986n != null) {
            Rect rect2 = this.f13974f0;
            boolean m26933e = C4911o.m26933e(this);
            rect2.bottom = rect.bottom;
            int i = this.f13966U;
            if (i != 1) {
                if (i != 2) {
                    rect2.left = m26753G(rect.left, m26933e);
                    rect2.top = getPaddingTop();
                    rect2.right = m26752H(rect.right, m26933e);
                    return rect2;
                }
                rect2.left = rect.left + this.f13986n.getPaddingLeft();
                rect2.top = rect.top - m26693u();
                rect2.right = rect.right - this.f13986n.getPaddingRight();
                return rect2;
            }
            rect2.left = m26753G(rect.left, m26933e);
            rect2.top = rect.top + this.f13967V;
            rect2.right = m26752H(rect.right, m26933e);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: r */
    private int m26699r(Rect rect, Rect rect2, float f) {
        if (m26744P()) {
            return (int) (rect2.top + f);
        }
        return rect.bottom - this.f13986n.getCompoundPaddingBottom();
    }

    /* renamed from: s */
    private int m26697s(Rect rect, float f) {
        if (m26744P()) {
            return (int) (rect.centerY() - (f / 2.0f));
        }
        return rect.top + this.f13986n.getCompoundPaddingTop();
    }

    /* renamed from: s0 */
    private boolean m26696s0() {
        int max;
        if (this.f13986n == null || this.f13986n.getMeasuredHeight() >= (max = Math.max(this.f13982l.getMeasuredHeight(), this.f13980k.getMeasuredHeight()))) {
            return false;
        }
        this.f13986n.setMinimumHeight(max);
        return true;
    }

    private void setEditText(EditText editText) {
        if (this.f13986n == null) {
            if (this.f13983l0 != 3 && !(editText instanceof TextInputEditText)) {
                Log.i("TextInputLayout", "EditText added is not a TextInputEditText. Please switch to using that class instead.");
            }
            this.f13986n = editText;
            int i = this.f13990p;
            if (i != -1) {
                setMinEms(i);
            } else {
                setMinWidth(this.f13994r);
            }
            int i2 = this.f13992q;
            if (i2 != -1) {
                setMaxEms(i2);
            } else {
                setMaxWidth(this.f13996s);
            }
            m26743Q();
            setTextInputAccessibilityDelegate(new C4965e(this));
            this.f13952L0.m27004j0(this.f13986n.getTypeface());
            this.f13952L0.m27020b0(this.f13986n.getTextSize());
            this.f13952L0.m27026X(this.f13986n.getLetterSpacing());
            int gravity = this.f13986n.getGravity();
            this.f13952L0.m27031S((gravity & (-113)) | 48);
            this.f13952L0.m27022a0(gravity);
            this.f13986n.addTextChangedListener(new C4961a());
            if (this.f14011z0 == null) {
                this.f14011z0 = this.f13986n.getHintTextColors();
            }
            if (this.f13951L) {
                if (TextUtils.isEmpty(this.f13953M)) {
                    CharSequence hint = this.f13986n.getHint();
                    this.f13988o = hint;
                    setHint(hint);
                    this.f13986n.setHint((CharSequence) null);
                }
                this.f13955N = true;
            }
            if (this.f14006x != null) {
                m26708m0(this.f13986n.getText().length());
            }
            m26698r0();
            this.f13998t.m26594f();
            this.f13980k.bringToFront();
            this.f13982l.bringToFront();
            this.f13984m.bringToFront();
            this.f14005w0.bringToFront();
            m26762B();
            m26759C0();
            if (!isEnabled()) {
                editText.setEnabled(false);
            }
            m26686x0(false, true);
            return;
        }
        throw new IllegalArgumentException("We already have an EditText, can only have one");
    }

    private void setHintInternal(CharSequence charSequence) {
        if (!TextUtils.equals(charSequence, this.f13953M)) {
            this.f13953M = charSequence;
            this.f13952L0.m27008h0(charSequence);
            if (!this.f13950K0) {
                m26742R();
            }
        }
    }

    private void setPlaceholderTextEnabled(boolean z) {
        if (this.f13931B == z) {
            return;
        }
        if (z) {
            m26717i();
        } else {
            m26736X();
            this.f13933C = null;
        }
        this.f13931B = z;
    }

    /* renamed from: t */
    private Rect m26695t(Rect rect) {
        if (this.f13986n != null) {
            Rect rect2 = this.f13974f0;
            float m26990w = this.f13952L0.m26990w();
            rect2.left = rect.left + this.f13986n.getCompoundPaddingLeft();
            rect2.top = m26697s(rect, m26990w);
            rect2.right = rect.right - this.f13986n.getCompoundPaddingRight();
            rect2.bottom = m26699r(rect, rect2, m26990w);
            return rect2;
        }
        throw new IllegalStateException();
    }

    /* renamed from: t0 */
    private void m26694t0() {
        int i;
        boolean z;
        boolean z2;
        FrameLayout frameLayout = this.f13984m;
        int i2 = 8;
        if (this.f13987n0.getVisibility() == 0 && !m26748L()) {
            i = 0;
        } else {
            i = 8;
        }
        frameLayout.setVisibility(i);
        if (this.f13947J != null && !m26746N()) {
            z = false;
        } else {
            z = true;
        }
        if (!m26749K() && !m26748L() && z) {
            z2 = false;
        } else {
            z2 = true;
        }
        LinearLayout linearLayout = this.f13982l;
        if (z2) {
            i2 = 0;
        }
        linearLayout.setVisibility(i2);
    }

    /* renamed from: u */
    private int m26693u() {
        float m26996q;
        if (!this.f13951L) {
            return 0;
        }
        int i = this.f13966U;
        if (i != 0) {
            if (i != 2) {
                return 0;
            }
            m26996q = this.f13952L0.m26996q() / 2.0f;
        } else {
            m26996q = this.f13952L0.m26996q();
        }
        return (int) m26996q;
    }

    /* renamed from: u0 */
    private void m26692u0() {
        boolean z;
        int i = 0;
        if (getErrorIconDrawable() != null && this.f13998t.m26574z() && this.f13998t.m26588l()) {
            z = true;
        } else {
            z = false;
        }
        CheckableImageButton checkableImageButton = this.f14005w0;
        if (!z) {
            i = 8;
        }
        checkableImageButton.setVisibility(i);
        m26694t0();
        m26759C0();
        if (!m26751I()) {
            m26700q0();
        }
    }

    /* renamed from: v */
    private boolean m26691v() {
        return this.f13966U == 2 && m26689w();
    }

    /* renamed from: v0 */
    private void m26690v0() {
        if (this.f13966U != 1) {
            LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.f13978j.getLayoutParams();
            int m26693u = m26693u();
            if (m26693u != layoutParams.topMargin) {
                layoutParams.topMargin = m26693u;
                this.f13978j.requestLayout();
            }
        }
    }

    /* renamed from: w */
    private boolean m26689w() {
        return this.f13968W > -1 && this.f13971c0 != 0;
    }

    /* renamed from: x */
    private void m26687x() {
        if (m26764A()) {
            ((C4983d) this.f13957O).m26667m0();
        }
    }

    /* renamed from: x0 */
    private void m26686x0(boolean z, boolean z2) {
        boolean z3;
        boolean z4;
        ColorStateList colorStateList;
        TextView textView;
        int i;
        boolean isEnabled = isEnabled();
        EditText editText = this.f13986n;
        if (editText != null && !TextUtils.isEmpty(editText.getText())) {
            z3 = true;
        } else {
            z3 = false;
        }
        EditText editText2 = this.f13986n;
        if (editText2 != null && editText2.hasFocus()) {
            z4 = true;
        } else {
            z4 = false;
        }
        boolean m26588l = this.f13998t.m26588l();
        ColorStateList colorStateList2 = this.f14011z0;
        if (colorStateList2 != null) {
            this.f13952L0.m27032R(colorStateList2);
            this.f13952L0.m27024Z(this.f14011z0);
        }
        if (!isEnabled) {
            ColorStateList colorStateList3 = this.f14011z0;
            if (colorStateList3 != null) {
                i = colorStateList3.getColorForState(new int[]{-16842910}, this.f13948J0);
            } else {
                i = this.f13948J0;
            }
            this.f13952L0.m27032R(ColorStateList.valueOf(i));
            this.f13952L0.m27024Z(ColorStateList.valueOf(i));
        } else if (m26588l) {
            this.f13952L0.m27032R(this.f13998t.m26583q());
        } else if (this.f14004w && (textView = this.f14006x) != null) {
            this.f13952L0.m27032R(textView.getTextColors());
        } else if (z4 && (colorStateList = this.f13930A0) != null) {
            this.f13952L0.m27032R(colorStateList);
        }
        if (!z3 && this.f13954M0 && (!isEnabled() || !z4)) {
            if (z2 || !this.f13950K0) {
                m26754F(z);
            }
        } else if (z2 || this.f13950K0) {
            m26685y(z);
        }
    }

    /* renamed from: y */
    private void m26685y(boolean z) {
        ValueAnimator valueAnimator = this.f13958O0;
        if (valueAnimator != null && valueAnimator.isRunning()) {
            this.f13958O0.cancel();
        }
        if (z && this.f13956N0) {
            m26713k(1.0f);
        } else {
            this.f13952L0.m27016d0(1.0f);
        }
        this.f13950K0 = false;
        if (m26764A()) {
            m26742R();
        }
        m26682z0();
        this.f13980k.m26553i(false);
        m26757D0();
    }

    /* renamed from: y0 */
    private void m26684y0() {
        EditText editText;
        if (this.f13933C != null && (editText = this.f13986n) != null) {
            this.f13933C.setGravity(editText.getGravity());
            this.f13933C.setPadding(this.f13986n.getCompoundPaddingLeft(), this.f13986n.getCompoundPaddingTop(), this.f13986n.getCompoundPaddingRight(), this.f13986n.getCompoundPaddingBottom());
        }
    }

    /* renamed from: z */
    private C1867c m26683z() {
        C1867c c1867c = new C1867c();
        c1867c.mo35138X(87L);
        c1867c.mo35136Z(C8878a.f23260a);
        return c1867c;
    }

    /* renamed from: z0 */
    private void m26682z0() {
        EditText editText = this.f13986n;
        m26763A0(editText == null ? 0 : editText.getText().length());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: E0 */
    public void m26755E0() {
        boolean z;
        TextView textView;
        EditText editText;
        EditText editText2;
        if (this.f13957O != null && this.f13966U != 0) {
            boolean z2 = false;
            if (!isFocused() && ((editText2 = this.f13986n) == null || !editText2.hasFocus())) {
                z = false;
            } else {
                z = true;
            }
            if (isHovered() || ((editText = this.f13986n) != null && editText.isHovered())) {
                z2 = true;
            }
            if (!isEnabled()) {
                this.f13971c0 = this.f13948J0;
            } else if (this.f13998t.m26588l()) {
                if (this.f13938E0 != null) {
                    m26761B0(z, z2);
                } else {
                    this.f13971c0 = this.f13998t.m26584p();
                }
            } else if (this.f14004w && (textView = this.f14006x) != null) {
                if (this.f13938E0 != null) {
                    m26761B0(z, z2);
                } else {
                    this.f13971c0 = textView.getCurrentTextColor();
                }
            } else if (z) {
                this.f13971c0 = this.f13936D0;
            } else if (z2) {
                this.f13971c0 = this.f13934C0;
            } else {
                this.f13971c0 = this.f13932B0;
            }
            m26692u0();
            m26738V();
            m26737W();
            m26739U();
            if (getEndIconDelegate().mo26623d()) {
                m26716i0(this.f13998t.m26588l());
            }
            if (this.f13966U == 2) {
                int i = this.f13968W;
                if (z && isEnabled()) {
                    this.f13968W = this.f13970b0;
                } else {
                    this.f13968W = this.f13969a0;
                }
                if (this.f13968W != i) {
                    m26741S();
                }
            }
            if (this.f13966U == 1) {
                if (!isEnabled()) {
                    this.f13972d0 = this.f13942G0;
                } else if (z2 && !z) {
                    this.f13972d0 = this.f13946I0;
                } else if (z) {
                    this.f13972d0 = this.f13944H0;
                } else {
                    this.f13972d0 = this.f13940F0;
                }
            }
            m26711l();
        }
    }

    /* renamed from: K */
    public boolean m26749K() {
        return this.f13984m.getVisibility() == 0 && this.f13987n0.getVisibility() == 0;
    }

    /* renamed from: M */
    public boolean m26747M() {
        return this.f13998t.m26616A();
    }

    /* renamed from: N */
    final boolean m26746N() {
        return this.f13950K0;
    }

    /* renamed from: O */
    public boolean m26745O() {
        return this.f13955N;
    }

    /* renamed from: U */
    public void m26739U() {
        C5000g.m26620c(this, this.f13987n0, this.f13991p0);
    }

    /* renamed from: V */
    public void m26738V() {
        C5000g.m26620c(this, this.f14005w0, this.f14007x0);
    }

    /* renamed from: W */
    public void m26737W() {
        this.f13980k.m26552j();
    }

    /* renamed from: Y */
    public void m26735Y(float f, float f2, float f3, float f4) {
        float f5;
        float f6;
        boolean m26933e = C4911o.m26933e(this);
        this.f13964S = m26933e;
        if (m26933e) {
            f5 = f2;
        } else {
            f5 = f;
        }
        if (!m26933e) {
            f = f2;
        }
        if (m26933e) {
            f6 = f4;
        } else {
            f6 = f3;
        }
        if (!m26933e) {
            f3 = f4;
        }
        C2232g c2232g = this.f13957O;
        if (c2232g == null || c2232g.m33936H() != f5 || this.f13957O.m33935I() != f || this.f13957O.m33890s() != f6 || this.f13957O.m33889t() != f3) {
            this.f13963R = this.f13963R.m33853v().m33849A(f5).m33845E(f).m33825s(f6).m33821w(f3).m33831m();
            m26711l();
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i, ViewGroup.LayoutParams layoutParams) {
        if (view instanceof EditText) {
            FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(layoutParams);
            layoutParams2.gravity = (layoutParams2.gravity & (-113)) | 16;
            this.f13978j.addView(view, layoutParams2);
            this.f13978j.setLayoutParams(layoutParams);
            m26690v0();
            setEditText((EditText) view);
            return;
        }
        super.addView(view, i, layoutParams);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: d0 */
    public void m26726d0(TextView textView, int i) {
        boolean z = true;
        try {
            C1435k.m36867n(textView, i);
            if (textView.getTextColors().getDefaultColor() != -65281) {
                z = false;
            }
        } catch (Exception unused) {
        }
        if (z) {
            C1435k.m36867n(textView, C7488j.f20265b);
            textView.setTextColor(C0946a.m38401c(getContext(), C7481c.f20124a));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    @TargetApi(26)
    public void dispatchProvideAutofillStructure(ViewStructure viewStructure, int i) {
        EditText editText = this.f13986n;
        if (editText == null) {
            super.dispatchProvideAutofillStructure(viewStructure, i);
            return;
        }
        if (this.f13988o != null) {
            boolean z = this.f13955N;
            this.f13955N = false;
            CharSequence hint = editText.getHint();
            this.f13986n.setHint(this.f13988o);
            try {
                super.dispatchProvideAutofillStructure(viewStructure, i);
                return;
            } finally {
                this.f13986n.setHint(hint);
                this.f13955N = z;
            }
        }
        viewStructure.setAutofillId(getAutofillId());
        onProvideAutofillStructure(viewStructure, i);
        onProvideAutofillVirtualStructure(viewStructure, i);
        viewStructure.setChildCount(this.f13978j.getChildCount());
        for (int i2 = 0; i2 < this.f13978j.getChildCount(); i2++) {
            View childAt = this.f13978j.getChildAt(i2);
            ViewStructure newChild = viewStructure.newChild(i2);
            childAt.dispatchProvideAutofillStructure(newChild, i);
            if (childAt == this.f13986n) {
                newChild.setHint(getHint());
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        this.f13962Q0 = true;
        super.dispatchRestoreInstanceState(sparseArray);
        this.f13962Q0 = false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        super.draw(canvas);
        m26756E(canvas);
        m26758D(canvas);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        boolean z;
        if (this.f13960P0) {
            return;
        }
        boolean z2 = true;
        this.f13960P0 = true;
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        C4890b c4890b = this.f13952L0;
        if (c4890b != null) {
            z = c4890b.m27010g0(drawableState) | false;
        } else {
            z = false;
        }
        if (this.f13986n != null) {
            if (!C1365w0.m37224U(this) || !isEnabled()) {
                z2 = false;
            }
            m26688w0(z2);
        }
        m26698r0();
        m26755E0();
        if (z) {
            invalidate();
        }
        this.f13960P0 = false;
    }

    /* renamed from: g */
    public void m26721g(InterfaceC4966f interfaceC4966f) {
        this.f13981k0.add(interfaceC4966f);
        if (this.f13986n != null) {
            interfaceC4966f.mo26563a(this);
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    public int getBaseline() {
        EditText editText = this.f13986n;
        if (editText != null) {
            return editText.getBaseline() + getPaddingTop() + m26693u();
        }
        return super.getBaseline();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C2232g getBoxBackground() {
        int i = this.f13966U;
        if (i != 1 && i != 2) {
            throw new IllegalStateException();
        }
        return this.f13957O;
    }

    public int getBoxBackgroundColor() {
        return this.f13972d0;
    }

    public int getBoxBackgroundMode() {
        return this.f13966U;
    }

    public int getBoxCollapsedPaddingTop() {
        return this.f13967V;
    }

    public float getBoxCornerRadiusBottomEnd() {
        if (C4911o.m26933e(this)) {
            return this.f13963R.m33865j().mo33876a(this.f13975g0);
        }
        return this.f13963R.m33863l().mo33876a(this.f13975g0);
    }

    public float getBoxCornerRadiusBottomStart() {
        if (C4911o.m26933e(this)) {
            return this.f13963R.m33863l().mo33876a(this.f13975g0);
        }
        return this.f13963R.m33865j().mo33876a(this.f13975g0);
    }

    public float getBoxCornerRadiusTopEnd() {
        if (C4911o.m26933e(this)) {
            return this.f13963R.m33857r().mo33876a(this.f13975g0);
        }
        return this.f13963R.m33855t().mo33876a(this.f13975g0);
    }

    public float getBoxCornerRadiusTopStart() {
        if (C4911o.m26933e(this)) {
            return this.f13963R.m33855t().mo33876a(this.f13975g0);
        }
        return this.f13963R.m33857r().mo33876a(this.f13975g0);
    }

    public int getBoxStrokeColor() {
        return this.f13936D0;
    }

    public ColorStateList getBoxStrokeErrorColor() {
        return this.f13938E0;
    }

    public int getBoxStrokeWidth() {
        return this.f13969a0;
    }

    public int getBoxStrokeWidthFocused() {
        return this.f13970b0;
    }

    public int getCounterMaxLength() {
        return this.f14002v;
    }

    CharSequence getCounterOverflowDescription() {
        TextView textView;
        if (this.f14000u && this.f14004w && (textView = this.f14006x) != null) {
            return textView.getContentDescription();
        }
        return null;
    }

    public ColorStateList getCounterOverflowTextColor() {
        return this.f13943H;
    }

    public ColorStateList getCounterTextColor() {
        return this.f13943H;
    }

    public ColorStateList getDefaultHintTextColor() {
        return this.f14011z0;
    }

    public EditText getEditText() {
        return this.f13986n;
    }

    public CharSequence getEndIconContentDescription() {
        return this.f13987n0.getContentDescription();
    }

    public Drawable getEndIconDrawable() {
        return this.f13987n0.getDrawable();
    }

    public int getEndIconMode() {
        return this.f13983l0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public CheckableImageButton getEndIconView() {
        return this.f13987n0;
    }

    public CharSequence getError() {
        if (this.f13998t.m26574z()) {
            return this.f13998t.m26585o();
        }
        return null;
    }

    public CharSequence getErrorContentDescription() {
        return this.f13998t.m26586n();
    }

    public int getErrorCurrentTextColors() {
        return this.f13998t.m26584p();
    }

    public Drawable getErrorIconDrawable() {
        return this.f14005w0.getDrawable();
    }

    final int getErrorTextCurrentColor() {
        return this.f13998t.m26584p();
    }

    public CharSequence getHelperText() {
        if (this.f13998t.m26616A()) {
            return this.f13998t.m26582r();
        }
        return null;
    }

    public int getHelperTextCurrentTextColor() {
        return this.f13998t.m26580t();
    }

    public CharSequence getHint() {
        if (this.f13951L) {
            return this.f13953M;
        }
        return null;
    }

    final float getHintCollapsedTextHeight() {
        return this.f13952L0.m26996q();
    }

    final int getHintCurrentCollapsedTextColor() {
        return this.f13952L0.m26993t();
    }

    public ColorStateList getHintTextColor() {
        return this.f13930A0;
    }

    public int getMaxEms() {
        return this.f13992q;
    }

    public int getMaxWidth() {
        return this.f13996s;
    }

    public int getMinEms() {
        return this.f13990p;
    }

    public int getMinWidth() {
        return this.f13994r;
    }

    @Deprecated
    public CharSequence getPasswordVisibilityToggleContentDescription() {
        return this.f13987n0.getContentDescription();
    }

    @Deprecated
    public Drawable getPasswordVisibilityToggleDrawable() {
        return this.f13987n0.getDrawable();
    }

    public CharSequence getPlaceholderText() {
        if (this.f13931B) {
            return this.f13929A;
        }
        return null;
    }

    public int getPlaceholderTextAppearance() {
        return this.f13937E;
    }

    public ColorStateList getPlaceholderTextColor() {
        return this.f13935D;
    }

    public CharSequence getPrefixText() {
        return this.f13980k.m26561a();
    }

    public ColorStateList getPrefixTextColor() {
        return this.f13980k.m26560b();
    }

    public TextView getPrefixTextView() {
        return this.f13980k.m26559c();
    }

    public CharSequence getStartIconContentDescription() {
        return this.f13980k.m26558d();
    }

    public Drawable getStartIconDrawable() {
        return this.f13980k.m26557e();
    }

    public CharSequence getSuffixText() {
        return this.f13947J;
    }

    public ColorStateList getSuffixTextColor() {
        return this.f13949K.getTextColors();
    }

    public TextView getSuffixTextView() {
        return this.f13949K;
    }

    public Typeface getTypeface() {
        return this.f13976h0;
    }

    /* renamed from: h */
    public void m26719h(InterfaceC4967g interfaceC4967g) {
        this.f13989o0.add(interfaceC4967g);
    }

    /* renamed from: k */
    void m26713k(float f) {
        if (this.f13952L0.m26989x() == f) {
            return;
        }
        if (this.f13958O0 == null) {
            ValueAnimator valueAnimator = new ValueAnimator();
            this.f13958O0 = valueAnimator;
            valueAnimator.setInterpolator(C8878a.f23261b);
            this.f13958O0.setDuration(167L);
            this.f13958O0.addUpdateListener(new C4964d());
        }
        this.f13958O0.setFloatValues(this.f13952L0.m26989x(), f);
        this.f13958O0.start();
    }

    /* renamed from: m0 */
    void m26708m0(int i) {
        boolean z;
        boolean z2 = this.f14004w;
        int i2 = this.f14002v;
        if (i2 == -1) {
            this.f14006x.setText(String.valueOf(i));
            this.f14006x.setContentDescription(null);
            this.f14004w = false;
        } else {
            if (i > i2) {
                z = true;
            } else {
                z = false;
            }
            this.f14004w = z;
            m26706n0(getContext(), this.f14006x, i, this.f14002v, this.f14004w);
            if (z2 != this.f14004w) {
                m26704o0();
            }
            this.f14006x.setText(C1100a.m37892c().m37885j(getContext().getString(C7487i.f20251d, Integer.valueOf(i), Integer.valueOf(this.f14002v))));
        }
        if (this.f13986n != null && z2 != this.f14004w) {
            m26688w0(false);
            m26755E0();
            m26698r0();
        }
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.f13952L0.m27042H(configuration);
    }

    @Override // android.widget.LinearLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        EditText editText = this.f13986n;
        if (editText != null) {
            Rect rect = this.f13973e0;
            C4892c.m26986a(this, editText, rect);
            m26712k0(rect);
            if (this.f13951L) {
                this.f13952L0.m27020b0(this.f13986n.getTextSize());
                int gravity = this.f13986n.getGravity();
                this.f13952L0.m27031S((gravity & (-113)) | 48);
                this.f13952L0.m27022a0(gravity);
                this.f13952L0.m27035O(m26701q(rect));
                this.f13952L0.m27027W(m26695t(rect));
                this.f13952L0.m27039K();
                if (m26764A() && !this.f13950K0) {
                    m26742R();
                }
            }
        }
    }

    @Override // android.widget.LinearLayout, android.view.View
    protected void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        boolean m26696s0 = m26696s0();
        boolean m26700q0 = m26700q0();
        if (m26696s0 || m26700q0) {
            this.f13986n.post(new RunnableC4963c());
        }
        m26684y0();
        m26759C0();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof C4968h)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        C4968h c4968h = (C4968h) parcelable;
        super.onRestoreInstanceState(c4968h.m34884a());
        setError(c4968h.f14017l);
        if (c4968h.f14018m) {
            this.f13987n0.post(new RunnableC4962b());
        }
        setHint(c4968h.f14019n);
        setHelperText(c4968h.f14020o);
        setPlaceholderText(c4968h.f14021p);
        requestLayout();
    }

    @Override // android.widget.LinearLayout, android.view.View
    public void onRtlPropertiesChanged(int i) {
        boolean z;
        float f;
        float f2;
        super.onRtlPropertiesChanged(i);
        boolean z2 = false;
        if (i == 1) {
            z = true;
        } else {
            z = false;
        }
        boolean z3 = this.f13964S;
        if (z != z3) {
            if (z && !z3) {
                z2 = true;
            }
            float mo33876a = this.f13963R.m33857r().mo33876a(this.f13975g0);
            float mo33876a2 = this.f13963R.m33855t().mo33876a(this.f13975g0);
            float mo33876a3 = this.f13963R.m33865j().mo33876a(this.f13975g0);
            float mo33876a4 = this.f13963R.m33863l().mo33876a(this.f13975g0);
            if (z2) {
                f = mo33876a;
            } else {
                f = mo33876a2;
            }
            if (z2) {
                mo33876a = mo33876a2;
            }
            if (z2) {
                f2 = mo33876a3;
            } else {
                f2 = mo33876a4;
            }
            if (z2) {
                mo33876a3 = mo33876a4;
            }
            m26735Y(f, mo33876a, f2, mo33876a3);
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        boolean z;
        C4968h c4968h = new C4968h(super.onSaveInstanceState());
        if (this.f13998t.m26588l()) {
            c4968h.f14017l = getError();
        }
        if (m26751I() && this.f13987n0.isChecked()) {
            z = true;
        } else {
            z = false;
        }
        c4968h.f14018m = z;
        c4968h.f14019n = getHint();
        c4968h.f14020o = getHelperText();
        c4968h.f14021p = getPlaceholderText();
        return c4968h;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: q0 */
    public boolean m26700q0() {
        boolean z;
        if (this.f13986n == null) {
            return false;
        }
        boolean z2 = true;
        if (m26722f0()) {
            int measuredWidth = this.f13980k.getMeasuredWidth() - this.f13986n.getPaddingLeft();
            if (this.f13977i0 == null || this.f13979j0 != measuredWidth) {
                ColorDrawable colorDrawable = new ColorDrawable();
                this.f13977i0 = colorDrawable;
                this.f13979j0 = measuredWidth;
                colorDrawable.setBounds(0, 0, measuredWidth, 1);
            }
            Drawable[] m36880a = C1435k.m36880a(this.f13986n);
            Drawable drawable = m36880a[0];
            Drawable drawable2 = this.f13977i0;
            if (drawable != drawable2) {
                C1435k.m36872i(this.f13986n, drawable2, m36880a[1], m36880a[2], m36880a[3]);
                z = true;
            }
            z = false;
        } else {
            if (this.f13977i0 != null) {
                Drawable[] m36880a2 = C1435k.m36880a(this.f13986n);
                C1435k.m36872i(this.f13986n, null, m36880a2[1], m36880a2[2], m36880a2[3]);
                this.f13977i0 = null;
                z = true;
            }
            z = false;
        }
        if (m26724e0()) {
            int measuredWidth2 = this.f13949K.getMeasuredWidth() - this.f13986n.getPaddingRight();
            CheckableImageButton endIconToUpdateDummyDrawable = getEndIconToUpdateDummyDrawable();
            if (endIconToUpdateDummyDrawable != null) {
                measuredWidth2 = measuredWidth2 + endIconToUpdateDummyDrawable.getMeasuredWidth() + C1363w.m37271b((ViewGroup.MarginLayoutParams) endIconToUpdateDummyDrawable.getLayoutParams());
            }
            Drawable[] m36880a3 = C1435k.m36880a(this.f13986n);
            Drawable drawable3 = this.f13995r0;
            if (drawable3 != null && this.f13997s0 != measuredWidth2) {
                this.f13997s0 = measuredWidth2;
                drawable3.setBounds(0, 0, measuredWidth2, 1);
                C1435k.m36872i(this.f13986n, m36880a3[0], m36880a3[1], this.f13995r0, m36880a3[3]);
            } else {
                if (drawable3 == null) {
                    ColorDrawable colorDrawable2 = new ColorDrawable();
                    this.f13995r0 = colorDrawable2;
                    this.f13997s0 = measuredWidth2;
                    colorDrawable2.setBounds(0, 0, measuredWidth2, 1);
                }
                Drawable drawable4 = m36880a3[2];
                Drawable drawable5 = this.f13995r0;
                if (drawable4 != drawable5) {
                    this.f13999t0 = drawable4;
                    C1435k.m36872i(this.f13986n, m36880a3[0], m36880a3[1], drawable5, m36880a3[3]);
                } else {
                    z2 = z;
                }
            }
        } else if (this.f13995r0 != null) {
            Drawable[] m36880a4 = C1435k.m36880a(this.f13986n);
            if (m36880a4[2] == this.f13995r0) {
                C1435k.m36872i(this.f13986n, m36880a4[0], m36880a4[1], this.f13999t0, m36880a4[3]);
            } else {
                z2 = z;
            }
            this.f13995r0 = null;
        } else {
            return z;
        }
        return z2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: r0 */
    public void m26698r0() {
        Drawable background;
        TextView textView;
        EditText editText = this.f13986n;
        if (editText == null || this.f13966U != 0 || (background = editText.getBackground()) == null) {
            return;
        }
        if (C0550p0.m39770a(background)) {
            background = background.mutate();
        }
        if (this.f13998t.m26588l()) {
            background.setColorFilter(C0529j.m39836e(this.f13998t.m26584p(), PorterDuff.Mode.SRC_IN));
        } else if (this.f14004w && (textView = this.f14006x) != null) {
            background.setColorFilter(C0529j.m39836e(textView.getCurrentTextColor(), PorterDuff.Mode.SRC_IN));
        } else {
            C1013a.m38095c(background);
            this.f13986n.refreshDrawableState();
        }
    }

    public void setBoxBackgroundColor(int i) {
        if (this.f13972d0 != i) {
            this.f13972d0 = i;
            this.f13940F0 = i;
            this.f13944H0 = i;
            this.f13946I0 = i;
            m26711l();
        }
    }

    public void setBoxBackgroundColorResource(int i) {
        setBoxBackgroundColor(C0946a.m38401c(getContext(), i));
    }

    public void setBoxBackgroundColorStateList(ColorStateList colorStateList) {
        int defaultColor = colorStateList.getDefaultColor();
        this.f13940F0 = defaultColor;
        this.f13972d0 = defaultColor;
        this.f13942G0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
        this.f13944H0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        this.f13946I0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
        m26711l();
    }

    public void setBoxBackgroundMode(int i) {
        if (i == this.f13966U) {
            return;
        }
        this.f13966U = i;
        if (this.f13986n != null) {
            m26743Q();
        }
    }

    public void setBoxCollapsedPaddingTop(int i) {
        this.f13967V = i;
    }

    public void setBoxStrokeColor(int i) {
        if (this.f13936D0 != i) {
            this.f13936D0 = i;
            m26755E0();
        }
    }

    public void setBoxStrokeColorStateList(ColorStateList colorStateList) {
        if (colorStateList.isStateful()) {
            this.f13932B0 = colorStateList.getDefaultColor();
            this.f13948J0 = colorStateList.getColorForState(new int[]{-16842910}, -1);
            this.f13934C0 = colorStateList.getColorForState(new int[]{16843623, 16842910}, -1);
            this.f13936D0 = colorStateList.getColorForState(new int[]{16842908, 16842910}, -1);
        } else if (this.f13936D0 != colorStateList.getDefaultColor()) {
            this.f13936D0 = colorStateList.getDefaultColor();
        }
        m26755E0();
    }

    public void setBoxStrokeErrorColor(ColorStateList colorStateList) {
        if (this.f13938E0 != colorStateList) {
            this.f13938E0 = colorStateList;
            m26755E0();
        }
    }

    public void setBoxStrokeWidth(int i) {
        this.f13969a0 = i;
        m26755E0();
    }

    public void setBoxStrokeWidthFocused(int i) {
        this.f13970b0 = i;
        m26755E0();
    }

    public void setBoxStrokeWidthFocusedResource(int i) {
        setBoxStrokeWidthFocused(getResources().getDimensionPixelSize(i));
    }

    public void setBoxStrokeWidthResource(int i) {
        setBoxStrokeWidth(getResources().getDimensionPixelSize(i));
    }

    public void setCounterEnabled(boolean z) {
        if (this.f14000u != z) {
            if (z) {
                AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
                this.f14006x = appCompatTextView;
                appCompatTextView.setId(C7484f.f20195K);
                Typeface typeface = this.f13976h0;
                if (typeface != null) {
                    this.f14006x.setTypeface(typeface);
                }
                this.f14006x.setMaxLines(1);
                this.f13998t.m26595e(this.f14006x, 2);
                C1363w.m37269d((ViewGroup.MarginLayoutParams) this.f14006x.getLayoutParams(), getResources().getDimensionPixelOffset(C7482d.f20151V));
                m26704o0();
                m26710l0();
            } else {
                this.f13998t.m26615B(this.f14006x, 2);
                this.f14006x = null;
            }
            this.f14000u = z;
        }
    }

    public void setCounterMaxLength(int i) {
        if (this.f14002v != i) {
            if (i > 0) {
                this.f14002v = i;
            } else {
                this.f14002v = -1;
            }
            if (this.f14000u) {
                m26710l0();
            }
        }
    }

    public void setCounterOverflowTextAppearance(int i) {
        if (this.f14008y != i) {
            this.f14008y = i;
            m26704o0();
        }
    }

    public void setCounterOverflowTextColor(ColorStateList colorStateList) {
        if (this.f13945I != colorStateList) {
            this.f13945I = colorStateList;
            m26704o0();
        }
    }

    public void setCounterTextAppearance(int i) {
        if (this.f14010z != i) {
            this.f14010z = i;
            m26704o0();
        }
    }

    public void setCounterTextColor(ColorStateList colorStateList) {
        if (this.f13943H != colorStateList) {
            this.f13943H = colorStateList;
            m26704o0();
        }
    }

    public void setDefaultHintTextColor(ColorStateList colorStateList) {
        this.f14011z0 = colorStateList;
        this.f13930A0 = colorStateList;
        if (this.f13986n != null) {
            m26688w0(false);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        m26740T(this, z);
        super.setEnabled(z);
    }

    public void setEndIconActivated(boolean z) {
        this.f13987n0.setActivated(z);
    }

    public void setEndIconCheckable(boolean z) {
        this.f13987n0.setCheckable(z);
    }

    public void setEndIconContentDescription(int i) {
        setEndIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setEndIconDrawable(int i) {
        setEndIconDrawable(i != 0 ? C6029a.m23853b(getContext(), i) : null);
    }

    public void setEndIconMode(int i) {
        boolean z;
        int i2 = this.f13983l0;
        if (i2 == i) {
            return;
        }
        this.f13983l0 = i;
        m26760C(i2);
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        setEndIconVisible(z);
        if (getEndIconDelegate().mo26625b(this.f13966U)) {
            getEndIconDelegate().mo26568a();
            C5000g.m26622a(this, this.f13987n0, this.f13991p0, this.f13993q0);
            return;
        }
        throw new IllegalStateException("The current box background mode " + this.f13966U + " is not supported by the end icon mode " + i);
    }

    public void setEndIconOnClickListener(View.OnClickListener onClickListener) {
        m26730b0(this.f13987n0, onClickListener, this.f14001u0);
    }

    public void setEndIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f14001u0 = onLongClickListener;
        m26728c0(this.f13987n0, onLongClickListener);
    }

    public void setEndIconTintList(ColorStateList colorStateList) {
        if (this.f13991p0 != colorStateList) {
            this.f13991p0 = colorStateList;
            C5000g.m26622a(this, this.f13987n0, colorStateList, this.f13993q0);
        }
    }

    public void setEndIconTintMode(PorterDuff.Mode mode) {
        if (this.f13993q0 != mode) {
            this.f13993q0 = mode;
            C5000g.m26622a(this, this.f13987n0, this.f13991p0, mode);
        }
    }

    public void setEndIconVisible(boolean z) {
        int i;
        if (m26749K() != z) {
            CheckableImageButton checkableImageButton = this.f13987n0;
            if (z) {
                i = 0;
            } else {
                i = 8;
            }
            checkableImageButton.setVisibility(i);
            m26694t0();
            m26759C0();
            m26700q0();
        }
    }

    public void setError(CharSequence charSequence) {
        if (!this.f13998t.m26574z()) {
            if (TextUtils.isEmpty(charSequence)) {
                return;
            }
            setErrorEnabled(true);
        }
        if (!TextUtils.isEmpty(charSequence)) {
            this.f13998t.m26602O(charSequence);
        } else {
            this.f13998t.m26578v();
        }
    }

    public void setErrorContentDescription(CharSequence charSequence) {
        this.f13998t.m26613D(charSequence);
    }

    public void setErrorEnabled(boolean z) {
        this.f13998t.m26612E(z);
    }

    public void setErrorIconDrawable(int i) {
        setErrorIconDrawable(i != 0 ? C6029a.m23853b(getContext(), i) : null);
        m26738V();
    }

    public void setErrorIconOnClickListener(View.OnClickListener onClickListener) {
        m26730b0(this.f14005w0, onClickListener, this.f14003v0);
    }

    public void setErrorIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f14003v0 = onLongClickListener;
        m26728c0(this.f14005w0, onLongClickListener);
    }

    public void setErrorIconTintList(ColorStateList colorStateList) {
        if (this.f14007x0 != colorStateList) {
            this.f14007x0 = colorStateList;
            C5000g.m26622a(this, this.f14005w0, colorStateList, this.f14009y0);
        }
    }

    public void setErrorIconTintMode(PorterDuff.Mode mode) {
        if (this.f14009y0 != mode) {
            this.f14009y0 = mode;
            C5000g.m26622a(this, this.f14005w0, this.f14007x0, mode);
        }
    }

    public void setErrorTextAppearance(int i) {
        this.f13998t.m26611F(i);
    }

    public void setErrorTextColor(ColorStateList colorStateList) {
        this.f13998t.m26610G(colorStateList);
    }

    public void setExpandedHintEnabled(boolean z) {
        if (this.f13954M0 != z) {
            this.f13954M0 = z;
            m26688w0(false);
        }
    }

    public void setHelperText(CharSequence charSequence) {
        if (TextUtils.isEmpty(charSequence)) {
            if (m26747M()) {
                setHelperTextEnabled(false);
                return;
            }
            return;
        }
        if (!m26747M()) {
            setHelperTextEnabled(true);
        }
        this.f13998t.m26601P(charSequence);
    }

    public void setHelperTextColor(ColorStateList colorStateList) {
        this.f13998t.m26607J(colorStateList);
    }

    public void setHelperTextEnabled(boolean z) {
        this.f13998t.m26608I(z);
    }

    public void setHelperTextTextAppearance(int i) {
        this.f13998t.m26609H(i);
    }

    public void setHint(CharSequence charSequence) {
        if (this.f13951L) {
            setHintInternal(charSequence);
            sendAccessibilityEvent(RecyclerView.ItemAnimator.FLAG_MOVED);
        }
    }

    public void setHintAnimationEnabled(boolean z) {
        this.f13956N0 = z;
    }

    public void setHintEnabled(boolean z) {
        if (z != this.f13951L) {
            this.f13951L = z;
            if (!z) {
                this.f13955N = false;
                if (!TextUtils.isEmpty(this.f13953M) && TextUtils.isEmpty(this.f13986n.getHint())) {
                    this.f13986n.setHint(this.f13953M);
                }
                setHintInternal(null);
            } else {
                CharSequence hint = this.f13986n.getHint();
                if (!TextUtils.isEmpty(hint)) {
                    if (TextUtils.isEmpty(this.f13953M)) {
                        setHint(hint);
                    }
                    this.f13986n.setHint((CharSequence) null);
                }
                this.f13955N = true;
            }
            if (this.f13986n != null) {
                m26690v0();
            }
        }
    }

    public void setHintTextAppearance(int i) {
        this.f13952L0.m27034P(i);
        this.f13930A0 = this.f13952L0.m26997p();
        if (this.f13986n != null) {
            m26688w0(false);
            m26690v0();
        }
    }

    public void setHintTextColor(ColorStateList colorStateList) {
        if (this.f13930A0 != colorStateList) {
            if (this.f14011z0 == null) {
                this.f13952L0.m27032R(colorStateList);
            }
            this.f13930A0 = colorStateList;
            if (this.f13986n != null) {
                m26688w0(false);
            }
        }
    }

    public void setMaxEms(int i) {
        this.f13992q = i;
        EditText editText = this.f13986n;
        if (editText != null && i != -1) {
            editText.setMaxEms(i);
        }
    }

    public void setMaxWidth(int i) {
        this.f13996s = i;
        EditText editText = this.f13986n;
        if (editText != null && i != -1) {
            editText.setMaxWidth(i);
        }
    }

    public void setMaxWidthResource(int i) {
        setMaxWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    public void setMinEms(int i) {
        this.f13990p = i;
        EditText editText = this.f13986n;
        if (editText != null && i != -1) {
            editText.setMinEms(i);
        }
    }

    public void setMinWidth(int i) {
        this.f13994r = i;
        EditText editText = this.f13986n;
        if (editText != null && i != -1) {
            editText.setMinWidth(i);
        }
    }

    public void setMinWidthResource(int i) {
        setMinWidth(getContext().getResources().getDimensionPixelSize(i));
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(int i) {
        setPasswordVisibilityToggleContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(int i) {
        setPasswordVisibilityToggleDrawable(i != 0 ? C6029a.m23853b(getContext(), i) : null);
    }

    @Deprecated
    public void setPasswordVisibilityToggleEnabled(boolean z) {
        if (z && this.f13983l0 != 1) {
            setEndIconMode(1);
        } else if (!z) {
            setEndIconMode(0);
        }
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintList(ColorStateList colorStateList) {
        this.f13991p0 = colorStateList;
        C5000g.m26622a(this, this.f13987n0, colorStateList, this.f13993q0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleTintMode(PorterDuff.Mode mode) {
        this.f13993q0 = mode;
        C5000g.m26622a(this, this.f13987n0, this.f13991p0, mode);
    }

    public void setPlaceholderText(CharSequence charSequence) {
        if (this.f13933C == null) {
            AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
            this.f13933C = appCompatTextView;
            appCompatTextView.setId(C7484f.f20198N);
            C1365w0.m37259A0(this.f13933C, 2);
            C1867c m26683z = m26683z();
            this.f13939F = m26683z;
            m26683z.mo35131c0(67L);
            this.f13941G = m26683z();
            setPlaceholderTextAppearance(this.f13937E);
            setPlaceholderTextColor(this.f13935D);
        }
        if (TextUtils.isEmpty(charSequence)) {
            setPlaceholderTextEnabled(false);
        } else {
            if (!this.f13931B) {
                setPlaceholderTextEnabled(true);
            }
            this.f13929A = charSequence;
        }
        m26682z0();
    }

    public void setPlaceholderTextAppearance(int i) {
        this.f13937E = i;
        TextView textView = this.f13933C;
        if (textView != null) {
            C1435k.m36867n(textView, i);
        }
    }

    public void setPlaceholderTextColor(ColorStateList colorStateList) {
        if (this.f13935D != colorStateList) {
            this.f13935D = colorStateList;
            TextView textView = this.f13933C;
            if (textView != null && colorStateList != null) {
                textView.setTextColor(colorStateList);
            }
        }
    }

    public void setPrefixText(CharSequence charSequence) {
        this.f13980k.m26551k(charSequence);
    }

    public void setPrefixTextAppearance(int i) {
        this.f13980k.m26550l(i);
    }

    public void setPrefixTextColor(ColorStateList colorStateList) {
        this.f13980k.m26549m(colorStateList);
    }

    public void setStartIconCheckable(boolean z) {
        this.f13980k.m26548n(z);
    }

    public void setStartIconContentDescription(int i) {
        setStartIconContentDescription(i != 0 ? getResources().getText(i) : null);
    }

    public void setStartIconDrawable(int i) {
        setStartIconDrawable(i != 0 ? C6029a.m23853b(getContext(), i) : null);
    }

    public void setStartIconOnClickListener(View.OnClickListener onClickListener) {
        this.f13980k.m26545q(onClickListener);
    }

    public void setStartIconOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.f13980k.m26544r(onLongClickListener);
    }

    public void setStartIconTintList(ColorStateList colorStateList) {
        this.f13980k.m26543s(colorStateList);
    }

    public void setStartIconTintMode(PorterDuff.Mode mode) {
        this.f13980k.m26542t(mode);
    }

    public void setStartIconVisible(boolean z) {
        this.f13980k.m26541u(z);
    }

    public void setSuffixText(CharSequence charSequence) {
        CharSequence charSequence2;
        if (TextUtils.isEmpty(charSequence)) {
            charSequence2 = null;
        } else {
            charSequence2 = charSequence;
        }
        this.f13947J = charSequence2;
        this.f13949K.setText(charSequence);
        m26757D0();
    }

    public void setSuffixTextAppearance(int i) {
        C1435k.m36867n(this.f13949K, i);
    }

    public void setSuffixTextColor(ColorStateList colorStateList) {
        this.f13949K.setTextColor(colorStateList);
    }

    public void setTextInputAccessibilityDelegate(C4965e c4965e) {
        EditText editText = this.f13986n;
        if (editText != null) {
            C1365w0.m37185q0(editText, c4965e);
        }
    }

    public void setTypeface(Typeface typeface) {
        if (typeface != this.f13976h0) {
            this.f13976h0 = typeface;
            this.f13952L0.m27004j0(typeface);
            this.f13998t.m26605L(typeface);
            TextView textView = this.f14006x;
            if (textView != null) {
                textView.setTypeface(typeface);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: w0 */
    public void m26688w0(boolean z) {
        m26686x0(z, false);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v109 */
    /* JADX WARN: Type inference failed for: r3v49 */
    /* JADX WARN: Type inference failed for: r3v50, types: [int, boolean] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public TextInputLayout(android.content.Context r27, android.util.AttributeSet r28, int r29) {
        /*
            Method dump skipped, instructions count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.material.textfield.TextInputLayout.<init>(android.content.Context, android.util.AttributeSet, int):void");
    }

    public void setEndIconContentDescription(CharSequence charSequence) {
        if (getEndIconContentDescription() != charSequence) {
            this.f13987n0.setContentDescription(charSequence);
        }
    }

    public void setEndIconDrawable(Drawable drawable) {
        this.f13987n0.setImageDrawable(drawable);
        if (drawable != null) {
            C5000g.m26622a(this, this.f13987n0, this.f13991p0, this.f13993q0);
            m26739U();
        }
    }

    public void setStartIconContentDescription(CharSequence charSequence) {
        this.f13980k.m26547o(charSequence);
    }

    public void setStartIconDrawable(Drawable drawable) {
        this.f13980k.m26546p(drawable);
    }

    public void setErrorIconDrawable(Drawable drawable) {
        this.f14005w0.setImageDrawable(drawable);
        m26692u0();
        C5000g.m26622a(this, this.f14005w0, this.f14007x0, this.f14009y0);
    }

    @Deprecated
    public void setPasswordVisibilityToggleContentDescription(CharSequence charSequence) {
        this.f13987n0.setContentDescription(charSequence);
    }

    @Deprecated
    public void setPasswordVisibilityToggleDrawable(Drawable drawable) {
        this.f13987n0.setImageDrawable(drawable);
    }

    public void setHint(int i) {
        setHint(i != 0 ? getResources().getText(i) : null);
    }
}

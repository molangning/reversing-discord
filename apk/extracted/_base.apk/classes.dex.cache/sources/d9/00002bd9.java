package com.google.android.material.datepicker;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.core.view.C1365w0;
import androidx.core.view.InterfaceC1324r0;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.FragmentTransaction;
import bb.C2232g;
import com.google.android.material.datepicker.C4808a;
import com.google.android.material.internal.C4893d;
import com.google.android.material.internal.C4911o;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Iterator;
import java.util.LinkedHashSet;
import p071e.C6029a;
import p155ia.C7480b;
import p155ia.C7482d;
import p155ia.C7483e;
import p155ia.C7484f;
import p155ia.C7486h;
import p155ia.C7487i;
import p155ia.C7488j;
import p443ya.C13956b;
import qa.View$OnTouchListenerC11813a;

/* renamed from: com.google.android.material.datepicker.i */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4832i<S> extends DialogFragment {

    /* renamed from: F */
    static final Object f13466F = "CONFIRM_BUTTON_TAG";

    /* renamed from: G */
    static final Object f13467G = "CANCEL_BUTTON_TAG";

    /* renamed from: H */
    static final Object f13468H = "TOGGLE_BUTTON_TAG";

    /* renamed from: A */
    private TextView f13469A;

    /* renamed from: B */
    private CheckableImageButton f13470B;

    /* renamed from: C */
    private C2232g f13471C;

    /* renamed from: D */
    private Button f13472D;

    /* renamed from: E */
    private boolean f13473E;

    /* renamed from: j */
    private final LinkedHashSet<InterfaceC4838j<? super S>> f13474j = new LinkedHashSet<>();

    /* renamed from: k */
    private final LinkedHashSet<View.OnClickListener> f13475k = new LinkedHashSet<>();

    /* renamed from: l */
    private final LinkedHashSet<DialogInterface.OnCancelListener> f13476l = new LinkedHashSet<>();

    /* renamed from: m */
    private final LinkedHashSet<DialogInterface.OnDismissListener> f13477m = new LinkedHashSet<>();

    /* renamed from: n */
    private int f13478n;

    /* renamed from: o */
    private InterfaceC4814d<S> f13479o;

    /* renamed from: p */
    private AbstractC4848p<S> f13480p;

    /* renamed from: q */
    private C4808a f13481q;

    /* renamed from: r */
    private C4819h<S> f13482r;

    /* renamed from: s */
    private int f13483s;

    /* renamed from: t */
    private CharSequence f13484t;

    /* renamed from: u */
    private boolean f13485u;

    /* renamed from: v */
    private int f13486v;

    /* renamed from: w */
    private int f13487w;

    /* renamed from: x */
    private CharSequence f13488x;

    /* renamed from: y */
    private int f13489y;

    /* renamed from: z */
    private CharSequence f13490z;

    /* renamed from: com.google.android.material.datepicker.i$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnClickListenerC4833a implements View.OnClickListener {
        View$OnClickListenerC4833a() {
            C4832i.this = r1;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C4832i.this.f13474j.iterator();
            while (it.hasNext()) {
                ((InterfaceC4838j) it.next()).m27270a(C4832i.this.m27279q());
            }
            C4832i.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class View$OnClickListenerC4834b implements View.OnClickListener {
        View$OnClickListenerC4834b() {
            C4832i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            Iterator it = C4832i.this.f13475k.iterator();
            while (it.hasNext()) {
                ((View.OnClickListener) it.next()).onClick(view);
            }
            C4832i.this.dismiss();
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4835c implements InterfaceC1324r0 {

        /* renamed from: a */
        final /* synthetic */ int f13493a;

        /* renamed from: b */
        final /* synthetic */ View f13494b;

        /* renamed from: c */
        final /* synthetic */ int f13495c;

        C4835c(int i, View view, int i2) {
            C4832i.this = r1;
            this.f13493a = i;
            this.f13494b = view;
            this.f13495c = i2;
        }

        @Override // androidx.core.view.InterfaceC1324r0
        /* renamed from: a */
        public WindowInsetsCompat mo24794a(View view, WindowInsetsCompat windowInsetsCompat) {
            int i = windowInsetsCompat.m37741f(WindowInsetsCompat.C1163m.m37675g()).f3341b;
            if (this.f13493a >= 0) {
                this.f13494b.getLayoutParams().height = this.f13493a + i;
                View view2 = this.f13494b;
                view2.setLayoutParams(view2.getLayoutParams());
            }
            View view3 = this.f13494b;
            view3.setPadding(view3.getPaddingLeft(), this.f13495c + i, this.f13494b.getPaddingRight(), this.f13494b.getPaddingBottom());
            return windowInsetsCompat;
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4836d extends AbstractC4847o<S> {
        C4836d() {
            C4832i.this = r1;
        }

        @Override // com.google.android.material.datepicker.AbstractC4847o
        /* renamed from: a */
        public void mo27235a(S s) {
            C4832i.this.m27272x();
            C4832i.this.f13472D.setEnabled(C4832i.this.m27282n().m27332F());
        }
    }

    /* renamed from: com.google.android.material.datepicker.i$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC4837e implements View.OnClickListener {
        View$OnClickListenerC4837e() {
            C4832i.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4832i.this.f13472D.setEnabled(C4832i.this.m27282n().m27332F());
            C4832i.this.f13470B.toggle();
            C4832i c4832i = C4832i.this;
            c4832i.m27271y(c4832i.f13470B);
            C4832i.this.m27273w();
        }
    }

    /* renamed from: l */
    private static Drawable m27284l(Context context) {
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, C6029a.m23853b(context, C7483e.f20179b));
        stateListDrawable.addState(new int[0], C6029a.m23853b(context, C7483e.f20180c));
        return stateListDrawable;
    }

    /* renamed from: m */
    private void m27283m(Window window) {
        if (this.f13473E) {
            return;
        }
        View findViewById = requireView().findViewById(C7484f.f20206f);
        C4893d.m26983a(window, true, C4911o.m26935c(findViewById), null);
        C1365w0.m37253D0(findViewById, new C4835c(findViewById.getLayoutParams().height, findViewById, findViewById.getPaddingTop()));
        this.f13473E = true;
    }

    /* renamed from: n */
    public InterfaceC4814d<S> m27282n() {
        if (this.f13479o == null) {
            this.f13479o = (InterfaceC4814d) getArguments().getParcelable("DATE_SELECTOR_KEY");
        }
        return this.f13479o;
    }

    /* renamed from: p */
    private static int m27280p(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(C7482d.f20130A);
        int i = C4841l.m27262e().f13506m;
        return (dimensionPixelOffset * 2) + (resources.getDimensionPixelSize(C7482d.f20132C) * i) + ((i - 1) * resources.getDimensionPixelOffset(C7482d.f20135F));
    }

    /* renamed from: r */
    private int m27278r(Context context) {
        int i = this.f13478n;
        if (i != 0) {
            return i;
        }
        return m27282n().m27329o(context);
    }

    /* renamed from: s */
    private void m27277s(Context context) {
        boolean z;
        this.f13470B.setTag(f13468H);
        this.f13470B.setImageDrawable(m27284l(context));
        CheckableImageButton checkableImageButton = this.f13470B;
        if (this.f13486v != 0) {
            z = true;
        } else {
            z = false;
        }
        checkableImageButton.setChecked(z);
        C1365w0.m37185q0(this.f13470B, null);
        m27271y(this.f13470B);
        this.f13470B.setOnClickListener(new View$OnClickListenerC4837e());
    }

    /* renamed from: t */
    public static boolean m27276t(Context context) {
        return m27274v(context, 16843277);
    }

    /* renamed from: u */
    public static boolean m27275u(Context context) {
        return m27274v(context, C7480b.f20086A);
    }

    /* renamed from: v */
    static boolean m27274v(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(C13956b.m1091d(context, C7480b.f20118u, C4819h.class.getCanonicalName()), new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    /* renamed from: w */
    public void m27273w() {
        AbstractC4848p<S> abstractC4848p;
        int m27278r = m27278r(requireContext());
        this.f13482r = C4819h.m27299v(m27282n(), m27278r, this.f13481q);
        if (this.f13470B.isChecked()) {
            abstractC4848p = C4839k.m27269f(m27282n(), m27278r, this.f13481q);
        } else {
            abstractC4848p = this.f13482r;
        }
        this.f13480p = abstractC4848p;
        m27272x();
        FragmentTransaction m36406m = getChildFragmentManager().m36406m();
        m36406m.m36352n(C7484f.f20222v, this.f13480p);
        m36406m.mo36329i();
        this.f13480p.mo27234d(new C4836d());
    }

    /* renamed from: x */
    public void m27272x() {
        String m27281o = m27281o();
        this.f13469A.setContentDescription(String.format(getString(C7487i.f20256i), m27281o));
        this.f13469A.setText(m27281o);
    }

    /* renamed from: y */
    public void m27271y(CheckableImageButton checkableImageButton) {
        String string;
        if (this.f13470B.isChecked()) {
            string = checkableImageButton.getContext().getString(C7487i.f20259l);
        } else {
            string = checkableImageButton.getContext().getString(C7487i.f20261n);
        }
        this.f13470B.setContentDescription(string);
    }

    /* renamed from: o */
    public String m27281o() {
        return m27282n().m27328v(getContext());
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnCancelListener> it = this.f13476l.iterator();
        while (it.hasNext()) {
            it.next().onCancel(dialogInterface);
        }
        super.onCancel(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f13478n = bundle.getInt("OVERRIDE_THEME_RES_ID");
        this.f13479o = (InterfaceC4814d) bundle.getParcelable("DATE_SELECTOR_KEY");
        this.f13481q = (C4808a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f13483s = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.f13484t = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.f13486v = bundle.getInt("INPUT_MODE_KEY");
        this.f13487w = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f13488x = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.f13489y = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.f13490z = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        Dialog dialog = new Dialog(requireContext(), m27278r(requireContext()));
        Context context = dialog.getContext();
        this.f13485u = m27276t(context);
        int m1091d = C13956b.m1091d(context, C7480b.f20110m, C4832i.class.getCanonicalName());
        C2232g c2232g = new C2232g(context, null, C7480b.f20118u, C7488j.f20282s);
        this.f13471C = c2232g;
        c2232g.m33929O(context);
        this.f13471C.m33919Y(ColorStateList.valueOf(m1091d));
        this.f13471C.m33920X(C1365w0.m37174w(dialog.getWindow().getDecorView()));
        return dialog;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        if (this.f13485u) {
            i = C7486h.f20247r;
        } else {
            i = C7486h.f20246q;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.f13485u) {
            inflate.findViewById(C7484f.f20222v).setLayoutParams(new LinearLayout.LayoutParams(m27280p(context), -2));
        } else {
            inflate.findViewById(C7484f.f20223w).setLayoutParams(new LinearLayout.LayoutParams(m27280p(context), -1));
        }
        TextView textView = (TextView) inflate.findViewById(C7484f.f20187C);
        this.f13469A = textView;
        C1365w0.m37181s0(textView, 1);
        this.f13470B = (CheckableImageButton) inflate.findViewById(C7484f.f20188D);
        TextView textView2 = (TextView) inflate.findViewById(C7484f.f20189E);
        CharSequence charSequence = this.f13484t;
        if (charSequence != null) {
            textView2.setText(charSequence);
        } else {
            textView2.setText(this.f13483s);
        }
        m27277s(context);
        this.f13472D = (Button) inflate.findViewById(C7484f.f20203c);
        if (m27282n().m27332F()) {
            this.f13472D.setEnabled(true);
        } else {
            this.f13472D.setEnabled(false);
        }
        this.f13472D.setTag(f13466F);
        CharSequence charSequence2 = this.f13488x;
        if (charSequence2 != null) {
            this.f13472D.setText(charSequence2);
        } else {
            int i2 = this.f13487w;
            if (i2 != 0) {
                this.f13472D.setText(i2);
            }
        }
        this.f13472D.setOnClickListener(new View$OnClickListenerC4833a());
        Button button = (Button) inflate.findViewById(C7484f.f20201a);
        button.setTag(f13467G);
        CharSequence charSequence3 = this.f13490z;
        if (charSequence3 != null) {
            button.setText(charSequence3);
        } else {
            int i3 = this.f13489y;
            if (i3 != 0) {
                button.setText(i3);
            }
        }
        button.setOnClickListener(new View$OnClickListenerC4834b());
        return inflate;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator<DialogInterface.OnDismissListener> it = this.f13477m.iterator();
        while (it.hasNext()) {
            it.next().onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) getView();
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.f13478n);
        bundle.putParcelable("DATE_SELECTOR_KEY", this.f13479o);
        C4808a.C4810b c4810b = new C4808a.C4810b(this.f13481q);
        if (this.f13482r.m27304q() != null) {
            c4810b.m27338b(this.f13482r.m27304q().f13508o);
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4810b.m27339a());
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.f13483s);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.f13484t);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.f13487w);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.f13488x);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.f13489y);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.f13490z);
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        Window window = requireDialog().getWindow();
        if (this.f13485u) {
            window.setLayout(-1, -1);
            window.setBackgroundDrawable(this.f13471C);
            m27283m(window);
        } else {
            window.setLayout(-2, -2);
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(C7482d.f20134E);
            Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
            window.setBackgroundDrawable(new InsetDrawable((Drawable) this.f13471C, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
            window.getDecorView().setOnTouchListener(new View$OnTouchListenerC11813a(requireDialog(), rect));
        }
        m27273w();
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public void onStop() {
        this.f13480p.m27233e();
        super.onStop();
    }

    /* renamed from: q */
    public final S m27279q() {
        return m27282n().getSelection();
    }
}
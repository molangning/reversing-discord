package com.google.android.material.datepicker;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;
import android.widget.ListAdapter;
import androidx.core.util.C1136d;
import androidx.core.view.C1170a;
import androidx.core.view.C1365w0;
import androidx.core.view.accessibility.AccessibilityNodeInfoCompat;
import androidx.recyclerview.widget.C1809k;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.button.MaterialButton;
import java.util.Calendar;
import java.util.Iterator;
import p155ia.C7482d;
import p155ia.C7484f;
import p155ia.C7485g;
import p155ia.C7486h;
import p155ia.C7487i;

/* renamed from: com.google.android.material.datepicker.h */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class C4819h<S> extends AbstractC4848p<S> {

    /* renamed from: u */
    static final Object f13431u = "MONTHS_VIEW_GROUP_TAG";

    /* renamed from: v */
    static final Object f13432v = "NAVIGATION_PREV_TAG";

    /* renamed from: w */
    static final Object f13433w = "NAVIGATION_NEXT_TAG";

    /* renamed from: x */
    static final Object f13434x = "SELECTOR_TOGGLE_TAG";

    /* renamed from: k */
    private int f13435k;

    /* renamed from: l */
    private InterfaceC4814d<S> f13436l;

    /* renamed from: m */
    private C4808a f13437m;

    /* renamed from: n */
    private C4841l f13438n;

    /* renamed from: o */
    private EnumC4830k f13439o;

    /* renamed from: p */
    private C4813c f13440p;

    /* renamed from: q */
    private RecyclerView f13441q;

    /* renamed from: r */
    private RecyclerView f13442r;

    /* renamed from: s */
    private View f13443s;

    /* renamed from: t */
    private View f13444t;

    /* renamed from: com.google.android.material.datepicker.h$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class RunnableC4820a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ int f13445j;

        RunnableC4820a(int i) {
            C4819h.this = r1;
            this.f13445j = i;
        }

        @Override // java.lang.Runnable
        public void run() {
            C4819h.this.f13442r.smoothScrollToPosition(this.f13445j);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4821b extends C1170a {
        C4821b() {
            C4819h.this = r1;
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            accessibilityNodeInfoCompat.m37586i0(null);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4822c extends C4849q {

        /* renamed from: R */
        final /* synthetic */ int f13448R;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C4822c(Context context, int i, boolean z, int i2) {
            super(context, i, z);
            C4819h.this = r1;
            this.f13448R = i2;
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        /* renamed from: V1 */
        public void mo27294V1(RecyclerView.State state, int[] iArr) {
            if (this.f13448R == 0) {
                iArr[0] = C4819h.this.f13442r.getWidth();
                iArr[1] = C4819h.this.f13442r.getWidth();
                return;
            }
            iArr[0] = C4819h.this.f13442r.getHeight();
            iArr[1] = C4819h.this.f13442r.getHeight();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    class C4823d implements InterfaceC4831l {
        C4823d() {
            C4819h.this = r1;
        }

        @Override // com.google.android.material.datepicker.C4819h.InterfaceC4831l
        /* renamed from: a */
        public void mo27293a(long j) {
            if (C4819h.this.f13437m.m27347j().mo27320p(j)) {
                C4819h.this.f13436l.m27330S(j);
                Iterator<AbstractC4847o<S>> it = C4819h.this.f13524j.iterator();
                while (it.hasNext()) {
                    it.next().mo27235a((S) C4819h.this.f13436l.getSelection());
                }
                C4819h.this.f13442r.getAdapter().notifyDataSetChanged();
                if (C4819h.this.f13441q != null) {
                    C4819h.this.f13441q.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4824e extends RecyclerView.ItemDecoration {

        /* renamed from: a */
        private final Calendar f13451a = C4853t.m27217k();

        /* renamed from: b */
        private final Calendar f13452b = C4853t.m27217k();

        C4824e() {
            C4819h.this = r1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.ItemDecoration
        public void onDraw(Canvas canvas, RecyclerView recyclerView, RecyclerView.State state) {
            int i;
            int width;
            if ((recyclerView.getAdapter() instanceof C4854u) && (recyclerView.getLayoutManager() instanceof GridLayoutManager)) {
                C4854u c4854u = (C4854u) recyclerView.getAdapter();
                GridLayoutManager gridLayoutManager = (GridLayoutManager) recyclerView.getLayoutManager();
                for (C1136d<Long, Long> c1136d : C4819h.this.f13436l.m27327w()) {
                    Long l = c1136d.f3508a;
                    if (l != null && c1136d.f3509b != null) {
                        this.f13451a.setTimeInMillis(l.longValue());
                        this.f13452b.setTimeInMillis(c1136d.f3509b.longValue());
                        int m27212c = c4854u.m27212c(this.f13451a.get(1));
                        int m27212c2 = c4854u.m27212c(this.f13452b.get(1));
                        View mo35749N = gridLayoutManager.mo35749N(m27212c);
                        View mo35749N2 = gridLayoutManager.mo35749N(m27212c2);
                        int m35880g3 = m27212c / gridLayoutManager.m35880g3();
                        int m35880g32 = m27212c2 / gridLayoutManager.m35880g3();
                        for (int i2 = m35880g3; i2 <= m35880g32; i2++) {
                            View mo35749N3 = gridLayoutManager.mo35749N(gridLayoutManager.m35880g3() * i2);
                            if (mo35749N3 != null) {
                                int top = mo35749N3.getTop() + C4819h.this.f13440p.f13421d.m27335c();
                                int bottom = mo35749N3.getBottom() - C4819h.this.f13440p.f13421d.m27336b();
                                if (i2 == m35880g3) {
                                    i = mo35749N.getLeft() + (mo35749N.getWidth() / 2);
                                } else {
                                    i = 0;
                                }
                                if (i2 == m35880g32) {
                                    width = mo35749N2.getLeft() + (mo35749N2.getWidth() / 2);
                                } else {
                                    width = recyclerView.getWidth();
                                }
                                canvas.drawRect(i, top, width, bottom, C4819h.this.f13440p.f13425h);
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4825f extends C1170a {
        C4825f() {
            C4819h.this = r1;
        }

        @Override // androidx.core.view.C1170a
        public void onInitializeAccessibilityNodeInfo(View view, AccessibilityNodeInfoCompat accessibilityNodeInfoCompat) {
            String string;
            super.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfoCompat);
            if (C4819h.this.f13444t.getVisibility() == 0) {
                string = C4819h.this.getString(C7487i.f20262o);
            } else {
                string = C4819h.this.getString(C7487i.f20260m);
            }
            accessibilityNodeInfoCompat.m37570q0(string);
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class C4826g extends RecyclerView.OnScrollListener {

        /* renamed from: a */
        final /* synthetic */ C4844n f13455a;

        /* renamed from: b */
        final /* synthetic */ MaterialButton f13456b;

        C4826g(C4844n c4844n, MaterialButton materialButton) {
            C4819h.this = r1;
            this.f13455a = c4844n;
            this.f13456b = materialButton;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrollStateChanged(RecyclerView recyclerView, int i) {
            if (i == 0) {
                recyclerView.announceForAccessibility(this.f13456b.getText());
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
        public void onScrolled(RecyclerView recyclerView, int i, int i2) {
            int m35817l2;
            if (i < 0) {
                m35817l2 = C4819h.this.m27300u().m35820i2();
            } else {
                m35817l2 = C4819h.this.m27300u().m35817l2();
            }
            C4819h.this.f13438n = this.f13455a.m27240b(m35817l2);
            this.f13456b.setText(this.f13455a.m27239c(m35817l2));
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC4827h implements View.OnClickListener {
        View$OnClickListenerC4827h() {
            C4819h.this = r1;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            C4819h.this.m27295z();
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC4828i implements View.OnClickListener {

        /* renamed from: j */
        final /* synthetic */ C4844n f13459j;

        View$OnClickListenerC4828i(C4844n c4844n) {
            C4819h.this = r1;
            this.f13459j = c4844n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m35820i2 = C4819h.this.m27300u().m35820i2() + 1;
            if (m35820i2 < C4819h.this.f13442r.getAdapter().getItemCount()) {
                C4819h.this.m27297x(this.f13459j.m27240b(m35820i2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$j */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public class View$OnClickListenerC4829j implements View.OnClickListener {

        /* renamed from: j */
        final /* synthetic */ C4844n f13461j;

        View$OnClickListenerC4829j(C4844n c4844n) {
            C4819h.this = r1;
            this.f13461j = c4844n;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            int m35817l2 = C4819h.this.m27300u().m35817l2() - 1;
            if (m35817l2 >= 0) {
                C4819h.this.m27297x(this.f13461j.m27240b(m35817l2));
            }
        }
    }

    /* renamed from: com.google.android.material.datepicker.h$k */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public enum EnumC4830k {
        DAY,
        YEAR
    }

    /* renamed from: com.google.android.material.datepicker.h$l */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public interface InterfaceC4831l {
        /* renamed from: a */
        void mo27293a(long j);
    }

    /* renamed from: m */
    private void m27308m(View view, C4844n c4844n) {
        MaterialButton materialButton = (MaterialButton) view.findViewById(C7484f.f20216p);
        materialButton.setTag(f13434x);
        C1365w0.m37185q0(materialButton, new C4825f());
        MaterialButton materialButton2 = (MaterialButton) view.findViewById(C7484f.f20218r);
        materialButton2.setTag(f13432v);
        MaterialButton materialButton3 = (MaterialButton) view.findViewById(C7484f.f20217q);
        materialButton3.setTag(f13433w);
        this.f13443s = view.findViewById(C7484f.f20225y);
        this.f13444t = view.findViewById(C7484f.f20220t);
        m27296y(EnumC4830k.DAY);
        materialButton.setText(this.f13438n.m27258z());
        this.f13442r.addOnScrollListener(new C4826g(c4844n, materialButton));
        materialButton.setOnClickListener(new View$OnClickListenerC4827h());
        materialButton3.setOnClickListener(new View$OnClickListenerC4828i(c4844n));
        materialButton2.setOnClickListener(new View$OnClickListenerC4829j(c4844n));
    }

    /* renamed from: n */
    private RecyclerView.ItemDecoration m27307n() {
        return new C4824e();
    }

    /* renamed from: s */
    public static int m27302s(Context context) {
        return context.getResources().getDimensionPixelSize(C7482d.f20131B);
    }

    /* renamed from: t */
    private static int m27301t(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelSize = resources.getDimensionPixelSize(C7482d.f20138I) + resources.getDimensionPixelOffset(C7482d.f20139J) + resources.getDimensionPixelOffset(C7482d.f20137H);
        int dimensionPixelSize2 = resources.getDimensionPixelSize(C7482d.f20133D);
        int i = C4843m.f13510o;
        return dimensionPixelSize + dimensionPixelSize2 + (resources.getDimensionPixelSize(C7482d.f20131B) * i) + ((i - 1) * resources.getDimensionPixelOffset(C7482d.f20136G)) + resources.getDimensionPixelOffset(C7482d.f20177z);
    }

    /* renamed from: v */
    public static <T> C4819h<T> m27299v(InterfaceC4814d<T> interfaceC4814d, int i, C4808a c4808a) {
        C4819h<T> c4819h = new C4819h<>();
        Bundle bundle = new Bundle();
        bundle.putInt("THEME_RES_ID_KEY", i);
        bundle.putParcelable("GRID_SELECTOR_KEY", interfaceC4814d);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", c4808a);
        bundle.putParcelable("CURRENT_MONTH_KEY", c4808a.m27344u());
        c4819h.setArguments(bundle);
        return c4819h;
    }

    /* renamed from: w */
    private void m27298w(int i) {
        this.f13442r.post(new RunnableC4820a(i));
    }

    @Override // com.google.android.material.datepicker.AbstractC4848p
    /* renamed from: d */
    public boolean mo27234d(AbstractC4847o<S> abstractC4847o) {
        return super.mo27234d(abstractC4847o);
    }

    /* renamed from: o */
    public C4808a m27306o() {
        return this.f13437m;
    }

    @Override // androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            bundle = getArguments();
        }
        this.f13435k = bundle.getInt("THEME_RES_ID_KEY");
        this.f13436l = (InterfaceC4814d) bundle.getParcelable("GRID_SELECTOR_KEY");
        this.f13437m = (C4808a) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        this.f13438n = (C4841l) bundle.getParcelable("CURRENT_MONTH_KEY");
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i;
        int i2;
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), this.f13435k);
        this.f13440p = new C4813c(contextThemeWrapper);
        LayoutInflater cloneInContext = layoutInflater.cloneInContext(contextThemeWrapper);
        C4841l m27343x = this.f13437m.m27343x();
        if (C4832i.m27276t(contextThemeWrapper)) {
            i = C7486h.f20244o;
            i2 = 1;
        } else {
            i = C7486h.f20242m;
            i2 = 0;
        }
        View inflate = cloneInContext.inflate(i, viewGroup, false);
        inflate.setMinimumHeight(m27301t(requireContext()));
        GridView gridView = (GridView) inflate.findViewById(C7484f.f20221u);
        C1365w0.m37185q0(gridView, new C4821b());
        gridView.setAdapter((ListAdapter) new C4818g());
        gridView.setNumColumns(m27343x.f13506m);
        gridView.setEnabled(false);
        this.f13442r = (RecyclerView) inflate.findViewById(C7484f.f20224x);
        this.f13442r.setLayoutManager(new C4822c(getContext(), i2, false, i2));
        this.f13442r.setTag(f13431u);
        C4844n c4844n = new C4844n(contextThemeWrapper, this.f13436l, this.f13437m, new C4823d());
        this.f13442r.setAdapter(c4844n);
        int integer = contextThemeWrapper.getResources().getInteger(C7485g.f20229c);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(C7484f.f20225y);
        this.f13441q = recyclerView;
        if (recyclerView != null) {
            recyclerView.setHasFixedSize(true);
            this.f13441q.setLayoutManager(new GridLayoutManager((Context) contextThemeWrapper, integer, 1, false));
            this.f13441q.setAdapter(new C4854u(this));
            this.f13441q.addItemDecoration(m27307n());
        }
        if (inflate.findViewById(C7484f.f20216p) != null) {
            m27308m(inflate, c4844n);
        }
        if (!C4832i.m27276t(contextThemeWrapper)) {
            new C1809k().m35339b(this.f13442r);
        }
        this.f13442r.scrollToPosition(c4844n.m27238d(this.f13438n));
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putInt("THEME_RES_ID_KEY", this.f13435k);
        bundle.putParcelable("GRID_SELECTOR_KEY", this.f13436l);
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", this.f13437m);
        bundle.putParcelable("CURRENT_MONTH_KEY", this.f13438n);
    }

    /* renamed from: p */
    public C4813c m27305p() {
        return this.f13440p;
    }

    /* renamed from: q */
    public C4841l m27304q() {
        return this.f13438n;
    }

    /* renamed from: r */
    public InterfaceC4814d<S> m27303r() {
        return this.f13436l;
    }

    /* renamed from: u */
    LinearLayoutManager m27300u() {
        return (LinearLayoutManager) this.f13442r.getLayoutManager();
    }

    /* renamed from: x */
    public void m27297x(C4841l c4841l) {
        boolean z;
        C4844n c4844n = (C4844n) this.f13442r.getAdapter();
        int m27238d = c4844n.m27238d(c4841l);
        int m27238d2 = m27238d - c4844n.m27238d(this.f13438n);
        boolean z2 = true;
        if (Math.abs(m27238d2) > 3) {
            z = true;
        } else {
            z = false;
        }
        if (m27238d2 <= 0) {
            z2 = false;
        }
        this.f13438n = c4841l;
        if (z && z2) {
            this.f13442r.scrollToPosition(m27238d - 3);
            m27298w(m27238d);
        } else if (z) {
            this.f13442r.scrollToPosition(m27238d + 3);
            m27298w(m27238d);
        } else {
            m27298w(m27238d);
        }
    }

    /* renamed from: y */
    public void m27296y(EnumC4830k enumC4830k) {
        this.f13439o = enumC4830k;
        if (enumC4830k == EnumC4830k.YEAR) {
            this.f13441q.getLayoutManager().mo28548G1(((C4854u) this.f13441q.getAdapter()).m27212c(this.f13438n.f13505l));
            this.f13443s.setVisibility(0);
            this.f13444t.setVisibility(8);
        } else if (enumC4830k == EnumC4830k.DAY) {
            this.f13443s.setVisibility(8);
            this.f13444t.setVisibility(0);
            m27297x(this.f13438n);
        }
    }

    /* renamed from: z */
    void m27295z() {
        EnumC4830k enumC4830k = this.f13439o;
        EnumC4830k enumC4830k2 = EnumC4830k.YEAR;
        if (enumC4830k == enumC4830k2) {
            m27296y(EnumC4830k.DAY);
        } else if (enumC4830k == EnumC4830k.DAY) {
            m27296y(enumC4830k2);
        }
    }
}
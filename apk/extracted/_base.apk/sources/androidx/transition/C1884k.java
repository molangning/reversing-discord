package androidx.transition;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import androidx.transition.Transition;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.Iterator;
import p330s0.AbstractC12339b;
import p330s0.AbstractC12341d;

/* renamed from: androidx.transition.k */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class C1884k extends Transition {

    /* renamed from: U */
    int f5193U;

    /* renamed from: S */
    private ArrayList<Transition> f5191S = new ArrayList<>();

    /* renamed from: T */
    private boolean f5192T = true;

    /* renamed from: V */
    boolean f5194V = false;

    /* renamed from: W */
    private int f5195W = 0;

    /* renamed from: androidx.transition.k$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class C1885a extends C1880i {

        /* renamed from: a */
        final /* synthetic */ Transition f5196a;

        C1885a(Transition transition) {
            this.f5196a = transition;
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            this.f5196a.mo35139W();
            transition.mo35142S(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.transition.k$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1886b extends C1880i {

        /* renamed from: a */
        C1884k f5198a;

        C1886b(C1884k c1884k) {
            this.f5198a = c1884k;
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionEnd(Transition transition) {
            C1884k c1884k = this.f5198a;
            int i = c1884k.f5193U - 1;
            c1884k.f5193U = i;
            if (i == 0) {
                c1884k.f5194V = false;
                c1884k.m35213s();
            }
            transition.mo35142S(this);
        }

        @Override // androidx.transition.C1880i, androidx.transition.Transition.InterfaceC1848f
        public void onTransitionStart(Transition transition) {
            C1884k c1884k = this.f5198a;
            if (!c1884k.f5194V) {
                c1884k.m35219d0();
                this.f5198a.f5194V = true;
            }
        }
    }

    /* renamed from: i0 */
    private void m35125i0(Transition transition) {
        this.f5191S.add(transition);
        transition.f5067A = this;
    }

    /* renamed from: r0 */
    private void m35112r0() {
        C1886b c1886b = new C1886b(this);
        Iterator<Transition> it = this.f5191S.iterator();
        while (it.hasNext()) {
            it.next().mo35134b(c1886b);
        }
        this.f5193U = this.f5191S.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: Q */
    public void mo35143Q(View view) {
        super.mo35143Q(view);
        int size = this.f5191S.size();
        for (int i = 0; i < size; i++) {
            this.f5191S.get(i).mo35143Q(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: U */
    public void mo35140U(View view) {
        super.mo35140U(view);
        int size = this.f5191S.size();
        for (int i = 0; i < size; i++) {
            this.f5191S.get(i).mo35140U(view);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: W */
    protected void mo35139W() {
        if (this.f5191S.isEmpty()) {
            m35219d0();
            m35213s();
            return;
        }
        m35112r0();
        if (!this.f5192T) {
            for (int i = 1; i < this.f5191S.size(); i++) {
                this.f5191S.get(i - 1).mo35134b(new C1885a(this.f5191S.get(i)));
            }
            Transition transition = this.f5191S.get(0);
            if (transition != null) {
                transition.mo35139W();
                return;
            }
            return;
        }
        Iterator<Transition> it = this.f5191S.iterator();
        while (it.hasNext()) {
            it.next().mo35139W();
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: Y */
    public void mo35137Y(Transition.AbstractC1847e abstractC1847e) {
        super.mo35137Y(abstractC1847e);
        this.f5195W |= 8;
        int size = this.f5191S.size();
        for (int i = 0; i < size; i++) {
            this.f5191S.get(i).mo35137Y(abstractC1847e);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: a0 */
    public void mo35135a0(AbstractC12339b abstractC12339b) {
        super.mo35135a0(abstractC12339b);
        this.f5195W |= 4;
        if (this.f5191S != null) {
            for (int i = 0; i < this.f5191S.size(); i++) {
                this.f5191S.get(i).mo35135a0(abstractC12339b);
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: b0 */
    public void mo35133b0(AbstractC12341d abstractC12341d) {
        super.mo35133b0(abstractC12341d);
        this.f5195W |= 2;
        int size = this.f5191S.size();
        for (int i = 0; i < size; i++) {
            this.f5191S.get(i).mo35133b0(abstractC12341d);
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: e0 */
    String mo35130e0(String str) {
        String mo35130e0 = super.mo35130e0(str);
        for (int i = 0; i < this.f5191S.size(); i++) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(mo35130e0);
            sb2.append(ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE);
            sb2.append(this.f5191S.get(i).mo35130e0(str + "  "));
            mo35130e0 = sb2.toString();
        }
        return mo35130e0;
    }

    @Override // androidx.transition.Transition
    /* renamed from: f0 */
    public C1884k mo35134b(Transition.InterfaceC1848f interfaceC1848f) {
        return (C1884k) super.mo35134b(interfaceC1848f);
    }

    @Override // androidx.transition.Transition
    /* renamed from: g */
    public void mo35128g(C1888m c1888m) {
        if (m35229J(c1888m.f5203b)) {
            Iterator<Transition> it = this.f5191S.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m35229J(c1888m.f5203b)) {
                    next.mo35128g(c1888m);
                    c1888m.f5204c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: g0 */
    public C1884k mo35132c(View view) {
        for (int i = 0; i < this.f5191S.size(); i++) {
            this.f5191S.get(i).mo35132c(view);
        }
        return (C1884k) super.mo35132c(view);
    }

    /* renamed from: h0 */
    public C1884k m35126h0(Transition transition) {
        m35125i0(transition);
        long j = this.f5084l;
        if (j >= 0) {
            transition.mo35138X(j);
        }
        if ((this.f5195W & 1) != 0) {
            transition.mo35136Z(m35210v());
        }
        if ((this.f5195W & 2) != 0) {
            m35206z();
            transition.mo35133b0(null);
        }
        if ((this.f5195W & 4) != 0) {
            transition.mo35135a0(m35207y());
        }
        if ((this.f5195W & 8) != 0) {
            transition.mo35137Y(m35211u());
        }
        return this;
    }

    /* renamed from: j0 */
    public Transition m35124j0(int i) {
        if (i >= 0 && i < this.f5191S.size()) {
            return this.f5191S.get(i);
        }
        return null;
    }

    @Override // androidx.transition.Transition
    /* renamed from: k */
    void mo35123k(C1888m c1888m) {
        super.mo35123k(c1888m);
        int size = this.f5191S.size();
        for (int i = 0; i < size; i++) {
            this.f5191S.get(i).mo35123k(c1888m);
        }
    }

    /* renamed from: k0 */
    public int m35122k0() {
        return this.f5191S.size();
    }

    @Override // androidx.transition.Transition
    /* renamed from: l */
    public void mo35121l(C1888m c1888m) {
        if (m35229J(c1888m.f5203b)) {
            Iterator<Transition> it = this.f5191S.iterator();
            while (it.hasNext()) {
                Transition next = it.next();
                if (next.m35229J(c1888m.f5203b)) {
                    next.mo35121l(c1888m);
                    c1888m.f5204c.add(next);
                }
            }
        }
    }

    @Override // androidx.transition.Transition
    /* renamed from: l0 */
    public C1884k mo35142S(Transition.InterfaceC1848f interfaceC1848f) {
        return (C1884k) super.mo35142S(interfaceC1848f);
    }

    @Override // androidx.transition.Transition
    /* renamed from: m0 */
    public C1884k mo35141T(View view) {
        for (int i = 0; i < this.f5191S.size(); i++) {
            this.f5191S.get(i).mo35141T(view);
        }
        return (C1884k) super.mo35141T(view);
    }

    @Override // androidx.transition.Transition
    /* renamed from: n0 */
    public C1884k mo35138X(long j) {
        ArrayList<Transition> arrayList;
        super.mo35138X(j);
        if (this.f5084l >= 0 && (arrayList = this.f5191S) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5191S.get(i).mo35138X(j);
            }
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: o0 */
    public C1884k mo35136Z(TimeInterpolator timeInterpolator) {
        this.f5195W |= 1;
        ArrayList<Transition> arrayList = this.f5191S;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                this.f5191S.get(i).mo35136Z(timeInterpolator);
            }
        }
        return (C1884k) super.mo35136Z(timeInterpolator);
    }

    @Override // androidx.transition.Transition
    /* renamed from: p */
    public Transition clone() {
        C1884k c1884k = (C1884k) super.clone();
        c1884k.f5191S = new ArrayList<>();
        int size = this.f5191S.size();
        for (int i = 0; i < size; i++) {
            c1884k.m35125i0(this.f5191S.get(i).clone());
        }
        return c1884k;
    }

    /* renamed from: p0 */
    public C1884k m35115p0(int i) {
        if (i != 0) {
            if (i == 1) {
                this.f5192T = false;
            } else {
                throw new AndroidRuntimeException("Invalid parameter for TransitionSet ordering: " + i);
            }
        } else {
            this.f5192T = true;
        }
        return this;
    }

    @Override // androidx.transition.Transition
    /* renamed from: q0 */
    public C1884k mo35131c0(long j) {
        return (C1884k) super.mo35131c0(j);
    }

    @Override // androidx.transition.Transition
    /* renamed from: r */
    protected void mo35113r(ViewGroup viewGroup, C1889n c1889n, C1889n c1889n2, ArrayList<C1888m> arrayList, ArrayList<C1888m> arrayList2) {
        long m35235B = m35235B();
        int size = this.f5191S.size();
        for (int i = 0; i < size; i++) {
            Transition transition = this.f5191S.get(i);
            if (m35235B > 0 && (this.f5192T || i == 0)) {
                long m35235B2 = transition.m35235B();
                if (m35235B2 > 0) {
                    transition.mo35131c0(m35235B2 + m35235B);
                } else {
                    transition.mo35131c0(m35235B);
                }
            }
            transition.mo35113r(viewGroup, c1889n, c1889n2, arrayList, arrayList2);
        }
    }
}

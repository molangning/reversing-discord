package androidx.fragment.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import p124h0.C6860c;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: androidx.fragment.app.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class LayoutInflater$Factory2C1600f implements LayoutInflater.Factory2 {

    /* renamed from: j */
    final FragmentManager f4227j;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.fragment.app.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class View$OnAttachStateChangeListenerC1601a implements View.OnAttachStateChangeListener {

        /* renamed from: j */
        final /* synthetic */ C1612m f4228j;

        View$OnAttachStateChangeListenerC1601a(C1612m c1612m) {
            this.f4228j = c1612m;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            Fragment m36250k = this.f4228j.m36250k();
            this.f4228j.m36248m();
            AbstractC1636s.m36156n((ViewGroup) m36250k.mView.getParent(), LayoutInflater$Factory2C1600f.this.f4227j).m36160j();
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public LayoutInflater$Factory2C1600f(FragmentManager fragmentManager) {
        this.f4227j = fragmentManager;
    }

    @Override // android.view.LayoutInflater.Factory
    public View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }

    @Override // android.view.LayoutInflater.Factory2
    public View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        C1612m m36381v;
        if (FragmentContainerView.class.getName().equals(str)) {
            return new FragmentContainerView(context, attributeSet, this.f4227j);
        }
        if ("fragment".equals(str)) {
            String attributeValue = attributeSet.getAttributeValue(null, "class");
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C6860c.f19104d);
            if (attributeValue == null) {
                attributeValue = obtainStyledAttributes.getString(C6860c.f19105e);
            }
            int resourceId = obtainStyledAttributes.getResourceId(C6860c.f19106f, -1);
            String string = obtainStyledAttributes.getString(C6860c.f19107g);
            obtainStyledAttributes.recycle();
            if (attributeValue == null || !C1599e.m36293b(context.getClassLoader(), attributeValue)) {
                return null;
            }
            int id2 = view != null ? view.getId() : 0;
            if (id2 == -1 && resourceId == -1 && string == null) {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Must specify unique android:id, android:tag, or have a parent with an id for " + attributeValue);
            }
            Fragment m36417i0 = resourceId != -1 ? this.f4227j.m36417i0(resourceId) : null;
            if (m36417i0 == null && string != null) {
                m36417i0 = this.f4227j.m36414j0(string);
            }
            if (m36417i0 == null && id2 != -1) {
                m36417i0 = this.f4227j.m36417i0(id2);
            }
            if (m36417i0 == null) {
                m36417i0 = this.f4227j.m36387s0().mo36294a(context.getClassLoader(), attributeValue);
                m36417i0.mFromLayout = true;
                m36417i0.mFragmentId = resourceId != 0 ? resourceId : id2;
                m36417i0.mContainerId = id2;
                m36417i0.mTag = string;
                m36417i0.mInLayout = true;
                FragmentManager fragmentManager = this.f4227j;
                m36417i0.mFragmentManager = fragmentManager;
                m36417i0.mHost = fragmentManager.m36380v0();
                m36417i0.onInflate(this.f4227j.m36380v0().m36504f(), attributeSet, m36417i0.mSavedFragmentState);
                m36381v = this.f4227j.m36424g(m36417i0);
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "Fragment " + m36417i0 + " has been inflated via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else if (!m36417i0.mInLayout) {
                m36417i0.mInLayout = true;
                FragmentManager fragmentManager2 = this.f4227j;
                m36417i0.mFragmentManager = fragmentManager2;
                m36417i0.mHost = fragmentManager2.m36380v0();
                m36417i0.onInflate(this.f4227j.m36380v0().m36504f(), attributeSet, m36417i0.mSavedFragmentState);
                m36381v = this.f4227j.m36381v(m36417i0);
                if (FragmentManager.m36479H0(2)) {
                    Log.v("FragmentManager", "Retained Fragment " + m36417i0 + " has been re-attached via the <fragment> tag: id=0x" + Integer.toHexString(resourceId));
                }
            } else {
                throw new IllegalArgumentException(attributeSet.getPositionDescription() + ": Duplicate id 0x" + Integer.toHexString(resourceId) + ", tag " + string + ", or parent id 0x" + Integer.toHexString(id2) + " with another fragment for " + attributeValue);
            }
            m36417i0.mContainer = (ViewGroup) view;
            m36381v.m36248m();
            m36381v.m36251j();
            View view2 = m36417i0.mView;
            if (view2 != null) {
                if (resourceId != 0) {
                    view2.setId(resourceId);
                }
                if (m36417i0.mView.getTag() == null) {
                    m36417i0.mView.setTag(string);
                }
                m36417i0.mView.addOnAttachStateChangeListener(new View$OnAttachStateChangeListenerC1601a(m36381v));
                return m36417i0.mView;
            }
            throw new IllegalStateException("Fragment " + attributeValue + " did not create a view.");
        }
        return null;
    }
}

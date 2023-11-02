package androidx.recyclerview.widget;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewPropertyAnimator;
import androidx.core.view.C1365w0;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public class DefaultItemAnimator extends AbstractC1812m {
    private static final boolean DEBUG = false;
    private static TimeInterpolator sDefaultInterpolator;
    private ArrayList<RecyclerView.ViewHolder> mPendingRemovals = new ArrayList<>();
    private ArrayList<RecyclerView.ViewHolder> mPendingAdditions = new ArrayList<>();
    private ArrayList<C1738i> mPendingMoves = new ArrayList<>();
    private ArrayList<ChangeInfo> mPendingChanges = new ArrayList<>();
    ArrayList<ArrayList<RecyclerView.ViewHolder>> mAdditionsList = new ArrayList<>();
    ArrayList<ArrayList<C1738i>> mMovesList = new ArrayList<>();
    ArrayList<ArrayList<ChangeInfo>> mChangesList = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> mAddAnimations = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> mMoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> mRemoveAnimations = new ArrayList<>();
    ArrayList<RecyclerView.ViewHolder> mChangeAnimations = new ArrayList<>();

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1730a implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ArrayList f4582j;

        RunnableC1730a(ArrayList arrayList) {
            this.f4582j = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4582j.iterator();
            while (it.hasNext()) {
                C1738i c1738i = (C1738i) it.next();
                DefaultItemAnimator.this.animateMoveImpl(c1738i.f4610a, c1738i.f4611b, c1738i.f4612c, c1738i.f4613d, c1738i.f4614e);
            }
            this.f4582j.clear();
            DefaultItemAnimator.this.mMovesList.remove(this.f4582j);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1731b implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ArrayList f4584j;

        RunnableC1731b(ArrayList arrayList) {
            this.f4584j = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4584j.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.animateChangeImpl((ChangeInfo) it.next());
            }
            this.f4584j.clear();
            DefaultItemAnimator.this.mChangesList.remove(this.f4584j);
        }
    }

    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    class RunnableC1732c implements Runnable {

        /* renamed from: j */
        final /* synthetic */ ArrayList f4586j;

        RunnableC1732c(ArrayList arrayList) {
            this.f4586j = arrayList;
        }

        @Override // java.lang.Runnable
        public void run() {
            Iterator it = this.f4586j.iterator();
            while (it.hasNext()) {
                DefaultItemAnimator.this.animateAddImpl((RecyclerView.ViewHolder) it.next());
            }
            this.f4586j.clear();
            DefaultItemAnimator.this.mAdditionsList.remove(this.f4586j);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$d */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1733d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f4588a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4589b;

        /* renamed from: c */
        final /* synthetic */ View f4590c;

        C1733d(RecyclerView.ViewHolder viewHolder, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4588a = viewHolder;
            this.f4589b = viewPropertyAnimator;
            this.f4590c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4589b.setListener(null);
            this.f4590c.setAlpha(1.0f);
            DefaultItemAnimator.this.dispatchRemoveFinished(this.f4588a);
            DefaultItemAnimator.this.mRemoveAnimations.remove(this.f4588a);
            DefaultItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchRemoveStarting(this.f4588a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$e */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1734e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f4592a;

        /* renamed from: b */
        final /* synthetic */ View f4593b;

        /* renamed from: c */
        final /* synthetic */ ViewPropertyAnimator f4594c;

        C1734e(RecyclerView.ViewHolder viewHolder, View view, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4592a = viewHolder;
            this.f4593b = view;
            this.f4594c = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            this.f4593b.setAlpha(1.0f);
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4594c.setListener(null);
            DefaultItemAnimator.this.dispatchAddFinished(this.f4592a);
            DefaultItemAnimator.this.mAddAnimations.remove(this.f4592a);
            DefaultItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchAddStarting(this.f4592a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$f */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1735f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ RecyclerView.ViewHolder f4596a;

        /* renamed from: b */
        final /* synthetic */ int f4597b;

        /* renamed from: c */
        final /* synthetic */ View f4598c;

        /* renamed from: d */
        final /* synthetic */ int f4599d;

        /* renamed from: e */
        final /* synthetic */ ViewPropertyAnimator f4600e;

        C1735f(RecyclerView.ViewHolder viewHolder, int i, View view, int i2, ViewPropertyAnimator viewPropertyAnimator) {
            this.f4596a = viewHolder;
            this.f4597b = i;
            this.f4598c = view;
            this.f4599d = i2;
            this.f4600e = viewPropertyAnimator;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            if (this.f4597b != 0) {
                this.f4598c.setTranslationX(0.0f);
            }
            if (this.f4599d != 0) {
                this.f4598c.setTranslationY(0.0f);
            }
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4600e.setListener(null);
            DefaultItemAnimator.this.dispatchMoveFinished(this.f4596a);
            DefaultItemAnimator.this.mMoveAnimations.remove(this.f4596a);
            DefaultItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchMoveStarting(this.f4596a);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$g */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1736g extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ChangeInfo f4602a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4603b;

        /* renamed from: c */
        final /* synthetic */ View f4604c;

        C1736g(ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4602a = changeInfo;
            this.f4603b = viewPropertyAnimator;
            this.f4604c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4603b.setListener(null);
            this.f4604c.setAlpha(1.0f);
            this.f4604c.setTranslationX(0.0f);
            this.f4604c.setTranslationY(0.0f);
            DefaultItemAnimator.this.dispatchChangeFinished(this.f4602a.f4576a, true);
            DefaultItemAnimator.this.mChangeAnimations.remove(this.f4602a.f4576a);
            DefaultItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchChangeStarting(this.f4602a.f4576a, true);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$h */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public class C1737h extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ChangeInfo f4606a;

        /* renamed from: b */
        final /* synthetic */ ViewPropertyAnimator f4607b;

        /* renamed from: c */
        final /* synthetic */ View f4608c;

        C1737h(ChangeInfo changeInfo, ViewPropertyAnimator viewPropertyAnimator, View view) {
            this.f4606a = changeInfo;
            this.f4607b = viewPropertyAnimator;
            this.f4608c = view;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            this.f4607b.setListener(null);
            this.f4608c.setAlpha(1.0f);
            this.f4608c.setTranslationX(0.0f);
            this.f4608c.setTranslationY(0.0f);
            DefaultItemAnimator.this.dispatchChangeFinished(this.f4606a.f4577b, false);
            DefaultItemAnimator.this.mChangeAnimations.remove(this.f4606a.f4577b);
            DefaultItemAnimator.this.dispatchFinishedWhenDone();
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationStart(Animator animator) {
            DefaultItemAnimator.this.dispatchChangeStarting(this.f4606a.f4577b, false);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: androidx.recyclerview.widget.DefaultItemAnimator$i */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class C1738i {

        /* renamed from: a */
        public RecyclerView.ViewHolder f4610a;

        /* renamed from: b */
        public int f4611b;

        /* renamed from: c */
        public int f4612c;

        /* renamed from: d */
        public int f4613d;

        /* renamed from: e */
        public int f4614e;

        C1738i(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
            this.f4610a = viewHolder;
            this.f4611b = i;
            this.f4612c = i2;
            this.f4613d = i3;
            this.f4614e = i4;
        }
    }

    private void animateRemoveImpl(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mRemoveAnimations.add(viewHolder);
        animate.setDuration(getRemoveDuration()).alpha(0.0f).setListener(new C1733d(viewHolder, animate, view)).start();
    }

    private void endChangeAnimation(List<ChangeInfo> list, RecyclerView.ViewHolder viewHolder) {
        for (int size = list.size() - 1; size >= 0; size--) {
            ChangeInfo changeInfo = list.get(size);
            if (endChangeAnimationIfNecessary(changeInfo, viewHolder) && changeInfo.f4576a == null && changeInfo.f4577b == null) {
                list.remove(changeInfo);
            }
        }
    }

    private void endChangeAnimationIfNecessary(ChangeInfo changeInfo) {
        RecyclerView.ViewHolder viewHolder = changeInfo.f4576a;
        if (viewHolder != null) {
            endChangeAnimationIfNecessary(changeInfo, viewHolder);
        }
        RecyclerView.ViewHolder viewHolder2 = changeInfo.f4577b;
        if (viewHolder2 != null) {
            endChangeAnimationIfNecessary(changeInfo, viewHolder2);
        }
    }

    private void resetAnimation(RecyclerView.ViewHolder viewHolder) {
        if (sDefaultInterpolator == null) {
            sDefaultInterpolator = new ValueAnimator().getInterpolator();
        }
        viewHolder.itemView.animate().setInterpolator(sDefaultInterpolator);
        endAnimation(viewHolder);
    }

    @Override // androidx.recyclerview.widget.AbstractC1812m
    public boolean animateAdd(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        viewHolder.itemView.setAlpha(0.0f);
        this.mPendingAdditions.add(viewHolder);
        return true;
    }

    void animateAddImpl(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        ViewPropertyAnimator animate = view.animate();
        this.mAddAnimations.add(viewHolder);
        animate.alpha(1.0f).setDuration(getAddDuration()).setListener(new C1734e(viewHolder, view, animate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC1812m
    public boolean animateChange(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
        if (viewHolder == viewHolder2) {
            return animateMove(viewHolder, i, i2, i3, i4);
        }
        float translationX = viewHolder.itemView.getTranslationX();
        float translationY = viewHolder.itemView.getTranslationY();
        float alpha = viewHolder.itemView.getAlpha();
        resetAnimation(viewHolder);
        int i5 = (int) ((i3 - i) - translationX);
        int i6 = (int) ((i4 - i2) - translationY);
        viewHolder.itemView.setTranslationX(translationX);
        viewHolder.itemView.setTranslationY(translationY);
        viewHolder.itemView.setAlpha(alpha);
        if (viewHolder2 != null) {
            resetAnimation(viewHolder2);
            viewHolder2.itemView.setTranslationX(-i5);
            viewHolder2.itemView.setTranslationY(-i6);
            viewHolder2.itemView.setAlpha(0.0f);
        }
        this.mPendingChanges.add(new ChangeInfo(viewHolder, viewHolder2, i, i2, i3, i4));
        return true;
    }

    void animateChangeImpl(ChangeInfo changeInfo) {
        View view;
        RecyclerView.ViewHolder viewHolder = changeInfo.f4576a;
        View view2 = null;
        if (viewHolder == null) {
            view = null;
        } else {
            view = viewHolder.itemView;
        }
        RecyclerView.ViewHolder viewHolder2 = changeInfo.f4577b;
        if (viewHolder2 != null) {
            view2 = viewHolder2.itemView;
        }
        if (view != null) {
            ViewPropertyAnimator duration = view.animate().setDuration(getChangeDuration());
            this.mChangeAnimations.add(changeInfo.f4576a);
            duration.translationX(changeInfo.f4580e - changeInfo.f4578c);
            duration.translationY(changeInfo.f4581f - changeInfo.f4579d);
            duration.alpha(0.0f).setListener(new C1736g(changeInfo, duration, view)).start();
        }
        if (view2 != null) {
            ViewPropertyAnimator animate = view2.animate();
            this.mChangeAnimations.add(changeInfo.f4577b);
            animate.translationX(0.0f).translationY(0.0f).setDuration(getChangeDuration()).alpha(1.0f).setListener(new C1737h(changeInfo, animate, view2)).start();
        }
    }

    @Override // androidx.recyclerview.widget.AbstractC1812m
    public boolean animateMove(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int translationX = i + ((int) view.getTranslationX());
        int translationY = i2 + ((int) viewHolder.itemView.getTranslationY());
        resetAnimation(viewHolder);
        int i5 = i3 - translationX;
        int i6 = i4 - translationY;
        if (i5 == 0 && i6 == 0) {
            dispatchMoveFinished(viewHolder);
            return false;
        }
        if (i5 != 0) {
            view.setTranslationX(-i5);
        }
        if (i6 != 0) {
            view.setTranslationY(-i6);
        }
        this.mPendingMoves.add(new C1738i(viewHolder, translationX, translationY, i3, i4));
        return true;
    }

    void animateMoveImpl(RecyclerView.ViewHolder viewHolder, int i, int i2, int i3, int i4) {
        View view = viewHolder.itemView;
        int i5 = i3 - i;
        int i6 = i4 - i2;
        if (i5 != 0) {
            view.animate().translationX(0.0f);
        }
        if (i6 != 0) {
            view.animate().translationY(0.0f);
        }
        ViewPropertyAnimator animate = view.animate();
        this.mMoveAnimations.add(viewHolder);
        animate.setDuration(getMoveDuration()).setListener(new C1735f(viewHolder, i5, view, i6, animate)).start();
    }

    @Override // androidx.recyclerview.widget.AbstractC1812m
    public boolean animateRemove(RecyclerView.ViewHolder viewHolder) {
        resetAnimation(viewHolder);
        this.mPendingRemovals.add(viewHolder);
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean canReuseUpdatedViewHolder(RecyclerView.ViewHolder viewHolder, List<Object> list) {
        return !list.isEmpty() || super.canReuseUpdatedViewHolder(viewHolder, list);
    }

    void cancelAll(List<RecyclerView.ViewHolder> list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            list.get(size).itemView.animate().cancel();
        }
    }

    void dispatchFinishedWhenDone() {
        if (!isRunning()) {
            dispatchAnimationsFinished();
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimation(RecyclerView.ViewHolder viewHolder) {
        View view = viewHolder.itemView;
        view.animate().cancel();
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            } else if (this.mPendingMoves.get(size).f4610a == viewHolder) {
                view.setTranslationY(0.0f);
                view.setTranslationX(0.0f);
                dispatchMoveFinished(viewHolder);
                this.mPendingMoves.remove(size);
            }
        }
        endChangeAnimation(this.mPendingChanges, viewHolder);
        if (this.mPendingRemovals.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchRemoveFinished(viewHolder);
        }
        if (this.mPendingAdditions.remove(viewHolder)) {
            view.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
        }
        for (int size2 = this.mChangesList.size() - 1; size2 >= 0; size2--) {
            ArrayList<ChangeInfo> arrayList = this.mChangesList.get(size2);
            endChangeAnimation(arrayList, viewHolder);
            if (arrayList.isEmpty()) {
                this.mChangesList.remove(size2);
            }
        }
        for (int size3 = this.mMovesList.size() - 1; size3 >= 0; size3--) {
            ArrayList<C1738i> arrayList2 = this.mMovesList.get(size3);
            int size4 = arrayList2.size() - 1;
            while (true) {
                if (size4 < 0) {
                    break;
                } else if (arrayList2.get(size4).f4610a == viewHolder) {
                    view.setTranslationY(0.0f);
                    view.setTranslationX(0.0f);
                    dispatchMoveFinished(viewHolder);
                    arrayList2.remove(size4);
                    if (arrayList2.isEmpty()) {
                        this.mMovesList.remove(size3);
                    }
                } else {
                    size4--;
                }
            }
        }
        for (int size5 = this.mAdditionsList.size() - 1; size5 >= 0; size5--) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = this.mAdditionsList.get(size5);
            if (arrayList3.remove(viewHolder)) {
                view.setAlpha(1.0f);
                dispatchAddFinished(viewHolder);
                if (arrayList3.isEmpty()) {
                    this.mAdditionsList.remove(size5);
                }
            }
        }
        this.mRemoveAnimations.remove(viewHolder);
        this.mAddAnimations.remove(viewHolder);
        this.mChangeAnimations.remove(viewHolder);
        this.mMoveAnimations.remove(viewHolder);
        dispatchFinishedWhenDone();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void endAnimations() {
        int size = this.mPendingMoves.size();
        while (true) {
            size--;
            if (size < 0) {
                break;
            }
            C1738i c1738i = this.mPendingMoves.get(size);
            View view = c1738i.f4610a.itemView;
            view.setTranslationY(0.0f);
            view.setTranslationX(0.0f);
            dispatchMoveFinished(c1738i.f4610a);
            this.mPendingMoves.remove(size);
        }
        for (int size2 = this.mPendingRemovals.size() - 1; size2 >= 0; size2--) {
            dispatchRemoveFinished(this.mPendingRemovals.get(size2));
            this.mPendingRemovals.remove(size2);
        }
        int size3 = this.mPendingAdditions.size();
        while (true) {
            size3--;
            if (size3 < 0) {
                break;
            }
            RecyclerView.ViewHolder viewHolder = this.mPendingAdditions.get(size3);
            viewHolder.itemView.setAlpha(1.0f);
            dispatchAddFinished(viewHolder);
            this.mPendingAdditions.remove(size3);
        }
        for (int size4 = this.mPendingChanges.size() - 1; size4 >= 0; size4--) {
            endChangeAnimationIfNecessary(this.mPendingChanges.get(size4));
        }
        this.mPendingChanges.clear();
        if (!isRunning()) {
            return;
        }
        for (int size5 = this.mMovesList.size() - 1; size5 >= 0; size5--) {
            ArrayList<C1738i> arrayList = this.mMovesList.get(size5);
            for (int size6 = arrayList.size() - 1; size6 >= 0; size6--) {
                C1738i c1738i2 = arrayList.get(size6);
                View view2 = c1738i2.f4610a.itemView;
                view2.setTranslationY(0.0f);
                view2.setTranslationX(0.0f);
                dispatchMoveFinished(c1738i2.f4610a);
                arrayList.remove(size6);
                if (arrayList.isEmpty()) {
                    this.mMovesList.remove(arrayList);
                }
            }
        }
        for (int size7 = this.mAdditionsList.size() - 1; size7 >= 0; size7--) {
            ArrayList<RecyclerView.ViewHolder> arrayList2 = this.mAdditionsList.get(size7);
            for (int size8 = arrayList2.size() - 1; size8 >= 0; size8--) {
                RecyclerView.ViewHolder viewHolder2 = arrayList2.get(size8);
                viewHolder2.itemView.setAlpha(1.0f);
                dispatchAddFinished(viewHolder2);
                arrayList2.remove(size8);
                if (arrayList2.isEmpty()) {
                    this.mAdditionsList.remove(arrayList2);
                }
            }
        }
        for (int size9 = this.mChangesList.size() - 1; size9 >= 0; size9--) {
            ArrayList<ChangeInfo> arrayList3 = this.mChangesList.get(size9);
            for (int size10 = arrayList3.size() - 1; size10 >= 0; size10--) {
                endChangeAnimationIfNecessary(arrayList3.get(size10));
                if (arrayList3.isEmpty()) {
                    this.mChangesList.remove(arrayList3);
                }
            }
        }
        cancelAll(this.mRemoveAnimations);
        cancelAll(this.mMoveAnimations);
        cancelAll(this.mAddAnimations);
        cancelAll(this.mChangeAnimations);
        dispatchAnimationsFinished();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public boolean isRunning() {
        if (this.mPendingAdditions.isEmpty() && this.mPendingChanges.isEmpty() && this.mPendingMoves.isEmpty() && this.mPendingRemovals.isEmpty() && this.mMoveAnimations.isEmpty() && this.mRemoveAnimations.isEmpty() && this.mAddAnimations.isEmpty() && this.mChangeAnimations.isEmpty() && this.mMovesList.isEmpty() && this.mAdditionsList.isEmpty() && this.mChangesList.isEmpty()) {
            return false;
        }
        return true;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.ItemAnimator
    public void runPendingAnimations() {
        long j;
        long j2;
        boolean z = !this.mPendingRemovals.isEmpty();
        boolean z2 = !this.mPendingMoves.isEmpty();
        boolean z3 = !this.mPendingChanges.isEmpty();
        boolean z4 = !this.mPendingAdditions.isEmpty();
        if (!z && !z2 && !z4 && !z3) {
            return;
        }
        Iterator<RecyclerView.ViewHolder> it = this.mPendingRemovals.iterator();
        while (it.hasNext()) {
            animateRemoveImpl(it.next());
        }
        this.mPendingRemovals.clear();
        if (z2) {
            ArrayList<C1738i> arrayList = new ArrayList<>();
            arrayList.addAll(this.mPendingMoves);
            this.mMovesList.add(arrayList);
            this.mPendingMoves.clear();
            RunnableC1730a runnableC1730a = new RunnableC1730a(arrayList);
            if (z) {
                C1365w0.m37199j0(arrayList.get(0).f4610a.itemView, runnableC1730a, getRemoveDuration());
            } else {
                runnableC1730a.run();
            }
        }
        if (z3) {
            ArrayList<ChangeInfo> arrayList2 = new ArrayList<>();
            arrayList2.addAll(this.mPendingChanges);
            this.mChangesList.add(arrayList2);
            this.mPendingChanges.clear();
            RunnableC1731b runnableC1731b = new RunnableC1731b(arrayList2);
            if (z) {
                C1365w0.m37199j0(arrayList2.get(0).f4576a.itemView, runnableC1731b, getRemoveDuration());
            } else {
                runnableC1731b.run();
            }
        }
        if (z4) {
            ArrayList<RecyclerView.ViewHolder> arrayList3 = new ArrayList<>();
            arrayList3.addAll(this.mPendingAdditions);
            this.mAdditionsList.add(arrayList3);
            this.mPendingAdditions.clear();
            RunnableC1732c runnableC1732c = new RunnableC1732c(arrayList3);
            if (!z && !z2 && !z3) {
                runnableC1732c.run();
                return;
            }
            long j3 = 0;
            if (z) {
                j = getRemoveDuration();
            } else {
                j = 0;
            }
            if (z2) {
                j2 = getMoveDuration();
            } else {
                j2 = 0;
            }
            if (z3) {
                j3 = getChangeDuration();
            }
            C1365w0.m37199j0(arrayList3.get(0).itemView, runnableC1732c, j + Math.max(j2, j3));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static class ChangeInfo {

        /* renamed from: a */
        public RecyclerView.ViewHolder f4576a;

        /* renamed from: b */
        public RecyclerView.ViewHolder f4577b;

        /* renamed from: c */
        public int f4578c;

        /* renamed from: d */
        public int f4579d;

        /* renamed from: e */
        public int f4580e;

        /* renamed from: f */
        public int f4581f;

        private ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2) {
            this.f4576a = viewHolder;
            this.f4577b = viewHolder2;
        }

        public String toString() {
            return "ChangeInfo{oldHolder=" + this.f4576a + ", newHolder=" + this.f4577b + ", fromX=" + this.f4578c + ", fromY=" + this.f4579d + ", toX=" + this.f4580e + ", toY=" + this.f4581f + '}';
        }

        ChangeInfo(RecyclerView.ViewHolder viewHolder, RecyclerView.ViewHolder viewHolder2, int i, int i2, int i3, int i4) {
            this(viewHolder, viewHolder2);
            this.f4578c = i;
            this.f4579d = i2;
            this.f4580e = i3;
            this.f4581f = i4;
        }
    }

    private boolean endChangeAnimationIfNecessary(ChangeInfo changeInfo, RecyclerView.ViewHolder viewHolder) {
        boolean z = false;
        if (changeInfo.f4577b == viewHolder) {
            changeInfo.f4577b = null;
        } else if (changeInfo.f4576a != viewHolder) {
            return false;
        } else {
            changeInfo.f4576a = null;
            z = true;
        }
        viewHolder.itemView.setAlpha(1.0f);
        viewHolder.itemView.setTranslationX(0.0f);
        viewHolder.itemView.setTranslationY(0.0f);
        dispatchChangeFinished(viewHolder, z);
        return true;
    }
}

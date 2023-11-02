package p176ja;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import java.util.List;

/* renamed from: ja.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C8879b {
    /* renamed from: a */
    public static void m17109a(AnimatorSet animatorSet, List<Animator> list) {
        int size = list.size();
        long j = 0;
        for (int i = 0; i < size; i++) {
            Animator animator = list.get(i);
            j = Math.max(j, animator.getStartDelay() + animator.getDuration());
        }
        ValueAnimator ofInt = ValueAnimator.ofInt(0, 0);
        ofInt.setDuration(j);
        list.add(0, ofInt);
        animatorSet.playTogether(list);
    }
}
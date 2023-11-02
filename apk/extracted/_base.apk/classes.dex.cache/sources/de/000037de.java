package p162ij;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import p162ij.AbstractC7626a;
import p162ij.InterfaceC7671w;

/* renamed from: ij.b */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public abstract class AbstractC7629b<U extends InterfaceC7671w, P extends AbstractC7626a<U>> implements InterfaceC7652j0<U, P>, Comparator<U> {

    /* renamed from: j */
    private final List<U> f20932j;

    /* renamed from: k */
    private final boolean f20933k;

    public AbstractC7629b(boolean z, U... uArr) {
        this(Arrays.asList(uArr), z);
    }

    @Override // java.util.Comparator
    /* renamed from: b */
    public int compare(U u, U u2) {
        return Double.compare(u2.getLength(), u.getLength());
    }

    private AbstractC7629b(List<U> list, boolean z) {
        if (!list.isEmpty()) {
            Collections.sort(list, this);
            int size = list.size();
            int i = 0;
            while (i < size) {
                U u = list.get(i);
                i++;
                for (int i2 = i; i2 < size; i2++) {
                    if (u.equals(list.get(i2))) {
                        throw new IllegalArgumentException("Duplicate unit: " + u);
                    }
                }
            }
            this.f20932j = Collections.unmodifiableList(list);
            this.f20933k = z;
            return;
        }
        throw new IllegalArgumentException("Missing units.");
    }
}
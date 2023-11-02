package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import cg.InterfaceC2533a;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.C9612q;
import kotlin.sequences.Sequence;
import p164j$.util.Iterator;
import p164j$.util.function.Consumer;

@Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a\u0013\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u0086\u0002\"\u001b\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00020\u0004*\u00020\u00008F¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, m14357d2 = {"Landroid/view/ViewGroup;", "", "Landroid/view/View;", "b", "Lkotlin/sequences/Sequence;", "a", "(Landroid/view/ViewGroup;)Lkotlin/sequences/Sequence;", "children", "core-ktx_release"}, m14356k = 2, m14355mv = {1, 8, 0})
/* renamed from: androidx.core.view.k2 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
public final class C1285k2 {

    @Metadata(m14358d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010)\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00020\u0003H\u0096\u0002¨\u0006\u0005"}, m14357d2 = {"androidx/core/view/k2$a", "Lkotlin/sequences/Sequence;", "Landroid/view/View;", "", "iterator", "core-ktx_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: androidx.core.view.k2$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1286a implements Sequence<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f3646a;

        C1286a(ViewGroup viewGroup) {
            this.f3646a = viewGroup;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<View> iterator() {
            return C1285k2.m37418b(this.f3646a);
        }
    }

    @Metadata(m14358d1 = {"\u0000#\n\u0000\n\u0002\u0010)\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\t\u0010\u0004\u001a\u00020\u0003H\u0096\u0002J\t\u0010\u0005\u001a\u00020\u0002H\u0096\u0002J\b\u0010\u0007\u001a\u00020\u0006H\u0016R\u0016\u0010\u000b\u001a\u00020\b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\f"}, m14357d2 = {"androidx/core/view/k2$b", "", "Landroid/view/View;", "", "hasNext", "a", "", "remove", "", "j", "I", "index", "core-ktx_release"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: androidx.core.view.k2$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes.dex */
    public static final class C1287b implements Iterator<View>, InterfaceC2533a, p164j$.util.Iterator {

        /* renamed from: j */
        private int f3647j;

        /* renamed from: k */
        final /* synthetic */ ViewGroup f3648k;

        C1287b(ViewGroup viewGroup) {
            this.f3648k = viewGroup;
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        /* renamed from: a */
        public View next() {
            ViewGroup viewGroup = this.f3648k;
            int i = this.f3647j;
            this.f3647j = i + 1;
            View childAt = viewGroup.getChildAt(i);
            if (childAt != null) {
                return childAt;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // p164j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer<? super View> consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public boolean hasNext() {
            return this.f3647j < this.f3648k.getChildCount();
        }

        @Override // java.util.Iterator, p164j$.util.Iterator
        public void remove() {
            ViewGroup viewGroup = this.f3648k;
            int i = this.f3647j - 1;
            this.f3647j = i;
            viewGroup.removeViewAt(i);
        }
    }

    /* renamed from: a */
    public static final Sequence<View> m37419a(ViewGroup viewGroup) {
        C9612q.m13917h(viewGroup, "<this>");
        return new C1286a(viewGroup);
    }

    /* renamed from: b */
    public static final java.util.Iterator<View> m37418b(ViewGroup viewGroup) {
        C9612q.m13917h(viewGroup, "<this>");
        return new C1287b(viewGroup);
    }
}
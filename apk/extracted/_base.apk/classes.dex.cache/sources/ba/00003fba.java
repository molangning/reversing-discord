package kotlin.collections;

import com.facebook.react.uimanager.ViewProps;
import gg.C6759j;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.C9643g;
import p304qf.C11880m;
import p304qf.C11881n;
import p304qf.C11888u;
import pf.C11591x;

@Metadata(m14358d1 = {"\u0000¼\u0001\n\u0000\n\u0002\u0010\u001c\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u001f\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0002\u0010\u0018\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\r\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a(\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u001d\u0010\u0006\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u001d\u0010\u0000\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0000\u0010\t\u001a\u001f\u0010\n\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\n\u0010\u0007\u001a\u001f\u0010\u000b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u000b\u0010\t\u001a'\u0010\u000e\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000f\u001a%\u0010\u0010\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0010\u0010\u0011\u001a%\u0010\u0012\u001a\u00020\f\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u0012\u0010\u0013\u001a\u001d\u0010\u0014\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0014\u0010\u0007\u001a\u001d\u0010\u0015\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0015\u0010\t\u001a\u001f\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0016\u0010\u0007\u001a\u001f\u0010\u0017\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0017\u0010\t\u001a\u001d\u0010\u0018\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0018\u0010\u0007\u001a\u001d\u0010\u0019\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u0019\u0010\t\u001a\u001f\u0010\u001a\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u001a\u0010\u0007\u001a\u001f\u0010\u001b\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b¢\u0006\u0004\b\u001b\u0010\t\u001a$\u0010\u001d\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001c\u001a\u00020\f\u001a$\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001c\u001a\u00020\f\u001a6\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001fH\u0086\bø\u0001\u0000\u001a\"\u0010#\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\b\b\u0000\u0010\u0000*\u00020\"*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00000\u0001\u001a=\u0010'\u001a\u00028\u0000\"\u0010\b\u0000\u0010%*\n\u0012\u0006\b\u0000\u0012\u00028\u00010$\"\b\b\u0001\u0010\u0000*\u00020\"*\n\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010&\u001a\u00028\u0000¢\u0006\u0004\b'\u0010(\u001a$\u0010+\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010*\u001a\u00020)\u001a$\u0010,\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u001c\u001a\u00020\f\u001a$\u0010-\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\b2\u0006\u0010\u001c\u001a\u00020\f\u001a&\u0010/\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000.*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a8\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u001a\u00102\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u000000j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`1\u001a\u0010\u00106\u001a\u000205*\b\u0012\u0004\u0012\u00020\u000304\u001a\u0010\u00108\u001a\u000207*\b\u0012\u0004\u0012\u00020\f04\u001a7\u00109\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010%*\n\u0012\u0006\b\u0000\u0012\u00028\u00000$*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010&\u001a\u00028\u0001¢\u0006\u0004\b9\u0010(\u001a&\u0010<\u001a\u0012\u0012\u0004\u0012\u00028\u00000:j\b\u0012\u0004\u0012\u00028\u0000`;\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010=\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010?\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010@\u001a\b\u0012\u0004\u0012\u00028\u00000>\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u000004\u001a\u001c\u0010B\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a<\u0010D\u001a\b\u0012\u0004\u0012\u00028\u00010\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010C\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u001fH\u0086\bø\u0001\u0000\u001a\"\u0010F\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000E0\u0001\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a\u001c\u0010G\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010I\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a\u001c\u0010K\u001a\b\u0012\u0004\u0012\u00028\u00000J\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u001a-\u0010L\u001a\b\u0012\u0004\u0012\u00028\u00000A\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0004\u001a0\u0010M\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0012\u0010 \u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020\u00030\u001fH\u0086\bø\u0001\u0000\u001a+\u0010N\u001a\u0004\u0018\u00018\u0000\"\u000e\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000.*\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0007¢\u0006\u0004\bN\u0010O\u001a.\u0010P\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bP\u0010Q\u001a.\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bR\u0010Q\u001a.\u0010S\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000042\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\bS\u0010T\u001a-\u0010V\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001a-\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00000\b\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u0000042\f\u0010U\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001H\u0086\u0002\u001aH\u0010Z\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Y0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00012\u000e\u0010H\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010XH\u0086\u0004¢\u0006\u0004\bZ\u0010[\u001a?\u0010\\\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010Y0\b\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010'*\b\u0012\u0004\u0012\u00028\u00000\u00012\f\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00010\u0001H\u0086\u0004\u001a}\u0010g\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010_*\u00060]j\u0002`^*\b\u0012\u0004\u0012\u00028\u00000\u00012\u0006\u0010`\u001a\u00028\u00012\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020a2\b\b\u0002\u0010d\u001a\u00020a2\b\b\u0002\u0010e\u001a\u00020\f2\b\b\u0002\u0010f\u001a\u00020a2\u0016\b\u0002\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020a\u0018\u00010\u001f¢\u0006\u0004\bg\u0010h\u001a`\u0010j\u001a\u00020i\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u00012\b\b\u0002\u0010b\u001a\u00020a2\b\b\u0002\u0010c\u001a\u00020a2\b\b\u0002\u0010d\u001a\u00020a2\b\b\u0002\u0010e\u001a\u00020\f2\b\b\u0002\u0010f\u001a\u00020a2\u0016\b\u0002\u0010C\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020a\u0018\u00010\u001f\u001a\u001c\u0010l\u001a\b\u0012\u0004\u0012\u00028\u00000k\"\u0004\b\u0000\u0010\u0000*\b\u0012\u0004\u0012\u00028\u00000\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006m"}, m14357d2 = {"T", "", "element", "", "L", "(Ljava/lang/Iterable;Ljava/lang/Object;)Z", "S", "(Ljava/lang/Iterable;)Ljava/lang/Object;", "", "(Ljava/util/List;)Ljava/lang/Object;", "U", "V", "", "index", "W", "(Ljava/util/List;I)Ljava/lang/Object;", "X", "(Ljava/lang/Iterable;Ljava/lang/Object;)I", "Y", "(Ljava/util/List;Ljava/lang/Object;)I", "e0", "f0", "g0", "h0", "p0", "q0", "r0", "s0", "n", "N", "O", "Lkotlin/Function1;", "predicate", "P", "", "Q", "", "C", "destination", "R", "(Ljava/lang/Iterable;Ljava/util/Collection;)Ljava/util/Collection;", "Lkotlin/ranges/IntRange;", "indices", "t0", "w0", "x0", "", "u0", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "v0", "", "", "y0", "", "B0", "z0", "Ljava/util/HashSet;", "Lkotlin/collections/HashSet;", "A0", "C0", "", "D0", "E0", "", "G0", ViewProps.TRANSFORM, "i0", "Lqf/m;", "I0", "M", "other", "Z", "", "F0", "H0", "J", "j0", "(Ljava/lang/Iterable;)Ljava/lang/Comparable;", "k0", "(Ljava/lang/Iterable;Ljava/lang/Object;)Ljava/util/List;", "m0", "o0", "(Ljava/util/Collection;Ljava/lang/Object;)Ljava/util/List;", "elements", "l0", "n0", "", "Lkotlin/Pair;", "K0", "(Ljava/lang/Iterable;[Ljava/lang/Object;)Ljava/util/List;", "J0", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "A", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "a0", "(Ljava/lang/Iterable;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "c0", "Lkotlin/sequences/Sequence;", "K", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/CollectionsKt")
/* renamed from: kotlin.collections.r */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9553r extends C9552q {

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"kotlin/collections/r$a", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.collections.r$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9554a<T> implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Iterable f25314a;

        public C9554a(Iterable iterable) {
            this.f25314a = iterable;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return this.f25314a.iterator();
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.collections.r$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9555b<T> extends AbstractC9614s implements Function0<Iterator<? extends T>> {

        /* renamed from: j */
        final /* synthetic */ Iterable<T> f25315j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        C9555b(Iterable<? extends T> iterable) {
            super(0);
            this.f25315j = iterable;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return this.f25315j.iterator();
        }
    }

    /* renamed from: A0 */
    public static <T> HashSet<T> m14077A0(Iterable<? extends T> iterable) {
        int m14093t;
        int m6758d;
        C9612q.m13917h(iterable, "<this>");
        m14093t = C9546k.m14093t(iterable, 12);
        m6758d = C11888u.m6758d(m14093t);
        return (HashSet) m14024z0(iterable, new HashSet(m6758d));
    }

    /* renamed from: B0 */
    public static int[] m14076B0(Collection<Integer> collection) {
        C9612q.m13917h(collection, "<this>");
        int[] iArr = new int[collection.size()];
        int i = 0;
        for (Integer num : collection) {
            iArr[i] = num.intValue();
            i++;
        }
        return iArr;
    }

    /* renamed from: C0 */
    public static <T> List<T> m14075C0(Iterable<? extends T> iterable) {
        List<T> m14097p;
        List<T> m14104i;
        Object next;
        List<T> m14109d;
        List<T> m14073E0;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    m14073E0 = m14073E0(collection);
                    return m14073E0;
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                m14109d = C9544i.m14109d(next);
                return m14109d;
            }
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        m14097p = C9545j.m14097p(m14074D0(iterable));
        return m14097p;
    }

    /* renamed from: D0 */
    public static final <T> List<T> m14074D0(Iterable<? extends T> iterable) {
        List<T> m14073E0;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            m14073E0 = m14073E0((Collection) iterable);
            return m14073E0;
        }
        return (List) m14024z0(iterable, new ArrayList());
    }

    /* renamed from: E0 */
    public static <T> List<T> m14073E0(Collection<? extends T> collection) {
        C9612q.m13917h(collection, "<this>");
        return new ArrayList(collection);
    }

    /* renamed from: F0 */
    public static <T> Set<T> m14072F0(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return new LinkedHashSet((Collection) iterable);
        }
        return (Set) m14024z0(iterable, new LinkedHashSet());
    }

    /* renamed from: G0 */
    public static <T> Set<T> m14071G0(Iterable<? extends T> iterable) {
        Set<T> m14007d;
        Object next;
        Set<T> m14008c;
        int m6758d;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            int size = collection.size();
            if (size != 0) {
                if (size != 1) {
                    m6758d = C11888u.m6758d(collection.size());
                    return (Set) m14024z0(iterable, new LinkedHashSet(m6758d));
                }
                if (iterable instanceof List) {
                    next = ((List) iterable).get(0);
                } else {
                    next = iterable.iterator().next();
                }
                m14008c = C9559v.m14008c(next);
                return m14008c;
            }
            m14007d = C9560w.m14007d();
            return m14007d;
        }
        return C9560w.m14003h((Set) m14024z0(iterable, new LinkedHashSet()));
    }

    /* renamed from: H0 */
    public static <T> Set<T> m14070H0(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Set<T> m14072F0;
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(other, "other");
        m14072F0 = m14072F0(iterable);
        C9550o.m14085y(m14072F0, other);
        return m14072F0;
    }

    /* renamed from: I0 */
    public static <T> Iterable<C11880m<T>> m14069I0(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        return new C11881n(new C9555b(iterable));
    }

    /* renamed from: J */
    public static <T> boolean m14068J(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(predicate, "predicate");
        if ((iterable instanceof Collection) && ((Collection) iterable).isEmpty()) {
            return true;
        }
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            if (!predicate.invoke((T) it.next()).booleanValue()) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: J0 */
    public static <T, R> List<Pair<T, R>> m14067J0(Iterable<? extends T> iterable, Iterable<? extends R> other) {
        int m14093t;
        int m14093t2;
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(other, "other");
        Iterator<? extends T> it = iterable.iterator();
        Iterator<? extends R> it2 = other.iterator();
        m14093t = C9546k.m14093t(iterable, 10);
        m14093t2 = C9546k.m14093t(other, 10);
        ArrayList arrayList = new ArrayList(Math.min(m14093t, m14093t2));
        while (it.hasNext() && it2.hasNext()) {
            arrayList.add(C11591x.m7577a(it.next(), it2.next()));
        }
        return arrayList;
    }

    /* renamed from: K */
    public static <T> Sequence<T> m14066K(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        return new C9554a(iterable);
    }

    /* renamed from: K0 */
    public static <T, R> List<Pair<T, R>> m14065K0(Iterable<? extends T> iterable, R[] other) {
        int m14093t;
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(other, "other");
        int length = other.length;
        m14093t = C9546k.m14093t(iterable, 10);
        ArrayList arrayList = new ArrayList(Math.min(m14093t, length));
        int i = 0;
        for (T t : iterable) {
            if (i >= length) {
                break;
            }
            arrayList.add(C11591x.m7577a(t, other[i]));
            i++;
        }
        return arrayList;
    }

    /* renamed from: L */
    public static <T> boolean m14064L(Iterable<? extends T> iterable, T t) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(t);
        }
        if (m14052X(iterable, t) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    public static <T> List<T> m14063M(Iterable<? extends T> iterable) {
        Set m14072F0;
        List<T> m14075C0;
        C9612q.m13917h(iterable, "<this>");
        m14072F0 = m14072F0(iterable);
        m14075C0 = m14075C0(m14072F0);
        return m14075C0;
    }

    /* renamed from: N */
    public static <T> List<T> m14062N(Iterable<? extends T> iterable, int i) {
        boolean z;
        ArrayList arrayList;
        List<T> m14097p;
        Object m14045e0;
        List<T> m14109d;
        List<T> m14104i;
        List<T> m14075C0;
        C9612q.m13917h(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                m14075C0 = m14075C0(iterable);
                return m14075C0;
            }
            if (iterable instanceof Collection) {
                Collection collection = (Collection) iterable;
                int size = collection.size() - i;
                if (size <= 0) {
                    m14104i = C9545j.m14104i();
                    return m14104i;
                } else if (size == 1) {
                    m14045e0 = m14045e0(iterable);
                    m14109d = C9544i.m14109d(m14045e0);
                    return m14109d;
                } else {
                    arrayList = new ArrayList(size);
                    if (iterable instanceof List) {
                        if (iterable instanceof RandomAccess) {
                            int size2 = collection.size();
                            while (i < size2) {
                                arrayList.add(((List) iterable).get(i));
                                i++;
                            }
                        } else {
                            ListIterator listIterator = ((List) iterable).listIterator(i);
                            while (listIterator.hasNext()) {
                                arrayList.add(listIterator.next());
                            }
                        }
                        return arrayList;
                    }
                }
            } else {
                arrayList = new ArrayList();
            }
            for (T t : iterable) {
                if (i2 >= i) {
                    arrayList.add(t);
                } else {
                    i2++;
                }
            }
            m14097p = C9545j.m14097p(arrayList);
            return m14097p;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: O */
    public static <T> List<T> m14061O(List<? extends T> list, int i) {
        boolean z;
        int m21930c;
        List<T> m14027w0;
        C9612q.m13917h(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m21930c = C6759j.m21930c(list.size() - i, 0);
            m14027w0 = m14027w0(list, m21930c);
            return m14027w0;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: P */
    public static <T> List<T> m14060P(Iterable<? extends T> iterable, Function1<? super T, Boolean> predicate) {
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(predicate, "predicate");
        ArrayList arrayList = new ArrayList();
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            Object obj = (T) it.next();
            if (predicate.invoke(obj).booleanValue()) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    /* renamed from: Q */
    public static <T> List<T> m14059Q(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        return (List) m14058R(iterable, new ArrayList());
    }

    /* renamed from: R */
    public static final <C extends Collection<? super T>, T> C m14058R(Iterable<? extends T> iterable, C destination) {
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(destination, "destination");
        for (T t : iterable) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    /* renamed from: S */
    public static <T> T m14057S(Iterable<? extends T> iterable) {
        Object m14056T;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof List) {
            m14056T = m14056T((List) iterable);
            return (T) m14056T;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            return it.next();
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: T */
    public static <T> T m14056T(List<? extends T> list) {
        C9612q.m13917h(list, "<this>");
        if (!list.isEmpty()) {
            return list.get(0);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: U */
    public static <T> T m14055U(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        return it.next();
    }

    /* renamed from: V */
    public static <T> T m14054V(List<? extends T> list) {
        C9612q.m13917h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(0);
    }

    /* renamed from: W */
    public static <T> T m14053W(List<? extends T> list, int i) {
        int m14102k;
        C9612q.m13917h(list, "<this>");
        if (i >= 0) {
            m14102k = C9545j.m14102k(list);
            if (i <= m14102k) {
                return list.get(i);
            }
        }
        return null;
    }

    /* renamed from: X */
    public static final <T> int m14052X(Iterable<? extends T> iterable, T t) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof List) {
            return ((List) iterable).indexOf(t);
        }
        int i = 0;
        for (T t2 : iterable) {
            if (i < 0) {
                C9545j.m14094s();
            }
            if (C9612q.m13922c(t, t2)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: Y */
    public static <T> int m14051Y(List<? extends T> list, T t) {
        C9612q.m13917h(list, "<this>");
        return list.indexOf(t);
    }

    /* renamed from: Z */
    public static <T> Set<T> m14050Z(Iterable<? extends T> iterable, Iterable<? extends T> other) {
        Set<T> m14072F0;
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(other, "other");
        m14072F0 = m14072F0(iterable);
        C9550o.m14086C(m14072F0, other);
        return m14072F0;
    }

    /* renamed from: a0 */
    public static final <T, A extends Appendable> A m14049a0(Iterable<? extends T> iterable, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(buffer, "buffer");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : iterable) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            C9643g.m13783a(buffer, t, function1);
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: b0 */
    public static /* synthetic */ Appendable m14048b0(Iterable iterable, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        CharSequence charSequence6;
        int i3;
        CharSequence charSequence7;
        Function1 function12;
        if ((i2 & 2) != 0) {
            charSequence5 = ", ";
        } else {
            charSequence5 = charSequence;
        }
        CharSequence charSequence8 = "";
        if ((i2 & 4) != 0) {
            charSequence6 = "";
        } else {
            charSequence6 = charSequence2;
        }
        if ((i2 & 8) == 0) {
            charSequence8 = charSequence3;
        }
        if ((i2 & 16) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 32) != 0) {
            charSequence7 = "...";
        } else {
            charSequence7 = charSequence4;
        }
        if ((i2 & 64) != 0) {
            function12 = null;
        } else {
            function12 = function1;
        }
        return m14049a0(iterable, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    /* renamed from: c0 */
    public static final <T> String m14047c0(Iterable<? extends T> iterable, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        String sb2 = ((StringBuilder) m14049a0(iterable, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9612q.m13918g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: d0 */
    public static /* synthetic */ String m14046d0(Iterable iterable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
        CharSequence charSequence5;
        if ((i2 & 1) != 0) {
            charSequence = ", ";
        }
        CharSequence charSequence6 = "";
        if ((i2 & 2) != 0) {
            charSequence5 = "";
        } else {
            charSequence5 = charSequence2;
        }
        if ((i2 & 4) == 0) {
            charSequence6 = charSequence3;
        }
        if ((i2 & 8) != 0) {
            i = -1;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            charSequence4 = "...";
        }
        CharSequence charSequence7 = charSequence4;
        if ((i2 & 32) != 0) {
            function1 = null;
        }
        return m14047c0(iterable, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: e0 */
    public static <T> T m14045e0(Iterable<? extends T> iterable) {
        Object m14044f0;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof List) {
            m14044f0 = m14044f0((List) iterable);
            return (T) m14044f0;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            while (it.hasNext()) {
                next = it.next();
            }
            return next;
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: f0 */
    public static <T> T m14044f0(List<? extends T> list) {
        int m14102k;
        C9612q.m13917h(list, "<this>");
        if (!list.isEmpty()) {
            m14102k = C9545j.m14102k(list);
            return list.get(m14102k);
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: g0 */
    public static <T> T m14043g0(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.isEmpty()) {
                return null;
            }
            return (T) list.get(list.size() - 1);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            next = it.next();
        }
        return next;
    }

    /* renamed from: h0 */
    public static <T> T m14042h0(List<? extends T> list) {
        C9612q.m13917h(list, "<this>");
        if (list.isEmpty()) {
            return null;
        }
        return list.get(list.size() - 1);
    }

    /* renamed from: i0 */
    public static <T, R> List<R> m14041i0(Iterable<? extends T> iterable, Function1<? super T, ? extends R> transform) {
        int m14093t;
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(transform, "transform");
        m14093t = C9546k.m14093t(iterable, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        Iterator<? extends T> it = iterable.iterator();
        while (it.hasNext()) {
            arrayList.add(transform.invoke((T) it.next()));
        }
        return arrayList;
    }

    /* renamed from: j0 */
    public static <T extends Comparable<? super T>> T m14040j0(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        while (it.hasNext()) {
            T next2 = it.next();
            if (next.compareTo(next2) > 0) {
                next = next2;
            }
        }
        return next;
    }

    /* renamed from: k0 */
    public static <T> List<T> m14039k0(Iterable<? extends T> iterable, T t) {
        int m14093t;
        C9612q.m13917h(iterable, "<this>");
        m14093t = C9546k.m14093t(iterable, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        boolean z = false;
        for (T t2 : iterable) {
            boolean z2 = true;
            if (!z && C9612q.m13922c(t2, t)) {
                z = true;
                z2 = false;
            }
            if (z2) {
                arrayList.add(t2);
            }
        }
        return arrayList;
    }

    /* renamed from: l0 */
    public static <T> List<T> m14038l0(Iterable<? extends T> iterable, Iterable<? extends T> elements) {
        List<T> m14036n0;
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(elements, "elements");
        if (iterable instanceof Collection) {
            m14036n0 = m14036n0((Collection) iterable, elements);
            return m14036n0;
        }
        ArrayList arrayList = new ArrayList();
        C9550o.m14085y(arrayList, iterable);
        C9550o.m14085y(arrayList, elements);
        return arrayList;
    }

    /* renamed from: m0 */
    public static <T> List<T> m14037m0(Iterable<? extends T> iterable, T t) {
        List<T> m14035o0;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            m14035o0 = m14035o0((Collection) iterable, t);
            return m14035o0;
        }
        ArrayList arrayList = new ArrayList();
        C9550o.m14085y(arrayList, iterable);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: n0 */
    public static <T> List<T> m14036n0(Collection<? extends T> collection, Iterable<? extends T> elements) {
        C9612q.m13917h(collection, "<this>");
        C9612q.m13917h(elements, "elements");
        if (elements instanceof Collection) {
            Collection collection2 = (Collection) elements;
            ArrayList arrayList = new ArrayList(collection.size() + collection2.size());
            arrayList.addAll(collection);
            arrayList.addAll(collection2);
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList(collection);
        C9550o.m14085y(arrayList2, elements);
        return arrayList2;
    }

    /* renamed from: o0 */
    public static <T> List<T> m14035o0(Collection<? extends T> collection, T t) {
        C9612q.m13917h(collection, "<this>");
        ArrayList arrayList = new ArrayList(collection.size() + 1);
        arrayList.addAll(collection);
        arrayList.add(t);
        return arrayList;
    }

    /* renamed from: p0 */
    public static <T> T m14034p0(Iterable<? extends T> iterable) {
        Object m14033q0;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof List) {
            m14033q0 = m14033q0((List) iterable);
            return (T) m14033q0;
        }
        Iterator<? extends T> it = iterable.iterator();
        if (it.hasNext()) {
            T next = it.next();
            if (!it.hasNext()) {
                return next;
            }
            throw new IllegalArgumentException("Collection has more than one element.");
        }
        throw new NoSuchElementException("Collection is empty.");
    }

    /* renamed from: q0 */
    public static <T> T m14033q0(List<? extends T> list) {
        C9612q.m13917h(list, "<this>");
        int size = list.size();
        if (size != 0) {
            if (size == 1) {
                return list.get(0);
            }
            throw new IllegalArgumentException("List has more than one element.");
        }
        throw new NoSuchElementException("List is empty.");
    }

    /* renamed from: r0 */
    public static <T> T m14032r0(Iterable<? extends T> iterable) {
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof List) {
            List list = (List) iterable;
            if (list.size() != 1) {
                return null;
            }
            return (T) list.get(0);
        }
        Iterator<? extends T> it = iterable.iterator();
        if (!it.hasNext()) {
            return null;
        }
        T next = it.next();
        if (it.hasNext()) {
            return null;
        }
        return next;
    }

    /* renamed from: s0 */
    public static <T> T m14031s0(List<? extends T> list) {
        C9612q.m13917h(list, "<this>");
        if (list.size() == 1) {
            return list.get(0);
        }
        return null;
    }

    /* renamed from: t0 */
    public static <T> List<T> m14030t0(List<? extends T> list, IntRange indices) {
        List<T> m14075C0;
        List<T> m14104i;
        C9612q.m13917h(list, "<this>");
        C9612q.m13917h(indices, "indices");
        if (indices.isEmpty()) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        m14075C0 = m14075C0(list.subList(indices.m13892p().intValue(), indices.m13893o().intValue() + 1));
        return m14075C0;
    }

    /* renamed from: u0 */
    public static <T extends Comparable<? super T>> List<T> m14029u0(Iterable<? extends T> iterable) {
        List<T> m14274d;
        List<T> m14075C0;
        C9612q.m13917h(iterable, "<this>");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m14075C0 = m14075C0(iterable);
                return m14075C0;
            }
            Object[] array = collection.toArray(new Comparable[0]);
            C9536e.m14261q((Comparable[]) array);
            m14274d = C9536e.m14274d(array);
            return m14274d;
        }
        List<T> m14074D0 = m14074D0(iterable);
        C9549n.m14090w(m14074D0);
        return m14074D0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* renamed from: v0 */
    public static <T> List<T> m14028v0(Iterable<? extends T> iterable, Comparator<? super T> comparator) {
        List<T> m14274d;
        List<T> m14075C0;
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(comparator, "comparator");
        if (iterable instanceof Collection) {
            Collection collection = (Collection) iterable;
            if (collection.size() <= 1) {
                m14075C0 = m14075C0(iterable);
                return m14075C0;
            }
            Object[] array = collection.toArray(new Object[0]);
            C9536e.m14260r(array, comparator);
            m14274d = C9536e.m14274d(array);
            return m14274d;
        }
        List<T> m14074D0 = m14074D0(iterable);
        C9549n.m14089x(m14074D0, comparator);
        return m14074D0;
    }

    /* renamed from: w0 */
    public static <T> List<T> m14027w0(Iterable<? extends T> iterable, int i) {
        boolean z;
        List<T> m14097p;
        Object m14057S;
        List<T> m14109d;
        List<T> m14075C0;
        List<T> m14104i;
        C9612q.m13917h(iterable, "<this>");
        int i2 = 0;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            if (iterable instanceof Collection) {
                if (i >= ((Collection) iterable).size()) {
                    m14075C0 = m14075C0(iterable);
                    return m14075C0;
                } else if (i == 1) {
                    m14057S = m14057S(iterable);
                    m14109d = C9544i.m14109d(m14057S);
                    return m14109d;
                }
            }
            ArrayList arrayList = new ArrayList(i);
            for (T t : iterable) {
                arrayList.add(t);
                i2++;
                if (i2 == i) {
                    break;
                }
            }
            m14097p = C9545j.m14097p(arrayList);
            return m14097p;
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: x0 */
    public static <T> List<T> m14026x0(List<? extends T> list, int i) {
        boolean z;
        Object m14044f0;
        List<T> m14109d;
        List<T> m14075C0;
        List<T> m14104i;
        C9612q.m13917h(list, "<this>");
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            if (i == 0) {
                m14104i = C9545j.m14104i();
                return m14104i;
            }
            int size = list.size();
            if (i >= size) {
                m14075C0 = m14075C0(list);
                return m14075C0;
            } else if (i == 1) {
                m14044f0 = m14044f0(list);
                m14109d = C9544i.m14109d(m14044f0);
                return m14109d;
            } else {
                ArrayList arrayList = new ArrayList(i);
                if (list instanceof RandomAccess) {
                    for (int i2 = size - i; i2 < size; i2++) {
                        arrayList.add(list.get(i2));
                    }
                } else {
                    ListIterator<? extends T> listIterator = list.listIterator(size - i);
                    while (listIterator.hasNext()) {
                        arrayList.add(listIterator.next());
                    }
                }
                return arrayList;
            }
        }
        throw new IllegalArgumentException(("Requested element count " + i + " is less than zero.").toString());
    }

    /* renamed from: y0 */
    public static boolean[] m14025y0(Collection<Boolean> collection) {
        C9612q.m13917h(collection, "<this>");
        boolean[] zArr = new boolean[collection.size()];
        int i = 0;
        for (Boolean bool : collection) {
            zArr[i] = bool.booleanValue();
            i++;
        }
        return zArr;
    }

    /* renamed from: z0 */
    public static final <T, C extends Collection<? super T>> C m14024z0(Iterable<? extends T> iterable, C destination) {
        C9612q.m13917h(iterable, "<this>");
        C9612q.m13917h(destination, "destination");
        for (T t : iterable) {
            destination.add(t);
        }
        return destination;
    }
}
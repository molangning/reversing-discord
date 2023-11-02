package kotlin.collections;

import cg.InterfaceC2533a;
import com.facebook.react.uimanager.ViewProps;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC9614s;
import kotlin.jvm.internal.C9581b;
import kotlin.jvm.internal.C9612q;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlin.text.C9643g;
import p304qf.C11880m;
import p304qf.C11881n;
import p304qf.C11888u;
import pf.C11591x;
import si.C12545m;

@Metadata(m14358d1 = {"\u0000à\u0001\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0012\n\u0002\u0010\u0005\n\u0000\n\u0002\u0010\u0017\n\u0002\u0010\n\n\u0000\n\u0002\u0010\u0015\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0016\n\u0002\u0010\t\n\u0002\b\u0012\n\u0002\u0010\u0019\n\u0002\u0010\f\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\u001f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u0014\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0013\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0018\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\b\t\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\u001a*\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u0086\u0002¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0015\u0010\b\u001a\u00020\u0003*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007H\u0086\u0002\u001a\u0015\u0010\u000b\u001a\u00020\u0003*\u00020\t2\u0006\u0010\u0002\u001a\u00020\nH\u0086\u0002\u001a\u0015\u0010\u000e\u001a\u00020\u0003*\u00020\f2\u0006\u0010\u0002\u001a\u00020\rH\u0086\u0002\u001a\u0015\u0010\u0011\u001a\u00020\u0003*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0010H\u0086\u0002\u001a\u001f\u0010\u0012\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0012\u0010\u0013\u001a!\u0010\u0014\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\u0014\u0010\u0013\u001a)\u0010\u0016\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0016\u0010\u0017\u001a\u001b\u0010\u0018\u001a\u0004\u0018\u00010\r*\u00020\f2\u0006\u0010\u0015\u001a\u00020\r¢\u0006\u0004\b\u0018\u0010\u0019\u001a'\u0010\u001a\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010\u0002\u001a\u00028\u0000¢\u0006\u0004\b\u001a\u0010\u001b\u001a\u0012\u0010\u001c\u001a\u00020\r*\u00020\u00062\u0006\u0010\u0002\u001a\u00020\u0007\u001a\u0012\u0010\u001d\u001a\u00020\r*\u00020\t2\u0006\u0010\u0002\u001a\u00020\n\u001a\u0012\u0010\u001e\u001a\u00020\r*\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u0012\u0010\u001f\u001a\u00020\r*\u00020\u000f2\u0006\u0010\u0002\u001a\u00020\u0010\u001a\u001f\u0010 \u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b \u0010\u0013\u001a\u0012\u0010!\u001a\u00020\r*\u00020\f2\u0006\u0010\u0002\u001a\u00020\r\u001a\u001f\u0010\"\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b\"\u0010\u0013\u001a\n\u0010%\u001a\u00020$*\u00020#\u001a!\u0010&\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b&\u0010\u0013\u001a+\u0010)\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\b\b\u0000\u0010\u0000*\u00020'*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00000\u0001¢\u0006\u0004\b)\u0010*\u001a?\u0010,\u001a\u00028\u0000\"\u0010\b\u0000\u0010,*\n\u0012\u0006\b\u0000\u0012\u00028\u00010+\"\b\b\u0001\u0010\u0000*\u00020'*\f\u0012\b\b\u0001\u0012\u0004\u0018\u00018\u00010\u00012\u0006\u0010-\u001a\u00028\u0000¢\u0006\u0004\b,\u0010.\u001aC\u00102\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u00101\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000/j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`0¢\u0006\u0004\b2\u00103\u001aA\u00104\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u001a\u00101\u001a\u0016\u0012\u0006\b\u0000\u0012\u00028\u00000/j\n\u0012\u0006\b\u0000\u0012\u00028\u0000`0¢\u0006\u0004\b4\u00105\u001a\u0019\u00106\u001a\u00020\f*\n\u0012\u0006\b\u0001\u0012\u00020\r0\u0001¢\u0006\u0004\b6\u00107\u001a9\u00108\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\u0010\b\u0001\u0010,*\n\u0012\u0006\b\u0000\u0012\u00028\u00000+*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010-\u001a\u00028\u0001¢\u0006\u0004\b8\u0010.\u001a%\u00109\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b9\u0010*\u001a\u0010\u0010:\u001a\b\u0012\u0004\u0012\u00020\u00070(*\u00020\u0006\u001a\u0010\u0010;\u001a\b\u0012\u0004\u0012\u00020\n0(*\u00020\t\u001a\u0010\u0010<\u001a\b\u0012\u0004\u0012\u00020\r0(*\u00020\f\u001a\u0010\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00100(*\u00020\u000f\u001a\u0010\u0010@\u001a\b\u0012\u0004\u0012\u00020?0(*\u00020>\u001a\u0010\u0010C\u001a\b\u0012\u0004\u0012\u00020B0(*\u00020A\u001a\u0010\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00030(*\u00020D\u001a\u0010\u0010F\u001a\b\u0012\u0004\u0012\u00020$0(*\u00020#\u001a%\u0010H\u001a\b\u0012\u0004\u0012\u00028\u00000G\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bH\u0010*\u001a\u0010\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00070G*\u00020\u0006\u001a\u0010\u0010J\u001a\b\u0012\u0004\u0012\u00020\n0G*\u00020\t\u001a\u0010\u0010K\u001a\b\u0012\u0004\u0012\u00020\r0G*\u00020\f\u001a\u0010\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00100G*\u00020\u000f\u001a\u0010\u0010M\u001a\b\u0012\u0004\u0012\u00020?0G*\u00020>\u001a\u0010\u0010N\u001a\b\u0012\u0004\u0012\u00020B0G*\u00020A\u001a\u0010\u0010O\u001a\b\u0012\u0004\u0012\u00020\u00030G*\u00020D\u001a\u0010\u0010P\u001a\b\u0012\u0004\u0012\u00020$0G*\u00020#\u001a%\u0010R\u001a\b\u0012\u0004\u0012\u00028\u00000Q\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\bR\u0010S\u001aE\u0010W\u001a\b\u0012\u0004\u0012\u00028\u00010(\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0012\u0010V\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010UH\u0086\bø\u0001\u0000¢\u0006\u0004\bW\u0010X\u001a+\u0010[\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000Z0Y\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b[\u0010\\\u001a%\u0010]\u001a\b\u0012\u0004\u0012\u00028\u00000(\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b]\u0010*\u001a%\u0010_\u001a\b\u0012\u0004\u0012\u00028\u00000^\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b_\u0010S\u001aJ\u0010b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010a0(\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010T*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u000e\u0010`\u001a\n\u0012\u0006\b\u0001\u0012\u00028\u00010\u0001H\u0086\u0004¢\u0006\u0004\bb\u0010c\u001a\u007f\u0010\u0000\u001a\u00028\u0001\"\u0004\b\u0000\u0010\u0000\"\f\b\u0001\u0010]*\u00060dj\u0002`e*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\u0006\u0010f\u001a\u00028\u00012\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\b\u0000\u0010m\u001aq\u0010n\u001a\u00028\u0000\"\f\b\u0000\u0010]*\u00060dj\u0002`e*\u00020\u00062\u0006\u0010f\u001a\u00028\u00002\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bn\u0010o\u001aq\u0010p\u001a\u00028\u0000\"\f\b\u0000\u0010]*\u00060dj\u0002`e*\u00020\f2\u0006\u0010f\u001a\u00028\u00002\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bp\u0010q\u001aq\u0010T\u001a\u00028\u0000\"\f\b\u0000\u0010]*\u00060dj\u0002`e*\u00020#2\u0006\u0010f\u001a\u00028\u00002\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bT\u0010r\u001ai\u0010t\u001a\u00020s\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00012\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00020g\u0018\u00010U¢\u0006\u0004\bt\u0010u\u001aT\u0010v\u001a\u00020s*\u00020\u00062\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020g\u0018\u00010U\u001aT\u0010w\u001a\u00020s*\u00020\f2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020g\u0018\u00010U\u001aT\u0010x\u001a\u00020s*\u00020#2\b\b\u0002\u0010h\u001a\u00020g2\b\b\u0002\u0010i\u001a\u00020g2\b\b\u0002\u0010j\u001a\u00020g2\b\b\u0002\u0010k\u001a\u00020\r2\b\b\u0002\u0010l\u001a\u00020g2\u0016\b\u0002\u0010V\u001a\u0010\u0012\u0004\u0012\u00020$\u0012\u0004\u0012\u00020g\u0018\u00010U\u001a%\u0010y\u001a\b\u0012\u0004\u0012\u00028\u00000Y\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\by\u0010\\\u001a%\u0010{\u001a\b\u0012\u0004\u0012\u00028\u00000z\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u0001¢\u0006\u0004\b{\u0010|\u001a\n\u0010}\u001a\u00020\r*\u00020\f\"%\u0010\u0081\u0001\u001a\u00020~\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\u0007\u001a\u0005\b\u007f\u0010\u0080\u0001\"&\u0010\u0084\u0001\u001a\u00020\r\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0006\b\u0001\u0012\u00028\u00000\u00018F¢\u0006\b\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0018\u0010\u0084\u0001\u001a\u00020\r*\u00020\f8F¢\u0006\b\u001a\u0006\b\u0085\u0001\u0010\u0086\u0001\"\u0018\u0010\u0084\u0001\u001a\u00020\r*\u00020\u000f8F¢\u0006\b\u001a\u0006\b\u0087\u0001\u0010\u0088\u0001\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0089\u0001"}, m14357d2 = {"T", "", "element", "", "y", "([Ljava/lang/Object;Ljava/lang/Object;)Z", "", "", "v", "", "", "z", "", "", "w", "", "", "x", "D", "([Ljava/lang/Object;)Ljava/lang/Object;", "E", "index", "K", "([Ljava/lang/Object;I)Ljava/lang/Object;", "J", "([II)Ljava/lang/Integer;", "O", "([Ljava/lang/Object;Ljava/lang/Object;)I", "L", "P", "M", "N", "d0", "e0", "h0", "", "", "g0", "i0", "", "", "B", "([Ljava/lang/Object;)Ljava/util/List;", "", "C", "destination", "([Ljava/lang/Object;Ljava/util/Collection;)Ljava/util/Collection;", "Ljava/util/Comparator;", "Lkotlin/Comparator;", "comparator", "j0", "([Ljava/lang/Object;Ljava/util/Comparator;)[Ljava/lang/Object;", "k0", "([Ljava/lang/Object;Ljava/util/Comparator;)Ljava/util/List;", "n0", "([Ljava/lang/Integer;)[I", "m0", "u0", "o0", "v0", "s0", "t0", "", "", "r0", "", "", "q0", "", "w0", "p0", "", "D0", "x0", "E0", "B0", "C0", "A0", "z0", "F0", "y0", "", "H0", "([Ljava/lang/Object;)Ljava/util/Set;", "R", "Lkotlin/Function1;", ViewProps.TRANSFORM, "f0", "([Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/util/List;", "", "Lqf/m;", "I0", "([Ljava/lang/Object;)Ljava/lang/Iterable;", "A", "", "G0", "other", "Lkotlin/Pair;", "J0", "([Ljava/lang/Object;[Ljava/lang/Object;)Ljava/util/List;", "Ljava/lang/Appendable;", "Lkotlin/text/Appendable;", "buffer", "", "separator", "prefix", "postfix", "limit", "truncated", "([Ljava/lang/Object;Ljava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "Q", "([BLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "S", "([ILjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "([CLjava/lang/Appendable;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/Appendable;", "", "Y", "([Ljava/lang/Object;Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;ILjava/lang/CharSequence;Lkotlin/jvm/functions/Function1;)Ljava/lang/String;", "V", "X", "W", "t", "Lkotlin/sequences/Sequence;", "u", "([Ljava/lang/Object;)Lkotlin/sequences/Sequence;", "l0", "Lkotlin/ranges/IntRange;", "F", "([Ljava/lang/Object;)Lkotlin/ranges/IntRange;", "indices", "I", "([Ljava/lang/Object;)I", "lastIndex", "G", "([I)I", "H", "([J)I", "kotlin-stdlib"}, m14356k = 5, m14355mv = {1, 8, 0}, m14352xs = "kotlin/collections/ArraysKt")
/* renamed from: kotlin.collections.f */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public class C9538f extends C9536e {

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0010\u001c\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"kotlin/collections/f$a", "", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.collections.f$a */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9539a<T> implements Iterable<T>, InterfaceC2533a {

        /* renamed from: j */
        final /* synthetic */ Object[] f25311j;

        public C9539a(Object[] objArr) {
            this.f25311j = objArr;
        }

        @Override // java.lang.Iterable
        public Iterator<T> iterator() {
            return C9581b.m13973a(this.f25311j);
        }
    }

    @Metadata(m14358d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010(\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096\u0002¨\u0006\u0004"}, m14357d2 = {"kotlin/collections/f$b", "Lkotlin/sequences/Sequence;", "", "iterator", "kotlin-stdlib"}, m14356k = 1, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.collections.f$b */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9540b<T> implements Sequence<T> {

        /* renamed from: a */
        final /* synthetic */ Object[] f25312a;

        public C9540b(Object[] objArr) {
            this.f25312a = objArr;
        }

        @Override // kotlin.sequences.Sequence
        public Iterator<T> iterator() {
            return C9581b.m13973a(this.f25312a);
        }
    }

    @Metadata(m14358d1 = {"\u0000\n\n\u0000\n\u0002\u0010(\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00028\u00000\u0001\"\u0004\b\u0000\u0010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m14357d2 = {"T", "", "a", "()Ljava/util/Iterator;"}, m14356k = 3, m14355mv = {1, 8, 0})
    /* renamed from: kotlin.collections.f$c */
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class C9541c<T> extends AbstractC9614s implements Function0<Iterator<? extends T>> {

        /* renamed from: j */
        final /* synthetic */ T[] f25313j;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C9541c(T[] tArr) {
            super(0);
            this.f25313j = tArr;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: a */
        public final Iterator<T> invoke() {
            return C9581b.m13973a(this.f25313j);
        }
    }

    /* renamed from: A */
    public static <T> List<T> m14255A(T[] tArr) {
        List<T> m14075C0;
        C9612q.m13917h(tArr, "<this>");
        m14075C0 = C9553r.m14075C0(m14242G0(tArr));
        return m14075C0;
    }

    /* renamed from: A0 */
    public static final List<Float> m14254A0(float[] fArr) {
        C9612q.m13917h(fArr, "<this>");
        ArrayList arrayList = new ArrayList(fArr.length);
        for (float f : fArr) {
            arrayList.add(Float.valueOf(f));
        }
        return arrayList;
    }

    /* renamed from: B */
    public static <T> List<T> m14253B(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        return (List) m14251C(tArr, new ArrayList());
    }

    /* renamed from: B0 */
    public static final List<Integer> m14252B0(int[] iArr) {
        C9612q.m13917h(iArr, "<this>");
        ArrayList arrayList = new ArrayList(iArr.length);
        for (int i : iArr) {
            arrayList.add(Integer.valueOf(i));
        }
        return arrayList;
    }

    /* renamed from: C */
    public static final <C extends Collection<? super T>, T> C m14251C(T[] tArr, C destination) {
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(destination, "destination");
        for (T t : tArr) {
            if (t != null) {
                destination.add(t);
            }
        }
        return destination;
    }

    /* renamed from: C0 */
    public static final List<Long> m14250C0(long[] jArr) {
        C9612q.m13917h(jArr, "<this>");
        ArrayList arrayList = new ArrayList(jArr.length);
        for (long j : jArr) {
            arrayList.add(Long.valueOf(j));
        }
        return arrayList;
    }

    /* renamed from: D */
    public static <T> T m14249D(T[] tArr) {
        boolean z;
        C9612q.m13917h(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            return tArr[0];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: D0 */
    public static <T> List<T> m14248D0(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        return new ArrayList(C9545j.m14107f(tArr));
    }

    /* renamed from: E */
    public static <T> T m14247E(T[] tArr) {
        boolean z;
        C9612q.m13917h(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return null;
        }
        return tArr[0];
    }

    /* renamed from: E0 */
    public static final List<Short> m14246E0(short[] sArr) {
        C9612q.m13917h(sArr, "<this>");
        ArrayList arrayList = new ArrayList(sArr.length);
        for (short s : sArr) {
            arrayList.add(Short.valueOf(s));
        }
        return arrayList;
    }

    /* renamed from: F */
    public static <T> IntRange m14245F(T[] tArr) {
        int m14239I;
        C9612q.m13917h(tArr, "<this>");
        m14239I = m14239I(tArr);
        return new IntRange(0, m14239I);
    }

    /* renamed from: F0 */
    public static final List<Boolean> m14244F0(boolean[] zArr) {
        C9612q.m13917h(zArr, "<this>");
        ArrayList arrayList = new ArrayList(zArr.length);
        for (boolean z : zArr) {
            arrayList.add(Boolean.valueOf(z));
        }
        return arrayList;
    }

    /* renamed from: G */
    public static final int m14243G(int[] iArr) {
        C9612q.m13917h(iArr, "<this>");
        return iArr.length - 1;
    }

    /* renamed from: G0 */
    public static final <T> Set<T> m14242G0(T[] tArr) {
        int m6758d;
        C9612q.m13917h(tArr, "<this>");
        m6758d = C11888u.m6758d(tArr.length);
        return (Set) m14207m0(tArr, new LinkedHashSet(m6758d));
    }

    /* renamed from: H */
    public static int m14241H(long[] jArr) {
        C9612q.m13917h(jArr, "<this>");
        return jArr.length - 1;
    }

    /* renamed from: H0 */
    public static <T> Set<T> m14240H0(T[] tArr) {
        Set<T> m14007d;
        Set<T> m14008c;
        int m6758d;
        C9612q.m13917h(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                m6758d = C11888u.m6758d(tArr.length);
                return (Set) m14207m0(tArr, new LinkedHashSet(m6758d));
            }
            m14008c = C9559v.m14008c(tArr[0]);
            return m14008c;
        }
        m14007d = C9560w.m14007d();
        return m14007d;
    }

    /* renamed from: I */
    public static <T> int m14239I(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        return tArr.length - 1;
    }

    /* renamed from: I0 */
    public static <T> Iterable<C11880m<T>> m14238I0(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        return new C11881n(new C9541c(tArr));
    }

    /* renamed from: J */
    public static Integer m14237J(int[] iArr, int i) {
        C9612q.m13917h(iArr, "<this>");
        if (i >= 0 && i <= m14243G(iArr)) {
            return Integer.valueOf(iArr[i]);
        }
        return null;
    }

    /* renamed from: J0 */
    public static <T, R> List<Pair<T, R>> m14236J0(T[] tArr, R[] other) {
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(other, "other");
        int min = Math.min(tArr.length, other.length);
        ArrayList arrayList = new ArrayList(min);
        for (int i = 0; i < min; i++) {
            arrayList.add(C11591x.m7577a(tArr[i], other[i]));
        }
        return arrayList;
    }

    /* renamed from: K */
    public static <T> T m14235K(T[] tArr, int i) {
        int m14239I;
        C9612q.m13917h(tArr, "<this>");
        if (i >= 0) {
            m14239I = m14239I(tArr);
            if (i <= m14239I) {
                return tArr[i];
            }
        }
        return null;
    }

    /* renamed from: L */
    public static final int m14234L(byte[] bArr, byte b) {
        C9612q.m13917h(bArr, "<this>");
        int length = bArr.length;
        for (int i = 0; i < length; i++) {
            if (b == bArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: M */
    public static final int m14233M(int[] iArr, int i) {
        C9612q.m13917h(iArr, "<this>");
        int length = iArr.length;
        for (int i2 = 0; i2 < length; i2++) {
            if (i == iArr[i2]) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: N */
    public static final int m14232N(long[] jArr, long j) {
        C9612q.m13917h(jArr, "<this>");
        int length = jArr.length;
        for (int i = 0; i < length; i++) {
            if (j == jArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: O */
    public static <T> int m14231O(T[] tArr, T t) {
        C9612q.m13917h(tArr, "<this>");
        int i = 0;
        if (t == null) {
            int length = tArr.length;
            while (i < length) {
                if (tArr[i] == null) {
                    return i;
                }
                i++;
            }
            return -1;
        }
        int length2 = tArr.length;
        while (i < length2) {
            if (C9612q.m13922c(t, tArr[i])) {
                return i;
            }
            i++;
        }
        return -1;
    }

    /* renamed from: P */
    public static final int m14230P(short[] sArr, short s) {
        C9612q.m13917h(sArr, "<this>");
        int length = sArr.length;
        for (int i = 0; i < length; i++) {
            if (s == sArr[i]) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: Q */
    public static final <A extends Appendable> A m14229Q(byte[] bArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        C9612q.m13917h(bArr, "<this>");
        C9612q.m13917h(buffer, "buffer");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (byte b : bArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Byte.valueOf(b)));
            } else {
                buffer.append(String.valueOf((int) b));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: R */
    public static final <A extends Appendable> A m14228R(char[] cArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) {
        C9612q.m13917h(cArr, "<this>");
        C9612q.m13917h(buffer, "buffer");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (char c : cArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Character.valueOf(c)));
            } else {
                buffer.append(c);
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: S */
    public static final <A extends Appendable> A m14227S(int[] iArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) {
        C9612q.m13917h(iArr, "<this>");
        C9612q.m13917h(buffer, "buffer");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (int i3 : iArr) {
            i2++;
            if (i2 > 1) {
                buffer.append(separator);
            }
            if (i >= 0 && i2 > i) {
                break;
            }
            if (function1 != null) {
                buffer.append(function1.invoke(Integer.valueOf(i3)));
            } else {
                buffer.append(String.valueOf(i3));
            }
        }
        if (i >= 0 && i2 > i) {
            buffer.append(truncated);
        }
        buffer.append(postfix);
        return buffer;
    }

    /* renamed from: T */
    public static final <T, A extends Appendable> A m14226T(T[] tArr, A buffer, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(buffer, "buffer");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        buffer.append(prefix);
        int i2 = 0;
        for (T t : tArr) {
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

    /* renamed from: U */
    public static /* synthetic */ Appendable m14225U(Object[] objArr, Appendable appendable, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m14226T(objArr, appendable, charSequence5, charSequence6, charSequence8, i3, charSequence7, function12);
    }

    /* renamed from: V */
    public static final String m14224V(byte[] bArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Byte, ? extends CharSequence> function1) {
        C9612q.m13917h(bArr, "<this>");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        String sb2 = ((StringBuilder) m14229Q(bArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9612q.m13918g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: W */
    public static final String m14223W(char[] cArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Character, ? extends CharSequence> function1) {
        C9612q.m13917h(cArr, "<this>");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        String sb2 = ((StringBuilder) m14228R(cArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9612q.m13918g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: X */
    public static final String m14222X(int[] iArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super Integer, ? extends CharSequence> function1) {
        C9612q.m13917h(iArr, "<this>");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        String sb2 = ((StringBuilder) m14227S(iArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9612q.m13918g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: Y */
    public static final <T> String m14221Y(T[] tArr, CharSequence separator, CharSequence prefix, CharSequence postfix, int i, CharSequence truncated, Function1<? super T, ? extends CharSequence> function1) {
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(separator, "separator");
        C9612q.m13917h(prefix, "prefix");
        C9612q.m13917h(postfix, "postfix");
        C9612q.m13917h(truncated, "truncated");
        String sb2 = ((StringBuilder) m14226T(tArr, new StringBuilder(), separator, prefix, postfix, i, truncated, function1)).toString();
        C9612q.m13918g(sb2, "joinTo(StringBuilder(), …ed, transform).toString()");
        return sb2;
    }

    /* renamed from: Z */
    public static /* synthetic */ String m14220Z(byte[] bArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m14224V(bArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: a0 */
    public static /* synthetic */ String m14219a0(char[] cArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m14223W(cArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: b0 */
    public static /* synthetic */ String m14218b0(int[] iArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m14222X(iArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: c0 */
    public static /* synthetic */ String m14217c0(Object[] objArr, CharSequence charSequence, CharSequence charSequence2, CharSequence charSequence3, int i, CharSequence charSequence4, Function1 function1, int i2, Object obj) {
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
        return m14221Y(objArr, charSequence, charSequence5, charSequence6, i3, charSequence7, function1);
    }

    /* renamed from: d0 */
    public static <T> T m14216d0(T[] tArr) {
        boolean z;
        int m14239I;
        C9612q.m13917h(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            m14239I = m14239I(tArr);
            return tArr[m14239I];
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: e0 */
    public static final int m14215e0(int[] iArr, int i) {
        C9612q.m13917h(iArr, "<this>");
        int length = iArr.length - 1;
        if (length >= 0) {
            while (true) {
                int i2 = length - 1;
                if (i == iArr[length]) {
                    return length;
                }
                if (i2 < 0) {
                    break;
                }
                length = i2;
            }
        }
        return -1;
    }

    /* renamed from: f0 */
    public static <T, R> List<R> m14214f0(T[] tArr, Function1<? super T, ? extends R> transform) {
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(transform, "transform");
        ArrayList arrayList = new ArrayList(tArr.length);
        for (T t : tArr) {
            arrayList.add(transform.invoke(t));
        }
        return arrayList;
    }

    /* renamed from: g0 */
    public static char m14213g0(char[] cArr) {
        C9612q.m13917h(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length == 1) {
                return cArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: h0 */
    public static <T> T m14212h0(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length == 1) {
                return tArr[0];
            }
            throw new IllegalArgumentException("Array has more than one element.");
        }
        throw new NoSuchElementException("Array is empty.");
    }

    /* renamed from: i0 */
    public static <T> T m14211i0(T[] tArr) {
        C9612q.m13917h(tArr, "<this>");
        if (tArr.length == 1) {
            return tArr[0];
        }
        return null;
    }

    /* renamed from: j0 */
    public static final <T> T[] m14210j0(T[] tArr, Comparator<? super T> comparator) {
        boolean z;
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(comparator, "comparator");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return tArr;
        }
        T[] tArr2 = (T[]) Arrays.copyOf(tArr, tArr.length);
        C9612q.m13918g(tArr2, "copyOf(this, size)");
        C9536e.m14260r(tArr2, comparator);
        return tArr2;
    }

    /* renamed from: k0 */
    public static <T> List<T> m14209k0(T[] tArr, Comparator<? super T> comparator) {
        List<T> m14274d;
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(comparator, "comparator");
        m14274d = C9536e.m14274d(m14210j0(tArr, comparator));
        return m14274d;
    }

    /* renamed from: l0 */
    public static int m14208l0(int[] iArr) {
        C9612q.m13917h(iArr, "<this>");
        int i = 0;
        for (int i2 : iArr) {
            i += i2;
        }
        return i;
    }

    /* renamed from: m0 */
    public static final <T, C extends Collection<? super T>> C m14207m0(T[] tArr, C destination) {
        C9612q.m13917h(tArr, "<this>");
        C9612q.m13917h(destination, "destination");
        for (T t : tArr) {
            destination.add(t);
        }
        return destination;
    }

    /* renamed from: n0 */
    public static int[] m14206n0(Integer[] numArr) {
        C9612q.m13917h(numArr, "<this>");
        int length = numArr.length;
        int[] iArr = new int[length];
        for (int i = 0; i < length; i++) {
            iArr[i] = numArr[i].intValue();
        }
        return iArr;
    }

    /* renamed from: o0 */
    public static List<Byte> m14205o0(byte[] bArr) {
        List<Byte> m14104i;
        List<Byte> m14109d;
        C9612q.m13917h(bArr, "<this>");
        int length = bArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14191x0(bArr);
            }
            m14109d = C9544i.m14109d(Byte.valueOf(bArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: p0 */
    public static List<Character> m14204p0(char[] cArr) {
        List<Character> m14104i;
        List<Character> m14109d;
        C9612q.m13917h(cArr, "<this>");
        int length = cArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14189y0(cArr);
            }
            m14109d = C9544i.m14109d(Character.valueOf(cArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: q0 */
    public static List<Double> m14203q0(double[] dArr) {
        List<Double> m14104i;
        List<Double> m14109d;
        C9612q.m13917h(dArr, "<this>");
        int length = dArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14187z0(dArr);
            }
            m14109d = C9544i.m14109d(Double.valueOf(dArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: r0 */
    public static List<Float> m14202r0(float[] fArr) {
        List<Float> m14104i;
        List<Float> m14109d;
        C9612q.m13917h(fArr, "<this>");
        int length = fArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14254A0(fArr);
            }
            m14109d = C9544i.m14109d(Float.valueOf(fArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: s0 */
    public static List<Integer> m14201s0(int[] iArr) {
        List<Integer> m14104i;
        List<Integer> m14109d;
        C9612q.m13917h(iArr, "<this>");
        int length = iArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14252B0(iArr);
            }
            m14109d = C9544i.m14109d(Integer.valueOf(iArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: t */
    public static <T> Iterable<T> m14200t(T[] tArr) {
        boolean z;
        List m14104i;
        C9612q.m13917h(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m14104i = C9545j.m14104i();
            return m14104i;
        }
        return new C9539a(tArr);
    }

    /* renamed from: t0 */
    public static List<Long> m14199t0(long[] jArr) {
        List<Long> m14104i;
        List<Long> m14109d;
        C9612q.m13917h(jArr, "<this>");
        int length = jArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14250C0(jArr);
            }
            m14109d = C9544i.m14109d(Long.valueOf(jArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: u */
    public static <T> Sequence<T> m14198u(T[] tArr) {
        boolean z;
        Sequence<T> m4879e;
        C9612q.m13917h(tArr, "<this>");
        if (tArr.length == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            m4879e = C12545m.m4879e();
            return m4879e;
        }
        return new C9540b(tArr);
    }

    /* renamed from: u0 */
    public static <T> List<T> m14197u0(T[] tArr) {
        List<T> m14104i;
        List<T> m14109d;
        List<T> m14248D0;
        C9612q.m13917h(tArr, "<this>");
        int length = tArr.length;
        if (length != 0) {
            if (length != 1) {
                m14248D0 = m14248D0(tArr);
                return m14248D0;
            }
            m14109d = C9544i.m14109d(tArr[0]);
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: v */
    public static boolean m14196v(byte[] bArr, byte b) {
        C9612q.m13917h(bArr, "<this>");
        if (m14234L(bArr, b) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: v0 */
    public static List<Short> m14195v0(short[] sArr) {
        List<Short> m14104i;
        List<Short> m14109d;
        C9612q.m13917h(sArr, "<this>");
        int length = sArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14246E0(sArr);
            }
            m14109d = C9544i.m14109d(Short.valueOf(sArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: w */
    public static boolean m14194w(int[] iArr, int i) {
        C9612q.m13917h(iArr, "<this>");
        if (m14233M(iArr, i) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: w0 */
    public static List<Boolean> m14193w0(boolean[] zArr) {
        List<Boolean> m14104i;
        List<Boolean> m14109d;
        C9612q.m13917h(zArr, "<this>");
        int length = zArr.length;
        if (length != 0) {
            if (length != 1) {
                return m14244F0(zArr);
            }
            m14109d = C9544i.m14109d(Boolean.valueOf(zArr[0]));
            return m14109d;
        }
        m14104i = C9545j.m14104i();
        return m14104i;
    }

    /* renamed from: x */
    public static boolean m14192x(long[] jArr, long j) {
        C9612q.m13917h(jArr, "<this>");
        if (m14232N(jArr, j) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: x0 */
    public static final List<Byte> m14191x0(byte[] bArr) {
        C9612q.m13917h(bArr, "<this>");
        ArrayList arrayList = new ArrayList(bArr.length);
        for (byte b : bArr) {
            arrayList.add(Byte.valueOf(b));
        }
        return arrayList;
    }

    /* renamed from: y */
    public static <T> boolean m14190y(T[] tArr, T t) {
        int m14231O;
        C9612q.m13917h(tArr, "<this>");
        m14231O = m14231O(tArr, t);
        if (m14231O >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: y0 */
    public static final List<Character> m14189y0(char[] cArr) {
        C9612q.m13917h(cArr, "<this>");
        ArrayList arrayList = new ArrayList(cArr.length);
        for (char c : cArr) {
            arrayList.add(Character.valueOf(c));
        }
        return arrayList;
    }

    /* renamed from: z */
    public static boolean m14188z(short[] sArr, short s) {
        C9612q.m13917h(sArr, "<this>");
        if (m14230P(sArr, s) >= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: z0 */
    public static final List<Double> m14187z0(double[] dArr) {
        C9612q.m13917h(dArr, "<this>");
        ArrayList arrayList = new ArrayList(dArr.length);
        for (double d : dArr) {
            arrayList.add(Double.valueOf(d));
        }
        return arrayList;
    }
}

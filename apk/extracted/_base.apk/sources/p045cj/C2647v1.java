package p045cj;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C9536e;
import kotlin.jvm.internal.C9581b;
import kotlin.jvm.internal.C9612q;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

@Metadata(m14358d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010(\n\u0002\b\t\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u0001*\n\b\u0001\u0010\u0003*\u0004\u0018\u00018\u00002*\u0012\u0004\u0012\u00028\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00010\u0005\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00070\u0004B#\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b\u0012\f\u0010&\u001a\b\u0012\u0004\u0012\u00028\u00010%¢\u0006\u0004\b'\u0010(J\u0019\u0010\t\u001a\u00020\b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\f\u001a\b\u0012\u0004\u0012\u00028\u00010\u000b*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\f\u0010\rJ\u0018\u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J\u001c\u0010\u000f\u001a\u00020\b*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014J)\u0010\u0010\u001a\b\u0012\u0004\u0012\u00028\u00010\u0005*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007H\u0014¢\u0006\u0004\b\u0010\u0010\u0011J)\u0010\u0012\u001a\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u0007*\b\u0012\u0004\u0012\u00028\u00010\u0005H\u0014¢\u0006\u0004\b\u0012\u0010\u0013J$\u0010\u0016\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0014\u001a\u00020\bH\u0014J3\u0010\u0019\u001a\u00020\u0015*\u0012\u0012\u0004\u0012\u00028\u00010\u0006j\b\u0012\u0004\u0012\u00028\u0001`\u00072\u0006\u0010\u0017\u001a\u00020\b2\u0006\u0010\u0018\u001a\u00028\u0001H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00028\u00000\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010$\u001a\u00020\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006)"}, m14357d2 = {"Lcj/v1;", "", "ElementKlass", "Element", "Lcj/s;", "", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "", "s", "([Ljava/lang/Object;)I", "", "r", "([Ljava/lang/Object;)Ljava/util/Iterator;", "o", "p", "v", "(Ljava/util/ArrayList;)[Ljava/lang/Object;", "u", "([Ljava/lang/Object;)Ljava/util/ArrayList;", "size", "", "q", "index", "element", "t", "(Ljava/util/ArrayList;ILjava/lang/Object;)V", "Lkotlin/reflect/KClass;", "b", "Lkotlin/reflect/KClass;", "kClass", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "c", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "Lkotlinx/serialization/KSerializer;", "eSerializer", "<init>", "(Lkotlin/reflect/KClass;Lkotlinx/serialization/KSerializer;)V", "kotlinx-serialization-core"}, m14356k = 1, m14355mv = {1, 8, 0})
/* renamed from: cj.v1 */
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class C2647v1<ElementKlass, Element extends ElementKlass> extends AbstractC2636s<Element, Element[], ArrayList<Element>> {

    /* renamed from: b */
    private final KClass<ElementKlass> f7125b;

    /* renamed from: c */
    private final SerialDescriptor f7126c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2647v1(KClass<ElementKlass> kClass, KSerializer<Element> eSerializer) {
        super(eSerializer, null);
        C9612q.m13917h(kClass, "kClass");
        C9612q.m13917h(eSerializer, "eSerializer");
        this.f7125b = kClass;
        this.f7126c = new C2572d(eSerializer.getDescriptor());
    }

    @Override // p045cj.AbstractC2636s, kotlinx.serialization.KSerializer, p470zi.InterfaceC14279h, kotlinx.serialization.DeserializationStrategy
    public SerialDescriptor getDescriptor() {
        return this.f7126c;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: o */
    public ArrayList<Element> mo32798a() {
        return new ArrayList<>();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: p */
    public int mo32797b(ArrayList<Element> arrayList) {
        C9612q.m13917h(arrayList, "<this>");
        return arrayList.size();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: q */
    public void mo32796c(ArrayList<Element> arrayList, int i) {
        C9612q.m13917h(arrayList, "<this>");
        arrayList.ensureCapacity(i);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: r */
    public Iterator<Element> mo32795d(Element[] elementArr) {
        C9612q.m13917h(elementArr, "<this>");
        return C9581b.m13973a(elementArr);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: s */
    public int mo12791e(Element[] elementArr) {
        C9612q.m13917h(elementArr, "<this>");
        return elementArr.length;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2636s
    /* renamed from: t */
    public void mo32793n(ArrayList<Element> arrayList, int i, Element element) {
        C9612q.m13917h(arrayList, "<this>");
        arrayList.add(i, element);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: u */
    public ArrayList<Element> mo12789k(Element[] elementArr) {
        List m14274d;
        C9612q.m13917h(elementArr, "<this>");
        m14274d = C9536e.m14274d(elementArr);
        return new ArrayList<>(m14274d);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // p045cj.AbstractC2556a
    /* renamed from: v */
    public Element[] mo32794l(ArrayList<Element> arrayList) {
        C9612q.m13917h(arrayList, "<this>");
        return (Element[]) C2612l1.m32855n(arrayList, this.f7125b);
    }
}

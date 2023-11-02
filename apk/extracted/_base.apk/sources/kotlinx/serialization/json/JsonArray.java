package kotlinx.serialization.json;

import cg.InterfaceC2533a;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import kotlin.Metadata;
import kotlin.collections.C9553r;
import kotlin.jvm.internal.C9597i;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlinx.serialization.KSerializer;
import p164j$.lang.Iterable$CC;
import p164j$.util.AbstractC8516n;
import p164j$.util.Collection;
import p164j$.util.List;
import p164j$.util.Spliterator;
import p164j$.util.function.Consumer;
import p164j$.util.function.IntFunction;
import p164j$.util.function.Predicate;
import p164j$.util.function.UnaryOperator;
import p164j$.util.stream.AbstractC8744w0;
import p164j$.util.stream.Stream;
import p470zi.InterfaceC14277f;

@Metadata(m14358d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010(\n\u0002\b\u0002\n\u0002\u0010*\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0007\u0018\u0000 $2\u00020\u00012\b\u0012\u0004\u0012\u00020\u00010\u0002:\u0001$B\u0015\u0012\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\"\u0010#J\u0011\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0003J\u0017\u0010\b\u001a\u00020\u00042\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00010\u0006H\u0096\u0001J\u0011\u0010\u000b\u001a\u00020\u00012\u0006\u0010\n\u001a\u00020\tH\u0096\u0003J\u0011\u0010\f\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\t\u0010\r\u001a\u00020\u0004H\u0096\u0001J\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00010\u000eH\u0096\u0003J\u0011\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0003\u001a\u00020\u0001H\u0096\u0001J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u0011H\u0096\u0001J\u0017\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00010\u00112\u0006\u0010\n\u001a\u00020\tH\u0096\u0001J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00010\u00022\u0006\u0010\u0013\u001a\u00020\t2\u0006\u0010\u0014\u001a\u00020\tH\u0096\u0001J\u0013\u0010\u0018\u001a\u00020\u00042\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0019\u001a\u00020\tH\u0016J\b\u0010\u001b\u001a\u00020\u001aH\u0016R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010!\u001a\u00020\t8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 ¨\u0006%"}, m14357d2 = {"Lkotlinx/serialization/json/JsonArray;", "Lkotlinx/serialization/json/JsonElement;", "", "element", "", "a", "", "elements", "containsAll", "", "index", "e", "i", "isEmpty", "", "iterator", "k", "", "listIterator", "fromIndex", "toIndex", "subList", "", "other", "equals", "hashCode", "", "toString", "j", "Ljava/util/List;", "content", "h", "()I", "size", "<init>", "(Ljava/util/List;)V", "Companion", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0})
@InterfaceC14277f(with = C9957a.class)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
public final class JsonArray extends JsonElement implements List<JsonElement>, InterfaceC2533a, p164j$.util.List {
    public static final Companion Companion = new Companion(null);

    /* renamed from: j */
    private final List<JsonElement> f25834j;

    @Metadata(m14358d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004HÆ\u0001¨\u0006\u0006"}, m14357d2 = {"Lkotlinx/serialization/json/JsonArray$Companion;", "", "()V", "serializer", "Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/json/JsonArray;", "kotlinx-serialization-json"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes7.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final KSerializer<JsonArray> serializer() {
            return C9957a.f25853a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public JsonArray(List<? extends JsonElement> content) {
        super(null);
        C9612q.m13917h(content, "content");
        this.f25834j = content;
    }

    /* renamed from: a */
    public boolean m12777a(JsonElement element) {
        C9612q.m13917h(element, "element");
        return this.f25834j.contains(element);
    }

    @Override // java.util.List, p164j$.util.List
    public /* bridge */ /* synthetic */ void add(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public /* bridge */ /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, p164j$.util.List
    public boolean addAll(int i, Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public boolean addAll(Collection<? extends JsonElement> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof JsonElement) {
            return m12777a((JsonElement) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public boolean containsAll(Collection<? extends Object> elements) {
        C9612q.m13917h(elements, "elements");
        return this.f25834j.containsAll(elements);
    }

    @Override // java.util.List, p164j$.util.List
    /* renamed from: e */
    public JsonElement get(int i) {
        return this.f25834j.get(i);
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public boolean equals(Object obj) {
        return C9612q.m13922c(this.f25834j, obj);
    }

    @Override // p164j$.util.Collection
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.lang.Iterable
    public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    /* renamed from: h */
    public int m12775h() {
        return this.f25834j.size();
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public int hashCode() {
        return this.f25834j.hashCode();
    }

    /* renamed from: i */
    public int m12774i(JsonElement element) {
        C9612q.m13917h(element, "element");
        return this.f25834j.indexOf(element);
    }

    @Override // java.util.List, p164j$.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return m12774i((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public boolean isEmpty() {
        return this.f25834j.isEmpty();
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, p164j$.util.List, p164j$.util.Collection
    public Iterator<JsonElement> iterator() {
        return this.f25834j.iterator();
    }

    /* renamed from: k */
    public int m12773k(JsonElement element) {
        C9612q.m13917h(element, "element");
        return this.f25834j.lastIndexOf(element);
    }

    @Override // java.util.List, p164j$.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof JsonElement) {
            return m12773k((JsonElement) obj);
        }
        return -1;
    }

    @Override // java.util.List, p164j$.util.List
    public ListIterator<JsonElement> listIterator() {
        return this.f25834j.listIterator();
    }

    @Override // java.util.List, p164j$.util.List
    public ListIterator<JsonElement> listIterator(int i) {
        return this.f25834j.listIterator(i);
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), true);
        return m17323v1;
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.List, p164j$.util.List
    public /* bridge */ /* synthetic */ Object remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // p164j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection
    public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
        return removeIf(Predicate.VivifiedWrapper.convert(predicate));
    }

    @Override // p164j$.util.List
    public void replaceAll(UnaryOperator<JsonElement> unaryOperator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List
    public /* synthetic */ void replaceAll(java.util.function.UnaryOperator<JsonElement> unaryOperator) {
        replaceAll(UnaryOperator.VivifiedWrapper.convert(unaryOperator));
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, p164j$.util.List
    public /* bridge */ /* synthetic */ Object set(int i, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public final /* bridge */ int size() {
        return m12775h();
    }

    @Override // java.util.List, p164j$.util.List
    public void sort(Comparator<? super JsonElement> comparator) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, p164j$.util.List, p164j$.util.Collection
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, p164j$.util.Collection
    public /* synthetic */ Stream stream() {
        Stream m17323v1;
        m17323v1 = AbstractC8744w0.m17323v1(AbstractC8516n.m17598s(this), false);
        return m17323v1;
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.List, p164j$.util.List
    public java.util.List<JsonElement> subList(int i, int i2) {
        return this.f25834j.subList(i, i2);
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public Object[] toArray() {
        return C9597i.m13947a(this);
    }

    @Override // p164j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    public /* synthetic */ Object[] toArray(java.util.function.IntFunction intFunction) {
        return toArray(IntFunction.VivifiedWrapper.convert(intFunction));
    }

    @Override // java.util.List, java.util.Collection, p164j$.util.List, p164j$.util.Collection
    public <T> T[] toArray(T[] array) {
        C9612q.m13917h(array, "array");
        return (T[]) C9597i.m13946b(this, array);
    }

    public String toString() {
        String m14046d0;
        m14046d0 = C9553r.m14046d0(this.f25834j, ",", "[", "]", 0, null, null, 56, null);
        return m14046d0;
    }
}

package com.discord.user_search_worker.react_events;

import com.discord.react.utilities.NativeArrayExtensionsKt;
import com.discord.react.utilities.NativeMapExtensionsKt;
import com.discord.reactevents.ReactEvent;
import com.discord.user_search_worker.UserSearchWorkerResult;
import com.facebook.react.bridge.WritableMap;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C9546k;
import kotlin.jvm.internal.C9612q;
import pf.C11591x;

@Metadata(m14358d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0002\u0010\tJ\u000f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u0011\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0006HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\b\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\b\u0010\u001b\u001a\u00020\u001cH\u0016J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\b\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001e"}, m14357d2 = {"Lcom/discord/user_search_worker/react_events/ReturnResultsEvent;", "Lcom/discord/reactevents/ReactEvent;", "results", "", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "query", "", "uuid", "type", "(Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getQuery", "()Ljava/lang/String;", "getResults", "()Ljava/util/List;", "getType", "getUuid", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "serialize", "Lcom/facebook/react/bridge/WritableMap;", "toString", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class ReturnResultsEvent implements ReactEvent {
    private final String query;
    private final List<UserSearchWorkerResult> results;
    private final String type;
    private final String uuid;

    public ReturnResultsEvent(List<UserSearchWorkerResult> results, String query, String uuid, String type) {
        C9612q.m13917h(results, "results");
        C9612q.m13917h(query, "query");
        C9612q.m13917h(uuid, "uuid");
        C9612q.m13917h(type, "type");
        this.results = results;
        this.query = query;
        this.uuid = uuid;
        this.type = type;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReturnResultsEvent copy$default(ReturnResultsEvent returnResultsEvent, List list, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            list = returnResultsEvent.results;
        }
        if ((i & 2) != 0) {
            str = returnResultsEvent.query;
        }
        if ((i & 4) != 0) {
            str2 = returnResultsEvent.uuid;
        }
        if ((i & 8) != 0) {
            str3 = returnResultsEvent.type;
        }
        return returnResultsEvent.copy(list, str, str2, str3);
    }

    public final List<UserSearchWorkerResult> component1() {
        return this.results;
    }

    public final String component2() {
        return this.query;
    }

    public final String component3() {
        return this.uuid;
    }

    public final String component4() {
        return this.type;
    }

    public final ReturnResultsEvent copy(List<UserSearchWorkerResult> results, String query, String uuid, String type) {
        C9612q.m13917h(results, "results");
        C9612q.m13917h(query, "query");
        C9612q.m13917h(uuid, "uuid");
        C9612q.m13917h(type, "type");
        return new ReturnResultsEvent(results, query, uuid, type);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ReturnResultsEvent) {
            ReturnResultsEvent returnResultsEvent = (ReturnResultsEvent) obj;
            return C9612q.m13922c(this.results, returnResultsEvent.results) && C9612q.m13922c(this.query, returnResultsEvent.query) && C9612q.m13922c(this.uuid, returnResultsEvent.uuid) && C9612q.m13922c(this.type, returnResultsEvent.type);
        }
        return false;
    }

    public final String getQuery() {
        return this.query;
    }

    public final List<UserSearchWorkerResult> getResults() {
        return this.results;
    }

    public final String getType() {
        return this.type;
    }

    public final String getUuid() {
        return this.uuid;
    }

    public int hashCode() {
        return (((((this.results.hashCode() * 31) + this.query.hashCode()) * 31) + this.uuid.hashCode()) * 31) + this.type.hashCode();
    }

    @Override // com.discord.reactevents.ReactEvent
    public WritableMap serialize() {
        int m14093t;
        Pair[] pairArr = new Pair[3];
        pairArr[0] = C11591x.m7577a("uuid", this.uuid);
        pairArr[1] = C11591x.m7577a("type", this.type);
        Pair[] pairArr2 = new Pair[2];
        pairArr2[0] = C11591x.m7577a("query", this.query);
        List<UserSearchWorkerResult> list = this.results;
        m14093t = C9546k.m14093t(list, 10);
        ArrayList arrayList = new ArrayList(m14093t);
        for (UserSearchWorkerResult userSearchWorkerResult : list) {
            arrayList.add(NativeMapExtensionsKt.nativeMapOf(C11591x.m7577a("id", userSearchWorkerResult.getId()), C11591x.m7577a("username", userSearchWorkerResult.getUsername()), C11591x.m7577a("comparator", userSearchWorkerResult.getComparator()), C11591x.m7577a("score", Double.valueOf(userSearchWorkerResult.getScore()))));
        }
        pairArr2[1] = C11591x.m7577a("results", NativeArrayExtensionsKt.toNativeArray(arrayList));
        pairArr[2] = C11591x.m7577a("payload", NativeMapExtensionsKt.nativeMapOf(pairArr2));
        return NativeMapExtensionsKt.nativeMapOf(pairArr);
    }

    public String toString() {
        List<UserSearchWorkerResult> list = this.results;
        String str = this.query;
        String str2 = this.uuid;
        String str3 = this.type;
        return "ReturnResultsEvent(results=" + list + ", query=" + str + ", uuid=" + str2 + ", type=" + str3 + ")";
    }
}
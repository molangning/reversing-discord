package com.discord.user_search_worker;

import co.discord.media_engine.C2690c;
import java.text.Normalizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C9545j;
import kotlin.collections.C9553r;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.C9612q;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.Regex;
import kotlinx.serialization.json.C9976l;
import kotlinx.serialization.json.Json;
import p340sf.C12466c;
import p355ti.EnumC12793f;
import pf.C11581q;

@Metadata(m14358d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0006\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\b\u0007\b\u0000\u0018\u0000 .2\u00020\u0001:\u0001.B-\u0012$\u0010!\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001e¢\u0006\u0004\b,\u0010-J\u0010\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002J\u0010\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0006H\u0002J\u0010\u0010\t\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\bH\u0002J \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u0018\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\nH\u0002J\u0018\u0010\u0018\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0017\u001a\u00020\u0015H\u0002J\u0018\u0010\u001a\u001a\u00020\u00042\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002J\u000e\u0010\u001c\u001a\u00020\u00042\u0006\u0010\u001b\u001a\u00020\nJ\u0006\u0010\u001d\u001a\u00020\u0004R5\u0010!\u001a \u0012\n\u0012\b\u0012\u0004\u0012\u00020 0\u001f\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00040\u001e8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R \u0010)\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000e0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010*¨\u0006/"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchWorker;", "", "Lcom/discord/user_search_worker/UserSearchUpdateUsersData;", "data", "", "mergeUsers", "Lcom/discord/user_search_worker/UserSearchQuerySetData;", "setNewQuery", "Lcom/discord/user_search_worker/UserSearchQueryClearData;", "clearQuery", "", "id", "Lcom/discord/user_search_worker/UserSearchTransformedUser;", "user", "Lcom/discord/user_search_worker/UserSearchQuerySetPayload;", "payload", "", "isValid", "needleBase", "haystackBase", "fuzzySearch", "", "score", "booster", "calculateScore", "uuid", "searchUsers", "dataJSON", "onMessage", "terminate", "Lkotlin/Function3;", "", "Lcom/discord/user_search_worker/UserSearchWorkerResult;", "onResults", "Lkotlin/jvm/functions/Function3;", "getOnResults", "()Lkotlin/jvm/functions/Function3;", "Lkotlinx/serialization/json/Json;", "json", "Lkotlinx/serialization/json/Json;", "", "users", "Ljava/util/Map;", "queries", "<init>", "(Lkotlin/jvm/functions/Function3;)V", "Companion", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0})
/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
public final class UserSearchWorker {
    private static final double CONTAIN_MATCH_VALUE = 5.0d;
    private static final double EXACT_MATCH_VALUE = 10.0d;
    private static final double FUZZY_MATCH_VALUE = 1.0d;
    private final Json json;
    private final Function3<List<UserSearchWorkerResult>, String, String, Unit> onResults;
    private final Map<String, UserSearchQuerySetPayload> queries;
    private final Map<String, UserSearchTransformedUser> users;
    public static final Companion Companion = new Companion(null);
    private static final Regex STRIP_DIACRITICS_REGEX_PATTERN = new Regex("[\\u0300-\\u036f]");

    @Metadata(m14358d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u000bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\f\u0010\t\u001a\u00020\n*\u00020\nH\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchWorker$Companion;", "", "()V", "CONTAIN_MATCH_VALUE", "", "EXACT_MATCH_VALUE", "FUZZY_MATCH_VALUE", "STRIP_DIACRITICS_REGEX_PATTERN", "Lkotlin/text/Regex;", "strippedOfDiacritics", "", "LocalResult", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
    public static final class Companion {

        @Metadata(m14358d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0006\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\b\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\t\u0010\f\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000e\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\n¨\u0006\u0014"}, m14357d2 = {"Lcom/discord/user_search_worker/UserSearchWorker$Companion$LocalResult;", "", "comparator", "", "score", "", "(Ljava/lang/String;D)V", "getComparator", "()Ljava/lang/String;", "getScore", "()D", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "user_search_worker_release"}, m14356k = 1, m14355mv = {1, 8, 0}, m14353xi = 48)
        /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes3.dex */
        public static final class LocalResult {
            private final String comparator;
            private final double score;

            public LocalResult(String comparator, double d) {
                C9612q.m13917h(comparator, "comparator");
                this.comparator = comparator;
                this.score = d;
            }

            public static /* synthetic */ LocalResult copy$default(LocalResult localResult, String str, double d, int i, Object obj) {
                if ((i & 1) != 0) {
                    str = localResult.comparator;
                }
                if ((i & 2) != 0) {
                    d = localResult.score;
                }
                return localResult.copy(str, d);
            }

            public final String component1() {
                return this.comparator;
            }

            public final double component2() {
                return this.score;
            }

            public final LocalResult copy(String comparator, double d) {
                C9612q.m13917h(comparator, "comparator");
                return new LocalResult(comparator, d);
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (obj instanceof LocalResult) {
                    LocalResult localResult = (LocalResult) obj;
                    return C9612q.m13922c(this.comparator, localResult.comparator) && Double.compare(this.score, localResult.score) == 0;
                }
                return false;
            }

            public final String getComparator() {
                return this.comparator;
            }

            public final double getScore() {
                return this.score;
            }

            public int hashCode() {
                return (this.comparator.hashCode() * 31) + C2690c.m32715a(this.score);
            }

            public String toString() {
                String str = this.comparator;
                double d = this.score;
                return "LocalResult(comparator=" + str + ", score=" + d + ")";
            }
        }

        private Companion() {
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final String strippedOfDiacritics(String str) {
            String nfdNormalized = Normalizer.normalize(str, Normalizer.Form.NFD);
            C9612q.m13918g(nfdNormalized, "nfdNormalized");
            return UserSearchWorker.STRIP_DIACRITICS_REGEX_PATTERN.m13867h(nfdNormalized, "");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserSearchWorker(Function3<? super List<UserSearchWorkerResult>, ? super String, ? super String, Unit> onResults) {
        C9612q.m13917h(onResults, "onResults");
        this.onResults = onResults;
        this.json = C9976l.m12702b(null, UserSearchWorker$json$1.INSTANCE, 1, null);
        this.users = new LinkedHashMap();
        this.queries = new LinkedHashMap();
    }

    private final double calculateScore(double d, double d2) {
        if (d2 == 0.0d) {
            d2 = FUZZY_MATCH_VALUE;
        }
        return d * d2;
    }

    private final void clearQuery(UserSearchQueryClearData userSearchQueryClearData) {
        this.queries.remove(userSearchQueryClearData.getUuid());
    }

    private final boolean fuzzySearch(String str, String str2) {
        Locale locale = Locale.ROOT;
        String lowerCase = str.toLowerCase(locale);
        C9612q.m13918g(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        String lowerCase2 = str2.toLowerCase(locale);
        C9612q.m13918g(lowerCase2, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        int length = lowerCase2.length();
        int length2 = lowerCase.length();
        if (length2 > length) {
            return false;
        }
        if (length2 == length) {
            return C9612q.m13922c(lowerCase, lowerCase2);
        }
        int length3 = lowerCase.length();
        int i = 0;
        for (int i2 = 0; i2 < length3; i2++) {
            char charAt = lowerCase.charAt(i2);
            while (true) {
                if (i >= length) {
                    break;
                }
                int i3 = i + 1;
                if (lowerCase2.charAt(i) == charAt) {
                    i = i3;
                    break;
                }
                i = i3;
            }
            if (i == length) {
                return false;
            }
        }
        return true;
    }

    private final boolean isValid(String str, UserSearchTransformedUser userSearchTransformedUser, UserSearchQuerySetPayload userSearchQuerySetPayload) {
        UserSearchQuerySetFilters filters;
        boolean z;
        boolean z2;
        if (userSearchQuerySetPayload.getBlacklist() != null && userSearchQuerySetPayload.getBlacklist().contains(str)) {
            return false;
        }
        if ((userSearchQuerySetPayload.getWhitelist() != null && userSearchQuerySetPayload.getWhitelist().contains(str)) || (filters = userSearchQuerySetPayload.getFilters()) == null) {
            return true;
        }
        Boolean friends = filters.getFriends();
        if (friends != null) {
            z = friends.booleanValue();
        } else {
            z = false;
        }
        Boolean isFriend = userSearchTransformedUser.isFriend();
        if (isFriend != null) {
            z2 = isFriend.booleanValue();
        } else {
            z2 = false;
        }
        String guild = filters.getGuild();
        if ((!z || !z2) && !userSearchTransformedUser.getNicknames().containsKey(guild)) {
            return false;
        }
        return true;
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x00a1, code lost:
        if (kotlin.jvm.internal.C9612q.m13922c(r3, r6) == false) goto L37;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void mergeUsers(com.discord.user_search_worker.UserSearchUpdateUsersData r14) {
        /*
            r13 = this;
            java.util.LinkedHashSet r0 = new java.util.LinkedHashSet
            r0.<init>()
            java.util.List r14 = r14.getPayload()
            java.util.Iterator r14 = r14.iterator()
            r1 = 0
        Le:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Lb1
            java.lang.Object r2 = r14.next()
            com.discord.user_search_worker.UserSearchTransformedUser r2 = (com.discord.user_search_worker.UserSearchTransformedUser) r2
            java.lang.String r3 = r2.getId()
            java.util.Map<java.lang.String, com.discord.user_search_worker.UserSearchTransformedUser> r4 = r13.users
            java.lang.Object r4 = r4.get(r3)
            com.discord.user_search_worker.UserSearchTransformedUser r4 = (com.discord.user_search_worker.UserSearchTransformedUser) r4
            if (r4 == 0) goto L71
            java.lang.String r6 = r2.getId()
            java.lang.String r7 = r2.getUsername()
            java.lang.Boolean r5 = r2.isBot()
            if (r5 != 0) goto L3a
            java.lang.Boolean r5 = r4.isBot()
        L3a:
            r8 = r5
            java.lang.Boolean r5 = r2.isFriend()
            if (r5 != 0) goto L45
            java.lang.Boolean r5 = r4.isFriend()
        L45:
            r9 = r5
            java.lang.String r5 = r2.getFriendNickname()
            if (r5 != 0) goto L50
            java.lang.String r5 = r4.getFriendNickname()
        L50:
            r10 = r5
            java.lang.String r5 = r2.getGlobalName()
            if (r5 != 0) goto L5b
            java.lang.String r5 = r4.getGlobalName()
        L5b:
            r11 = r5
            java.util.Map r5 = r4.getNicknames()
            java.util.Map r12 = r2.getNicknames()
            java.util.Map r12 = p304qf.C11886s.m6765o(r5, r12)
            r5 = r4
            com.discord.user_search_worker.UserSearchTransformedUser r5 = r5.copy(r6, r7, r8, r9, r10, r11, r12)
            if (r5 != 0) goto L70
            goto L71
        L70:
            r2 = r5
        L71:
            java.util.Map<java.lang.String, com.discord.user_search_worker.UserSearchTransformedUser> r5 = r13.users
            r5.put(r3, r2)
            java.util.Map<java.lang.String, com.discord.user_search_worker.UserSearchQuerySetPayload> r3 = r13.queries
            boolean r3 = r3.isEmpty()
            r5 = 1
            r3 = r3 ^ r5
            if (r3 == 0) goto Le
            java.lang.Boolean r3 = r2.isFriend()
            r6 = 0
            if (r4 == 0) goto L8c
            java.lang.Boolean r7 = r4.isFriend()
            goto L8d
        L8c:
            r7 = r6
        L8d:
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r7)
            if (r3 == 0) goto La3
            java.lang.String r3 = r2.getFriendNickname()
            if (r4 == 0) goto L9d
            java.lang.String r6 = r4.getFriendNickname()
        L9d:
            boolean r3 = kotlin.jvm.internal.C9612q.m13922c(r3, r6)
            if (r3 != 0) goto La4
        La3:
            r1 = r5
        La4:
            java.util.Map r2 = r2.getNicknames()
            java.util.Set r2 = r2.keySet()
            r0.addAll(r2)
            goto Le
        Lb1:
            java.util.Map<java.lang.String, com.discord.user_search_worker.UserSearchQuerySetPayload> r14 = r13.queries
            java.util.Set r14 = r14.entrySet()
            java.util.Iterator r14 = r14.iterator()
        Lbb:
            boolean r2 = r14.hasNext()
            if (r2 == 0) goto Lfb
            java.lang.Object r2 = r14.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.String r3 = (java.lang.String) r3
            java.lang.Object r2 = r2.getValue()
            com.discord.user_search_worker.UserSearchQuerySetPayload r2 = (com.discord.user_search_worker.UserSearchQuerySetPayload) r2
            com.discord.user_search_worker.UserSearchQuerySetFilters r4 = r2.getFilters()
            if (r4 == 0) goto Lf7
            java.lang.Boolean r5 = r4.getFriends()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r1)
            boolean r5 = kotlin.jvm.internal.C9612q.m13922c(r5, r6)
            if (r5 != 0) goto Lf7
            java.lang.String r5 = r4.getGuild()
            if (r5 == 0) goto Lbb
            java.lang.String r4 = r4.getGuild()
            boolean r4 = r0.contains(r4)
            if (r4 == 0) goto Lbb
        Lf7:
            r13.searchUsers(r3, r2)
            goto Lbb
        Lfb:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.discord.user_search_worker.UserSearchWorker.mergeUsers(com.discord.user_search_worker.UserSearchUpdateUsersData):void");
    }

    private final void searchUsers(String str, UserSearchQuerySetPayload userSearchQuerySetPayload) {
        boolean z;
        boolean z2;
        Comparator m5211b;
        List m14028v0;
        List<UserSearchWorkerResult> m14027w0;
        List m14101l;
        List m14036n0;
        List<String> m14059Q;
        double d;
        Regex regex;
        Companion.LocalResult localResult;
        String str2;
        Boolean strict;
        String query = userSearchQuerySetPayload.getQuery();
        UserSearchQuerySetFilters filters = userSearchQuerySetPayload.getFilters();
        char c = 0;
        if (filters != null && (strict = filters.getStrict()) != null) {
            z = strict.booleanValue();
        } else {
            z = false;
        }
        ArrayList arrayList = new ArrayList();
        char c2 = 1;
        if (query.length() == 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            this.onResults.invoke(arrayList, query, str);
            return;
        }
        String m13861c = Regex.f25372k.m13861c(query);
        EnumC12793f enumC12793f = EnumC12793f.IGNORE_CASE;
        Regex regex2 = new Regex("^" + m13861c, enumC12793f);
        Regex regex3 = new Regex(m13861c, enumC12793f);
        for (Map.Entry<String, UserSearchTransformedUser> entry : this.users.entrySet()) {
            String key = entry.getKey();
            UserSearchTransformedUser value = entry.getValue();
            String username = value.getUsername();
            if (isValid(key, value, userSearchQuerySetPayload)) {
                if (z == c2) {
                    String[] strArr = new String[4];
                    strArr[c] = value.getUsername();
                    strArr[c2] = value.getGlobalName();
                    strArr[2] = value.getFriendNickname();
                    Map<String, String> nicknames = value.getNicknames();
                    UserSearchQuerySetFilters filters2 = userSearchQuerySetPayload.getFilters();
                    if (filters2 != null) {
                        str2 = filters2.getGuild();
                    } else {
                        str2 = null;
                    }
                    strArr[3] = nicknames.get(str2);
                    m14036n0 = C9545j.m14101l(strArr);
                } else if (!z) {
                    String[] strArr2 = new String[3];
                    strArr2[c] = value.getUsername();
                    strArr2[c2] = value.getGlobalName();
                    strArr2[2] = value.getFriendNickname();
                    m14101l = C9545j.m14101l(strArr2);
                    m14036n0 = C9553r.m14036n0(m14101l, value.getNicknames().values());
                } else {
                    throw new C11581q();
                }
                m14059Q = C9553r.m14059Q(m14036n0);
                UserSearchWorkerResult userSearchWorkerResult = null;
                for (String str3 : m14059Q) {
                    Double d2 = userSearchQuerySetPayload.getBoosters().get(key);
                    if (d2 != null) {
                        d = d2.doubleValue();
                    } else {
                        d = 0.0d;
                    }
                    ArrayList arrayList2 = arrayList;
                    double d3 = d;
                    if (regex2.m13874a(str3)) {
                        regex = regex2;
                        localResult = new Companion.LocalResult(str3, calculateScore(EXACT_MATCH_VALUE, d3));
                    } else {
                        regex = regex2;
                        if (regex3.m13874a(str3)) {
                            localResult = new Companion.LocalResult(str3, calculateScore(CONTAIN_MATCH_VALUE, d3));
                        } else if (fuzzySearch(query, Companion.strippedOfDiacritics(str3))) {
                            localResult = new Companion.LocalResult(str3, calculateScore(FUZZY_MATCH_VALUE, d3));
                        } else {
                            localResult = null;
                        }
                    }
                    if (localResult != null && (userSearchWorkerResult == null || userSearchWorkerResult.getScore() < localResult.getScore())) {
                        userSearchWorkerResult = new UserSearchWorkerResult(key, username, localResult.getComparator(), localResult.getScore());
                    }
                    arrayList = arrayList2;
                    regex2 = regex;
                }
                ArrayList arrayList3 = arrayList;
                Regex regex4 = regex2;
                if (userSearchWorkerResult != null) {
                    arrayList3.add(userSearchWorkerResult);
                    arrayList = arrayList3;
                } else {
                    arrayList = arrayList3;
                }
                regex2 = regex4;
                c = 0;
                c2 = 1;
            }
        }
        m5211b = C12466c.m5211b(UserSearchWorker$searchUsers$sortedResults$1.INSTANCE, UserSearchWorker$searchUsers$sortedResults$2.INSTANCE);
        m14028v0 = C9553r.m14028v0(arrayList, m5211b);
        m14027w0 = C9553r.m14027w0(m14028v0, userSearchQuerySetPayload.getLimit());
        this.onResults.invoke(m14027w0, query, str);
    }

    private final void setNewQuery(UserSearchQuerySetData userSearchQuerySetData) {
        this.queries.put(userSearchQuerySetData.getUuid(), userSearchQuerySetData.getPayload());
        searchUsers(userSearchQuerySetData.getUuid(), userSearchQuerySetData.getPayload());
    }

    public final Function3<List<UserSearchWorkerResult>, String, String, Unit> getOnResults() {
        return this.onResults;
    }

    public final void onMessage(String dataJSON) {
        C9612q.m13917h(dataJSON, "dataJSON");
        Json json = this.json;
        json.mo265a();
        UserSearchData userSearchData = (UserSearchData) json.mo232b(UserSearchData.Companion.serializer(), dataJSON);
        if (userSearchData instanceof UserSearchUpdateUsersData) {
            mergeUsers((UserSearchUpdateUsersData) userSearchData);
        } else if (userSearchData instanceof UserSearchQuerySetData) {
            setNewQuery((UserSearchQuerySetData) userSearchData);
        } else if (userSearchData instanceof UserSearchQueryClearData) {
            clearQuery((UserSearchQueryClearData) userSearchData);
        }
    }

    public final void terminate() {
        this.users.clear();
        this.queries.clear();
    }
}
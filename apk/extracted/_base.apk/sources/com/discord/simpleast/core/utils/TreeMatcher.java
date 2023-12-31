package com.discord.simpleast.core.utils;

import android.text.style.CharacterStyle;
import com.discord.simpleast.core.node.Node;
import com.discord.simpleast.core.node.StyleNode;
import com.discord.simpleast.core.node.TextNode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
public class TreeMatcher {
    private Map<Class, NodeMatcher> matchers = new HashMap();

    /* loaded from: /home/user/temp/discord/apk/extracted/_base.apk/classes5.dex */
    public interface NodeMatcher {
        boolean matches(Node node, Node node2);
    }

    public boolean matches(List<? extends Node> list, List<? extends Node> list2) {
        final ArrayList arrayList = new ArrayList();
        final ArrayList arrayList2 = new ArrayList();
        ASTUtils.traversePostOrder(list, new NodeProcessor() { // from class: com.discord.simpleast.core.utils.TreeMatcher.1
            @Override // com.discord.simpleast.core.utils.NodeProcessor
            public void processNode(Node node) {
                arrayList.add(node);
            }
        });
        ASTUtils.traversePostOrder(list2, new NodeProcessor() { // from class: com.discord.simpleast.core.utils.TreeMatcher.2
            @Override // com.discord.simpleast.core.utils.NodeProcessor
            public void processNode(Node node) {
                arrayList2.add(node);
            }
        });
        if (arrayList.size() != arrayList2.size()) {
            return false;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            Node node = (Node) arrayList.get(i);
            Node node2 = (Node) arrayList2.get(i);
            if (node.getClass() != node2.getClass()) {
                return false;
            }
            Class<?> cls = node.getClass();
            if (this.matchers.containsKey(cls) && !this.matchers.get(cls).matches(node, node2)) {
                return false;
            }
        }
        return true;
    }

    public void registerDefaultMatchers() {
        registerMatcher(TextNode.class, new NodeMatcher() { // from class: com.discord.simpleast.core.utils.TreeMatcher.3
            @Override // com.discord.simpleast.core.utils.TreeMatcher.NodeMatcher
            public boolean matches(Node node, Node node2) {
                return ((TextNode) node).getContent().equals(((TextNode) node2).getContent());
            }
        });
        registerMatcher(StyleNode.class, new NodeMatcher() { // from class: com.discord.simpleast.core.utils.TreeMatcher.4
            @Override // com.discord.simpleast.core.utils.TreeMatcher.NodeMatcher
            public boolean matches(Node node, Node node2) {
                List styles = ((StyleNode) node).getStyles();
                List styles2 = ((StyleNode) node2).getStyles();
                if (styles.size() != styles2.size()) {
                    return false;
                }
                for (int i = 0; i < styles.size(); i++) {
                    if (((CharacterStyle) styles.get(i)).getClass() != ((CharacterStyle) styles2.get(i)).getClass()) {
                        return false;
                    }
                }
                return true;
            }
        });
    }

    public void registerMatcher(Class cls, NodeMatcher nodeMatcher) {
        this.matchers.put(cls, nodeMatcher);
    }
}

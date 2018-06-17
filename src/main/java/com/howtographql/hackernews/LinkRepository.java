package com.howtographql.hackernews;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class LinkRepository {

    private final List<Link> links = new ArrayList<>();

    public LinkRepository() {
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docks"));
    }

    public List<Link> getAllLinks() {
        return Collections.unmodifiableList(links);
    }

    public void saveLink(Link link) {
        links.add(link);
    }
}

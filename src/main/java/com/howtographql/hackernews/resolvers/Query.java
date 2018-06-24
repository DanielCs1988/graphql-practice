package com.howtographql.hackernews.resolvers;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.howtographql.hackernews.models.Link;
import com.howtographql.hackernews.models.LinkFilter;
import com.howtographql.hackernews.services.LinkRepository;

import java.util.List;

public class Query implements GraphQLRootResolver {

    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks(LinkFilter filter, Number skip, Number first) {
        return linkRepository.getAllLinks(filter, skip.intValue(), first.intValue());
    }

    public Link getLink(String id) {
        return linkRepository.findById(id);
    }
}

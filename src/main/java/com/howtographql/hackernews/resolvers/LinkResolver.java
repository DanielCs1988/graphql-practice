package com.howtographql.hackernews.resolvers;

import com.coxautodev.graphql.tools.GraphQLResolver;
import com.howtographql.hackernews.models.Link;
import com.howtographql.hackernews.models.User;
import com.howtographql.hackernews.services.UserRepository;

public class LinkResolver implements GraphQLResolver<Link> {

    private final UserRepository userRepository;

    public LinkResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User postedBy(Link link) {
        return link.getUserId() == null ? null : userRepository.findById(link.getUserId());
    }
}

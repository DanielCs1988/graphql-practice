package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLResolver;

public class LinkResolver implements GraphQLResolver<Link> {

    private final UserRepository userRepository;

    public LinkResolver(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User postedBy(Link link) {
        return link.getUserId() == null ? null : userRepository.findById(link.getUserId());
    }
}

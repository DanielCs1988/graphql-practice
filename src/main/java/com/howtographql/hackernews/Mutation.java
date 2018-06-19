package com.howtographql.hackernews;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import graphql.GraphQLException;
import graphql.schema.DataFetchingEnvironment;

public class Mutation implements GraphQLRootResolver {

    private final LinkRepository linkRepository;
    private final UserRepository userRepository;

    public Mutation(LinkRepository linkRepository, UserRepository userRepository) {
        this.linkRepository = linkRepository;
        this.userRepository = userRepository;
    }

    public Link createLink(String url, String description, DataFetchingEnvironment env) {
        AuthContext ctx = env.getContext();
        Link link = new Link(url, description, ctx.getUser().getId());
        return linkRepository.saveLink(link);
    }

    public User createUser(String name, AuthData auth) {
        User user = new User(name, auth.getEmail(), auth.getPassword());
        return userRepository.saveUser(user);
    }

    public SigninPayload signinUser(AuthData authData) throws IllegalAccessException {
        User user = userRepository.findByEmail(authData.getEmail());
        if (user.getPassword().equals(authData.getPassword())) {
            return new SigninPayload(user.getId(), user);
        }
        throw new GraphQLException("Invalid credentials!");
    }
}

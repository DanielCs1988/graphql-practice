package com.howtographql.hackernews.resolvers;

import com.fasterxml.jackson.annotation.JsonIgnore;
import graphql.ExceptionWhileDataFetching;

public class SanitizedError extends ExceptionWhileDataFetching {

    public SanitizedError(ExceptionWhileDataFetching e) {
        super(e.getException());
    }

    @Override
    @JsonIgnore
    public Throwable getException() {
        return super.getException();
    }
}

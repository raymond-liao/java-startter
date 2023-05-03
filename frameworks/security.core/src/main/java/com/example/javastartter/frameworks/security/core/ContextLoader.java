package com.example.javastartter.frameworks.security.core;

import com.example.javastartter.frameworks.context.core.GlobalUserContextResetter;
import com.example.javastartter.frameworks.domain.core.Id;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Nullable;

public class ContextLoader {

    private final ContextProvider contextProvider;

    public ContextLoader(ContextProvider contextProvider) {
        this.contextProvider = contextProvider;
    }

    public void load(@Nullable String tokenId) {
        clear();
        if (missing(tokenId)) return;
        reset(loadContext(tokenId));
    }

    public void clear() {
        GlobalUserContextResetter.clear();
        GlobalSecurityContextResetter.clear();
    }

    private boolean missing(String tokenId) {
        return StringUtils.isBlank(tokenId);
    }

    private Context loadContext(String tokenId) {
        return contextProvider.get(Id.id(tokenId)).orElse(Context.INVALID);
    }

    private void reset(Context context) {
        GlobalUserContextResetter.reset(context.userContext());
        GlobalSecurityContextResetter.reset(context.securityContext());
    }

}

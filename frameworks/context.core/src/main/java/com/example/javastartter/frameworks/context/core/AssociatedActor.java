package com.example.javastartter.frameworks.context.core;

import com.example.javastartter.frameworks.domain.core.Id;
import com.example.javastartter.frameworks.domain.core.Identity;

public class AssociatedActor {

    private final Id actorId;
    private final Actors actors;

    public AssociatedActor(Id actorId, Actors actors) {
        this.actorId = actorId;
        this.actors = actors;
    }

    public Id id() {
        return actorId;
    }

    public Identity value() {
        return actors.get(actorId);
    }

}

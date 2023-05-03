package com.example.javastartter.frameworks.context.core;

import com.example.javastartter.frameworks.domain.core.Id;
import com.example.javastartter.frameworks.domain.core.Identity;

public interface Actors {

    Identity get(Id id);

}

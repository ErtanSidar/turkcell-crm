package io.github.ertansidar.pipeline.auth;

import java.util.List;

public interface AuthorizedRequest {
    List<String> getRequiredRoles();
}

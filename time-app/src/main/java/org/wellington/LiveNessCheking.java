package org.wellington;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Liveness;

@Liveness
public class LiveNessCheking implements HealthCheck {
    @Override
    public HealthCheckResponse call() {
        return HealthCheckResponse.up("estou vivo");
    }
}

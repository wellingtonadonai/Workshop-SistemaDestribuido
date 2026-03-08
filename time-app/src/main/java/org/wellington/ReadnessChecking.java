package org.wellington;

import org.eclipse.microprofile.health.HealthCheck;
import org.eclipse.microprofile.health.HealthCheckResponse;
import org.eclipse.microprofile.health.Readiness;
import org.eclipse.microprofile.rest.client.inject.RestClient;

@Readiness
public class ReadnessChecking implements HealthCheck {

    @RestClient
    TimeApiService timeApiService;

    @Override
    public HealthCheckResponse call() {

        if (timeApiService.getTime().contains("FallBack")){
            return HealthCheckResponse.down("não estou pronto");
        }else {
            return HealthCheckResponse.up("estou pronto");
        }
    }
}

package com.example.javastartter;

import com.example.javastartter.frameworks.test.container.WithTestContainers;
import com.example.javastartter.frameworks.test.postgres.PostgresContainer;
import com.example.javastartter.frameworks.test.web.RestTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;

@ActiveProfiles("ci")
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@WithTestContainers(containers = {PostgresContainer.class})
public abstract class IntegrationTest extends RestTest {

}

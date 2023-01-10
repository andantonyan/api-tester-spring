package com.andantonyan.apitester.github.contributor;

import com.andantonyan.apitester.common.interceptor.DefaultInterceptor;
import com.andantonyan.apitester.github.client.GitHubClient;
import com.andantonyan.apitester.github.common.AbstractGithubTest;
import com.andantonyan.apitester.github.model.Contributor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.testng.annotations.Test;

import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.isA;
import static org.hamcrest.Matchers.notNullValue;

@Import(DefaultInterceptor.class)
public class ContributorsGetTest extends AbstractGithubTest {

    @Autowired
    GitHubClient gitHubClient;

    @Test
    public void shouldGetContributorsList() {
        List<Contributor> contributors = gitHubClient.contributors("OpenFeign", "feign");
        assertThat(contributors, notNullValue());
        assertThat(contributors, isA(List.class));
    }
}
package com.andantonyan.apitester.github.client;

import com.andantonyan.apitester.github.model.Contributor;
import com.andantonyan.apitester.github.model.Issue;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@FeignClient(name = "github")
public interface GitHubClient {
    @RequestMapping(method = RequestMethod.GET, value = "/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@RequestParam("owner") String owner, @RequestParam("repo") String repo);

    @RequestMapping(method = RequestMethod.POST, value = "POST /repos/{owner}/{repo}/issues")
    void createIssue(Issue issue, @RequestParam("owner") String owner, @RequestParam("repo") String repo);
}

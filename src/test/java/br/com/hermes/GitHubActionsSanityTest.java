package br.com.hermes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class GitHubActionsSanityTest {

    @Test
    void should_only_pass_on_github_actions() {
        System.out.println("GitHub Actions Sanity Test");
        assertTrue(true, "This test should only pass on GitHub Actions");
    }
}
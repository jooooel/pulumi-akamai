// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanChallengeInjectionRulesArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanChallengeInjectionRulesArgs Empty = new BotmanChallengeInjectionRulesArgs();

    @Import(name="challengeInjectionRules", required=true)
    private Output<String> challengeInjectionRules;

    public Output<String> challengeInjectionRules() {
        return this.challengeInjectionRules;
    }

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    private BotmanChallengeInjectionRulesArgs() {}

    private BotmanChallengeInjectionRulesArgs(BotmanChallengeInjectionRulesArgs $) {
        this.challengeInjectionRules = $.challengeInjectionRules;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanChallengeInjectionRulesArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanChallengeInjectionRulesArgs $;

        public Builder() {
            $ = new BotmanChallengeInjectionRulesArgs();
        }

        public Builder(BotmanChallengeInjectionRulesArgs defaults) {
            $ = new BotmanChallengeInjectionRulesArgs(Objects.requireNonNull(defaults));
        }

        public Builder challengeInjectionRules(Output<String> challengeInjectionRules) {
            $.challengeInjectionRules = challengeInjectionRules;
            return this;
        }

        public Builder challengeInjectionRules(String challengeInjectionRules) {
            return challengeInjectionRules(Output.of(challengeInjectionRules));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public BotmanChallengeInjectionRulesArgs build() {
            $.challengeInjectionRules = Objects.requireNonNull($.challengeInjectionRules, "expected parameter 'challengeInjectionRules' to be non-null");
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class BotmanChallengeInterceptionRulesState extends com.pulumi.resources.ResourceArgs {

    public static final BotmanChallengeInterceptionRulesState Empty = new BotmanChallengeInterceptionRulesState();

    @Import(name="challengeInterceptionRules")
    private @Nullable Output<String> challengeInterceptionRules;

    public Optional<Output<String>> challengeInterceptionRules() {
        return Optional.ofNullable(this.challengeInterceptionRules);
    }

    @Import(name="configId")
    private @Nullable Output<Integer> configId;

    public Optional<Output<Integer>> configId() {
        return Optional.ofNullable(this.configId);
    }

    private BotmanChallengeInterceptionRulesState() {}

    private BotmanChallengeInterceptionRulesState(BotmanChallengeInterceptionRulesState $) {
        this.challengeInterceptionRules = $.challengeInterceptionRules;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanChallengeInterceptionRulesState defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanChallengeInterceptionRulesState $;

        public Builder() {
            $ = new BotmanChallengeInterceptionRulesState();
        }

        public Builder(BotmanChallengeInterceptionRulesState defaults) {
            $ = new BotmanChallengeInterceptionRulesState(Objects.requireNonNull(defaults));
        }

        public Builder challengeInterceptionRules(@Nullable Output<String> challengeInterceptionRules) {
            $.challengeInterceptionRules = challengeInterceptionRules;
            return this;
        }

        public Builder challengeInterceptionRules(String challengeInterceptionRules) {
            return challengeInterceptionRules(Output.of(challengeInterceptionRules));
        }

        public Builder configId(@Nullable Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public BotmanChallengeInterceptionRulesState build() {
            return $;
        }
    }

}
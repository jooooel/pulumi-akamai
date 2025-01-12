// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanChallengeActionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanChallengeActionPlainArgs Empty = new GetBotmanChallengeActionPlainArgs();

    @Import(name="actionId")
    private @Nullable String actionId;

    public Optional<String> actionId() {
        return Optional.ofNullable(this.actionId);
    }

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    private GetBotmanChallengeActionPlainArgs() {}

    private GetBotmanChallengeActionPlainArgs(GetBotmanChallengeActionPlainArgs $) {
        this.actionId = $.actionId;
        this.configId = $.configId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanChallengeActionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanChallengeActionPlainArgs $;

        public Builder() {
            $ = new GetBotmanChallengeActionPlainArgs();
        }

        public Builder(GetBotmanChallengeActionPlainArgs defaults) {
            $ = new GetBotmanChallengeActionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder actionId(@Nullable String actionId) {
            $.actionId = actionId;
            return this;
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public GetBotmanChallengeActionPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}

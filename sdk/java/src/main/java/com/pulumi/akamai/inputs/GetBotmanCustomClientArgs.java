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


public final class GetBotmanCustomClientArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanCustomClientArgs Empty = new GetBotmanCustomClientArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="customClientId")
    private @Nullable Output<String> customClientId;

    public Optional<Output<String>> customClientId() {
        return Optional.ofNullable(this.customClientId);
    }

    private GetBotmanCustomClientArgs() {}

    private GetBotmanCustomClientArgs(GetBotmanCustomClientArgs $) {
        this.configId = $.configId;
        this.customClientId = $.customClientId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanCustomClientArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanCustomClientArgs $;

        public Builder() {
            $ = new GetBotmanCustomClientArgs();
        }

        public Builder(GetBotmanCustomClientArgs defaults) {
            $ = new GetBotmanCustomClientArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder customClientId(@Nullable Output<String> customClientId) {
            $.customClientId = customClientId;
            return this;
        }

        public Builder customClientId(String customClientId) {
            return customClientId(Output.of(customClientId));
        }

        public GetBotmanCustomClientArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            return $;
        }
    }

}
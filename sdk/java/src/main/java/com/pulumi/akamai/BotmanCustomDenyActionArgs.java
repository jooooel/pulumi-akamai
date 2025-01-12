// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class BotmanCustomDenyActionArgs extends com.pulumi.resources.ResourceArgs {

    public static final BotmanCustomDenyActionArgs Empty = new BotmanCustomDenyActionArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="customDenyAction", required=true)
    private Output<String> customDenyAction;

    public Output<String> customDenyAction() {
        return this.customDenyAction;
    }

    private BotmanCustomDenyActionArgs() {}

    private BotmanCustomDenyActionArgs(BotmanCustomDenyActionArgs $) {
        this.configId = $.configId;
        this.customDenyAction = $.customDenyAction;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(BotmanCustomDenyActionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private BotmanCustomDenyActionArgs $;

        public Builder() {
            $ = new BotmanCustomDenyActionArgs();
        }

        public Builder(BotmanCustomDenyActionArgs defaults) {
            $ = new BotmanCustomDenyActionArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder customDenyAction(Output<String> customDenyAction) {
            $.customDenyAction = customDenyAction;
            return this;
        }

        public Builder customDenyAction(String customDenyAction) {
            return customDenyAction(Output.of(customDenyAction));
        }

        public BotmanCustomDenyActionArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.customDenyAction = Objects.requireNonNull($.customDenyAction, "expected parameter 'customDenyAction' to be non-null");
            return $;
        }
    }

}

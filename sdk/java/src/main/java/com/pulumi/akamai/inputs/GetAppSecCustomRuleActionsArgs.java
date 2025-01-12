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


public final class GetAppSecCustomRuleActionsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecCustomRuleActionsArgs Empty = new GetAppSecCustomRuleActionsArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="customRuleId")
    private @Nullable Output<Integer> customRuleId;

    public Optional<Output<Integer>> customRuleId() {
        return Optional.ofNullable(this.customRuleId);
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecCustomRuleActionsArgs() {}

    private GetAppSecCustomRuleActionsArgs(GetAppSecCustomRuleActionsArgs $) {
        this.configId = $.configId;
        this.customRuleId = $.customRuleId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecCustomRuleActionsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecCustomRuleActionsArgs $;

        public Builder() {
            $ = new GetAppSecCustomRuleActionsArgs();
        }

        public Builder(GetAppSecCustomRuleActionsArgs defaults) {
            $ = new GetAppSecCustomRuleActionsArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder customRuleId(@Nullable Output<Integer> customRuleId) {
            $.customRuleId = customRuleId;
            return this;
        }

        public Builder customRuleId(Integer customRuleId) {
            return customRuleId(Output.of(customRuleId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetAppSecCustomRuleActionsArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}

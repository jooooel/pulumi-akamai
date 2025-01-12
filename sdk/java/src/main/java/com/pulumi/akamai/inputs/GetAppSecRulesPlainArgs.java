// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecRulesPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecRulesPlainArgs Empty = new GetAppSecRulesPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="ruleId")
    private @Nullable Integer ruleId;

    public Optional<Integer> ruleId() {
        return Optional.ofNullable(this.ruleId);
    }

    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecRulesPlainArgs() {}

    private GetAppSecRulesPlainArgs(GetAppSecRulesPlainArgs $) {
        this.configId = $.configId;
        this.ruleId = $.ruleId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecRulesPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecRulesPlainArgs $;

        public Builder() {
            $ = new GetAppSecRulesPlainArgs();
        }

        public Builder(GetAppSecRulesPlainArgs defaults) {
            $ = new GetAppSecRulesPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder ruleId(@Nullable Integer ruleId) {
            $.ruleId = ruleId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetAppSecRulesPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}

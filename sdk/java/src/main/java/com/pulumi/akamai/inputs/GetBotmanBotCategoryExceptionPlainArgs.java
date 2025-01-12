// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetBotmanBotCategoryExceptionPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanBotCategoryExceptionPlainArgs Empty = new GetBotmanBotCategoryExceptionPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetBotmanBotCategoryExceptionPlainArgs() {}

    private GetBotmanBotCategoryExceptionPlainArgs(GetBotmanBotCategoryExceptionPlainArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanBotCategoryExceptionPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanBotCategoryExceptionPlainArgs $;

        public Builder() {
            $ = new GetBotmanBotCategoryExceptionPlainArgs();
        }

        public Builder(GetBotmanBotCategoryExceptionPlainArgs defaults) {
            $ = new GetBotmanBotCategoryExceptionPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetBotmanBotCategoryExceptionPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}

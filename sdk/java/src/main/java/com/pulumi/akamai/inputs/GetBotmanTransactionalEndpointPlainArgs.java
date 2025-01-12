// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetBotmanTransactionalEndpointPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanTransactionalEndpointPlainArgs Empty = new GetBotmanTransactionalEndpointPlainArgs();

    @Import(name="configId", required=true)
    private Integer configId;

    public Integer configId() {
        return this.configId;
    }

    @Import(name="operationId")
    private @Nullable String operationId;

    public Optional<String> operationId() {
        return Optional.ofNullable(this.operationId);
    }

    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetBotmanTransactionalEndpointPlainArgs() {}

    private GetBotmanTransactionalEndpointPlainArgs(GetBotmanTransactionalEndpointPlainArgs $) {
        this.configId = $.configId;
        this.operationId = $.operationId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanTransactionalEndpointPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanTransactionalEndpointPlainArgs $;

        public Builder() {
            $ = new GetBotmanTransactionalEndpointPlainArgs();
        }

        public Builder(GetBotmanTransactionalEndpointPlainArgs defaults) {
            $ = new GetBotmanTransactionalEndpointPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder operationId(@Nullable String operationId) {
            $.operationId = operationId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetBotmanTransactionalEndpointPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}

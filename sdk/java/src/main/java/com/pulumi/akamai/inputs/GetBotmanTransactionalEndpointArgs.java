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


public final class GetBotmanTransactionalEndpointArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetBotmanTransactionalEndpointArgs Empty = new GetBotmanTransactionalEndpointArgs();

    @Import(name="configId", required=true)
    private Output<Integer> configId;

    public Output<Integer> configId() {
        return this.configId;
    }

    @Import(name="operationId")
    private @Nullable Output<String> operationId;

    public Optional<Output<String>> operationId() {
        return Optional.ofNullable(this.operationId);
    }

    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetBotmanTransactionalEndpointArgs() {}

    private GetBotmanTransactionalEndpointArgs(GetBotmanTransactionalEndpointArgs $) {
        this.configId = $.configId;
        this.operationId = $.operationId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetBotmanTransactionalEndpointArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetBotmanTransactionalEndpointArgs $;

        public Builder() {
            $ = new GetBotmanTransactionalEndpointArgs();
        }

        public Builder(GetBotmanTransactionalEndpointArgs defaults) {
            $ = new GetBotmanTransactionalEndpointArgs(Objects.requireNonNull(defaults));
        }

        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        public Builder operationId(@Nullable Output<String> operationId) {
            $.operationId = operationId;
            return this;
        }

        public Builder operationId(String operationId) {
            return operationId(Output.of(operationId));
        }

        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetBotmanTransactionalEndpointArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}
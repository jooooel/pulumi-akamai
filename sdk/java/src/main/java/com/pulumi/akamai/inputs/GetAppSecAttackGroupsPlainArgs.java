// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


public final class GetAppSecAttackGroupsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecAttackGroupsPlainArgs Empty = new GetAppSecAttackGroupsPlainArgs();

    @Import(name="attackGroup")
    private @Nullable String attackGroup;

    public Optional<String> attackGroup() {
        return Optional.ofNullable(this.attackGroup);
    }

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

    private GetAppSecAttackGroupsPlainArgs() {}

    private GetAppSecAttackGroupsPlainArgs(GetAppSecAttackGroupsPlainArgs $) {
        this.attackGroup = $.attackGroup;
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecAttackGroupsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecAttackGroupsPlainArgs $;

        public Builder() {
            $ = new GetAppSecAttackGroupsPlainArgs();
        }

        public Builder(GetAppSecAttackGroupsPlainArgs defaults) {
            $ = new GetAppSecAttackGroupsPlainArgs(Objects.requireNonNull(defaults));
        }

        public Builder attackGroup(@Nullable String attackGroup) {
            $.attackGroup = attackGroup;
            return this;
        }

        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetAppSecAttackGroupsPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}

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


public final class GetAppSecAttackGroupsArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecAttackGroupsArgs Empty = new GetAppSecAttackGroupsArgs();

    /**
     * . Unique name of the attack group you want to return information for. If not included, information is returned for all your attack groups.
     * 
     */
    @Import(name="attackGroup")
    private @Nullable Output<String> attackGroup;

    /**
     * @return . Unique name of the attack group you want to return information for. If not included, information is returned for all your attack groups.
     * 
     */
    public Optional<Output<String>> attackGroup() {
        return Optional.ofNullable(this.attackGroup);
    }

    /**
     * . Unique identifier of the security configuration associated with the attack group.
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration associated with the attack group.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * . Unique identifier of the security policy associated with the attack group.
     * 
     */
    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    /**
     * @return . Unique identifier of the security policy associated with the attack group.
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecAttackGroupsArgs() {}

    private GetAppSecAttackGroupsArgs(GetAppSecAttackGroupsArgs $) {
        this.attackGroup = $.attackGroup;
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecAttackGroupsArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecAttackGroupsArgs $;

        public Builder() {
            $ = new GetAppSecAttackGroupsArgs();
        }

        public Builder(GetAppSecAttackGroupsArgs defaults) {
            $ = new GetAppSecAttackGroupsArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param attackGroup . Unique name of the attack group you want to return information for. If not included, information is returned for all your attack groups.
         * 
         * @return builder
         * 
         */
        public Builder attackGroup(@Nullable Output<String> attackGroup) {
            $.attackGroup = attackGroup;
            return this;
        }

        /**
         * @param attackGroup . Unique name of the attack group you want to return information for. If not included, information is returned for all your attack groups.
         * 
         * @return builder
         * 
         */
        public Builder attackGroup(String attackGroup) {
            return attackGroup(Output.of(attackGroup));
        }

        /**
         * @param configId . Unique identifier of the security configuration associated with the attack group.
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId . Unique identifier of the security configuration associated with the attack group.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param securityPolicyId . Unique identifier of the security policy associated with the attack group.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId . Unique identifier of the security policy associated with the attack group.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        public GetAppSecAttackGroupsArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}
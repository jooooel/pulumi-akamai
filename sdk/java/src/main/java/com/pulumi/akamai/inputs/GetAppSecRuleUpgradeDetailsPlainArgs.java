// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai.inputs;

import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class GetAppSecRuleUpgradeDetailsPlainArgs extends com.pulumi.resources.InvokeArgs {

    public static final GetAppSecRuleUpgradeDetailsPlainArgs Empty = new GetAppSecRuleUpgradeDetailsPlainArgs();

    /**
     * . Unique identifier of the security configuration associated with the Kona Rule Sets.
     * 
     */
    @Import(name="configId", required=true)
    private Integer configId;

    /**
     * @return . Unique identifier of the security configuration associated with the Kona Rule Sets.
     * 
     */
    public Integer configId() {
        return this.configId;
    }

    /**
     * . Unique identifier of the security policy associated with the Kona Rule Sets.
     * 
     */
    @Import(name="securityPolicyId", required=true)
    private String securityPolicyId;

    /**
     * @return . Unique identifier of the security policy associated with the Kona Rule Sets.
     * 
     */
    public String securityPolicyId() {
        return this.securityPolicyId;
    }

    private GetAppSecRuleUpgradeDetailsPlainArgs() {}

    private GetAppSecRuleUpgradeDetailsPlainArgs(GetAppSecRuleUpgradeDetailsPlainArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GetAppSecRuleUpgradeDetailsPlainArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GetAppSecRuleUpgradeDetailsPlainArgs $;

        public Builder() {
            $ = new GetAppSecRuleUpgradeDetailsPlainArgs();
        }

        public Builder(GetAppSecRuleUpgradeDetailsPlainArgs defaults) {
            $ = new GetAppSecRuleUpgradeDetailsPlainArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId . Unique identifier of the security configuration associated with the Kona Rule Sets.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param securityPolicyId . Unique identifier of the security policy associated with the Kona Rule Sets.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        public GetAppSecRuleUpgradeDetailsPlainArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            return $;
        }
    }

}
// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.akamai;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;


public final class AppSecThreatIntelArgs extends com.pulumi.resources.ResourceArgs {

    public static final AppSecThreatIntelArgs Empty = new AppSecThreatIntelArgs();

    /**
     * . Unique identifier of the security configuration associated with the threat intelligence protection settings being modified.
     * 
     */
    @Import(name="configId", required=true)
    private Output<Integer> configId;

    /**
     * @return . Unique identifier of the security configuration associated with the threat intelligence protection settings being modified.
     * 
     */
    public Output<Integer> configId() {
        return this.configId;
    }

    /**
     * . Unique identifier of the security policy associated with the threat intelligence protection settings being modified.
     * 
     */
    @Import(name="securityPolicyId", required=true)
    private Output<String> securityPolicyId;

    /**
     * @return . Unique identifier of the security policy associated with the threat intelligence protection settings being modified.
     * 
     */
    public Output<String> securityPolicyId() {
        return this.securityPolicyId;
    }

    /**
     * . Set to `on` to enable threat intelligence protection; set to **off** to disable threat intelligence protection.
     * 
     */
    @Import(name="threatIntel", required=true)
    private Output<String> threatIntel;

    /**
     * @return . Set to `on` to enable threat intelligence protection; set to **off** to disable threat intelligence protection.
     * 
     */
    public Output<String> threatIntel() {
        return this.threatIntel;
    }

    private AppSecThreatIntelArgs() {}

    private AppSecThreatIntelArgs(AppSecThreatIntelArgs $) {
        this.configId = $.configId;
        this.securityPolicyId = $.securityPolicyId;
        this.threatIntel = $.threatIntel;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(AppSecThreatIntelArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private AppSecThreatIntelArgs $;

        public Builder() {
            $ = new AppSecThreatIntelArgs();
        }

        public Builder(AppSecThreatIntelArgs defaults) {
            $ = new AppSecThreatIntelArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param configId . Unique identifier of the security configuration associated with the threat intelligence protection settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder configId(Output<Integer> configId) {
            $.configId = configId;
            return this;
        }

        /**
         * @param configId . Unique identifier of the security configuration associated with the threat intelligence protection settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder configId(Integer configId) {
            return configId(Output.of(configId));
        }

        /**
         * @param securityPolicyId . Unique identifier of the security policy associated with the threat intelligence protection settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(Output<String> securityPolicyId) {
            $.securityPolicyId = securityPolicyId;
            return this;
        }

        /**
         * @param securityPolicyId . Unique identifier of the security policy associated with the threat intelligence protection settings being modified.
         * 
         * @return builder
         * 
         */
        public Builder securityPolicyId(String securityPolicyId) {
            return securityPolicyId(Output.of(securityPolicyId));
        }

        /**
         * @param threatIntel . Set to `on` to enable threat intelligence protection; set to **off** to disable threat intelligence protection.
         * 
         * @return builder
         * 
         */
        public Builder threatIntel(Output<String> threatIntel) {
            $.threatIntel = threatIntel;
            return this;
        }

        /**
         * @param threatIntel . Set to `on` to enable threat intelligence protection; set to **off** to disable threat intelligence protection.
         * 
         * @return builder
         * 
         */
        public Builder threatIntel(String threatIntel) {
            return threatIntel(Output.of(threatIntel));
        }

        public AppSecThreatIntelArgs build() {
            $.configId = Objects.requireNonNull($.configId, "expected parameter 'configId' to be non-null");
            $.securityPolicyId = Objects.requireNonNull($.securityPolicyId, "expected parameter 'securityPolicyId' to be non-null");
            $.threatIntel = Objects.requireNonNull($.threatIntel, "expected parameter 'threatIntel' to be non-null");
            return $;
        }
    }

}